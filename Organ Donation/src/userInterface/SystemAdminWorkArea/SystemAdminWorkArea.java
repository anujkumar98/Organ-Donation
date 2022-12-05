/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userInterface.SystemAdminWorkArea;

/**
 *
 * @author anujkumar
 */
public class SystemAdminWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminWorkArea
     */
    public SystemAdminWorkArea() {
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
        ManageHospitalJButton = new javax.swing.JButton();
        ManageOPOJButton = new javax.swing.JButton();
        ManageTransportJButton = new javax.swing.JButton();
        ManageNGOJButton = new javax.swing.JButton();
        ManageTransportJButton1 = new javax.swing.JButton();
        jButtonNetwork = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManageHospitalJButton.setBackground(new java.awt.Color(0, 0, 0));
        ManageHospitalJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageHospitalJButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageHospitalJButton.setText("MANAGE HOSPITAL");
        ManageHospitalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageHospitalJButtonActionPerformed(evt);
            }
        });

        ManageOPOJButton.setBackground(new java.awt.Color(0, 0, 0));
        ManageOPOJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageOPOJButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageOPOJButton.setText("MANAGE OPO");
        ManageOPOJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOPOJButtonActionPerformed(evt);
            }
        });

        ManageTransportJButton.setBackground(new java.awt.Color(0, 0, 0));
        ManageTransportJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageTransportJButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageTransportJButton.setText("MANAGE TRANSPORT");
        ManageTransportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageTransportJButtonActionPerformed(evt);
            }
        });

        ManageNGOJButton.setBackground(new java.awt.Color(0, 0, 0));
        ManageNGOJButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageNGOJButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageNGOJButton.setText("MANAGE NGO");
        ManageNGOJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageNGOJButtonActionPerformed(evt);
            }
        });

        ManageTransportJButton1.setBackground(new java.awt.Color(0, 0, 0));
        ManageTransportJButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageTransportJButton1.setForeground(new java.awt.Color(255, 255, 255));
        ManageTransportJButton1.setText("LOGOUT");
        ManageTransportJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageTransportJButton1ActionPerformed(evt);
            }
        });

        jButtonNetwork.setText("Network");
        jButtonNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNetworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageTransportJButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jButtonNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ManageTransportJButton)
                        .addComponent(ManageNGOJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ManageOPOJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManageHospitalJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButtonNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                .addComponent(ManageTransportJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(ManageHospitalJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ManageOPOJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(ManageNGOJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ManageTransportJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(166, Short.MAX_VALUE)))
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

    private void ManageHospitalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageHospitalJButtonActionPerformed
        // TODO add your handling code here:
        ManageHospitalJPanel manageHospital = new ManageHospitalJPanel();
        jSplitPaneAdmin.setRightComponent(manageHospital);
    }//GEN-LAST:event_ManageHospitalJButtonActionPerformed

    private void ManageOPOJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOPOJButtonActionPerformed
        // TODO add your handling code here:
        ManageOPOJPanel manageOPO=new ManageOPOJPanel();
        jSplitPaneAdmin.setRightComponent(manageOPO);
    }//GEN-LAST:event_ManageOPOJButtonActionPerformed

    private void ManageNGOJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageNGOJButtonActionPerformed
        // TODO add your handling code here:
        ManageNGOJPanel manageNGO=new ManageNGOJPanel();
        jSplitPaneAdmin.setRightComponent(manageNGO);
    }//GEN-LAST:event_ManageNGOJButtonActionPerformed

    private void ManageTransportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageTransportJButtonActionPerformed
        // TODO add your handling code here:
        ManageTransportJPanel manageTransport=new ManageTransportJPanel();
        jSplitPaneAdmin.setRightComponent(manageTransport);
    }//GEN-LAST:event_ManageTransportJButtonActionPerformed

    private void ManageTransportJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageTransportJButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_ManageTransportJButton1ActionPerformed

    private void jButtonNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNetworkActionPerformed
        // TODO add your handling code here:
        CreateNetworkJPanel createNetwork=new CreateNetworkJPanel();
        jSplitPaneAdmin.setRightComponent(createNetwork);
    }//GEN-LAST:event_jButtonNetworkActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new SystemAdminWorkArea().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageHospitalJButton;
    private javax.swing.JButton ManageNGOJButton;
    private javax.swing.JButton ManageOPOJButton;
    private javax.swing.JButton ManageTransportJButton;
    private javax.swing.JButton ManageTransportJButton1;
    private javax.swing.JButton jButtonNetwork;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPaneAdmin;
    // End of variables declaration//GEN-END:variables
}
