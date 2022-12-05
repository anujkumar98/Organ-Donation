/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
    
public static Boolean createLogin(String name,String username, String password,String role,int hospitalID,String tableName){
    Boolean status=false;    
    try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String query="INSERT INTO `OrganDonation`.`"+tableName+"` "
            + "( `"+tableName.toUpperCase()+"_NAME"+"`, `"+tableName.toUpperCase()+"_USERNAME"+"`, "
            + "`"+tableName.toUpperCase()+"_PASSWORD"+"`, `"+"HOSPITAL_ID"+"`) "
            + "VALUES ('"+name+"', '"+username+"', '"+password+"', '"+hospitalID+"')";
    statement.executeUpdate(query);
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

public ArrayList <Employee> employeeList(){
    EmployeeDirectory ed=new EmployeeDirectory();
    ArrayList <Employee> employeeList = new ArrayList<> ();
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM `HOSPITAL_RECEPTIONIST`";
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
        String query="SELECT * FROM `HOSPITAL_DOCTOR`";
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
        String query="SELECT * FROM `HOSPITAL_PATHOLOGIST`";
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
public Boolean updateProfile(String name,String email,String contact,int age,String address,String gender,String tableName,int id){
    Boolean status=false;
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="UPDATE `OrganDonation`.`"+tableName.toUpperCase()+"` SET "
            + "`"+tableName.toUpperCase()+"_NAME` = '"+name+"', `"+tableName.toUpperCase()+"_AGE` = '"+Integer.toString(age)+"', "
            + "`"+tableName.toUpperCase()+"_CONTACT` = '"+contact+"', `"+tableName.toUpperCase()+"_EMAIL` = '"+email+"',"+
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
            String query="INSERT INTO `OrganDonation`.`HOSPITAL_PATIENT` (`HOSPITAL_PATIENT_NAME`,"
                    + "`HOSPITAL_PATIENT_AGE`, `HOSPITAL_PATIENT_EMAIL`, `HOSPITAL_PATIENT_GENDER`, "
                    + "`HOSPITAL_PATIENT_CONTACT`, `HOSPITAL_PATIENT_ADDRESS`, `HOSPITAL_PATIENT_TYPE`,`HOSPITAL_ID`) "
                    + "VALUES ('"+name+"', '"+age+"', '"+email+"', '"+gender+"', '"+contact+"' , '"+address+"',"
                    + "'"+type+"', '"+hospitalId+"');";
            //System.out.println(query);
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
public ArrayList <Employee> fetchPatient(int id ){
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

public Boolean creatVisit(int patientId,int doctorId){
    Boolean status=false;
    try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String query="INSERT INTO `OrganDonation`.`PATIENTS_VISIT` (`"
                + "PATIENTS_VISIT_DOCTOR_ID`, `PATIENTS_VISIT_PATIENT_ID`) VALUES "
                + "('"+doctorId+"', '"+patientId+"')";

        statement.executeUpdate(query);
        status=true;
    }
    catch (Exception e){
    System.out.println("creatVisit"+ e);
    }
    return status;
}
}