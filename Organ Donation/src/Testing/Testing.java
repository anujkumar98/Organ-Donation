/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anujkumar
 */
public class Testing {
    
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
        final String DB_URL ="jdbc:mysql://localhost:3306/OrganDonation";
        final String DB_USER = "root";
        final String DB_PASSWD = "anujkumar";
        //Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
         {
            
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/OrganDonation","root","anujkumar");
            System.out.println("Connection Successful");
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM HOSPITAL H\n" +
                                             "LEFT JOIN DOCTOR D\n" +
                                             "ON H.HOSPITAL_ID=D.HOSPITAL_ID");
            while(resultSet.next()){
            System.out.printf("%s %s %s %s ",
            resultSet.getString("DOCTOR_USERNAME"),
            resultSet.getString("DOCTOR_NAME"),
            resultSet.getString("HOSPITAL_NAME"),
            resultSet.getString("HOSPITAL_CITY"));
            System.out.println();
         }
         }
         
        catch(Exception e)
        {
        
        System.out.println("Did not connect");
        System.out.println(e);
        }

//    public Testing(EnterpriseType enterpriseType, String username, String password) {
//        super(enterpriseType, username, password);
//    }
    
    
    
}

}
