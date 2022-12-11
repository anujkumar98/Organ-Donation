/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientReport;
import Business.Patient.PatientVisit;
import Business.Patient.PatientVisitDirectory;
import Business.Patient.PatientVitals;
import email.util.EmailUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anujkumar
 */
public class DatabaseHandleHospitalRoles {
    
    public static Connection createConnection(){
        
        Connection con=null;
        final String DB_URL ="jdbc:mysql://localhost:3306/OrganDonation";
        final String DB_USER = "root";
        final String DB_PASSWD = "root";
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseEnterpriseUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
         {
            
            con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
            //System.out.println("Connection Successful");
         }
        catch (Exception e){
            System.out.println("Connection DB:"+e);
            }
        return con;
    }
    
public static Boolean createLogin(String name,String username,String email, String password,String role,int adminId,String tableName){
    Boolean status=false; 
    int hospitalId=0;
    try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String queryHospitalId="SELECT HOSPITAL_ID FROM  `OrganDonation`.`HOSPITAL_ADMIN`"
                    + "where HOSPITAL_ADMIN_ID = "+adminId+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                hospitalId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }
            String query="INSERT INTO `OrganDonation`.`"+tableName+"` "
            + "( `"+tableName.toUpperCase()+"_NAME"+"`, `"+tableName.toUpperCase()+"_USERNAME"+"`, "
            + "`"+tableName.toUpperCase()+"_PASSWORD"+"`, `"+"HOSPITAL_ID"+"` ,`"+tableName.toUpperCase()+"_EMAIL"+"`) "
            + "VALUES ('"+name+"', '"+username+"', '"+password+"', '"+hospitalId+"' , ' "+email+"')";
    statement.executeUpdate(query);
    String text="Your username is " + username + ". \nYour password is "+password+ "\n "
                    + "Thank you for registering.";
    EmailUtil.sendEmail(email,text);
    status=true;
        }
        catch(Exception e){
            System.out.println("Create Login"+e);
        }
    return status;
    }
    //Code to check unique username in the table
public Boolean checkUniqueUserName(String uname,String tableName){
    Boolean check=true;
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM `"+tableName+"` ";
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            String usrName=resultSet.getString(tableName+"_USERNAME");
            if (usrName.equals(uname))
                check=false;
        }
    }   
    catch(Exception e){
        System.out.println("Check Unique Username"+e);
    }
    return check;
}

public ArrayList <Employee> employeeList(int adminId){
    EmployeeDirectory ed=new EmployeeDirectory();
    ArrayList <Employee> employeeList = new ArrayList<> ();
    int hospitalId=0;
    try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String queryHospitalId="SELECT HOSPITAL_ID FROM  `OrganDonation`.`HOSPITAL_ADMIN`"
                    + "where HOSPITAL_ADMIN_ID = "+adminId+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                hospitalId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }  
        
    }
    catch(Exception e){
        System.out.println("employeeList fetch Hospital id: "+e);
    }
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM `HOSPITAL_RECEPTIONIST` WHERE HOSPITAL_ID = "+ hospitalId;
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            Employee emp= new Employee();
            emp.setId(resultSet.getInt("HOSPITAL_RECEPTIONIST_ID"));
            emp.setName(resultSet.getString("HOSPITAL_RECEPTIONIST_NAME"));
            emp.setRole("RECEPTIONIST");
            emp.setUsername(resultSet.getString("HOSPITAL_RECEPTIONIST_USERNAME"));
            employeeList=ed.add(emp);
        }
    } catch(Exception e){
        System.out.println("Employee List RECEPTIONIST"+e);
    }
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM `HOSPITAL_DOCTOR`WHERE HOSPITAL_ID = "+ hospitalId;
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            Employee emp= new Employee();
            emp.setId(resultSet.getInt("HOSPITAL_DOCTOR_ID"));
            emp.setName(resultSet.getString("HOSPITAL_DOCTOR_NAME"));
            emp.setRole("DOCTOR");
            emp.setUsername(resultSet.getString("HOSPITAL_DOCTOR_USERNAME"));
            employeeList=ed.add(emp);
        }
    } 
    catch(Exception e){
        System.out.println("Employee List DOCTOR"+e);
    }
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM `HOSPITAL_PATHOLOGIST` WHERE HOSPITAL_ID = "+ hospitalId;
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            Employee emp= new Employee();
            emp.setId(resultSet.getInt("HOSPITAL_PATHOLOGIST_ID"));
            emp.setName(resultSet.getString("HOSPITAL_PATHOLOGIST_NAME"));
            emp.setRole("PATHOLOGIST");
            emp.setUsername(resultSet.getString("HOSPITAL_PATHOLOGIST_USERNAME"));
            employeeList=ed.add(emp);
        }
    } 
    catch(Exception e){
        System.out.println("Employee List PATHOLOGIST"+e);
    }
    return employeeList;
}
public Boolean updateProfile(String name,String contact,int age,String address,String gender,String tableName,int id){
    Boolean status=false;
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="UPDATE `OrganDonation`.`"+tableName.toUpperCase()+"` SET "
            + "`"+tableName.toUpperCase()+"_NAME` = '"+name+"', `"+tableName.toUpperCase()+"_AGE` = '"+Integer.toString(age)+"', "
            + "`"+tableName.toUpperCase()+"_CONTACT` = '"+contact+"',"+
             "`"+tableName.toUpperCase()+"_GENDER` = '"+gender+"',`"+tableName.toUpperCase()+"_ADDRESS` = '"+address+"' WHERE (`"+
            tableName.toUpperCase()+"_ID` = '"+Integer.toString(id)+"');";
        //System.out.println(query);
        statement.executeUpdate(query);
        status=true;
    } 
    catch(Exception e){
        System.out.println("updateProfile :"+e);
    }
    return status;
}
public Boolean createPerson(String name,int age,String email,String gender,String contact,String address,String type,int id){
    int hospitalId=0;
    Boolean status=false;
    try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            hospitalId=fetchHosplitalId(id);
            //System.out.println(query);
            
            String query="INSERT INTO `OrganDonation`.`HOSPITAL_PATIENT` (`HOSPITAL_PATIENT_NAME`,"
                    + "`HOSPITAL_PATIENT_AGE`, `HOSPITAL_PATIENT_EMAIL`, `HOSPITAL_PATIENT_GENDER`, "
                    + "`HOSPITAL_PATIENT_CONTACT`, `HOSPITAL_PATIENT_ADDRESS`, `HOSPITAL_PATIENT_TYPE`,`HOSPITAL_ID`) "
                    + "VALUES ('"+name+"', '"+age+"', '"+email+"', '"+gender+"', '"+contact+"' , '"+address+"',"
                    + "'"+type+"', '"+hospitalId+"');";
            statement.executeUpdate(query);
            status=true;
        }
        catch(Exception e){
            System.out.println("createPerson"+e);
        }
    return status;
}
//Fetch Hospital ID based on the id of receptionist
public int fetchHosplitalId(int id){
    int hospitalId=0;
    try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String queryHospitalId="SELECT HOSPITAL_ID FROM  `OrganDonation`.`HOSPITAL_RECEPTIONIST`"
                    + "where HOSPITAL_RECEPTIONIST_ID = "+id+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                hospitalId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }
    }
    catch(Exception e){
        System.out.println("fetchHosplitalId" + e);
    }
    return hospitalId;
}
public ArrayList <Employee> fetchPatient(int id){
    EmployeeDirectory ed=new EmployeeDirectory();
    ArrayList <Employee> employeeList = new ArrayList<> ();
    int hospitalId=0;
    try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            hospitalId=fetchHosplitalId(id);
            String query="SELECT * FROM HOSPITAL_PATIENT WHERE HOSPITAL_ID = "+hospitalId;
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                Employee emp= new Employee();
                emp.setId(resultSet.getInt("HOSPITAL_PATIENT_ID"));
                emp.setName(resultSet.getString("HOSPITAL_PATIENT_NAME"));
                emp.setEmail(resultSet.getString("HOSPITAL_PATIENT_EMAIL"));
                emp.setAge(resultSet.getInt("HOSPITAL_PATIENT_AGE"));
                emp.setGender(resultSet.getString("HOSPITAL_PATIENT_GENDER"));
                emp.setContactNumber(resultSet.getString("HOSPITAL_PATIENT_CONTACT"));
                emp.setAddress(resultSet.getString("HOSPITAL_PATIENT_ADDRESS"));
                emp.setRole(resultSet.getString("HOSPITAL_PATIENT_TYPE"));
                employeeList=ed.add(emp);
            }
        }
        catch(Exception e){
            System.out.println("createPerson"+e);
        }
    return employeeList;
}

public ArrayList <Employee> fetchDoctor(int id ){
    EmployeeDirectory ed=new EmployeeDirectory();
    ArrayList <Employee> employeeList = new ArrayList<> ();
    int hospitalId=0;
    try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String queryHospitalId="SELECT HOSPITAL_ID FROM  `OrganDonation`.`HOSPITAL_RECEPTIONIST`"
                    + "where HOSPITAL_RECEPTIONIST_ID = "+id+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                hospitalId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }
            String query="SELECT * FROM HOSPITAL_DOCTOR WHERE HOSPITAL_ID = "+hospitalId;
            resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                Employee emp= new Employee();
                emp.setId(resultSet.getInt("HOSPITAL_DOCTOR_ID"));
                emp.setName(resultSet.getString("HOSPITAL_DOCTOR_NAME"));
                emp.setEmail(resultSet.getString("HOSPITAL_DOCTOR_EMAIL"));
                emp.setAge(resultSet.getInt("HOSPITAL_DOCTOR_AGE"));
                emp.setGender(resultSet.getString("HOSPITAL_DOCTOR_GENDER"));
                emp.setContactNumber(resultSet.getString("HOSPITAL_DOCTOR_CONTACT"));
                emp.setAddress(resultSet.getString("HOSPITAL_DOCTOR_ADDRESS"));
                emp.setRole("DOCTOR");
                employeeList=ed.add(emp);
            }
        }
        catch(Exception e){
            System.out.println("createPerson"+e);
        }
    return employeeList;
}

public ArrayList <Employee> fetchPatho(int id ){
    //EmployeeDirectory ed=new EmployeeDirectory();
    ArrayList <Employee> employeeList = new ArrayList<> ();
    int hospitalId=0;
    try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String queryHospitalId="SELECT HOSPITAL_ID FROM `OrganDonation`.`HOSPITAL_DOCTOR`"
                    + "where HOSPITAL_DOCTOR_ID = "+id+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                hospitalId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }
            System.out.println("Hospital Id : "+hospitalId);
            String query="SELECT * FROM HOSPITAL_PATHOLOGIST WHERE HOSPITAL_ID = "+hospitalId;
            resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                Employee emp= new Employee();
                emp.setId(resultSet.getInt("HOSPITAL_PATHOLOGIST_ID"));
                emp.setName(resultSet.getString("HOSPITAL_PATHOLOGIST_NAME"));
                emp.setEmail(resultSet.getString("HOSPITAL_PATHOLOGIST_EMAIL"));
                emp.setAge(resultSet.getInt("HOSPITAL_PATHOLOGIST_AGE"));
                emp.setGender(resultSet.getString("HOSPITAL_PATHOLOGIST_GENDER"));
                emp.setContactNumber(resultSet.getString("HOSPITAL_PATHOLOGIST_CONTACT"));
                emp.setAddress(resultSet.getString("HOSPITAL_PATHOLOGIST_ADDRESS"));
                emp.setRole("PATHOLOGIST");
                employeeList.add(emp);
            }
        }
        catch(Exception e){
            System.out.println("fetchPatho:"+e);
        }
    return employeeList;
}

public Boolean creatVisit(int patientId,int doctorId){
    Boolean status=false;
    int reportId=0;
    int vitalId=0;
    try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String queryVitals="INSERT INTO `OrganDonation`.`PATIENTS_VITALS` (`PATIENTS_VITALS_TEMPERATURE`) VALUES (-1);";
            String vitalsID="SELECT MAX(PATIENTS_VITALS_ID) AS ID FROM `OrganDonation`.`PATIENTS_VITALS`;";
            statement.executeUpdate(queryVitals);
            String queryReport="INSERT INTO `OrganDonation`.`PATIENT_REPORT` (`PATIENT_REPORT_BLOOD_TYPE`) VALUES ('No');";
            String reportID="SELECT MAX(PATIENTS_VITALS_ID) AS ID FROM `OrganDonation`.`PATIENTS_VITALS`;";
            statement.executeUpdate(queryReport);
            ResultSet resultSet=statement.executeQuery(vitalsID);
            while(resultSet.next()){
             vitalId=resultSet.getInt("ID");
            }
            resultSet=statement.executeQuery(reportID);
            while(resultSet.next()){
             reportId=resultSet.getInt("ID");
            }
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        String query="INSERT INTO `OrganDonation`.`PATIENTS_VISIT` (`"
                + "HOSPITAL_DOCTOR_ID`, `HOSPITAL_PATIENT_ID`,`PATIENTS_REPORT_ID`,`PATIENTS_VITALS_ID`,`PATIENTS_VISIT_DATE`) VALUES "
                + "('"+doctorId+"', '"+patientId+"' ,'"+reportId+"','"+vitalId+"','"+timeStamp+"');";
        System.out.println(query);
        statement.executeUpdate(query);
        status=true;
    }
    catch (Exception e){
    System.out.println("creatVisit"+ e);
    }
    return status;
}
public ArrayList <PatientVisit> fetchPatientsDoctor(int doctorId){
    ArrayList <PatientVisit> patientVisitList= new ArrayList();
    PatientVisitDirectory pvd=new PatientVisitDirectory(); 
    try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String query="SELECT *\n" +
            "FROM HOSPITAL_PATIENT AS HP\n" +
            "JOIN PATIENTS_VISIT AS PV ON \n" +
            "HP.HOSPITAL_PATIENT_ID = PV.HOSPITAL_PATIENT_ID\n" +
            "JOIN HOSPITAL_DOCTOR AS HD ON \n" +
            "HD.HOSPITAL_DOCTOR_ID = PV.HOSPITAL_DOCTOR_ID WHERE HD.HOSPITAL_DOCTOR_ID = '" + doctorId+"';";
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            PatientVisit pv=new PatientVisit();
            pv.setPatientId(resultSet.getInt("HOSPITAL_PATIENT_ID"));
            pv.setName(resultSet.getString("HOSPITAL_PATIENT_NAME"));
            pv.setAge(resultSet.getInt("HOSPITAL_PATIENT_AGE"));
            pv.setGender(resultSet.getString("HOSPITAL_PATIENT_GENDER"));
            pv.setType(resultSet.getString("HOSPITAL_PATIENT_TYPE"));
            pv.setId(resultSet.getInt("PATIENTS_VISIT_ID"));
            pv.setDoctorId(resultSet.getInt("HOSPITAL_DOCTOR_ID"));
            pv.setReportId(resultSet.getInt("PATIENTS_REPORT_ID"));
            pv.setReportId(resultSet.getInt("PATIENTS_VITALS_ID"));
            pv.setReportStatus(resultSet.getString("PATIENTS_REPORT_STATUS"));
            pv.setVitalStatus(resultSet.getString("PATIENTS_VITALS_STATUS"));
            pv.setDate(resultSet.getString("PATIENTS_VISIT_DATE"));
            patientVisitList=pvd.addPatientsVisits(pv);
        }
    }
    catch(Exception e) {
        System.out.println("fetchPatients Doctor: " +e);
    }
    return patientVisitList;
}
public ArrayList <PatientVisit> fetchPatientsPatho(int pathoId){
    ArrayList <PatientVisit> patientVisitList= new ArrayList();
    PatientVisitDirectory pvd=new PatientVisitDirectory(); 
    try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM HOSPITAL_PATIENT AS HP JOIN PATIENTS_VISIT AS PV ON "
                + "HP.HOSPITAL_PATIENT_ID = PV.HOSPITAL_PATIENT_ID  JOIN HOSPITAL_PATHOLOGIST AS P ON"
                + "  P.HOSPITAL_PATHOLOGIST_ID = PV.HOSPITAL_PATHOLOGIST_ID "
                + "WHERE P.HOSPITAL_PATHOLOGIST_ID = "+pathoId;
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            PatientVisit pv=new PatientVisit();
            pv.setPatientId(resultSet.getInt("HOSPITAL_PATIENT_ID"));
            pv.setName(resultSet.getString("HOSPITAL_PATIENT_NAME"));
            pv.setAge(resultSet.getInt("HOSPITAL_PATIENT_AGE"));
            pv.setGender(resultSet.getString("HOSPITAL_PATIENT_GENDER"));
            pv.setType(resultSet.getString("HOSPITAL_PATIENT_TYPE"));
            pv.setId(resultSet.getInt("PATIENTS_VISIT_ID"));
            pv.setDoctorId(resultSet.getInt("HOSPITAL_DOCTOR_ID"));
            pv.setReportId(resultSet.getInt("PATIENTS_REPORT_ID"));
            pv.setReportId(resultSet.getInt("PATIENTS_VITALS_ID"));
            pv.setReportStatus(resultSet.getString("PATIENTS_REPORT_STATUS"));
            pv.setVitalStatus(resultSet.getString("PATIENTS_VITALS_STATUS"));
            patientVisitList=pvd.addPatientsVisits(pv);
        }
    }
    catch(Exception e) {
        System.out.println("fetchPatients Patho: " +e);
    }
    return patientVisitList;
}
public Boolean creatVitals(int visitId,float weight,float height,float temp,int pulse,int bp, int respRate,int pathoId){
    Boolean status=false;
    int vitalId=0;
    try{
           Connection con=createConnection();
           Statement statement=con.createStatement();
           String queryVitalId="SELECT PATIENTS_VITALS_ID FROM PATIENTS_VISIT WHERE PATIENTS_VISIT_ID = "+visitId;
           ResultSet resultSet=statement.executeQuery(queryVitalId);
           while(resultSet.next()){
               vitalId=resultSet.getInt("PATIENTS_VITALS_ID");
           }
           String queryVitalUpdate="UPDATE `OrganDonation`.`PATIENTS_VITALS` "
                   + "SET `PATIENTS_VITALS_TEMPERATURE` = '"+temp+"', `PATIENTS_VITALS_HEIGHT` = '"+height+"', "
                   + "`PATIENTS_VITALS_WEIGHT` = '"+weight+"', `PATIENTS_VITALS_PULSE` = '"+pulse+"', "
                   + "`PATIENTS_VITALS_BP` = '"+bp+"',"
                   + " `PATIENTS_VITALS_RESPIRATORY_RATE` = '"+respRate+"' WHERE (`PATIENTS_VITALS_ID` = '"+vitalId+"');";
           statement.executeUpdate(queryVitalUpdate);
           String updateVitalsStatus="UPDATE `OrganDonation`.`PATIENTS_VISIT` SET "
                   + "`PATIENTS_VITALS_STATUS` = 'Filled by Doctor', `HOSPITAL_PATHOLOGIST_ID` = '"+pathoId
                   + "' WHERE (`PATIENTS_VISIT_ID` = '"+visitId+"');";
           statement.executeUpdate(updateVitalsStatus);
           String updateReportStatus="UPDATE `OrganDonation`.`PATIENTS_VISIT` SET "
                   + "`PATIENTS_REPORT_STATUS` = 'Requested to Patho' WHERE (`PATIENTS_VISIT_ID` = '"+visitId+"');";
           statement.executeUpdate(updateReportStatus);
           status=true;
    }
    catch(Exception e) {
           System.out.println("creatVitals : " +e);
       }
    return status;
   }

public Boolean createPathoReport(int visitId,String bloodType,String tissueCondition){
Boolean status=false;
    int reportId=0;
    try{
           Connection con=createConnection();
           Statement statement=con.createStatement();
           String queryVitalId="SELECT PATIENTS_REPORT_ID FROM PATIENTS_VISIT WHERE PATIENTS_VISIT_ID = "+visitId;
           ResultSet resultSet=statement.executeQuery(queryVitalId);
           while(resultSet.next()){
               reportId=resultSet.getInt("PATIENTS_REPORT_ID");
           }
           String queryReportUpdate="UPDATE `OrganDonation`.`PATIENT_REPORT` SET  "
                   + "`PATIENT_REPORT_BLOOD_TYPE` = "
                   + "'"+bloodType+"', `PATIENT_REPORT_TISSUE_CONDITION` = '"+tissueCondition+"' "
                   + "WHERE (`PATIENT_REPORT_ID` = '"+reportId+"');";
           statement.executeUpdate(queryReportUpdate);
           String updateReportStatus="UPDATE `OrganDonation`.`PATIENTS_VISIT` SET "
                   + "`PATIENTS_REPORT_STATUS` = 'Filled by Patho' WHERE (`PATIENTS_VISIT_ID` = '"+visitId+"');";
           statement.executeUpdate(updateReportStatus);
           status=true;
           
    }
    catch(Exception e) {
           System.out.println("createPathoReport : " +e);
       }
    return status;
}
public Boolean updateDoctorApproval(int visitId,int approvalStatus,String patientType,int doctorId,String date){
Boolean status=false;
int hospitalId=0;
    try{
           Connection con=createConnection();
           Statement statement=con.createStatement();
           String updateStatus="UPDATE `OrganDonation`.`PATIENTS_VISIT` SET "
                   + "`PATIENTS_VISIT_ORGAN_STATUS` = "+approvalStatus+" , `PATIENTS_VISIT_DATE` ='"
                   +date+"' WHERE (`PATIENTS_VISIT_ID` = '"+visitId+"');";
           statement.executeUpdate(updateStatus);
           String queryHospitalId="SELECT HOSPITAL_ID FROM `OrganDonation`.`HOSPITAL_DOCTOR`"
                    + "where HOSPITAL_DOCTOR_ID = "+doctorId+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                hospitalId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }
            if (approvalStatus ==1){
            String queryOrganList="INSERT INTO `OrganDonation`.`ORGAN_DONOR_RECEIVER_LIST` "
                       + "(`HOSPITAL_ID`, `VISIT_ID`, "
                       + "`ORGAN_DONOR_RECEIVER_LIST_TYPE`,`ORGAN_DONOR_RECEIVER_LIST_STATUS`) "
                    + "VALUES ('"+hospitalId+"', '"+visitId+"', '"+patientType+"', 'Approved by Doctor')";
            statement.executeUpdate(queryOrganList);
            }
            status=true;
    }
    catch(Exception e) {
           System.out.println("createPathoReport : " +e);
       }
    return status;
}
public ArrayList <PatientVisit> fetchDoctorDonorRevicerList(int doctorId, String type){
ArrayList <PatientVisit> patientVisitList= new ArrayList();
PatientVisitDirectory pvd=new PatientVisitDirectory();
int hospitalId=0;
    try{
           Connection con=createConnection();
           Statement statement=con.createStatement();
           String queryHospitalId="SELECT HOSPITAL_ID FROM `OrganDonation`.`HOSPITAL_DOCTOR`"
                    + "where HOSPITAL_DOCTOR_ID = "+doctorId+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                hospitalId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }
            String getDonorList="SELECT * FROM ORGAN_DONOR_RECEIVER_LIST AS ODRL "
                    + "JOIN PATIENTS_VISIT AS PV ON  ODRL.VISIT_ID= PV.PATIENTS_VISIT_ID "
                    + "JOIN  HOSPITAL_PATIENT AS HP ON PV.HOSPITAL_PATIENT_ID = HP.HOSPITAL_PATIENT_ID WHERE "
                    + "ODRL.HOSPITAL_ID = "+hospitalId + " AND ODRL.ORGAN_DONOR_RECEIVER_LIST_TYPE= '"+type+"' "
                    + "AND HOSPITAL_DOCTOR_ID = "+ doctorId;
            resultSet=statement.executeQuery(getDonorList);
            while(resultSet.next()){
            PatientVisit pv=new PatientVisit();
            pv.setId(resultSet.getInt("ORGAN_DONOR_RECEIVER_LIST_ID"));
            pv.setPatientId(resultSet.getInt("HOSPITAL_PATIENT_ID"));
            pv.setName(resultSet.getString("HOSPITAL_PATIENT_NAME"));
            pv.setAge(resultSet.getInt("HOSPITAL_PATIENT_AGE"));
            pv.setGender(resultSet.getString("HOSPITAL_PATIENT_GENDER"));
            pv.setType(resultSet.getString("HOSPITAL_PATIENT_TYPE"));
            pv.setDoctorId(resultSet.getInt("HOSPITAL_DOCTOR_ID"));
            pv.setReportId(resultSet.getInt("PATIENTS_REPORT_ID"));
            pv.setVitalId(resultSet.getInt("PATIENTS_VITALS_ID"));
            pv.setReportStatus(resultSet.getString("PATIENTS_REPORT_STATUS"));
            pv.setVitalStatus(resultSet.getString("PATIENTS_VITALS_STATUS"));
            pv.setDate(resultSet.getString("PATIENTS_VISIT_DATE"));
            pv.setOrgan(resultSet.getString("ORGAN_DONOR_RECEIVER_LIST_ORGAN_NAME"));
            pv.setOrganStatus(resultSet.getString("ORGAN_DONOR_RECEIVER_LIST_STATUS"));
            patientVisitList=pvd.addPatientsVisits(pv);
            }
            
    }
    catch(Exception e) {
           System.out.println("populateAdminDonorList : " +e);
       }
    return patientVisitList;
}


public Boolean updateReciverDonorList(int id,String organ){
    Boolean status=false;
    try{
           Connection con=createConnection();
           Statement statement=con.createStatement();
           String creatQuery="UPDATE `OrganDonation`.`ORGAN_DONOR_RECEIVER_LIST` SET "
                   + "`ORGAN_DONOR_RECEIVER_LIST_ORGAN_NAME` = '"+organ+"' ,`ORGAN_DONOR_RECEIVER_LIST_STATUS` "
                   + "= 'Sent to Admin'  WHERE (`ORGAN_DONOR_RECEIVER_LIST_ID` = '"+id+"');";
           statement.executeUpdate(creatQuery);
           //Update ORGAN_DONOR_RECEIVER_LIST_STATUS
           status=true;
    }
    catch(Exception e){
        System.out.println("updateReciverDonorList : " +e);
    }
    return status;
}

public Boolean populateReciverDonorList(int id,String organ,String type){
    Boolean status=false;
    int visitId=0;
    int hospitalId=0;
    try{
           Connection con=createConnection();
           Statement statement=con.createStatement();
           String queryVisitID="SELECT VISIT_ID FROM ORGAN_DONOR_RECEIVER_LIST WHERE ORGAN_DONOR_RECEIVER_LIST_ID = "+id;
           ResultSet resultSet=statement.executeQuery(queryVisitID);
           while(resultSet.next()){
              visitId= resultSet.getInt("VISIT_ID");
           }
           String hospitalQuery="SELECT HOSPITAL_ID FROM ORGAN_DONOR_RECEIVER_LIST WHERE ORGAN_DONOR_RECEIVER_LIST_ID = "+id;
           resultSet=statement.executeQuery(hospitalQuery);
           while(resultSet.next()){
              hospitalId= resultSet.getInt("HOSPITAL_ID");
           }
           String creatQuery="INSERT INTO `OrganDonation`.`ORGAN_DONOR_RECEIVER_LIST` (`HOSPITAL_ID`, `VISIT_ID`, "
                   + "`ORGAN_DONOR_RECEIVER_LIST_ORGAN_NAME`, `ORGAN_DONOR_RECEIVER_LIST_TYPE`,`ORGAN_DONOR_RECEIVER_LIST_STATUS`) VALUES "
                   + "('"+hospitalId+"', '"+visitId+"',"
                   + " '"+organ+"', '"+type+"', 'Sent to Admin');";
           
           System.out.println(creatQuery);
           statement.executeUpdate(creatQuery);
           status=true;
    }
    catch(Exception e){
        System.out.println("populateReciverDonorList : " +e);

    }
    return status;
}

public ArrayList <PatientVisit> fetchAdminDonorRevicerList(int adminId, String type,String state){
ArrayList <PatientVisit> patientVisitList= new ArrayList();
PatientVisitDirectory pvd=new PatientVisitDirectory();
int hospitalId=0;
    try{
           Connection con=createConnection();
           Statement statement=con.createStatement();
           String queryHospitalId="SELECT HOSPITAL_ID FROM `OrganDonation`.`HOSPITAL_ADMIN`"
                    + "where HOSPITAL_ADMIN_ID = "+adminId+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                hospitalId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }
            String getDonorList="SELECT * FROM ORGAN_DONOR_RECEIVER_LIST AS ODRL "
                    + "JOIN PATIENTS_VISIT AS PV ON  ODRL.VISIT_ID= PV.PATIENTS_VISIT_ID "
                    + "JOIN  HOSPITAL_PATIENT AS HP ON PV.HOSPITAL_PATIENT_ID = HP.HOSPITAL_PATIENT_ID WHERE "
                    + "ODRL.HOSPITAL_ID = "+hospitalId + " AND ODRL.ORGAN_DONOR_RECEIVER_LIST_TYPE= '"+type+"' "
                    + "AND `ORGAN_DONOR_RECEIVER_LIST_STATUS` = '"+state+"'";
            resultSet=statement.executeQuery(getDonorList);
            while(resultSet.next()){
            PatientVisit pv=new PatientVisit();
            pv.setId(resultSet.getInt("ORGAN_DONOR_RECEIVER_LIST_ID"));
            pv.setPatientId(resultSet.getInt("HOSPITAL_PATIENT_ID"));
            pv.setName(resultSet.getString("HOSPITAL_PATIENT_NAME"));
            pv.setAge(resultSet.getInt("HOSPITAL_PATIENT_AGE"));
            pv.setGender(resultSet.getString("HOSPITAL_PATIENT_GENDER"));
            pv.setType(resultSet.getString("HOSPITAL_PATIENT_TYPE"));
            pv.setDoctorId(resultSet.getInt("HOSPITAL_DOCTOR_ID"));
            pv.setReportId(resultSet.getInt("PATIENTS_REPORT_ID"));
            pv.setVitalId(resultSet.getInt("PATIENTS_VITALS_ID"));
            pv.setReportStatus(resultSet.getString("PATIENTS_REPORT_STATUS"));
            pv.setVitalStatus(resultSet.getString("PATIENTS_VITALS_STATUS"));
            pv.setDate(resultSet.getString("PATIENTS_VISIT_DATE"));
            pv.setOrgan(resultSet.getString("ORGAN_DONOR_RECEIVER_LIST_ORGAN_NAME"));
            pv.setOrganStatus(resultSet.getString("ORGAN_DONOR_RECEIVER_LIST_STATUS"));
            patientVisitList=pvd.addPatientsVisits(pv);
            }    
    }
    catch(Exception e) {
           System.out.println("fetchAdminDonorRevicerList : " +e);
       }
    return patientVisitList;
}

public Boolean sendListToOPO(int organDonationId){
    Boolean status=false;
    try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String updateQuery="UPDATE `OrganDonation`.`ORGAN_DONOR_RECEIVER_LIST` SET "
                   +  "`ORGAN_DONOR_RECEIVER_LIST_STATUS` "
                   + "= 'Sent to OPO'  WHERE (`ORGAN_DONOR_RECEIVER_LIST_ID` = '"+organDonationId+"');";
        statement.executeUpdate(updateQuery);
        status=true;
    }
    
    catch(Exception e){
        System.out.println("sendListToOPO :"+e);
    }
    return status;
}
public PatientVitals fetchVitals(int visitId){
    PatientVitals pv=new PatientVitals();
    int vitalId=0;
    try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String getVitalId="SELECT PATIENTS_VITALS_ID FROM PATIENTS_VISIT WHERE PATIENTS_VISIT_ID = "+visitId;
        ResultSet resultSet=statement.executeQuery(getVitalId);
        while(resultSet.next()){
            vitalId=resultSet.getInt("PATIENTS_VITALS_ID");
        }
        String vitalsQuery="Select * from PATIENTS_VITALS WHERE PATIENTS_VITALS_ID = "+vitalId;
        resultSet=statement.executeQuery(vitalsQuery);
        while(resultSet.next()){
            pv.setWeight(resultSet.getFloat("PATIENTS_VITALS_WEIGHT"));
            pv.setTemp(resultSet.getFloat("PATIENTS_VITALS_TEMPERATURE"));
            pv.setHeight(resultSet.getFloat("PATIENTS_VITALS_HEIGHT"));
            pv.setBp(resultSet.getFloat("PATIENTS_VITALS_BP"));
            pv.setPulse(resultSet.getInt("PATIENTS_VITALS_PULSE"));
            pv.setRepiratoryRate(resultSet.getInt("PATIENTS_VITALS_RESPIRATORY_RATE"));    
        }
    }
    catch(Exception e){
        System.out.println("fetchVitals :"+e);
    }
    return pv;
}
public PatientReport fetchReports(int visitId){
    PatientReport pr=new PatientReport();
    int reportId=0;
    try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String getVitalId="SELECT PATIENTS_REPORT_ID FROM PATIENTS_VISIT WHERE PATIENTS_VISIT_ID = "+visitId;
        ResultSet resultSet=statement.executeQuery(getVitalId);
        while(resultSet.next()){
            reportId=resultSet.getInt("PATIENTS_REPORT_ID");
        }
        String vitalsQuery="Select * from PATIENT_REPORT WHERE PATIENT_REPORT_ID = "+reportId;
        resultSet=statement.executeQuery(vitalsQuery);
        while(resultSet.next()){
            pr.setBloodType(resultSet.getString("PATIENT_REPORT_BLOOD_TYPE"));
            pr.setTissueConditon(resultSet.getString("PATIENT_REPORT_TISSUE_CONDITION"));    
        }
    }
    catch(Exception e){
        System.out.println("fetchReports :"+e);
    }
    return pr;
}
}