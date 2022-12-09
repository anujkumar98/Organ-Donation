/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.SystemAdminWorkArea;
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
public class ManageNGOJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalJPanel
     */
    
    DatabaseEnterpriseUtilities dbCon;
    Boolean update;
    int fetchId;
    
      NetworkDirectory nd;
    public ManageNGOJPanel() {
        initComponents();
        this.update=false;
        this.fetchId=-1;
        dbCon=new DatabaseEnterpriseUtilities();
        populateTable(dbCon.fetchNGO());
        
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jButtonNGOAdminCreate.setVisible(false);
        jTextNGOAdminName.setVisible(false);
        jTextNGOAdminUsername.setVisible(false);
        jTextNGOAdminPassword.setVisible(false);
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
        jTableNgo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextNGOAdminName = new javax.swing.JTextField();
        jTextNGOAdminUsername = new javax.swing.JTextField();
        jTextNGOAdminPassword = new javax.swing.JTextField();
        jButtonNGOAdminCreate = new javax.swing.JButton();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jComboBoxRegion = new javax.swing.JComboBox<>();
        jComboBoxState = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAdminEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("MANAGE NGO");
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
                .addGap(423, 423, 423))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTableNgo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableNgo);

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setText("CREATE NGO");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setText("UPDATE NGO");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setText("DELETE NGO");
        jButton3.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setText("VIEW NGO");
        jButton4.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("NGO NAME");
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

        jLabel5.setText("ADMIN NAME");

        jLabel6.setText("ADMIN USERNAME");

        jLabel7.setText("ADMIN PASSWORD");

        jButtonNGOAdminCreate.setText("CREATE ADMIN");
        jButtonNGOAdminCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNGOAdminCreateActionPerformed(evt);
            }
        });

        jLabel9.setText("EMAIL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(jTextNGOAdminName)
                                    .addComponent(jTextNGOAdminUsername)
                                    .addComponent(jTextNGOAdminPassword)
                                    .addComponent(jComboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(332, 332, 332))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addComponent(jTextFieldAdminEmail)))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNGOAdminCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextNGOAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jButtonNGOAdminCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextNGOAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextNGOAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldAdminEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
       
        
        Boolean status=dbCon.createEnterprise(name, city, state, region,"NGO");
        if (status){
            populateTable(dbCon.fetchNGO());
            jTextFieldName.setText("");
            jTextNGOAdminName.setText("");
            jTextNGOAdminUsername.setText("");
            jTextNGOAdminPassword.setText(""); 
        }
        else {
        JOptionPane.showMessageDialog(this, "Error in creating NGO");
        }
        
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTableNgo.getSelectedRow();
        if (selectedIndex != -1){
            int deleteId=(int)jTableNgo.getValueAt(selectedIndex,0);
            Boolean status =dbCon.deleteEnterprise(deleteId,"NGO");
             if (status){
                JOptionPane.showMessageDialog(this, "Hospital Deleted");
                jComboBoxCity.setEnabled(true);
                jComboBoxRegion.setEnabled(true);
                jComboBoxState.setEnabled(true);
                jTextNGOAdminName.setText("");
                jTextNGOAdminUsername.setText("");
                jTextNGOAdminPassword.setText("");
                jTextFieldName.setText("");
                
            }
            else {
                JOptionPane.showMessageDialog(this, "Check the delete conditon.");
            }
            populateTable(dbCon.fetchNGO());
            return;
       
    
        }
        JOptionPane.showMessageDialog(this, "Please select a row to delete");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed


  int selectedIndex=jTableNgo.getSelectedRow();
        if (selectedIndex != -1){
            this.update=true;
            this.fetchId=(int)jTableNgo.getValueAt(selectedIndex,0);
            jTextFieldName.setText(jTableNgo.getValueAt(selectedIndex,1).toString());
            jComboBoxCity.setEnabled(false);
            jComboBoxRegion.setEnabled(false);
            jComboBoxState.setEnabled(false);
            
            
            //jTextFieldRegion.setText(jTableHospital.getValueAt(selectedIndex,2).toString());
            //jTextFieldCity.setText(jTableHospital.getValueAt(selectedIndex,3).toString());
            //jTextFieldState.setText(jTableHospital.getValueAt(selectedIndex,4).toString());
            jComboBoxCity.setSelectedItem(jTableNgo.getValueAt(selectedIndex,3));
            jComboBoxRegion.setSelectedItem(jTableNgo.getValueAt(selectedIndex,2));
            jComboBoxState.setSelectedItem(jTableNgo.getValueAt(selectedIndex,4));
            
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jButtonNGOAdminCreate.setVisible(true);
            jTextNGOAdminName.setVisible(true);
            jTextNGOAdminUsername.setVisible(true);
            jTextNGOAdminPassword.setVisible(true);
            
            if (!jTableNgo.getValueAt(selectedIndex,5).toString().equals("No Admin")){
                jLabel5.setVisible(false);
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);
                jButtonNGOAdminCreate.setVisible(false);
                jTextNGOAdminName.setVisible(false);
                jTextNGOAdminUsername.setVisible(false);
                jTextNGOAdminPassword.setVisible(false);
            }
            
            return;
        }
        JOptionPane.showMessageDialog(this, "Please select a row to fetch");









    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        if (update){
//            String name=jTextFieldName.getText();
//            String city=jTextFieldCity.getText();
//            String region=jTextFieldRegion.getText();
//            String state=jTextFieldState.getText();
//            Boolean status=dbCon.updateEnterprise(fetchId,name, city, state, region,"NGO");
//            if (status){
//                populateTable(dbCon.fetchNGO());
//                JOptionPane.showMessageDialog(this, "Record Updated");
//                jTextFieldName.setText("");
//                jTextFieldCity.setText("");
//                jTextFieldRegion.setText("");
//                jTextFieldState.setText("");
//                this.update=false;
//                this.fetchId=-1;
//                return;
//            }
//            else {
//                JOptionPane.showMessageDialog(this, "Error in update. Check the inputs.");
//            }
//        }
//        JOptionPane.showMessageDialog(this, "Please fetch a row to update");
//     ==============================================================================


  if (update){
            String name=jTextFieldName.getText();
            
            //String city=jTextFieldCity.getText();
            //String region=jTextFieldRegion.getText();
            //String state=jTextFieldState.getText();
            String city=jComboBoxCity.getSelectedItem().toString();
            String region=jComboBoxRegion.getSelectedItem().toString();
            String state=jComboBoxState.getSelectedItem().toString();
            
            Boolean status =dbCon.updateEnterprise(fetchId,name, city, state, region,"NGO");
            if (status){
                populateTable(dbCon.fetchNGO());
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

    private void jButtonNGOAdminCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNGOAdminCreateActionPerformed
        // TODO add your handling code here:
        
        
        
        if (update){
            String name=jTextNGOAdminName.getText();
            String username=jTextNGOAdminUsername.getText();
            String password=jTextNGOAdminPassword.getText();
           String email=jTextFieldAdminEmail.getText();
            //System.out.println(dbCon.checkUniqueUserName(username,"NGO"));
            if(dbCon.checkUniqueUserName(username,"NGO")==true){
                boolean status=dbCon.createEnterpriseAdmin(fetchId,name,username,password,"NGO",email);
                if (status){
                    populateTable(dbCon.fetchNGO());
                    JOptionPane.showMessageDialog(this, "Admin Created");
                    jTextNGOAdminName.setText("");
                    jTextNGOAdminUsername.setText("");
                    jTextNGOAdminPassword.setText("");
                    this.update=false;
                    this.fetchId=-1;
                    jTextFieldName.setText("");
                    jComboBoxCity.setEnabled(true);
                    jComboBoxRegion.setEnabled(true);
                    jComboBoxState.setEnabled(true);
                    jLabel5.setVisible(false);
                    jLabel6.setVisible(false);
                    jLabel7.setVisible(false);
                    jButtonNGOAdminCreate.setVisible(false);
                    jTextNGOAdminName.setVisible(false);
                    jTextNGOAdminUsername.setVisible(false);
                    jTextNGOAdminPassword.setVisible(false);
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
        
        
    }//GEN-LAST:event_jButtonNGOAdminCreateActionPerformed
void populateTable(NgoDirectory hd){
        ArrayList<NgoEnterprise> ngoDirectory=hd.getNgoDirectory();
        DefaultTableModel model=(DefaultTableModel) jTableNgo.getModel();
        model.setRowCount(0);
        for (NgoEnterprise n: ngoDirectory)
        {
            Object[] row =new Object[7];
            row[0]=n.getId();
            row[1]=n.getName();
            row[2]=n.getRegion();
            row[3]=n.getCity();
            row[4]=n.getState();
            if (n.getAdminName() == null){
                row[5]="No Admin";
            }else{
            row[5]=n.getAdminName();
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonNGOAdminCreate;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxRegion;
    private javax.swing.JComboBox<String> jComboBoxState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNgo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAdminEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextNGOAdminName;
    private javax.swing.JTextField jTextNGOAdminPassword;
    private javax.swing.JTextField jTextNGOAdminUsername;
    // End of variables declaration//GEN-END:variables
}
