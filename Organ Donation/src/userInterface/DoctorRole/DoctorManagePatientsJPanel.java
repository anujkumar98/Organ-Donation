/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.DoctorRole;

import Business.Employee.Employee;
import Business.Enterprise.HospitalEnterprise;
import Business.Patient.PatientReport;
import Business.Patient.PatientVisit;
import Business.Patient.PatientVisitDirectory;
import Business.Patient.PatientVitals;
import DatabaseUtility.DatabaseHandleHospitalRoles;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class DoctorManagePatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorManagePatientsJPanel
     */
    Employee emp;
    int doctorId;
    Boolean rowSelected=false;
    PatientVisitDirectory pvd = new PatientVisitDirectory();
    DatabaseHandleHospitalRoles dbCon;
    ArrayList<Employee> pathoList;
    public DoctorManagePatientsJPanel(Employee e) {
        initComponents();
        this.emp=e;
        this.doctorId=emp.getId();
        dbCon=new DatabaseHandleHospitalRoles();
//        System.out.println("Doctor Id" + doctorId);
        populatePatients(dbCon.fetchPatientsDoctor(doctorId)); 
        jTextNamePatient.setEditable(false);
        jTextPatientType.setEditable(false);
        pathoList=dbCon.fetchPatho(doctorId); // All available doctors in the hospital;
        populatePathoList(pathoList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableManagePateints = new javax.swing.JTable();
        jButtonViewPatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNamePatient = new javax.swing.JTextField();
        jTextPatientType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextPatientTemperature = new javax.swing.JTextField();
        jTextPatientPulse = new javax.swing.JTextField();
        jTextPatientBP = new javax.swing.JTextField();
        jTextRespirationRate = new javax.swing.JTextField();
        jButtonSavePatients = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextPatientBloodType = new javax.swing.JTextField();
        jTextPatientTissueType = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextPatientHeight = new javax.swing.JTextField();
        jTextPatientWeight = new javax.swing.JTextField();
        jButtonUpdateStatus = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboPatientStatus = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxPatho = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTableManagePateints.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTableManagePateints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "TYPE", "DATE", "PATHO STATUS", "ELIGIBILITY STATUS"
            }
        ));
        jTableManagePateints.setGridColor(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(jTableManagePateints);
        if (jTableManagePateints.getColumnModel().getColumnCount() > 0) {
            jTableManagePateints.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTableManagePateints.getColumnModel().getColumn(1).setHeaderValue("NAME");
            jTableManagePateints.getColumnModel().getColumn(2).setHeaderValue("TYPE");
            jTableManagePateints.getColumnModel().getColumn(3).setHeaderValue("DATE");
            jTableManagePateints.getColumnModel().getColumn(4).setHeaderValue("PATHO STATUS");
            jTableManagePateints.getColumnModel().getColumn(5).setHeaderValue("ELIGIBILITY STATUS");
        }

        jButtonViewPatient.setBackground(new java.awt.Color(150, 21, 53));
        jButtonViewPatient.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonViewPatient.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewPatient.setText("VIEW PATIENT");
        jButtonViewPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewPatientActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel1.setText("NAME");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel2.setText("TYPE");

        jTextNamePatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextPatientType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel5.setText("TEMPERATURE");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel6.setText("PULSE");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel7.setText("BLOOD PRESSURE");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel8.setText("RESPIRATION RATE");

        jTextPatientTemperature.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextPatientPulse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextPatientBP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextRespirationRate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jButtonSavePatients.setBackground(new java.awt.Color(150, 21, 53));
        jButtonSavePatients.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonSavePatients.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSavePatients.setText("SAVE DETAILS AND REQUEST PATHO REPORT");
        jButtonSavePatients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSavePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavePatientsActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel10.setText("BLOOD TYPE");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel11.setText("TISSUE TYPE");

        jTextPatientBloodType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextPatientTissueType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel12.setText("WEIGHT");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel13.setText("HEIGHT");

        jTextPatientHeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextPatientWeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jButtonUpdateStatus.setBackground(new java.awt.Color(150, 21, 53));
        jButtonUpdateStatus.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonUpdateStatus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateStatus.setText("UPDATE STATUS");
        jButtonUpdateStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateStatusActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel9.setText("ELIGIBILITY STATUS");

        jComboPatientStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        jComboPatientStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel14.setText("PATHOLOGIST");

        jComboBoxPatho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBoxPatho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGE PATIENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(654, 654, 654))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxPatho, 0, 220, Short.MAX_VALUE)
                            .addComponent(jTextNamePatient)
                            .addComponent(jTextPatientType)
                            .addComponent(jTextPatientWeight)
                            .addComponent(jTextPatientHeight)
                            .addComponent(jButtonViewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextPatientBP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jTextPatientPulse, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPatientTemperature, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextRespirationRate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPatientBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboPatientStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextPatientTissueType, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(171, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jButtonSavePatients, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextNamePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPatientTemperature, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextPatientBloodType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPatientWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jComboPatientStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPatientHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxPatho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jTextPatientPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jTextPatientBP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextPatientTissueType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(jButtonUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jTextRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonSavePatients, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void changefieldStatus(Boolean status){
        jTextNamePatient.setEditable(status);
        jTextPatientType.setEditable(status);
        jTextNamePatient.setEditable(status);
        jTextPatientType.setEditable(status);
        jTextPatientWeight.setEditable(status);
        jTextPatientHeight.setEditable(status);
        jTextPatientTemperature.setEditable(status);
        jTextPatientPulse.setEditable(status);
        jTextPatientBP.setEditable(status);
        jTextRespirationRate.setEditable(status);
        jTextPatientBloodType.setEditable(false);
        jTextPatientTissueType.setEditable(false);
    }
    private void jButtonViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewPatientActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTableManagePateints.getSelectedRow();
        if (selectedIndex != -1){
            rowSelected=true;
            int visitId=Integer.parseInt(jTableManagePateints.getValueAt(selectedIndex, 0).toString());
            jTextNamePatient.setText(jTableManagePateints.getValueAt(selectedIndex, 1).toString());
            jTextPatientType.setText(jTableManagePateints.getValueAt(selectedIndex, 2).toString()); 
            //Set value if set by doctor
            if (jTableManagePateints.getValueAt(selectedIndex, 4).toString().equalsIgnoreCase("Filled by Doctor")){
                //Fetch Vital details for that id.
                //Set fields to non editing
                changefieldStatus(false);
                PatientVitals pv = dbCon.fetchVitals(visitId);
                jTextPatientWeight.setText(Double.toString(pv.getWeight()));
                jTextPatientHeight.setText(Double.toString(pv.getHeight()));
                jTextPatientTemperature.setText(Double.toString(pv.getTemp()));
                jTextPatientPulse.setText(Integer.toString(pv.getPulse()));
                jTextPatientBP.setText(Double.toString(pv.getBp()));
                jTextRespirationRate.setText(Integer.toString(pv.getRepiratoryRate()));
                
            }
            if (jTableManagePateints.getValueAt(selectedIndex, 4).toString().equalsIgnoreCase("Not Requested")){
                //Fetch Vital details for that id.
                //Set fields to non editing
                jTextPatientWeight.setText("");
                jTextPatientHeight.setText("");
                jTextPatientTemperature.setText("");
                jTextPatientPulse.setText("");
                jTextPatientBP.setText("");
                jTextRespirationRate.setText("");
                
            }
            if (jTableManagePateints.getValueAt(selectedIndex, 5).toString().equalsIgnoreCase("Filled by Patho")){
                //Fetch report details for that id.
                //Set fields to non editing
                changefieldStatus(false);
                PatientReport pr = dbCon.fetchReports(visitId);
                jTextPatientBloodType.setText(pr.getBloodType());
                jTextPatientTissueType.setText(pr.getTissueConditon());
            }
            if (jTableManagePateints.getValueAt(selectedIndex, 5).toString().equalsIgnoreCase("Not Requested")){
                //Fetch report details for that id.
                //Set fields to non editing
                jTextPatientBloodType.setText("");
                jTextPatientTissueType.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select a row to fetch.");
        }
        //Set fields to inactive
        changefieldStatus(true);
    }//GEN-LAST:event_jButtonViewPatientActionPerformed

    private void jButtonSavePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavePatientsActionPerformed
        // TODO add your handling code here:
        //Validation 
        if (rowSelected){
            int selectedIndex=jTableManagePateints.getSelectedRow();
            if (selectedIndex != -1){
            int visitId=Integer.parseInt(jTableManagePateints.getValueAt(selectedIndex, 0).toString());
            jTextNamePatient.setText(jTableManagePateints.getValueAt(selectedIndex, 1).toString());
            jTextPatientType.setText(jTableManagePateints.getValueAt(selectedIndex, 2).toString());
            float weight=Float.parseFloat(jTextPatientWeight.getText());
            float height=Float.parseFloat(jTextPatientHeight.getText());
            float temp=Float.parseFloat(jTextPatientTemperature.getText());
            int pulse=Integer.parseInt(jTextPatientPulse.getText());
            int bp=Integer.parseInt(jTextPatientBP.getText());
            int respRate=Integer.parseInt(jTextRespirationRate.getText());
            int pathoIndex=jComboBoxPatho.getSelectedIndex();
            int pathoId=pathoList.get(pathoIndex).getId();
            
            Boolean validated=validateInputFields(weight,height,temp,pulse,bp,respRate);
            if (validated){
               Boolean status=dbCon.creatVitals(visitId, weight, height, temp, pulse, bp, respRate,pathoId);
            if (status){
                JOptionPane.showMessageDialog(this, "Vitals Created.");
                jTextNamePatient.setText("");
                jTextPatientType.setText("");
                jTextPatientWeight.setText("");
                jTextPatientHeight.setText("");
                jTextPatientTemperature.setText("");
                jTextPatientPulse.setText("");
                jTextPatientBP.setText("");
                jTextRespirationRate.setText("");
                rowSelected=false;
                populatePatients(dbCon.fetchPatientsDoctor(doctorId));
            }
            else{
            JOptionPane.showMessageDialog(this, "Error in creating vitals");
            } 
            }  
        }
        
        }else{
            JOptionPane.showMessageDialog(this, "Please select a row to fetch.");
        }
    }//GEN-LAST:event_jButtonSavePatientsActionPerformed

    private void jButtonUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateStatusActionPerformed
        // TODO add your handling code here:
        if (rowSelected){
            int selectedIndex=jTableManagePateints.getSelectedRow();
            if (selectedIndex != -1){
            int visitId=Integer.parseInt(jTableManagePateints.getValueAt(selectedIndex, 0).toString());
            jTextNamePatient.setText(jTableManagePateints.getValueAt(selectedIndex, 1).toString());
            jTextPatientType.setText(jTableManagePateints.getValueAt(selectedIndex, 2).toString());
            String type=jTableManagePateints.getValueAt(selectedIndex, 2).toString();
            int organStatus=0;
            String approval=jComboPatientStatus.getSelectedItem().toString();
            if (approval.equalsIgnoreCase("Yes")){
                organStatus=1;  
            }
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
            LocalDate localDate = LocalDate.now();
            String date=dtf.format(localDate);
                Boolean status = dbCon.updateDoctorApproval(visitId,organStatus,type,doctorId,date);
                if (status==true && organStatus==1){
                    JOptionPane.showMessageDialog(this, "Patient added to the list and sent for admin approval.");
                     jTextNamePatient.setText("");
                    jTextPatientType.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error in approval");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select a row to fetch.");
        }
            
    }//GEN-LAST:event_jButtonUpdateStatusActionPerformed
private Boolean validateInputFields(float weight,float height,float temp,int pulse,int bp,int respRate) {
        //Function to validate the input fields
        
        Boolean validated=true;
        
        if(weight < 0){
            JOptionPane.showMessageDialog(this,"Weight cannot be negative");
            validated=false;
        }
        else if(height<0){
            JOptionPane.showMessageDialog(this,"Height cannot be negative");
            validated=false;
        }
        else if(temp<-10){
            JOptionPane.showMessageDialog(this,"Check the temperature entered");
            validated=false;
        }
        else if(pulse<0){
            JOptionPane.showMessageDialog(this,"Pulse cannot be negative");
            validated=false;
        }
        else if(bp<0){
            JOptionPane.showMessageDialog(this,"BP cannot be negative");
            validated=false;
        }
        else if(respRate<0){
            JOptionPane.showMessageDialog(this,"respRate cannot be negative");
            validated=false;
        }
        return validated;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSavePatients;
    private javax.swing.JButton jButtonUpdateStatus;
    private javax.swing.JButton jButtonViewPatient;
    private javax.swing.JComboBox<String> jComboBoxPatho;
    private javax.swing.JComboBox<String> jComboPatientStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableManagePateints;
    private javax.swing.JTextField jTextNamePatient;
    private javax.swing.JTextField jTextPatientBP;
    private javax.swing.JTextField jTextPatientBloodType;
    private javax.swing.JTextField jTextPatientHeight;
    private javax.swing.JTextField jTextPatientPulse;
    private javax.swing.JTextField jTextPatientTemperature;
    private javax.swing.JTextField jTextPatientTissueType;
    private javax.swing.JTextField jTextPatientType;
    private javax.swing.JTextField jTextPatientWeight;
    private javax.swing.JTextField jTextRespirationRate;
    // End of variables declaration//GEN-END:variables

    private void populatePatients(ArrayList<PatientVisit> patientVisits) {
        DefaultTableModel model=(DefaultTableModel) jTableManagePateints.getModel();
        model.setRowCount(0);
        for (PatientVisit v: patientVisits)
        {
            Object[] row =new Object[7];
            row[0]=v.getId();
            row[1]=v.getName();
            row[2]=v.getType();
            row[3]=v.getDate();
            row[4]=v.getVitalStatus();
            row[5]=v.getReportStatus();
            model.addRow(row);
        }
    }

    private void populatePathoList(ArrayList<Employee> emp){
    for(Employee e:emp){
        jComboBoxPatho.addItem(e.getName());
    }
        
    }
}
