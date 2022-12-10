/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface.SystemAdminWorkArea;

import Business.Employee.Employee;
import DatabaseUtility.DatabaseHandelLogin;
import javax.swing.JOptionPane;
import userInterface.DoctorRole.DoctorWorkAreaJFrame;
import userInterface.DriverRole.DriverAdminWorkAreaJFrame;
import userInterface.HospitalAdminWorkArea.HospitalAdminWorkAreaJFrame;
import userInterface.NGO.NGOAdminWorkArea;
import userInterface.OPO.OPOAdminWorkArea;
import userInterface.Pathology.PathologyWorkArea;
import userInterface.RecepitionistRole.RecepitionistWorkAreaJFrame;
import userInterface.Transport.TransportAdminWorkArea;

/**
 *
 * @author anujkumar
 */
public class LoginJPanel extends javax.swing.JFrame {

    /**
     * Creates new form LoginJPanel1
     */
    DatabaseHandelLogin dblogin;
    public LoginJPanel() {
        initComponents();
        addRoles();
        dblogin=new DatabaseHandelLogin();
    }
    public void addRoles(){
        jComboBoxRoles.addItem("SYSTEM ADMIN");
        jComboBoxRoles.addItem("HOSPITAL ADMIN");
        jComboBoxRoles.addItem("DOCTOR");
        jComboBoxRoles.addItem("RECEPTIONIST");
        jComboBoxRoles.addItem("PATHOLOGIST");
        jComboBoxRoles.addItem("NGO ADMIN");
        jComboBoxRoles.addItem("TRANSPORT ADMIN");
        jComboBoxRoles.addItem("OPO ADMIN");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jComboBoxRoles = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Role");

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        jComboBoxRoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBoxRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton1)
                .addContainerGap(652, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldUserName)
                        .addComponent(jTextFieldPassword)
                        .addComponent(jComboBoxRoles, 0, 127, Short.MAX_VALUE))
                    .addContainerGap(562, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(267, 267, 267))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addContainerGap(360, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username=jTextFieldUserName.getText();
        String password=jTextFieldPassword.getText();
        String role=jComboBoxRoles.getSelectedItem().toString();
        Boolean validation =validateInputFields(username,password);
        if (validation){
            Employee emp;
        switch (role){
            case "SYSTEM ADMIN" -> {
                if ((username.equals("root") && password.equals("root"))){
                    SystemAdminWorkArea JFrame = new SystemAdminWorkArea();
                    JFrame.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please check the password");
                }
            }
            case "DOCTOR" -> {
                emp=dblogin.loginUser(username,password,"HOSPITAL_DOCTOR","HOSPITAL");
                if (emp != null){
                    DoctorWorkAreaJFrame JFrame = new DoctorWorkAreaJFrame(emp);
                    JFrame.setVisible(true);  
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please check the username, password and role. ");
                }
            }
            case "HOSPITAL ADMIN" -> {
                emp=dblogin.loginUser(username,password,"HOSPITAL_ADMIN","HOSPITAL");
                if (emp != null){
                    HospitalAdminWorkAreaJFrame JFrame = new HospitalAdminWorkAreaJFrame(emp);
                    JFrame.setVisible(true);  
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please check the username, password and role. ");
                }
            }
            case "RECEPTIONIST" -> {
                emp=dblogin.loginUser(username,password,"HOSPITAL_RECEPTIONIST","HOSPITAL");
                if (emp != null){
                    RecepitionistWorkAreaJFrame JFrame = new RecepitionistWorkAreaJFrame(emp);
                    JFrame.setVisible(true);  
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please check the username, password and role. ");
                }
            }
            case "PATHOLOGIST" -> {
                emp=dblogin.loginUser(username,password,"HOSPITAL_PATHOLOGIST","HOSPITAL");
                if (emp != null){
                    PathologyWorkArea JFrame = new PathologyWorkArea(emp);
                    JFrame.setVisible(true);  
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please check the username, password and role. ");
                }
            }
            case "NGO ADMIN" -> {
                emp=dblogin.loginUser(username,password,"NGO_ADMIN","NGO");
                if (emp != null){
                    NGOAdminWorkArea JFrame = new NGOAdminWorkArea(emp);
                    JFrame.setVisible(true);  
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please check the username, password and role. ");
                }
            }
            case "TRANSPORT ADMIN" -> {
                emp=dblogin.loginUser(username,password,"TRANSPORT_ADMIN","TRANSPORT");
                if (emp != null){
                    TransportAdminWorkArea JFrame = new TransportAdminWorkArea(emp);
                    JFrame.setVisible(true);  
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please check the username, password and role. ");
                }
            }
            case "OPO ADMIN" -> {
                emp=dblogin.loginUser(username,password,"OPO_ADMIN","OPO");
                if (emp != null){
                    OPOAdminWorkArea JFrame = new OPOAdminWorkArea(emp);
                    JFrame.setVisible(true);  
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please check the username, password and role. ");
                }
            }
            case "DRIVER" -> {
                emp=dblogin.loginUser(username,password,"TRANSPORT_DRIVER","TRANSPORT");
                if (emp != null){
                    DriverAdminWorkAreaJFrame JFrame = new DriverAdminWorkAreaJFrame(emp);
                    JFrame.setVisible(true);  
                }
                else{
                    JOptionPane.showMessageDialog(this, "Please check the username, password and role. ");
                }
            }
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jComboBoxRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRolesActionPerformed
private Boolean validateInputFields(String userName,String password) {
        //Function to validate the input fields
        Boolean validated=true;
        if(userName == null || userName.isEmpty()){
            JOptionPane.showMessageDialog(this,"Username cannot be empty");
            validated=false;
        }
        else if(password == null || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"Password cannot be empty.");
            validated=false;
        }
        return validated;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;

    // End of variables declaration//GEN-END:variables
}
