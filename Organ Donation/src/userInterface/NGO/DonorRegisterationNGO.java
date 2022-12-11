/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.NGO;

import Business.Employee.Employee;
import Business.Patient.PatientVisit;
import DatabaseUtility.DatabaseHandleNgoRole;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import userInterface.Pathology.*;
import userInterface.Transport.*;
import userInterface.RecepitionistRole.*;

/**
 *
 * @author Lenovo
 */
public class DonorRegisterationNGO extends javax.swing.JPanel {

    /**
     * Creates new form RecepionistWorkAreaJPanel
     */
    Employee emp;
    int adminId;
    DatabaseHandleNgoRole dbCon=new DatabaseHandleNgoRole();
    public DonorRegisterationNGO(Employee e) {
        initComponents();
        this.emp=e;
        this.adminId=emp.getId();
        populateTable(dbCon.fetchAdminDonorRevicerList(adminId));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextDonorName = new javax.swing.JTextField();
        jTextDonorEmail = new javax.swing.JTextField();
        jTextDonorAge = new javax.swing.JTextField();
        jTextNGODonorContact = new javax.swing.JTextField();
        jTextNGODonorAdress = new javax.swing.JTextField();
        jComboBoxGenderNGODonor = new javax.swing.JComboBox<>();
        jButtonDonorRegistration = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DONOR  REGISTRATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(450, 450, 450))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setText("NAME:");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setText("EMAIL");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setText("AGE");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setText("GENDER");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setText("CONTACT");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel8.setText("ADDRESS");

        jTextDonorName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));

        jTextDonorEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));

        jTextDonorAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));

        jTextNGODonorContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));

        jTextNGODonorAdress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));

        jComboBoxGenderNGODonor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Pefer Not To Say" }));
        jComboBoxGenderNGODonor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));

        jButtonDonorRegistration.setBackground(new java.awt.Color(255, 51, 51));
        jButtonDonorRegistration.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jButtonDonorRegistration.setText("SAVE");
        jButtonDonorRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDonorRegistrationActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NAME", "GENDER", "AGE", "EMAIL", "CONTACT", "ADDRESS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(565, 565, 565)
                .addComponent(jButtonDonorRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 832, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(257, 257, 257))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextDonorName)
                    .addComponent(jComboBoxGenderNGODonor, 0, 250, Short.MAX_VALUE)
                    .addComponent(jTextNGODonorContact))
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextNGODonorAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextDonorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextDonorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextDonorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDonorName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxGenderNGODonor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextDonorAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextNGODonorContact, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextNGODonorAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButtonDonorRegistration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(172, 172, 172))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDonorRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDonorRegistrationActionPerformed
        // TODO add your handling code here:
        
        String name=jTextDonorName.getText();
        String email=jTextDonorEmail.getText();
        int age = Integer.parseInt(jTextDonorAge.getText().toString());
        String gender = jComboBoxGenderNGODonor.getSelectedItem().toString();
        String contact=jTextNGODonorContact.getText();
        String address=jTextNGODonorAdress.getText();
        Boolean validated =validateInputFields( name,age,contact,address,email,gender);
        if (validated){
            Boolean status=dbCon.createDonorList(name,gender,age,contact,address,email,adminId);
        if (status){
            JOptionPane.showMessageDialog(this, "Donor registered");
            jTextDonorName.setText("");
            jTextDonorEmail.setText("");
            jTextDonorAge.setText("");
            jTextNGODonorContact.setText("");
            jTextNGODonorAdress.setText("");
            populateTable(dbCon.fetchAdminDonorRevicerList(adminId));
        }else{
            JOptionPane.showMessageDialog(this, "Error in registoring patient ");
            
        }
        }
        
    }//GEN-LAST:event_jButtonDonorRegistrationActionPerformed
private Boolean validateInputFields(String name,int age,String contactno,String address,String email,String gender) {
        //Function to validate the input fields
        Pattern patternCellNumber = Pattern.compile("^[+\\d](\\d{11})$");
        Matcher matcherCell = patternCellNumber.matcher(contactno);
        Pattern patternEmail = Pattern.compile("^[a-z0-9]+@[a-z]+.[a-z]+$");
        Matcher matcher = patternEmail.matcher(email);
        Boolean validated=true;
        
        if(name == null || name.isEmpty()){
            JOptionPane.showMessageDialog(this,"Name cannot be empty.");
            validated=false;
        }
        else if(address == null || address.isEmpty()){
            JOptionPane.showMessageDialog(this,"Address cannot be empty.");
            validated=false;
        }
        else if(contactno == null || contactno.isEmpty()){
            JOptionPane.showMessageDialog(this,"Contact no cannot be empty.");
            validated=false;
        }
        else if (!matcherCell.matches()){
            JOptionPane.showMessageDialog(this,"Contact number should be valid. Must start with +1.");
            validated=false;
        }
        else if(age < 0 || age > 99){
            JOptionPane.showMessageDialog(this,"Age cannot be less than 0");
            validated=false;
        }
        else if(gender == null || gender.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please select gender");
            validated=false;
        }
        else if (!matcher.matches()){
            JOptionPane.showMessageDialog(this,"Email should be valid.");
            validated=false;
        }
        
        return validated;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDonorRegistration;
    private javax.swing.JComboBox<String> jComboBoxGenderNGODonor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDonorAge;
    private javax.swing.JTextField jTextDonorEmail;
    private javax.swing.JTextField jTextDonorName;
    private javax.swing.JTextField jTextNGODonorAdress;
    private javax.swing.JTextField jTextNGODonorContact;
    // End of variables declaration//GEN-END:variables

    private void populateTable(ArrayList<Employee> donorList) {
       DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Employee v: donorList)
        {
            Object[] row =new Object[7];
            row[0]=v.getName();
            row[1]=v.getGender();
            row[2]=v.getAge();
            row[3]=v.getEmail();
            row[4]=v.getContactNumber();
            row[5]=v.getAddress();
            model.addRow(row);
        }
        
    }
}
