/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.SystemAdminWorkArea;

/**
 *
 * @author Lenovo
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel() {
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

        jButton1 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonHospitalEnterpriseLogin = new javax.swing.JButton();
        jButtonOPOAdminLogin = new javax.swing.JButton();
        jButtonTransportEnterpriseLogin = new javax.swing.JButton();
        jButtonNGOEnterpriseLogin = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jSplitPane1.setDividerLocation(210);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(100, 100));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(185, 50));

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setOpaque(false);

        jButtonHospitalEnterpriseLogin.setBackground(new java.awt.Color(255, 102, 0));
        jButtonHospitalEnterpriseLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonHospitalEnterpriseLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHospitalEnterpriseLogin.setText("MANAGE HOSPITAL");

        jButtonOPOAdminLogin.setBackground(new java.awt.Color(255, 102, 0));
        jButtonOPOAdminLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonOPOAdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOPOAdminLogin.setText("MANAGE OPO");

        jButtonTransportEnterpriseLogin.setBackground(new java.awt.Color(255, 102, 0));
        jButtonTransportEnterpriseLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonTransportEnterpriseLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTransportEnterpriseLogin.setText("MANAGE TRANSPORT");

        jButtonNGOEnterpriseLogin.setBackground(new java.awt.Color(255, 102, 0));
        jButtonNGOEnterpriseLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonNGOEnterpriseLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNGOEnterpriseLogin.setText("MANAGE NGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHospitalEnterpriseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonNGOEnterpriseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonOPOAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonTransportEnterpriseLogin)))
                .addGap(18, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButtonHospitalEnterpriseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonOPOAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonNGOEnterpriseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonTransportEnterpriseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHospitalEnterpriseLogin;
    private javax.swing.JButton jButtonNGOEnterpriseLogin;
    private javax.swing.JButton jButtonOPOAdminLogin;
    private javax.swing.JButton jButtonTransportEnterpriseLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
