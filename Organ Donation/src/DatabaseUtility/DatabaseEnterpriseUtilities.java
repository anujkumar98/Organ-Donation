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
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import email.util.EmailUtil;
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
    
public Boolean createNetwork(String cityName, String stateName, String regionName){
    Boolean status=false;
    try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String query="INSERT INTO `OrganDonation`.`NETWORK` (`NETWORK_CITY`, `NETWORK_STATE`,"
                + " `NETWORK_REGION`) VALUES ('"+cityName+"', '"+stateName+"', '"+regionName+"')";
        statement.executeUpdate(query);
        status=true;
    }
    catch(Exception e){
        System.out.println(e);
    }
    return status;
}

public NetworkDirectory fetchNetwork(){
    NetworkDirectory nd=new NetworkDirectory();
    try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM `OrganDonation`.`NETWORK`;";
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            Network n =new Network();
            n.setCity(resultSet.getString("NETWORK_CITY"));
            n.setRegion(resultSet.getString("NETWORK_REGION"));
            n.setState(resultSet.getString("NETWORK_STATE"));
            nd.addNetwork(n);
        }
    }
    catch(Exception e){
        System.out.println("fetchNetwork:"+e);
    }
    return nd;
}
public Boolean createEnterprise(String name,String city,String state,String region,String enterprise){
    Boolean status=false;
    try{
    Connection con=createConnection();
    Statement statement=con.createStatement();
    String query="INSERT INTO `OrganDonation`.`"+enterprise.toUpperCase()+"` "
            + "( `"+enterprise.toUpperCase()+"_NAME"+"`, `"+enterprise.toUpperCase()+"_CITY"+"`, "
            + "`"+enterprise.toUpperCase()+"_STATE"+"`, `"+enterprise.toUpperCase()+"_REGION"+"`) "
            + "VALUES ('"+name+"', '"+city+"', '"+state+"', '"+region+"')";
    statement.executeUpdate(query);
    status=true;
    }
    catch(Exception e){
        System.out.println(e);
    }
    return status;
}

public Boolean updateEnterprise(int id,String name,String city,String state,String region,String enterprise){
    Boolean status=false;
    try{
    Connection con=createConnection();
    Statement statement=con.createStatement();
    String query="UPDATE `OrganDonation`.`"+enterprise.toUpperCase()+"` SET "
            + "`"+enterprise.toUpperCase()+"_NAME` = '"+name+"', `"+enterprise.toUpperCase()+"_CITY` = '"+city+"', "
            + "`"+enterprise.toUpperCase()+"_STATE` = '"+state+"', `"+enterprise.toUpperCase()+"_REGION` = '"+region+"' WHERE (`"+
            enterprise.toUpperCase()+"_ID` = '"+Integer.toString(id)+"');";
    //System.out.println(query);
    statement.executeUpdate(query);
    status = true;
    }
    catch(Exception e){
        System.out.println(e);
    }
    return status;
}


public HospitalDirectory fetchHospital(){
    HospitalDirectory hd=new HospitalDirectory();
    try{
    
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("""
                                                   SELECT * FROM `OrganDonation`.`HOSPITAL` AS HA
                                                   LEFT JOIN `OrganDonation`.`HOSPITAL_ADMIN` AS H
                                                   ON HA.HOSPITAL_ID=H.HOSPITAL_ID;""");
        while(resultSet.next()){
            HospitalEnterprise h=new HospitalEnterprise();
            h.setId(resultSet.getInt("HOSPITAL_ID"));
            h.setName(resultSet.getString("HOSPITAL_NAME"));
            h.setCity(resultSet.getString("HOSPITAL_CITY"));
            h.setState(resultSet.getString("HOSPITAL_STATE"));
            h.setRegion(resultSet.getString("HOSPITAL_REGION"));
            h.setAdminName(resultSet.getString("HOSPITAL_ADMIN_NAME"));
            hd.addHospital(h);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
     return hd;
        
    }
//Code to check unique username in the table
public Boolean checkUniqueUserName(String uname,String enterprise){
    Boolean check=true;
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM `"+enterprise.toUpperCase()+"_ADMIN` ";
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            String usrName=resultSet.getString(enterprise.toUpperCase()+"_ADMIN_USERNAME");
            if (usrName.equals(uname))
                check=false;
        }
    }   
    catch(Exception e){
        System.out.println(e);
    }
    return check;
}
public Boolean createEnterpriseAdmin(int hospitalId,String name,String username,String password,String enterprise,String email){
    Boolean status=false;
    try{
    
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String query="INSERT INTO `OrganDonation`.`"+enterprise.toUpperCase()+"_ADMIN` "
            + "( `"+enterprise.toUpperCase()+"_ADMIN_USERNAME"+"`, `"+enterprise.toUpperCase()+"_ADMIN_NAME"+"`, "
            + "`"+enterprise.toUpperCase()+"_ID"+"`, `"+enterprise.toUpperCase()+
                "_ADMIN_PASSWORD"+"` , `"+enterprise.toUpperCase()+"_ADMIN_EMAIL"+"`) "
            + "VALUES ('"+username+"', '"+name+"', '"+hospitalId+"', '"+password+"','"+email+"')";
        String text="Your username is " + username + ". \nYour password is "+password+ "\n "
                    + "Thank you for registering.";
        EmailUtil.sendEmail(email,text);
        statement.executeUpdate(query);
        status=true;
    }
    catch(Exception e){
        System.out.println(e);
    }
    return status;
}
public NgoDirectory fetchNGO(){
    NgoDirectory ne=new NgoDirectory();
    try{
    
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM `OrganDonation`.`NGO` AS N\n" +
"                                                   LEFT JOIN `OrganDonation`.`NGO_ADMIN` AS NA\n" +
"                                                   ON N.NGO_ID=NA.NGO_ID;");
        while(resultSet.next()){
            NgoEnterprise n=new NgoEnterprise();
            n.setId(resultSet.getInt("NGO_ID"));
            n.setName(resultSet.getString("NGO_NAME"));
            n.setCity(resultSet.getString("NGO_CITY"));
            n.setState(resultSet.getString("NGO_STATE"));
            n.setRegion(resultSet.getString("NGO_REGION"));
            n.setAdminName(resultSet.getString("NGO_ADMIN_NAME"));
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
        ResultSet resultSet=statement.executeQuery("SELECT * FROM `OrganDonation`.`OPO` AS O\n" +
"                                                   LEFT JOIN `OrganDonation`.`OPO_ADMIN` AS OA\n" +
"                                                   ON O.OPO_ID=OA.OPO_ID;");
        while(resultSet.next()){
            OpoEnterprise o=new OpoEnterprise();
            o.setId(resultSet.getInt("OPO_ID"));
            o.setName(resultSet.getString("OPO_NAME"));
            o.setCity(resultSet.getString("OPO_CITY"));
            o.setState(resultSet.getString("OPO_STATE"));
            o.setRegion(resultSet.getString("OPO_REGION"));
            o.setAdminName(resultSet.getString("OPO_ADMIN_NAME"));
            od.addOpo(o);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
     return od;
        
    }

public Boolean checkUniqueOPO(String region){
    Boolean status=true;
    OpoDirectory od=fetchOpo();
    for (OpoEnterprise o: od.getOpoDirectory()){
        if(o.getRegion().equalsIgnoreCase(region)){
            status=false;
        }
    }
    return status;
}
public Boolean checkUniqueTransport(String region){
    Boolean status=true;
    TransportDirectory od=fetchTransport();
    for (TransportEnterprise o: od.getTransportDirectory()){
        if(o.getRegion().equalsIgnoreCase(region)){
            status=false;
        }
    }
    return status;
}

public TransportDirectory fetchTransport(){
    TransportDirectory td=new TransportDirectory();
    try{
    
        Connection con=createConnection();
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT * FROM `OrganDonation`.`TRANSPORT` AS T\n" +
"                                                   LEFT JOIN `OrganDonation`.`TRANSPORT_ADMIN` AS TA\n" +
"                                                   ON T.TRANSPORT_ID=TA.TRANSPORT_ID;");
        while(resultSet.next()){
            TransportEnterprise t=new TransportEnterprise();
            t.setId(resultSet.getInt("TRANSPORT_ID"));
            t.setName(resultSet.getString("TRANSPORT_NAME"));
            t.setCity(resultSet.getString("TRANSPORT_CITY"));
            t.setState(resultSet.getString("TRANSPORT_STATE"));
            t.setRegion(resultSet.getString("TRANSPORT_REGION"));
            t.setAdminName(resultSet.getString("TRANSPORT_ADMIN_NAME"));
            td.addTransport(t);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
     return td;
        
    }

 public Boolean deleteEnterprise(int id,String enterprise){
     Boolean status=false;
     try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        statement.execute("DELETE FROM `"+enterprise.toUpperCase()+"` where "+enterprise.toUpperCase()+"_ID = '"+Integer.toString(id)+"'");
        status=true;
     }
    catch(Exception e){
        System.out.println(e);
    }
     return status;
 }
 
 
}




