/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface.DoctorRole;

import Business.Employee.Employee;
import userInterface.RecepitionistRole.RecepionistProfileUpdateJPanel;

/**
 *
 * @author Lenovo
 */
public class DoctorWorkAreaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorWorkAreaJFrame
     */
    private static Employee emp;
    public DoctorWorkAreaJFrame(Employee e) {
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

        DoctorWorkAreaSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonDoctorProfile = new javax.swing.JButton();
        jButtonDoctorManagePatients = new javax.swing.JButton();
        jButtonDoctorManageDonor = new javax.swing.JButton();
        jButtonDoctorManageReceiver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DoctorWorkAreaSplitPane.setBackground(new java.awt.Color(255, 255, 255));
        DoctorWorkAreaSplitPane.setDividerLocation(200);

        jPanel1.setBackground(new java.awt.Color(196, 6, 44));

        jButtonDoctorProfile.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDoctorProfile.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonDoctorProfile.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDoctorProfile.setText("PROFILE");
        jButtonDoctorProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoctorProfileActionPerformed(evt);
            }
        });

        jButtonDoctorManagePatients.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDoctorManagePatients.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonDoctorManagePatients.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDoctorManagePatients.setText("MANAGE PATIENTS");
        jButtonDoctorManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoctorManagePatientsActionPerformed(evt);
            }
        });

        jButtonDoctorManageDonor.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDoctorManageDonor.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonDoctorManageDonor.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDoctorManageDonor.setText("MANAGE DONOR");
        jButtonDoctorManageDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoctorManageDonorActionPerformed(evt);
            }
        });

        jButtonDoctorManageReceiver.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDoctorManageReceiver.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButtonDoctorManageReceiver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDoctorManageReceiver.setText("MANAGE RECIEVERS");
        jButtonDoctorManageReceiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoctorManageReceiverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonDoctorManageReceiver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonDoctorManageDonor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDoctorManagePatients, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(jButtonDoctorProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButtonDoctorProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDoctorManagePatients, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDoctorManageDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDoctorManageReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        DoctorWorkAreaSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        DoctorWorkAreaSplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DoctorWorkAreaSplitPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(DoctorWorkAreaSplitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDoctorManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoctorManagePatientsActionPerformed
        // TODO add your handling code here:
          DoctorManagePatientsJPanel dmpJP = new DoctorManagePatientsJPanel();
        DoctorWorkAreaSplitPane.setRightComponent(dmpJP);
        
        
    }//GEN-LAST:event_jButtonDoctorManagePatientsActionPerformed

    private void jButtonDoctorProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoctorProfileActionPerformed
        // TODO add your handling code here:
          DoctorProfileJPanel rwaJP = new DoctorProfileJPanel(emp);
        DoctorWorkAreaSplitPane.setRightComponent(rwaJP);
        
    }//GEN-LAST:event_jButtonDoctorProfileActionPerformed

    private void jButtonDoctorManageDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoctorManageDonorActionPerformed
        // TODO add your handling code here:
        
         DoctorManageDonorJPanel dmdJP = new DoctorManageDonorJPanel();
        DoctorWorkAreaSplitPane.setRightComponent(dmdJP);
        
    }//GEN-LAST:event_jButtonDoctorManageDonorActionPerformed

    private void jButtonDoctorManageReceiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoctorManageReceiverActionPerformed
        // TODO add your handling code here:
        DoctorManageReceiverJPanel dmrJP = new DoctorManageReceiverJPanel();
        DoctorWorkAreaSplitPane.setRightComponent(dmrJP);
    }//GEN-LAST:event_jButtonDoctorManageReceiverActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorWorkAreaJFrame(emp).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane DoctorWorkAreaSplitPane;
    private javax.swing.JButton jButtonDoctorManageDonor;
    private javax.swing.JButton jButtonDoctorManagePatients;
    private javax.swing.JButton jButtonDoctorManageReceiver;
    private javax.swing.JButton jButtonDoctorProfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
