/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;
import Business.Enterprise.HospitalDirectory;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.NgoDirectory;
import Business.Enterprise.NgoEnterprise;
import Business.Enterprise.OpoDirectory;
import Business.Enterprise.OpoEnterprise;
import Business.Enterprise.TransportDirectory;
import Business.Enterprise.TransportEnterprise;
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
public class DatabaseEnterpriseUtilities {
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
            System.out.println("Connection Successful");
         }
        catch (Exception e){
            System.out.println(e);
            }
        return con;
    }
    public static void main(String args[]){
  
}

public void createEnterprise(String name,String city,String state,String region,String enterprise){
    try{
    Connection con=createConnection();
    Statement statement=con.createStatement();
    String query="INSERT INTO `OrganDonation`.`"+enterprise.toUpperCase()+"` "
            + "( `"+enterprise.toUpperCase()+"_NAME"+"`, `"+enterprise.toUpperCase()+"_CITY"+"`, "
            + "`"+enterprise.toUpperCase()+"_STATE"+"`, `"+enterprise.toUpperCase()+"_REGION"+"`) "
            + "VALUES ('"+name+"', '"+city+"', '"+state+"', '"+region+"')";
    statement.executeUpdate(query);

    }
    catch(Exception e){
        System.out.println(e);
    }
}

public void updateEnterprise(int id,String name,String city,String state,String region,String enterprise){
    try{
    Connection con=createConnection();
    Statement statement=con.createStatement();
    String query="UPDATE `OrganDonation`.`"+enterprise.toUpperCase()+"` SET "
            + "`"+enterprise.toUpperCase()+"_NAME` = '"+name+"', `"+enterprise.toUpperCase()+"_CITY` = '"+city+"', "
            + "`"+enterprise.toUpperCase()+"_STATE` = '"+state+"', `"+enterprise.toUpperCase()+"_REGION` = '"+region+"' WHERE (`"+
            enterprise.toUpperCase()+"_ID` = '"+Integer.toString(id)+"');";
    System.out.println(query);
    statement.executeUpdate(query);
    
    }
    catch(Exception e){
        System.out.println(e);
    }
}


public HospitalDirectory fetchHospital(){
    HospitalDirectory hd=new HospitalDirectory();
    try{
    
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM HOSPITAL");
        while(resultSet.next()){
            HospitalEnterprise h=new HospitalEnterprise();
            h.setId(resultSet.getInt("HOSPITAL_ID"));
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

public NgoDirectory fetchNGO(){
    NgoDirectory ne=new NgoDirectory();
    try{
    
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM NGO");
        while(resultSet.next()){
            NgoEnterprise n=new NgoEnterprise();
            n.setId(resultSet.getInt("NGO_ID"));
            n.setName(resultSet.getString("NGO_NAME"));
            n.setCity(resultSet.getString("NGO_CITY"));
            n.setState(resultSet.getString("NGO_STATE"));
            n.setRegion(resultSet.getString("NGO_REGION"));
            ne.addNgo(n);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
     return ne;
        
    }

public OpoDirectory fetchOpo(){
    OpoDirectory od=new OpoDirectory();
    try{
    
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM OPO");
        while(resultSet.next()){
            OpoEnterprise o=new OpoEnterprise();
            o.setId(resultSet.getInt("OPO_ID"));
            o.setName(resultSet.getString("OPO_NAME"));
            o.setCity(resultSet.getString("OPO_CITY"));
            o.setState(resultSet.getString("OPO_STATE"));
            o.setRegion(resultSet.getString("OPO_REGION"));
            od.addOpo(o);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
     return od;
        
    }

public TransportDirectory fetchTransport(){
    TransportDirectory td=new TransportDirectory();
    try{
    
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM TRANSPORT");
        while(resultSet.next()){
            TransportEnterprise t=new TransportEnterprise();
            t.setId(resultSet.getInt("TRANSPORT_ID"));
            t.setName(resultSet.getString("TRANSPORT_NAME"));
            t.setCity(resultSet.getString("TRANSPORT_CITY"));
            t.setState(resultSet.getString("TRANSPORT_STATE"));
            t.setRegion(resultSet.getString("TRANSPORT_REGION"));
            td.addTransport(t);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
     return td;
        
    }

 public void deleteEnterprise(int id,String enterprise){
     try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        statement.execute("DELETE FROM `"+enterprise.toUpperCase()+"` where "+enterprise.toUpperCase()+"_ID = '"+Integer.toString(id)+"'");
        
     }
    catch(Exception e){
        System.out.println(e);
    }
 }
}




