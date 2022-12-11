/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Transport;

import Business.Employee.Employee;
import DatabaseUtility.DatabaseHandelTransportRoles;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anujkumar
 */
public class CreateDriveCredentialsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDriveCredentialsJPanel
     */
    Employee emp;
    int adminId;
    ArrayList <Employee> employeeList;
    DatabaseHandelTransportRoles dbCon=new DatabaseHandelTransportRoles();
    public CreateDriveCredentialsJPanel(Employee e) {
        initComponents();
        this.emp=e;
        this.adminId=emp.getId();
        populateTable(dbCon.employeeList(adminId));
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextDriverName = new javax.swing.JTextField();
        jTextDriverID = new javax.swing.JTextField();
        jTextDriverPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextDriverEmail = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DRIVER ID", "DRIVER NAME", "DRIVER USERNAME", "DRIVER PASSWORD"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("DRIVER NAME");

        jLabel2.setText("DRIVER USERNAME");

        jLabel3.setText("DRIVER PASSWORD");

        jButton1.setText("CREATE DRIVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextDriverName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDriverNameActionPerformed(evt);
            }
        });

        jTextDriverPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDriverPasswordActionPerformed(evt);
            }
        });

        jLabel4.setText("DRIVER Email");

        jTextDriverEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDriverEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextDriverEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextDriverName)
                                    .addComponent(jTextDriverID, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                                .addComponent(jTextDriverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextDriverID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextDriverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextDriverEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDriverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDriverNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDriverNameActionPerformed

    private void jTextDriverPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDriverPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDriverPasswordActionPerformed

    private void jTextDriverEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDriverEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDriverEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = jTextDriverName.getText();
        String username=jTextDriverID.getText();
        String password=jTextDriverPassword.getText();
        String email=jTextDriverEmail.getText();
        Boolean status=false;
        Boolean validation =validateInputFields(name,username,password,email);
        if (validation){
            if(dbCon.checkUniqueUserName(username,"TRANSPORT_DRIVER")){
                        status=dbCon.createLogin(name,username,email,password,adminId,"TRANSPORT_DRIVER");
                        if(status){
                            JOptionPane.showMessageDialog(this, "Doctor Created");
                            
                        }else{
                            JOptionPane.showMessageDialog(this, "Error in creating doctor");
                        }
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Username already exists");
                    }
        populateTable(dbCon.employeeList(adminId));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

private Boolean validateInputFields(String useraname,String name,String password,String email) {
        //Function to validate the input fields
        Pattern patternEmail = Pattern.compile("^[a-z0-9]+@[a-z]+.[a-z]+$");
        Matcher matcher = patternEmail.matcher(email);
        Boolean validated=true;
        if(name == null || name.isEmpty()){
            JOptionPane.showMessageDialog(this,"Name cannot be empty.");
            validated=false;
        }
        else if(useraname == null || useraname.isEmpty()){
            JOptionPane.showMessageDialog(this,"Username cannot be empty.");
            validated=false;
        }
        else if(password == null || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"Password cannot be empty.");
            validated=false;
        }
        else if(password.length()<8){
            JOptionPane.showMessageDialog(this,"Password must be atleast 8 characters.");
            validated=false;
        }
        else if (!matcher.matches()){
            JOptionPane.showMessageDialog(this,"Email should be valid.");
            validated=false;
        }
        return validated;
    }    

void populateTable(ArrayList<Employee> emp){
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Employee e: emp)
        {
            Object[] row =new Object[7];
            row[0]=e.getId();
            row[1]=e.getName();
            row[2]=e.getUsername();
            row[3]=e.getRole();
            model.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDriverEmail;
    private javax.swing.JTextField jTextDriverID;
    private javax.swing.JTextField jTextDriverName;
    private javax.swing.JTextField jTextDriverPassword;
    // End of variables declaration//GEN-END:variables
}