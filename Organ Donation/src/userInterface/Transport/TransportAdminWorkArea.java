
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface.Transport;


import Business.Employee.Employee;
import userInterface.SystemAdminWorkArea.*;

/**
 *
 * @author anujkumar
 */
public class TransportAdminWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminWorkArea
     */
    private static Employee emp;
    public TransportAdminWorkArea(Employee e) {
        initComponents();
        this.emp=e;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneAdmin = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        ManageDriverJButton = new javax.swing.JButton();
        LogoutJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManageDriverJButton.setBackground(new java.awt.Color(0, 0, 0));
        ManageDriverJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageDriverJButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageDriverJButton.setText("CREATE DRIVER CREDENTIALS");
        ManageDriverJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDriverJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ManageDriverJButton);

        LogoutJButton.setBackground(new java.awt.Color(0, 0, 0));
        LogoutJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutJButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutJButton.setText("LOGOUT");
        LogoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogoutJButton);

        jButton1.setText("MNAGE REQUEST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setText("DRIVER STATUS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setText("UPDATE PROFILE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jSplitPaneAdmin.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        jSplitPaneAdmin.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneAdmin)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageDriverJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDriverJButtonActionPerformed
        // TODO add your handling code here:
        CreateDriveCredentialsJPanel createDriver=new CreateDriveCredentialsJPanel(emp);
        jSplitPaneAdmin.setRightComponent(createDriver);
    }//GEN-LAST:event_ManageDriverJButtonActionPerformed

    private void LogoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutJButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_LogoutJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        
        
        ManageTransportRequestJPanel manageTransportRequest=new ManageTransportRequestJPanel(emp);
        jSplitPaneAdmin.setRightComponent(manageTransportRequest);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         DriverStatusJPanel DriverStatus=new DriverStatusJPanel(emp);
        jSplitPaneAdmin.setRightComponent(DriverStatus);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        UpdateAdminProfileJPanel adminProfileUpdate=new UpdateAdminProfileJPanel(emp);
        jSplitPaneAdmin.setRightComponent(adminProfileUpdate);
    }//GEN-LAST:event_jButton3ActionPerformed


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
            java.util.logging.Logger.getLogger(TransportAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransportAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransportAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransportAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new TransportAdminWorkArea(emp).setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutJButton;
    private javax.swing.JButton ManageDriverJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPaneAdmin;
    // End of variables declaration//GEN-END:variables
}
