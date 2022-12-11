/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientVisit;
import Business.Patient.PatientVisitDirectory;
import static DatabaseUtility.DatabaseHandelTransportRoles.createConnection;
import static DatabaseUtility.DatabaseHandleHospitalRoles.createConnection;
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
public class DatabaseHandleNgoRole {
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
    
    public static Boolean createDonorList(String name,String gender, int age,String contact, String address,String email,int adminId){
    Boolean status=false;    
    int ngoId=0;
    try{    
            Connection con=createConnection();
            Statement statement=con.createStatement();
            String queryNgoId="SELECT NGO_ID FROM NGO_ADMIN WHERE NGO_ADMIN_ID = "+adminId;
            ResultSet resultSet=statement.executeQuery(queryNgoId);
            while(resultSet.next()){
                ngoId=Integer.parseInt(resultSet.getString("NGO_ID"));
            }
            String query="INSERT INTO `OrganDonation`.`POTENTIAL_DONORS` "
                    + "(`POTENTIAL_DONORS_NAME`, `POTENTIAL_DONORS_GENDER`, `POTENTIAL_DONORS_AGE`, "
                    + "`POTENTIAL_DONORS_CONTACT`, `POTENTIAL_DONORS_ADDRESS`, `POTENTIAL_DONORS_NGO_ID`, "
                    + "`POTENTIAL_DONORS_EMAIL`)"
                    + " VALUES ('"+name+"', '"+gender+"', '"+age+"', '"+contact+"', '"+address+"', '"+ngoId+"', '"+email+"');";
    statement.executeUpdate(query);
    status=true;
        }
        catch(Exception e){
            System.out.println("createDonorList : "+e);
        }
    return status;
    }
public ArrayList <Employee> fetchAdminDonorRevicerList(int adminId){
ArrayList <Employee> donorList= new ArrayList();
EmployeeDirectory pvd=new EmployeeDirectory();
int ngoId=0;
    try{
           Connection con=createConnection();
           Statement statement=con.createStatement();
           String queryNgoId="SELECT NGO_ID FROM `OrganDonation`.`NGO_ADMIN`"
                    + "where NGO_ADMIN_ID = "+adminId+";";
            ResultSet resultSet=statement.executeQuery(queryNgoId);
            while(resultSet.next()){
                ngoId=Integer.parseInt(resultSet.getString("NGO_ID"));
            }
            String getDonorList="SELECT * FROM POTENTIAL_DONORS WHERE POTENTIAL_DONORS_NGO_ID = "+ngoId;
            resultSet=statement.executeQuery(getDonorList);
            while(resultSet.next()){
            Employee pv=new Employee();
            pv.setName(resultSet.getString("POTENTIAL_DONORS_NAME"));
            pv.setAge(resultSet.getInt("POTENTIAL_DONORS_AGE"));
            pv.setGender(resultSet.getString("POTENTIAL_DONORS_GENDER"));
            pv.setId(resultSet.getInt("POTENTIAL_DONORS_ID"));
            pv.setAddress(resultSet.getString("POTENTIAL_DONORS_ADDRESS"));
            pv.setContactNumber(resultSet.getString("POTENTIAL_DONORS_CONTACT"));
            pv.setEmail(resultSet.getString("POTENTIAL_DONORS_EMAIL"));
            donorList=pvd.add(pv);
            }
            
    }
    catch(Exception e) {
           System.out.println("populateAdminDonorList : " +e);
       }
    return donorList;
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
}
