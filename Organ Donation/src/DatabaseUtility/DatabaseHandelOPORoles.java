/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseUtility;

import Business.Employee.Employee;
import Business.Patient.PatientVisit;
import Business.Patient.PatientVisitDirectory;
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
public class DatabaseHandelOPORoles {
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
    
    public ArrayList <PatientVisit> fetchDonorReciverList(int adminId,String type){
        ArrayList <PatientVisit> patientVisitList= new ArrayList();
        PatientVisitDirectory pvd=new PatientVisitDirectory();
        try{
        Connection con=createConnection();
        Statement statement=con.createStatement();
        String query="SELECT * FROM ORGAN_DONOR_RECEIVER_LIST AS ODRL JOIN "
                + " HOSPITAL AS H ON H.HOSPITAL_ID=ODRL.HOSPITAL_ID "
                + " JOIN PATIENTS_VISIT AS PV ON PV.PATIENTS_VISIT_ID=ODRL.VISIT_ID"
                + " JOIN HOSPITAL_PATIENT AS HP ON PV.HOSPITAL_PATIENT_ID= HP.HOSPITAL_PATIENT_ID"
                + " JOIN (SELECT OPO_REGION,OA.OPO_ADMIN_ID FROM OPO_ADMIN AS OA JOIN  OPO AS O ON  OA.OPO_ID=O.OPO_ID)"
                + " AS OPO_REG ON OPO_REG.OPO_REGION = H.HOSPITAL_REGION WHERE "
                + " ODRL.ORGAN_DONOR_RECEIVER_LIST_STATUS = 'Sent to OPO' AND ODRL.ORGAN_DONOR_RECEIVER_LIST_TYPE='"+type+"'"
                + " AND OPO_REG.OPO_ADMIN_ID ="+ adminId;
        
        ResultSet resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            PatientVisit pv=new PatientVisit();
            pv.setId(resultSet.getInt("ORGAN_DONOR_RECEIVER_LIST_ID"));
            pv.setPatientId(resultSet.getInt("HOSPITAL_PATIENT_ID"));
            pv.setName(resultSet.getString("HOSPITAL_PATIENT_NAME"));
            pv.setAge(resultSet.getInt("HOSPITAL_PATIENT_AGE"));
            pv.setGender(resultSet.getString("HOSPITAL_PATIENT_GENDER"));
            pv.setType(resultSet.getString("HOSPITAL_PATIENT_TYPE"));
            pv.setDoctorId(resultSet.getInt("HOSPITAL_DOCTOR_ID"));
            pv.setReportId(resultSet.getInt("PATIENTS_REPORT_ID"));
            pv.setVitalId(resultSet.getInt("PATIENTS_VITALS_ID"));
            pv.setReportStatus(resultSet.getString("PATIENTS_REPORT_STATUS"));
            pv.setVitalStatus(resultSet.getString("PATIENTS_VITALS_STATUS"));
            pv.setDate(resultSet.getString("PATIENTS_VISIT_DATE"));
            pv.setOrgan(resultSet.getString("ORGAN_DONOR_RECEIVER_LIST_ORGAN_NAME"));
            pv.setOrganStatus(resultSet.getString("ORGAN_DONOR_RECEIVER_LIST_STATUS"));
            patientVisitList.add(pv);
        }
    }
    catch(Exception e){
        System.out.println("fetchReciverList: "+ e);
    }
    return patientVisitList;
    }
}
