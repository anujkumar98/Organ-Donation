/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;

import Business.Patient.PatientVisit;
import Business.Patient.PatientVisitDirectory;
import static DatabaseUtility.DatabaseHandelTransportRoles.createConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anujkumar
 */
public class DatabaseHandelOPORoles {
    public static Connection createConnection(){
//        jdbc:mysql://localhost:3306/organdonation?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
        Connection con=null;
        final String DB_URL ="jdbc:mysql://localhost:3306/organdonation";
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
            System.out.println(e);
            }
        return con;
    }
    
    public ArrayList <PatientVisit> fetchDonorReciverList(int adminId,String type,int orderBy){
        ArrayList <PatientVisit> patientVisitList= new ArrayList();
        PatientVisitDirectory pvd=new PatientVisitDirectory();
        try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM ORGAN_DONOR_RECEIVER_LIST AS ODRL JOIN "
                + " HOSPITAL AS H ON H.HOSPITAL_ID=ODRL.HOSPITAL_ID "
                + " JOIN PATIENTS_VISIT AS PV ON PV.PATIENTS_VISIT_ID=ODRL.VISIT_ID"
                + " JOIN HOSPITAL_PATIENT AS HP ON PV.HOSPITAL_PATIENT_ID= HP.HOSPITAL_PATIENT_ID"
                + " JOIN (SELECT OPO_REGION,OA.OPO_ADMIN_ID FROM OPO_ADMIN AS OA JOIN  OPO AS O ON  OA.OPO_ID=O.OPO_ID)"
                + " AS OPO_REG ON OPO_REG.OPO_REGION = H.HOSPITAL_REGION WHERE "
                + " ODRL.ORGAN_DONOR_RECEIVER_LIST_STATUS = 'Sent to OPO' AND ODRL.ORGAN_DONOR_RECEIVER_LIST_TYPE='"+type+"'"
                + " AND OPO_REG.OPO_ADMIN_ID ="+ adminId;
        if (orderBy ==1){
            query+=" ORDER BY PATIENTS_VISIT_DATE;";
        }
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            PatientVisit pv=new PatientVisit();
            pv.setId(resultSet.getInt("ORGAN_DONOR_RECEIVER_LIST_ID"));
            pv.setPatientId(resultSet.getInt("HOSPITAL_PATIENT_ID"));
            pv.setName(resultSet.getString("HOSPITAL_PATIENT_NAME"));
            pv.setAge(resultSet.getInt("HOSPITAL_PATIENT_AGE"));
            pv.setGender(resultSet.getString("HOSPITAL_PATIENT_GENDER"));
            pv.setType(resultSet.getString("HOSPITAL_NAME"));//Used to store hospital name
            pv.setDoctorId(resultSet.getInt("HOSPITAL_DOCTOR_ID"));
            pv.setReportId(resultSet.getInt("PATIENTS_REPORT_ID"));
            pv.setVitalId(resultSet.getInt("PATIENTS_VITALS_ID"));
            pv.setReportStatus(resultSet.getString("PATIENTS_REPORT_STATUS"));
            pv.setVitalStatus(resultSet.getString("PATIENTS_VITALS_STATUS"));
            pv.setDate(resultSet.getString("PATIENTS_VISIT_DATE"));
            pv.setOrgan(resultSet.getString("ORGAN_DONOR_RECEIVER_LIST_ORGAN_NAME"));
            pv.setOrganStatus(resultSet.getString("ORGAN_DONOR_RECEIVER_LIST_STATUS"));
            patientVisitList.add(pv);
        }
    }
    catch(Exception e){
        System.out.println("fetchReciverList: "+ e);
    }
    return patientVisitList;
    }
    
    public ArrayList <PatientVisit> findMatches(int adminId, String organName){
        ArrayList <PatientVisit> patientVisitList= fetchDonorReciverList(adminId,"Reciver",1);  
        ArrayList <PatientVisit> matchedPatientList=new ArrayList();
        for (PatientVisit pv : patientVisitList){
            
            if(pv.getOrgan().equalsIgnoreCase(organName)){
                matchedPatientList.add(pv);
            }
        }
        System.out.println(matchedPatientList.size());
        return matchedPatientList;
    }
    
    public Boolean updateDonorReviciverStatus(int donorId,int reciverID,String organ){
        Boolean status=false;
        try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String updateDonorQuery="UPDATE `OrganDonation`.`ORGAN_DONOR_RECEIVER_LIST` SET "
                   + "`ORGAN_DONOR_RECEIVER_LIST_STATUS` "
                   + "= 'Organ Used',`ORGAN_DONOR_RECEIVER_LIST_DONOR_RECIVER_ID` = '"+reciverID+"'  WHERE (`ORGAN_DONOR_RECEIVER_LIST_ID` = '"+donorId+"');";
            System.out.println(updateDonorQuery);
            statement.executeUpdate(updateDonorQuery);
            String updateRciverQuery="UPDATE `OrganDonation`.`ORGAN_DONOR_RECEIVER_LIST` SET "
                   + "`ORGAN_DONOR_RECEIVER_LIST_STATUS` "
                   + "= 'Organ Recived' ,`ORGAN_DONOR_RECEIVER_LIST_DONOR_RECIVER_ID` = '"+donorId+"' WHERE (`ORGAN_DONOR_RECEIVER_LIST_ID` = '"+reciverID+"');";
            System.out.println(updateRciverQuery);
            statement.executeUpdate(updateRciverQuery);
           
            
            int donorHospitalId=0;
            String fetchDonorHospitalId="SELECT HOSPITAL_ID FROM ORGAN_DONOR_RECEIVER_LIST WHERE ORGAN_DONOR_RECEIVER_LIST_ID = "+donorId;
            ResultSet resultSet=statement.executeQuery(fetchDonorHospitalId);
            while(resultSet.next()){
                donorHospitalId=resultSet.getInt("HOSPITAL_ID");
            }
            int reciverHospitalId=0;
            String fetchReciverHospitalId="SELECT HOSPITAL_ID FROM ORGAN_DONOR_RECEIVER_LIST WHERE ORGAN_DONOR_RECEIVER_LIST_ID = "+reciverID;
            resultSet=statement.executeQuery(fetchReciverHospitalId);
            while(resultSet.next()){
                reciverHospitalId=resultSet.getInt("HOSPITAL_ID");
            }
            String createTransportDetails="INSERT INTO `OrganDonation`.`TRANSPORT_DETAILS` "
                    + "(`TRANSPORT_DETAILS_SOURCE_HOSPITAL_ID`, `TRANSPORT_DETAILS_DESTINATION_HOSPITAL_ID`,"
                    + " `TRANSPORT_DETAILS_STATUS`,`TRANSPORT_DETAILS_ORGAN_NAME`)"
                    + " VALUES ('"+donorHospitalId+"', '"+reciverHospitalId+"', 'Sent to Driver Admins','"+organ+"');";
            statement.executeUpdate(createTransportDetails);
            status=true;
        }
        catch(Exception e){
        System.out.println("updateDonorReviciverStatus: "+ e);
    }
        return status;
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
    
public ArrayList<PatientVisit> fetchPotentialDonors(int adminId){
    ArrayList<PatientVisit> potentialDonorList=new ArrayList();
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM POTENTIAL_DONORS AS PD\n" +
            "JOIN NGO AS N ON PD.POTENTIAL_DONORS_NGO_ID=N.NGO_ID\n" +
            "JOIN (SELECT OA.OPO_ADMIN_ID,OPO_REGION FROM OPO AS O JOIN OPO_ADMIN AS OA ON OA.OPO_ID=O.OPO_ID) AS OPO_REG\n" +
            "ON OPO_REG.OPO_REGION=N.NGO_REGION\n" +
            "WHERE OPO_REG.OPO_ADMIN_ID="+adminId;
        ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                PatientVisit pv=new PatientVisit();
                pv.setId(Integer.parseInt(resultSet.getString("POTENTIAL_DONORS_ID")));
                pv.setName(resultSet.getString("POTENTIAL_DONORS_NAME"));
                pv.setAge(Integer.parseInt(resultSet.getString("POTENTIAL_DONORS_AGE")));
                pv.setAddress(resultSet.getString("POTENTIAL_DONORS_ADDRESS")+","+resultSet.getString("NGO_CITY"));
                potentialDonorList.add(pv);
            }
    }
    catch(Exception e){
        System.out.println("updateProfile :"+e);
    }
    return potentialDonorList;
}
}
