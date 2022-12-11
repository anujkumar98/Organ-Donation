/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.SystemAdminWorkArea;

import Business.Enterprise.OpoDirectory;
import Business.Enterprise.OpoEnterprise;
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import DatabaseUtility.DatabaseEnterpriseUtilities;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ManageOPOJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalJPanel
     */
    
    DatabaseEnterpriseUtilities dbCon;
    Boolean update;
    int fetchId;
      NetworkDirectory nd;
    
    public ManageOPOJPanel() {
        initComponents();
        this.update=false;
        this.fetchId=-1;
       
         
        dbCon=new DatabaseEnterpriseUtilities();
        populateTable(dbCon.fetchOpo());
        
        
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jButtonOPOAdminCreate.setVisible(false);
        jTextOGOAdminName.setVisible(false);
        jTextOGOAdminUsername.setVisible(false);
        jTextOGOAdminPassword.setVisible(false);
        jLabel9.setVisible(false);
        jTextFieldAdminEmail.setVisible(false);
        nd=dbCon.fetchNetwork();
        
        addDropdown(nd.getNetworkList());
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOPO = new javax.swing.JTable();
        jButtonCreateOPO = new javax.swing.JButton();
        jButtonUpdateOPO = new javax.swing.JButton();
        jButtonDeleteOPO = new javax.swing.JButton();
        jButtonViewOPO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jComboBoxRegion = new javax.swing.JComboBox<>();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jComboBoxState = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextOGOAdminName = new javax.swing.JTextField();
        jTextOGOAdminUsername = new javax.swing.JTextField();
        jTextOGOAdminPassword = new javax.swing.JTextField();
        jButtonOPOAdminCreate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAdminEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("MANAGE OPO");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(451, 451, 451))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTableOPO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "REGION", "CITY", "STATE", "ADMIN NAME"
            }
        ));
        jScrollPane1.setViewportView(jTableOPO);

        jButtonCreateOPO.setBackground(new java.awt.Color(198, 63, 97));
        jButtonCreateOPO.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonCreateOPO.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateOPO.setText("CREATE OPO");
        jButtonCreateOPO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCreateOPO.setMaximumSize(new java.awt.Dimension(100, 40));
        jButtonCreateOPO.setMinimumSize(new java.awt.Dimension(100, 40));
        jButtonCreateOPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateOPOActionPerformed(evt);
            }
        });

        jButtonUpdateOPO.setBackground(new java.awt.Color(198, 63, 97));
        jButtonUpdateOPO.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonUpdateOPO.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdateOPO.setText("UPDATE OPO");
        jButtonUpdateOPO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonUpdateOPO.setMaximumSize(new java.awt.Dimension(100, 40));
        jButtonUpdateOPO.setMinimumSize(new java.awt.Dimension(100, 40));
        jButtonUpdateOPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateOPOActionPerformed(evt);
            }
        });

        jButtonDeleteOPO.setBackground(new java.awt.Color(198, 63, 97));
        jButtonDeleteOPO.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonDeleteOPO.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteOPO.setText("DELETE OPO");
        jButtonDeleteOPO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonDeleteOPO.setMaximumSize(new java.awt.Dimension(100, 40));
        jButtonDeleteOPO.setMinimumSize(new java.awt.Dimension(100, 40));
        jButtonDeleteOPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteOPOActionPerformed(evt);
            }
        });

        jButtonViewOPO.setBackground(new java.awt.Color(198, 63, 97));
        jButtonViewOPO.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonViewOPO.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewOPO.setText("VIEW OPO");
        jButtonViewOPO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonViewOPO.setMaximumSize(new java.awt.Dimension(100, 40));
        jButtonViewOPO.setMinimumSize(new java.awt.Dimension(100, 40));
        jButtonViewOPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewOPOActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("OPO NAME");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("CITY");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("REGION");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("STATE");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 100));

        jTextFieldName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jComboBoxRegion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jComboBoxCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jComboBoxState.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jLabel6.setText("ADMIN NAME");

        jLabel7.setText("ADMIN USERNAME");

        jLabel8.setText("ADMIN PASSWORD");

        jTextOGOAdminName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextOGOAdminUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextOGOAdminPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jButtonOPOAdminCreate.setBackground(new java.awt.Color(198, 63, 97));
        jButtonOPOAdminCreate.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButtonOPOAdminCreate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOPOAdminCreate.setText("CREATE ADMIN");
        jButtonOPOAdminCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonOPOAdminCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOPOAdminCreateActionPerformed(evt);
            }
        });

        jLabel9.setText("EMAIL");

        jTextFieldAdminEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextOGOAdminPassword)
                    .addComponent(jTextOGOAdminUsername)
                    .addComponent(jComboBoxState, 0, 463, Short.MAX_VALUE)
                    .addComponent(jTextFieldName)
                    .addComponent(jComboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextOGOAdminName)
                    .addComponent(jTextFieldAdminEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCreateOPO, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonViewOPO, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonDeleteOPO, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonUpdateOPO, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(575, 575, 575)
                .addComponent(jButtonOPOAdminCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCreateOPO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonViewOPO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDeleteOPO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdateOPO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jComboBoxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextOGOAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextOGOAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextOGOAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldAdminEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addComponent(jButtonOPOAdminCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonCreateOPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateOPOActionPerformed
        // TODO add your handling code here:
        String name=jTextFieldName.getText();
        
        
      jComboBoxCity.setEnabled(true);
        jComboBoxRegion.setEnabled(true);
        jComboBoxState.setEnabled(true);
        
        
         String city=jComboBoxCity.getSelectedItem().toString();
        String region=jComboBoxRegion.getSelectedItem().toString();
        String state=jComboBoxState.getSelectedItem().toString();
       if(name == null || name.isEmpty()){
            JOptionPane.showMessageDialog(this,"Name cannot be empty.");
            return;
        }
        Boolean statusUnique=dbCon.checkUniqueOPO(region);
        if(statusUnique){
            Boolean status=dbCon.createEnterprise(name, city, state, region,"OPO");
        if (status){
            populateTable(dbCon.fetchOpo());
            jTextFieldName.setText("");
             jTextOGOAdminName.setText("");
            jTextOGOAdminUsername.setText("");
            jTextOGOAdminPassword.setText("");
        }
        else{
            JOptionPane.showMessageDialog(this, "Error in creating OPO");
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "OPO already exists in the selected region");
        }
        
        

    }//GEN-LAST:event_jButtonCreateOPOActionPerformed

    private void jButtonDeleteOPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteOPOActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTableOPO.getSelectedRow();
        if (selectedIndex != -1){
            int deleteId=(int)jTableOPO.getValueAt(selectedIndex,0);
          Boolean status=  dbCon.deleteEnterprise(deleteId,"OPO");
             if (status){
                JOptionPane.showMessageDialog(this, "Hospital Deleted");
                jComboBoxCity.setEnabled(true);
                jComboBoxRegion.setEnabled(true);
                jComboBoxState.setEnabled(true);
                jTextOGOAdminName.setText("");
                jTextOGOAdminUsername.setText("");
                jTextOGOAdminPassword.setText("");
                jTextFieldName.setText("");
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);
                jLabel8.setVisible(false);
                jButtonOPOAdminCreate.setVisible(false);
                jTextOGOAdminName.setVisible(false);
                jTextOGOAdminUsername.setVisible(false);
                jTextOGOAdminPassword.setVisible(false);
                jLabel9.setVisible(false);
                jTextFieldAdminEmail.setVisible(false);
          
            }
            else {
                JOptionPane.showMessageDialog(this, "Check the delete conditon.");
            }
            
            
            
            populateTable(dbCon.fetchOpo());
            return;
        }
        JOptionPane.showMessageDialog(this, "Please select a row to delete");
        
    }//GEN-LAST:event_jButtonDeleteOPOActionPerformed

    private void jButtonViewOPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewOPOActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTableOPO.getSelectedRow();
        if (selectedIndex != -1){
            this.update=true;
            this.fetchId=(int)jTableOPO.getValueAt(selectedIndex,0);
            jTextFieldName.setText(jTableOPO.getValueAt(selectedIndex,1).toString());
             jComboBoxCity.setEnabled(false);
            jComboBoxRegion.setEnabled(false);
            jComboBoxState.setEnabled(false);
            
            
            
            jComboBoxCity.setSelectedItem(jTableOPO.getValueAt(selectedIndex,3));
            jComboBoxRegion.setSelectedItem(jTableOPO.getValueAt(selectedIndex,2));
            jComboBoxState.setSelectedItem(jTableOPO.getValueAt(selectedIndex,4));
            
            
             
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            
            jButtonOPOAdminCreate.setVisible(true);
            jTextOGOAdminName.setVisible(true);
            jTextOGOAdminUsername.setVisible(true);
            jTextOGOAdminPassword.setVisible(true);
            jLabel9.setVisible(false);
            jTextFieldAdminEmail.setVisible(false);
            
              if (!jTableOPO.getValueAt(selectedIndex,5).toString().equals("No Admin")){
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);
                jLabel8.setVisible(false);
                jButtonOPOAdminCreate.setVisible(false);
                jTextOGOAdminName.setVisible(false);
                jTextOGOAdminUsername.setVisible(false);
                jTextOGOAdminPassword.setVisible(false);
                jLabel9.setVisible(false);
                jTextFieldAdminEmail.setVisible(false);
            }
            
            
            return;
        }
        JOptionPane.showMessageDialog(this, "Please select a row to fetch");
    }//GEN-LAST:event_jButtonViewOPOActionPerformed

    private void jButtonUpdateOPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateOPOActionPerformed
        // TODO add your handling code here:
        if (update){
            String name=jTextFieldName.getText();
            String city=jComboBoxCity.getSelectedItem().toString();
            String region=jComboBoxRegion.getSelectedItem().toString();
            String state=jComboBoxState.getSelectedItem().toString();
            
            
            Boolean status=dbCon.updateEnterprise(fetchId,name, city, state, region,"OPO");
            
            if (status){
                populateTable(dbCon.fetchOpo());
            JOptionPane.showMessageDialog(this, "Record Updated");
            jTextFieldName.setText("");
           
            this.update=false;
            this.fetchId=-1;
              jComboBoxCity.setEnabled(true);
                jComboBoxRegion.setEnabled(true);
                jComboBoxState.setEnabled(true);
            return;
            }
            else{
              JOptionPane.showMessageDialog(this, "Error in update. Check the inputs.");
            }
        }
        JOptionPane.showMessageDialog(this, "Please fetch a row to update");
    }//GEN-LAST:event_jButtonUpdateOPOActionPerformed

    private void jButtonOPOAdminCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOPOAdminCreateActionPerformed
    if (update){
            String name=jTextOGOAdminName.getText();
            String username=jTextOGOAdminUsername.getText();
            String password=jTextOGOAdminPassword.getText();
            String email=jTextFieldAdminEmail.getText();
            //System.out.println(dbCon.checkUniqueUserName(username,"OPO"));
            Boolean validated=validateInputFields(name,username,password,email);
            if(validated){
            if(dbCon.checkUniqueUserName(username,"OPO")==true){
                boolean status=dbCon.createEnterpriseAdmin(fetchId,name,username,password,"OPO",email);
                if (status){
                    populateTable(dbCon.fetchOpo());
                    JOptionPane.showMessageDialog(this, "Admin Created");
                    jTextOGOAdminName.setText("");
                    jTextOGOAdminUsername.setText("");
                    jTextOGOAdminPassword.setText("");
                    jTextFieldAdminEmail.setText("");
                    this.update=false;
                    this.fetchId=-1;
                    jTextFieldName.setText("");
                    jComboBoxCity.setEnabled(true);
                    jComboBoxRegion.setEnabled(true);
                    jComboBoxState.setEnabled(true);
                    jLabel6.setVisible(false);
                    jLabel7.setVisible(false);
                    jLabel8.setVisible(false);
                    jButtonOPOAdminCreate.setVisible(false);
                    jTextOGOAdminName.setVisible(false);
                    jTextOGOAdminUsername.setVisible(false);
                    jTextOGOAdminPassword.setVisible(false);
                    jLabel9.setVisible(false);
                    jTextFieldAdminEmail.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error in creating admin");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Username already exists");
            }
            }
          
            return;
        }
        JOptionPane.showMessageDialog(this, "Please fetch a row to update");
        
        
        
        
    }//GEN-LAST:event_jButtonOPOAdminCreateActionPerformed

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
    void populateTable(OpoDirectory od){
        ArrayList<OpoEnterprise> opoDirectory=od.getOpoDirectory();
        DefaultTableModel model=(DefaultTableModel) jTableOPO.getModel();
        model.setRowCount(0);
        for (OpoEnterprise o: opoDirectory)
        {
            Object[] row =new Object[7];
            row[0]=o.getId();
            row[1]=o.getName();
            row[2]=o.getRegion();
            row[3]=o.getCity();
            row[4]=o.getState();
            if (o.getAdminName() == null){
                row[5]="No Admin";
            }else{
            row[5]=o.getAdminName();
            }
            model.addRow(row);
        }
    }

 private void addDropdown(ArrayList <Network> networkList) {
        for (Network n: networkList){
            jComboBoxCity.addItem(n.getCity());
            jComboBoxRegion.addItem(n.getRegion());
            jComboBoxState.addItem(n.getState());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateOPO;
    private javax.swing.JButton jButtonDeleteOPO;
    private javax.swing.JButton jButtonOPOAdminCreate;
    private javax.swing.JButton jButtonUpdateOPO;
    private javax.swing.JButton jButtonViewOPO;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxRegion;
    private javax.swing.JComboBox<String> jComboBoxState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOPO;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAdminEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextOGOAdminName;
    private javax.swing.JTextField jTextOGOAdminPassword;
    private javax.swing.JTextField jTextOGOAdminUsername;
    // End of variables declaration//GEN-END:variables
}
