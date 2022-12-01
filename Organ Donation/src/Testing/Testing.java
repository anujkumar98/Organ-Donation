/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;
import Business.Enterprise.HospitalDirectory;
import Business.Enterprise.HospitalEnterprise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anujkumar
 */
public class Testing {
    public static Connection createConnection(){
        
        Connection con=null;
        final String DB_URL ="jdbc:mysql://localhost:3306/OrganDonation";
        final String DB_USER = "root";
        final String DB_PASSWD = "anujkumar";
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
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
    public static void main(String args[]){
        
            //        Testing testing=new Testing(EnterpriseType.Hospital,"anuj","anuj");
//        testing.setName("Anuj");
//        System.out.print(testing.getName());
//        System.out.println(testing.getOrganizationID());
//
//        
//        Testing testing1=new Testing(EnterpriseType.NGO,"anuj","anuj");
//        testing1.setName("Anuj Kumar");
//        System.out.print(testing1.getName());
//        System.out.println(testing1.getOrganizationID());
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        try {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            //Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println(ex);
//        }
//  
       
//    public Testing(EnterpriseType enterpriseType, String username, String password) {
//        super(enterpriseType, username, password);
//    }
   
    createHospital("Kunal","Roxburry","New 123", "SEA");
    HospitalDirectory hd=fetchHospital();
    
    ArrayList<HospitalEnterprise> a=hd.getHospitalDirectory();
    for(int i=0;i<a.size();i++){
        System.out.println(a.get(i).getName());
    }
    
}
    
public static int getMaxID(){
    int maxID=0;
    try{
    Connection con=createConnection();
    Statement statement=con.createStatement();
    ResultSet resultSet=statement.executeQuery("SELECT MAX(HOSPITAL_ID) AS HOSPITAL_ID FROM HOSPITAL");
    while(resultSet.next()){
       maxID=resultSet.getInt("HOSPITAL_ID");
    }
    
    }
    catch(Exception e){
        System.out.println(e);
    }
    return maxID+1;
}
public static void createHospital(String name,String city,String state,String region){
    try{
    Connection con=createConnection();
    Statement statement=con.createStatement();
    int hospitalID=getMaxID();
    String query="INSERT INTO `OrganDonation`.`HOSPITAL` "
            + "(`HOSPITAL_ID`, `HOSPITAL_NAME`, `HOSPITAL_CITY`, `HOSPITAL_STATE`, `HOSPITAL_REGION`) "
            + "VALUES ('"+Integer.toString(hospitalID)+"', '"+name+"', '"+city+"', '"+state+"', '"+region+"')";
    statement.executeUpdate(query);
    
    }
    catch(Exception e){
        System.out.println(e);
    }
}

public static HospitalDirectory fetchHospital(){
    HospitalDirectory hd=hd=new HospitalDirectory();;
    try{
    
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM HOSPITAL");
        while(resultSet.next()){
            HospitalEnterprise h=new HospitalEnterprise();
            h.setName(resultSet.getString("HOSPITAL_NAME"));
            h.setCity(resultSet.getString("HOSPITAL_CITY"));
            h.setState(resultSet.getString("HOSPITAL_STATE"));
            h.setRegion(resultSet.getString("HOSPITAL_REGION"));
            hd.addHospital(h);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
     return hd;
        
    }
}




