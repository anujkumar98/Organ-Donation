/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;

import Business.Employee.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anujkumar
 */
public class DatabaseHandelLogin {
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
            System.out.println("Connection Successful");
         }
        catch (Exception e){
            System.out.println(e);
            }
        return con;
    }
    
    public Employee loginUser(String username,String password,String tableName,String enterprise){
        Employee emp=null;
        try {
            Connection con =createConnection();
            Statement statement=con.createStatement();
            String query="SELECT * FROM "+tableName;
            String usrname="";
            String pass="";
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
            usrname=resultSet.getString(tableName+"_USERNAME");
            pass =resultSet.getString(tableName+"_PASSWORD");
            if (usrname.equals(username) && pass.equals(password)){
                emp=new Employee();
                emp.setUsername(resultSet.getString(tableName+"_USERNAME"));
                emp.setId(resultSet.getInt(tableName+"_ID"));
                emp.setEnterprise(enterprise.toUpperCase()); 
                emp.setName(resultSet.getString(tableName+"_NAME"));
                emp.setAge(resultSet.getInt(tableName+"_AGE"));
                emp.setGender(resultSet.getString(tableName+"_GENDER"));
                emp.setContactNumber(resultSet.getString(tableName+"_CONTACT"));
                emp.setEmail(resultSet.getString(tableName+"_EMAIL"));
                emp.setAddress(resultSet.getString(tableName+"_ADDRESS"));
                
            }
        }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return emp;
    }
    
}
