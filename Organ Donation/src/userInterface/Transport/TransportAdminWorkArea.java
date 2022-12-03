/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface.Transport;

import userInterface.NgoAdmin.*;
import userInterface.SystemAdminWorkArea.*;

/**
 *
 * @author anujkumar
 */
public class TransportAdminWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminWorkArea
     */
    public TransportAdminWorkArea() {
        initComponents();
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
        ManageRosterJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManageDriverJButton.setBackground(new java.awt.Color(0, 0, 0));
        ManageDriverJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageDriverJButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageDriverJButton.setText("CREATE DRIVER");
        ManageDriverJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDriverJButtonActionPerformed(evt);
            }
        });

        LogoutJButton.setBackground(new java.awt.Color(0, 0, 0));
        LogoutJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutJButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutJButton.setText("LOGOUT");
        LogoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutJButtonActionPerformed(evt);
            }
        });

        ManageRosterJButton.setBackground(new java.awt.Color(0, 0, 0));
        ManageRosterJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageRosterJButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageRosterJButton.setText("MANAGE TRANSPORT");
        ManageRosterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageRosterJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManageDriverJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageRosterJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(ManageDriverJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ManageRosterJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(LogoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

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
        ManageDriverJPanel manageDriver=new ManageDriverJPanel();
        jSplitPaneAdmin.setRightComponent(manageDriver);
    }//GEN-LAST:event_ManageDriverJButtonActionPerformed

    private void LogoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutJButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_LogoutJButtonActionPerformed

    private void ManageRosterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageRosterJButtonActionPerformed
        // TODO add your handling code here:
       ManageTransportPanel manageVolunteer=new ManageTransportPanel();
        jSplitPaneAdmin.setRightComponent(manageVolunteer);
        
    }//GEN-LAST:event_ManageRosterJButtonActionPerformed

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
                new TransportAdminWorkArea().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutJButton;
    private javax.swing.JButton ManageDriverJButton;
    private javax.swing.JButton ManageRosterJButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPaneAdmin;
    // End of variables declaration//GEN-END:variables
}