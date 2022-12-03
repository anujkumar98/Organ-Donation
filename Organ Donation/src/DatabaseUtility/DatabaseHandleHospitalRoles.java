/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import static DatabaseUtility.DatabaseEnterpriseUtilities.createConnection;
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
public class DatabaseHandleHospitalRoles {
    
    public static Connection createConnection(){
        
        Connection con=null;
        final String DB_URL ="jdbc:mysql://localhost:3306/OrganDonation";
        final String DB_USER = "root";
        final String DB_PASSWD = "anujkumar";
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
    
    public static void createLogin(String name,String username, String password,String role,int hospitalID,String tableName){
        try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String query="INSERT INTO `OrganDonation`.`"+tableName+"` "
            + "( `"+tableName.toUpperCase()+"_NAME"+"`, `"+tableName.toUpperCase()+"_USERNAME"+"`, "
            + "`"+tableName.toUpperCase()+"_PASSWORD"+"`, `"+"HOSPITAL_ID"+"`) "
            + "VALUES ('"+name+"', '"+username+"', '"+password+"', '"+hospitalID+"')";
    statement.executeUpdate(query);
        }
        catch(Exception e){
            System.out.println("Create Login"+e);
        }
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
public void updateProfile(String name,String email,String contact,int age,String address,String gender,String tableName,int id){
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
        
    } 
    catch(Exception e){
        System.out.println("updateProfile :"+e);
    }
}
}