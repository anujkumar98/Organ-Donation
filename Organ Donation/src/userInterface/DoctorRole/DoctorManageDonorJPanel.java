/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.DoctorRole;
 import javax.swing.table.JTableHeader;
import userInterface.HospitalAdminWorkArea.*;
import Business.Employee.Employee;
import Business.Patient.PatientVisit;
import DatabaseUtility.DatabaseHandleHospitalRoles;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


/**
 *
 * @author Lenovo
 */



public class DoctorManageDonorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDonorJPAnel
     */
    
  
    private static Employee emp;
    Boolean selected;
    int adminId;
    DatabaseHandleHospitalRoles dbCon=new DatabaseHandleHospitalRoles();
    
    
    
    public DoctorManageDonorJPanel(Employee e) {
        
//          jTableDonorDetails.setBackground(Color.LIGHT_GRAY);
//          jTableDonorDetails.setForeground(Color.BLUE); 
//          jTableDonorDetails.getTableHeader().setBackground(Color.MAGENTA);
 
        initComponents();
        this.emp=e;
        selected=false;
        adminId=emp.getId();
        populateTable(dbCon.fetchDoctorDonorRevicerList(adminId,"Donor"));
    }
//jTableDonorDetails.getTableHeader().setBackground(Color.MAGENTA);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDonorDetails = new javax.swing.JTable();
        jButtonDonorInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDonorName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonDonorReportToAdmin = new javax.swing.JButton();
        jCheckBoxLiverD = new javax.swing.JCheckBox();
        jCheckBoxPancreasD = new javax.swing.JCheckBox();
        jCheckBoxHeartD = new javax.swing.JCheckBox();
        jCheckBoxIntestineD = new javax.swing.JCheckBox();
        jCheckBoxLungD = new javax.swing.JCheckBox();
        jCheckBoxKidneyD = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jTableDonorDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableDonorDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PATIENT_DONOR ID", "DONOR NAME", "DONOR AGE", "DATE", "ORGAN NAME"
            }
        ));
        jTableDonorDetails.setShowGrid(false);
        jScrollPane1.setViewportView(jTableDonorDetails);

        jButtonDonorInfo.setBackground(new java.awt.Color(150, 21, 53));
        jButtonDonorInfo.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonDonorInfo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDonorInfo.setText("VIEW DONOR");
        jButtonDonorInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButtonDonorInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDonorInfoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setText("DONOR NAME");

        jTextFieldDonorName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setText("SELECT ORGAN:");

        jButtonDonorReportToAdmin.setBackground(new java.awt.Color(150, 21, 53));
        jButtonDonorReportToAdmin.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonDonorReportToAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDonorReportToAdmin.setText("SEND TO ADMIN");
        jButtonDonorReportToAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButtonDonorReportToAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDonorReportToAdminActionPerformed(evt);
            }
        });

        jCheckBoxLiverD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxLiverD.setText("LIVER");
        jCheckBoxLiverD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jCheckBoxPancreasD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxPancreasD.setText("PANCREAS");
        jCheckBoxPancreasD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jCheckBoxHeartD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxHeartD.setText("HEART");
        jCheckBoxHeartD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jCheckBoxIntestineD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxIntestineD.setText("INTESTINES");
        jCheckBoxIntestineD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jCheckBoxLungD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxLungD.setText("LUNG");
        jCheckBoxLungD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jCheckBoxKidneyD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxKidneyD.setText("KIDNEY");
        jCheckBoxKidneyD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setText("MANAGE DONORS");
        jPanel1.add(jLabel4);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("MANAGE DONOR");
        jPanel1.add(jTextField1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(1212, 1212, 1212)
                .addComponent(jLabel2))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jButtonDonorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jTextFieldDonorName, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel3)
                .addGap(67, 67, 67)
                .addComponent(jCheckBoxKidneyD)
                .addGap(109, 109, 109)
                .addComponent(jCheckBoxLungD))
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jCheckBoxIntestineD)
                .addGap(81, 81, 81)
                .addComponent(jCheckBoxHeartD))
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jCheckBoxLiverD)
                .addGap(122, 122, 122)
                .addComponent(jCheckBoxPancreasD))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jButtonDonorReportToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jButtonDonorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addComponent(jTextFieldDonorName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBoxKidneyD, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxLungD))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxIntestineD)
                    .addComponent(jCheckBoxHeartD))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxLiverD)
                    .addComponent(jCheckBoxPancreasD))
                .addGap(41, 41, 41)
                .addComponent(jButtonDonorReportToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDonorInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDonorInfoActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTableDonorDetails.getSelectedRow();
        if(selectedIndex != -1){
            selected=true;
            int id=Integer.parseInt(jTableDonorDetails.getValueAt(selectedIndex, 0).toString());
            jTextFieldDonorName.setText(jTableDonorDetails.getValueAt(selectedIndex, 1).toString());
            jTextFieldDonorName.setEditable(false);
        }
        else{
            JOptionPane.showMessageDialog(this, "Please select the row");
        }
    }//GEN-LAST:event_jButtonDonorInfoActionPerformed

    private void jButtonDonorReportToAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDonorReportToAdminActionPerformed
        // TODO add your handling code here:
        if (selected){
          int selectedIndex=jTableDonorDetails.getSelectedRow();
            if(selectedIndex != -1){
                int id=Integer.parseInt(jTableDonorDetails.getValueAt(selectedIndex, 0).toString());
                jTextFieldDonorName.setText(jTableDonorDetails.getValueAt(selectedIndex, 1).toString());
                String organTable=jTableDonorDetails.getValueAt(selectedIndex, 4).toString();
                if(organTable.equalsIgnoreCase("Select Organ")){
                    jTextFieldDonorName.setEditable(false);
                int [] organList = new int [6];
                Dictionary organdict = new Hashtable();
                if(jCheckBoxKidneyD.isSelected())
                    organdict.put("Kidney","Kidney");
                if(jCheckBoxIntestineD.isSelected())
                    organdict.put("Intestine","Intestine");
                if(jCheckBoxLiverD.isSelected())
                    organdict.put("Liver","Liver");
                if(jCheckBoxLungD.isSelected())
                    organdict.put("Lungs","Lungs");
                if(jCheckBoxHeartD.isSelected())
                   organdict.put("Heart","Heart");
                if(jCheckBoxPancreasD.isSelected())
                    organdict.put("Pancreas","Pancreas");
                int count =organdict.size();
                if (count ==0 ){
                    JOptionPane.showMessageDialog(this, "Please select atleast one organ");
                    return;
                }
                
                if (count==1){ 
                    String organ="";
                    for (Enumeration i = organdict.elements(); i.hasMoreElements();)
                    {
                        organ=i.nextElement().toString();
                    }
                   Boolean status = dbCon.updateReciverDonorList(id, organ);
                   if(status){
                       JOptionPane.showMessageDialog(this, "Sent to admin");
                       clearFields();
                       populateTable(dbCon.fetchDoctorDonorRevicerList(adminId,"Donor"));
                       return;
                   }
                }
                else{
                    Boolean status=false;
                    String organ="";
                    for (Enumeration i = organdict.elements(); i.hasMoreElements();){
                        organ=i.nextElement().toString();
                        status=dbCon.updateReciverDonorList(id, organ);
                        break;
                                
                    }
                    organdict.remove(organ);
                    for (Enumeration i = organdict.elements(); i.hasMoreElements();){
                        organ=i.nextElement().toString();
                        status=dbCon.populateReciverDonorList(id, organ,"Donor");        
                    }
                    if (status){
                        JOptionPane.showMessageDialog(this, "Sent to admin");
                        clearFields();
                        populateTable(dbCon.fetchDoctorDonorRevicerList(adminId,"Donor"));
                       return;
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Error in adding to list");
                    }
                }
                
            }
            if(!organTable.equalsIgnoreCase("Select Organ")){
                    JOptionPane.showMessageDialog(this, "Organ is already selcted.");
            }
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select the row");
            }
                
                  
        }
        clearFields();
        selected=false;
        
    }//GEN-LAST:event_jButtonDonorReportToAdminActionPerformed

void clearFields(){
    jTextFieldDonorName.setText("");
    jCheckBoxKidneyD.setSelected(false);
    jCheckBoxIntestineD.setSelected(false);
    jCheckBoxLiverD.setSelected(false);
    jCheckBoxLungD.setSelected(false);
    jCheckBoxHeartD.setSelected(false);
    jCheckBoxPancreasD.setSelected(false);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDonorInfo;
    private javax.swing.JButton jButtonDonorReportToAdmin;
    private javax.swing.JCheckBox jCheckBoxHeartD;
    private javax.swing.JCheckBox jCheckBoxIntestineD;
    private javax.swing.JCheckBox jCheckBoxKidneyD;
    private javax.swing.JCheckBox jCheckBoxLiverD;
    private javax.swing.JCheckBox jCheckBoxLungD;
    private javax.swing.JCheckBox jCheckBoxPancreasD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDonorDetails;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldDonorName;
    // End of variables declaration//GEN-END:variables

    private void populateTable(ArrayList <PatientVisit> patientList) {
        DefaultTableModel model=(DefaultTableModel) jTableDonorDetails.getModel();
        model.setRowCount(0);
        for (PatientVisit pv:patientList){
            Object[] row =new Object[7];
            row[0]=pv.getId();
            row[1]=pv.getName();
            row[2]=pv.getAge();
            row[3]=pv.getDate();
            if (pv.getOrgan() == null){
                row[4]="Select Organ";
            }
            else{
                row[4]=pv.getOrgan();
            }
            
            model.addRow(row);
        }
    }
}
