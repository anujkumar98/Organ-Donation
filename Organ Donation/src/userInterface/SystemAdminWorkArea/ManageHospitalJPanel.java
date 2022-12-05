/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.SystemAdminWorkArea;

import Business.Enterprise.HospitalDirectory;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.NgoDirectory;
import Business.Enterprise.NgoEnterprise;
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import DatabaseUtility.DatabaseEnterpriseUtilities;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ManageHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalJPanel
     */
    
    DatabaseEnterpriseUtilities dbCon;
    Boolean update;
    int fetchId;
    NetworkDirectory nd;
    
    public ManageHospitalJPanel() {
        initComponents();
        this.update=false;
        this.fetchId=-1;
        dbCon=new DatabaseEnterpriseUtilities();
        populateTable(dbCon.fetchHospital());
        
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jButtonCreateHospitalAdmins.setVisible(false);
        jTextFieldAdminName.setVisible(false);
        jTextFieldAdminId.setVisible(false);
        jTextFieldAdminPassword.setVisible(false);
        nd=dbCon.fetchNetwork();
        
        addDropdown(nd.getNetworkList());
        //System.out.println(nd.getNetorkList().size());
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
        jTableHospital = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jButtonCreateHospitalAdmins = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAdminName = new javax.swing.JTextField();
        jTextFieldAdminId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAdminPassword = new javax.swing.JTextField();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jComboBoxRegion = new javax.swing.JComboBox<>();
        jComboBoxState = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("MANAGE HOSPITAL");
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
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTableHospital.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableHospital);

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setText("CREATE HOSPITAL");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setText("UPDATE HOSPITAL");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setText("DELETE HOSPITAL");
        jButton3.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setText("VIEW HOSPITAL");
        jButton4.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("HOSPITAL NAME");
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

        jButtonCreateHospitalAdmins.setText("CREATE ADMINS");
        jButtonCreateHospitalAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateHospitalAdminsActionPerformed(evt);
            }
        });

        jLabel6.setText("ADMIN NAME");

        jLabel7.setText("ADMIN ID");

        jLabel8.setText("ADMIN PASSWORD");

        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCityActionPerformed(evt);
            }
        });

        jComboBoxRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jComboBoxState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(jComboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonCreateHospitalAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldAdminName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                        .addComponent(jTextFieldAdminId, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldAdminPassword, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(180, 180, 180))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                        .addComponent(jComboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(71, 71, 71)
                                    .addComponent(jComboBoxRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldAdminId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jButtonCreateHospitalAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jComboBoxCity.setEnabled(true);
        jComboBoxRegion.setEnabled(true);
        jComboBoxState.setEnabled(true);
        String name=jTextFieldName.getText();
        
        String city=jComboBoxCity.getSelectedItem().toString();
        String region=jComboBoxRegion.getSelectedItem().toString();
        String state=jComboBoxState.getSelectedItem().toString();
        
        
        Boolean status =dbCon.createEnterprise(name, city, state, region,"HOSPITAL");
        if (status){
            populateTable(dbCon.fetchHospital());
            jTextFieldName.setText("");
            jTextFieldAdminName.setText("");
            jTextFieldAdminId.setText("");
            jTextFieldAdminPassword.setText(""); 
        JOptionPane.showMessageDialog(this, "Hospital Created.");
        
        
        
        
        
        
        }
        else{
            JOptionPane.showMessageDialog(this, "Error in creating hospital");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTableHospital.getSelectedRow();
        if (selectedIndex != -1){
            int deleteId=(int)jTableHospital.getValueAt(selectedIndex,0);
            Boolean status=dbCon.deleteEnterprise(deleteId,"HOSPITAL");
            if (status){
                JOptionPane.showMessageDialog(this, "Hospital Deleted");
                jComboBoxCity.setEnabled(true);
                jComboBoxRegion.setEnabled(true);
                jComboBoxState.setEnabled(true);
                jTextFieldAdminName.setText("");
                jTextFieldAdminId.setText("");
                jTextFieldAdminPassword.setText("");
                jTextFieldName.setText("");
                
            }
            else {
                JOptionPane.showMessageDialog(this, "Check the delete conditon.");
            }
            populateTable(dbCon.fetchHospital());
            return;
        }
        JOptionPane.showMessageDialog(this, "Please select a row to delete");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTableHospital.getSelectedRow();
        if (selectedIndex != -1){
            this.update=true;
            this.fetchId=(int)jTableHospital.getValueAt(selectedIndex,0);
            jTextFieldName.setText(jTableHospital.getValueAt(selectedIndex,1).toString());
            jComboBoxCity.setEnabled(false);
            jComboBoxRegion.setEnabled(false);
            jComboBoxState.setEnabled(false);
            
            
            //jTextFieldRegion.setText(jTableHospital.getValueAt(selectedIndex,2).toString());
            //jTextFieldCity.setText(jTableHospital.getValueAt(selectedIndex,3).toString());
            //jTextFieldState.setText(jTableHospital.getValueAt(selectedIndex,4).toString());
            jComboBoxCity.setSelectedItem(jTableHospital.getValueAt(selectedIndex,3));
            jComboBoxRegion.setSelectedItem(jTableHospital.getValueAt(selectedIndex,2));
            jComboBoxState.setSelectedItem(jTableHospital.getValueAt(selectedIndex,4));
            
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jButtonCreateHospitalAdmins.setVisible(true);
            jTextFieldAdminName.setVisible(true);
            jTextFieldAdminId.setVisible(true);
            jTextFieldAdminPassword.setVisible(true);
            
            if (!jTableHospital.getValueAt(selectedIndex,5).toString().equals("No Admin")){
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);
                jLabel8.setVisible(false);
                jButtonCreateHospitalAdmins.setVisible(false);
                jTextFieldAdminName.setVisible(false);
                jTextFieldAdminId.setVisible(false);
                jTextFieldAdminPassword.setVisible(false);
            }
            
            return;
        }
        JOptionPane.showMessageDialog(this, "Please select a row to fetch");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (update){
            String name=jTextFieldName.getText();
            
            //String city=jTextFieldCity.getText();
            //String region=jTextFieldRegion.getText();
            //String state=jTextFieldState.getText();
            String city=jComboBoxCity.getSelectedItem().toString();
            String region=jComboBoxRegion.getSelectedItem().toString();
            String state=jComboBoxState.getSelectedItem().toString();
            
            Boolean status =dbCon.updateEnterprise(fetchId,name, city, state, region,"HOSPITAL");
            if (status){
                populateTable(dbCon.fetchHospital());
                JOptionPane.showMessageDialog(this, "Record Updated");
                jTextFieldName.setText("");
                this.update=false;
                this.fetchId=-1;
                jComboBoxCity.setEnabled(true);
                jComboBoxRegion.setEnabled(true);
                jComboBoxState.setEnabled(true);
                return;
            }
            else {
                JOptionPane.showMessageDialog(this, "Error in update. Check the inputs.");
            }
        }
        JOptionPane.showMessageDialog(this, "Please fetch a row to update");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonCreateHospitalAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateHospitalAdminsActionPerformed
        // TODO add your handling code here:
        if (update){
            String name=jTextFieldAdminName.getText();
            String username=jTextFieldAdminId.getText();
            String password=jTextFieldAdminPassword.getText();
            //Check username for unique values
//            if (!name.equals("No Admin")){
//                JOptionPane.showMessageDialog(this, "Admin already exists");
//                return;
//            }
            System.out.println(dbCon.checkUniqueUserName(username,"HOSPITAL"));
            if(dbCon.checkUniqueUserName(username,"HOSPITAL")==true){
                boolean status=dbCon.createEnterpriseAdmin(fetchId,name,username,password,"HOSPITAL");
                if (status){
                    populateTable(dbCon.fetchHospital());
                    JOptionPane.showMessageDialog(this, "Admin Created");
                    jTextFieldAdminName.setText("");
                    jTextFieldAdminId.setText("");
                    jTextFieldAdminPassword.setText("");
                    this.update=false;
                    this.fetchId=-1;
                    jTextFieldName.setText("");
                    jComboBoxCity.setEnabled(true);
                    jComboBoxRegion.setEnabled(true);
                    jComboBoxState.setEnabled(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error in creating admin");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Username already exists");
            }
          
            return;
        }
        JOptionPane.showMessageDialog(this, "Please fetch a row to update");
        
    }//GEN-LAST:event_jButtonCreateHospitalAdminsActionPerformed

    private void jComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCityActionPerformed
void populateTable(HospitalDirectory hd){
        ArrayList<HospitalEnterprise> hospitalDirectory=hd.getHospitalDirectory();
        DefaultTableModel model=(DefaultTableModel) jTableHospital.getModel();
        model.setRowCount(0);
        for (HospitalEnterprise h: hospitalDirectory)
        {
            Object[] row =new Object[7];
            row[0]=h.getId();
            row[1]=h.getName();
            row[2]=h.getRegion();
            row[3]=h.getCity();
            row[4]=h.getState();
            if (h.getAdminName() == null){
                row[5]="No Admin";
            }else{
            row[5]=h.getAdminName();
            }
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCreateHospitalAdmins;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHospital;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAdminId;
    private javax.swing.JTextField jTextFieldAdminName;
    private javax.swing.JTextField jTextFieldAdminPassword;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    private void addDropdown(ArrayList <Network> networkList) {
        for (Network n: networkList){
            jComboBoxCity.addItem(n.getCity());
            jComboBoxRegion.addItem(n.getRegion());
            jComboBoxState.addItem(n.getState());
        }
    }
}
