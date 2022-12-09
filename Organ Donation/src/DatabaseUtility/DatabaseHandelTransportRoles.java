/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import static DatabaseUtility.DatabaseHandleHospitalRoles.createConnection;
import email.util.EmailUtil;
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
public class DatabaseHandelTransportRoles {
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
    
 public static Boolean createLogin(String name,String username,String email, String password,int adminId,String tableName){
    int transportId=-1;
    Boolean status=false;    
    try{
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String queryHospitalId="SELECT TRANSPORT_ID FROM  `OrganDonation`.`TRANSPORT_ADMIN`"
                    + "where TRANSPORT_ADMIN_ID = "+adminId+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                transportId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }
            String query="INSERT INTO `OrganDonation`.`"+tableName+"` "
            + "( `"+tableName.toUpperCase()+"_NAME"+"`, `"+tableName.toUpperCase()+"_USERNAME"+"`, "
            + "`"+tableName.toUpperCase()+"_PASSWORD"+"`, `"+"TRANSPORT_ID"+"` ,`"+tableName.toUpperCase()+"_EMAIL"+"` "
                    + "`,`"+tableName.toUpperCase()+"_EMAIL`)"
            + "VALUES ('"+name+"', '"+username+"', '"+password+"', '"+transportId+"' , ' "+email+", 'Free')";
    statement.executeUpdate(query);
    EmailUtil.sendEmail(email,username,password);
    status=true;
        }
        catch(Exception e){
            System.out.println("Create Login :"+e);
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
        System.out.println("Check Unique Username : "+e);
    }
    return check;
}
public ArrayList <Employee> employeeList(int adminId){
    EmployeeDirectory ed=new EmployeeDirectory();
    int transportId=-1;
    ArrayList <Employee> employeeList = new ArrayList<> ();
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String queryHospitalId="SELECT TRANSPORT_ID FROM  `OrganDonation`.`TRANSPORT_ADMIN`"
                    + "where TRANSPORT_ADMIN_ID = "+adminId+";";
            ResultSet resultSet=statement.executeQuery(queryHospitalId);
            while(resultSet.next()){
                transportId=Integer.parseInt(resultSet.getString("HOSPITAL_ID"));
            }
        String query="SELECT * FROM `TRANSPORT_DRIVER` WHERE TRANSPORT_ID = "+transportId;
        resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            Employee emp= new Employee();
            emp.setId(resultSet.getInt("TRANSPORT_DRIVER_ID"));
            emp.setName(resultSet.getString("TRANSPORT_DRIVER_NAME"));
            emp.setRole(resultSet.getString("TRANSPORT_DRIVER_STATUS"));//Stores the status of the driver . Free or occupied
            emp.setUsername(resultSet.getString("TRANSPORT_DRIVER_USERNAME"));
            employeeList=ed.add(emp);
        }
    } catch(Exception e){
        System.out.println("Employee List Drivers"+e);
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

}
