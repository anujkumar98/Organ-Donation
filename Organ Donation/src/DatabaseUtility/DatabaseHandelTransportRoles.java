/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Transport.TransportRequest;
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
                transportId=Integer.parseInt(resultSet.getString("TRANSPORT_ID"));
            }
            String query="INSERT INTO `OrganDonation`.`TRANSPORT_DRIVER` \n" +
                "( `TRANSPORT_DRIVER_NAME`, `TRANSPORT_DRIVER_USERNAME`,\n" +
                " `TRANSPORT_DRIVER_PASSWORD`, `TRANSPORT_ID`  ,`TRANSPORT_DRIVER_EMAIL`,`TRANSPORT_DRIVER_STATUS`)\n" +
                " VALUES ('"+name+"','"+username+"','"+password+"','"+transportId+"','"+email+"','Available')";
            System.out.println(query);
    statement.executeUpdate(query);
    String text="Your username is " + username + ". \nYour password is "+password+ "\n "
                    + "Thank you for registering.";
    EmailUtil.sendEmail(email,text);
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
                transportId=Integer.parseInt(resultSet.getString("TRANSPORT_ID"));
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
public ArrayList<TransportRequest> fetchTransportRequests(int adminId){
    ArrayList<TransportRequest> transportList=new ArrayList();
    try {
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String queryfetechRequests="SELECT * FROM TRANSPORT_DETAILS AS TD"
                + " JOIN HOSPITAL AS H_SRC ON TD.TRANSPORT_DETAILS_SOURCE_HOSPITAL_ID =H_SRC.HOSPITAL_ID"
                + " JOIN HOSPITAL AS H_DEST ON TD.TRANSPORT_DETAILS_DESTINATION_HOSPITAL_ID =H_DEST.HOSPITAL_ID"
                + " JOIN (SELECT TRANSPORT_REGION,TRANSPORT_ADMIN_ID FROM TRANSPORT AS T JOIN  TRANSPORT_ADMIN AS TA ON T.TRANSPORT_ID=TA.TRANSPORT_ID) AS T_REG "
                + "ON H_SRC.HOSPITAL_REGION=T_REG.TRANSPORT_REGION "
                + "WHERE T_REG.TRANSPORT_ADMIN_ID="+adminId+"; ";
        
        ResultSet resultSet=statement.executeQuery(queryfetechRequests);
        while(resultSet.next()){
            int srcHospitalId=Integer.parseInt(resultSet.getString("TRANSPORT_DETAILS_SOURCE_HOSPITAL_ID"));
            int destHospitalId=Integer.parseInt(resultSet.getString("TRANSPORT_DETAILS_DESTINATION_HOSPITAL_ID"));
            if(srcHospitalId!=destHospitalId){
                TransportRequest tr=new TransportRequest();
                tr.setId(Integer.parseInt(resultSet.getString("TRANSPORT_DETAILS_ID")));
                tr.setSrcHopitalId(srcHospitalId);
                tr.setDestHopitalId(destHospitalId);
                String srcAdd=resultSet.getString("H_SRC.HOSPITAL_CITY")+", "+resultSet.getString("H_SRC.HOSPITAL_STATE")+" ,"+resultSet.getString("H_SRC.HOSPITAL_REGION");
                String desAdd=resultSet.getString("H_DEST.HOSPITAL_CITY")+", "+resultSet.getString("H_DEST.HOSPITAL_STATE")+" ,"+resultSet.getString("H_DEST.HOSPITAL_REGION");
                tr.setSrcHospitalAddress(srcAdd);
                tr.setDestHospitalAddress(desAdd);
                tr.setDestHospitalName(resultSet.getString("H_DEST.HOSPITAL_NAME"));
                tr.setSrcHospitalName(resultSet.getString("H_SRC.HOSPITAL_NAME"));
                tr.setRequestStatus(resultSet.getString("TRANSPORT_DETAILS_STATUS"));
                tr.setOrganName(resultSet.getString("TRANSPORT_DETAILS_ORGAN_NAME"));
                transportList.add(tr);
            }
        }
    }
    catch(Exception e){
        System.out.println("updateProfile :"+e);
    }
    return transportList;
}

public ArrayList<Employee> fetchDrivers(int adminId){
    ArrayList<Employee> driverlist=new ArrayList();
    try{
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM  TRANSPORT_DRIVER AS TD\n" +
            "JOIN TRANSPORT_ADMIN AS TA ON TD.TRANSPORT_ID=TA.TRANSPORT_ID "
                + "WHERE TRANSPORT_ADMIN_ID = "+adminId +" AND TRANSPORT_DRIVER_STATUS = 'Available'";
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            Employee e=new Employee();
            e.setId(Integer.parseInt(resultSet.getString("TRANSPORT_DRIVER_ID")));
            e.setName(resultSet.getString("TRANSPORT_DRIVER_NAME"));
            driverlist.add(e);
        }
    }
    catch(Exception e){
        System.out.println("fetchDrivers :"+e);
    }
    return driverlist;
}

public Boolean updateTransportDetails(int adminId,int driverId,int id){
    Boolean status=false;
    try{
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String updateQuery="UPDATE `OrganDonation`.`TRANSPORT_DETAILS` SET "
                + "`TRANSPORT_DETAILS_STATUS` = 'Sent to driver',"
                + " `DRIVER_ID` = '"+driverId+"' WHERE (`TRANSPORT_DETAILS_ID` = '"+id+"');";
        statement.executeUpdate(updateQuery);
        String updateDriver="UPDATE `OrganDonation`.`TRANSPORT_DRIVER` "
                + "SET `TRANSPORT_DRIVER_STATUS` = 'Occupied' WHERE (`TRANSPORT_DRIVER_ID` = '"+driverId+"');";
        statement.executeUpdate(updateDriver);
        status=true;
    }
    catch(Exception e){
        System.out.println("updateTransportDetails :"+e);
    }
    return status;
}

public ArrayList<TransportRequest> fetchDriverDetails(int driverId){
    ArrayList<TransportRequest> transportList=new ArrayList();
    try{
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String updateDriver="SELECT * FROM TRANSPORT_DETAILS AS TD JOIN HOSPITAL "
                + "AS H_SRC ON TD.TRANSPORT_DETAILS_SOURCE_HOSPITAL_ID =H_SRC.HOSPITAL_ID \n" +
                " JOIN HOSPITAL AS H_DEST ON TD.TRANSPORT_DETAILS_DESTINATION_HOSPITAL_ID =H_DEST.HOSPITAL_ID \n" +
                    " WHERE DRIVER_ID= "+driverId+"  AND TRANSPORT_DETAILS_STATUS='Sent to driver';";
        ResultSet resultSet=statement.executeQuery(updateDriver);
        while(resultSet.next()){
                TransportRequest tr=new TransportRequest();
                tr.setId(Integer.parseInt(resultSet.getString("TRANSPORT_DETAILS_ID")));
                tr.setSrcHopitalId(Integer.parseInt(resultSet.getString("TRANSPORT_DETAILS_SOURCE_HOSPITAL_ID")));
                tr.setDestHopitalId(Integer.parseInt(resultSet.getString("TRANSPORT_DETAILS_DESTINATION_HOSPITAL_ID")));
                String srcAdd=resultSet.getString("H_SRC.HOSPITAL_CITY")+", "+resultSet.getString("H_SRC.HOSPITAL_STATE")+" ,"+resultSet.getString("H_SRC.HOSPITAL_REGION");
                String desAdd=resultSet.getString("H_DEST.HOSPITAL_CITY")+", "+resultSet.getString("H_DEST.HOSPITAL_STATE")+" ,"+resultSet.getString("H_DEST.HOSPITAL_REGION");
                tr.setSrcHospitalAddress(srcAdd);
                tr.setDestHospitalAddress(desAdd);
                tr.setDestHospitalName(resultSet.getString("H_DEST.HOSPITAL_NAME"));
                tr.setSrcHospitalName(resultSet.getString("H_SRC.HOSPITAL_NAME"));
                tr.setRequestStatus(resultSet.getString("TRANSPORT_DETAILS_STATUS"));
                tr.setOrganName(resultSet.getString("TRANSPORT_DETAILS_ORGAN_NAME"));
                transportList.add(tr);
    }
    }
    catch(Exception e){
        System.out.println("updateTransportDetails :"+e);
    }
    return transportList;
}

public Boolean updateTransportDetails(int id,int driverId){
    Boolean status=false;
    try{
        Connection con = createConnection();
        Statement statement=con.createStatement();
        String query="UPDATE `OrganDonation`.`TRANSPORT_DETAILS` "
                + "SET `TRANSPORT_DETAILS_STATUS` = 'Delivered' WHERE (`TRANSPORT_DETAILS_ID` = '"+id+"');";
        statement.executeUpdate(query);
        String query1="UPDATE `OrganDonation`.`TRANSPORT_DRIVER` "
                + "SET `TRANSPORT_DRIVER_STATUS` = 'Avaliable' WHERE (`TRANSPORT_DRIVER_ID` = '"+driverId+"');";
        statement.executeUpdate(query1);
        String srcHospitalIdQuery="Select * from `OrganDonation`.`TRANSPORT_DETAILS` WHERE `TRANSPORT_DETAILS_ID` = "+id;
        int srcHospitalId=0;
        ResultSet resultSet=statement.executeQuery(srcHospitalIdQuery);{
        while(resultSet.next()){
            srcHospitalId=Integer.parseInt(resultSet.getString("TRANSPORT_DETAILS_DESTINATION_HOSPITAL_ID"));
        }
        String queryHospitalEmail= "SELECT * FROM HOSPITAL_ADMIN WHERE HOSPITAL_ID = "+srcHospitalId;
        String hospitalEmail="";
        resultSet=statement.executeQuery(queryHospitalEmail);
        while(resultSet.next()){
            hospitalEmail=resultSet.getString("HOSPITAL_ADMIN_EMAIL"); 
        }
        System.out.println(hospitalEmail);
        String text="Your requested organ is delivered by driver.";
        EmailUtil.sendEmail(hospitalEmail,text);
        }
        status=true;
    }
    catch(Exception e){
        System.out.println("updateTransportDetails :"+e);
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
}
