/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.SystemAdminWorkArea;

import Business.Enterprise.HospitalEnterprise;
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
public class CreateNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNetworkJPanel
     */
    DatabaseEnterpriseUtilities dbCon;
    NetworkDirectory nd;
    public CreateNetworkJPanel() {
        initComponents();
        dbCon= new DatabaseEnterpriseUtilities();
        nd=new NetworkDirectory();
        populateTable(dbCon.fetchNetwork());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextRegionName = new javax.swing.JTextField();
        jTextStateName = new javax.swing.JTextField();
        jTextCityName = new javax.swing.JTextField();
        jButtonCreateNetwork = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNetwork = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REGION");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("STATE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CITY");

        jTextRegionName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextStateName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jTextCityName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));

        jButtonCreateNetwork.setBackground(new java.awt.Color(171, 30, 64));
        jButtonCreateNetwork.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonCreateNetwork.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateNetwork.setText("CREATE NETWORK");
        jButtonCreateNetwork.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCreateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateNetworkActionPerformed(evt);
            }
        });

        jTableNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "City", "State", "Region"
            }
        ));
        jScrollPane1.setViewportView(jTableNetwork);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(121, 121, 121)
                        .addComponent(jTextRegionName, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextCityName)
                            .addComponent(jTextStateName)
                            .addComponent(jButtonCreateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(514, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextRegionName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextStateName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButtonCreateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateNetworkActionPerformed
        // TODO add your handling code here:
        //Validation
        String regionName=jTextRegionName.getText();
        String stateName=jTextStateName.getText();
        String cityName=jTextCityName.getText();
                
        Boolean validation =validateInputFields(regionName,stateName,cityName);
        if(validation){
            Boolean status=dbCon.createNetwork(cityName, stateName, regionName);
            if (status){
                jTextRegionName.setText("");
                jTextStateName.setText("");
                jTextCityName.setText("");
                JOptionPane.showMessageDialog(this, "Network Created.");
                populateTable(dbCon.fetchNetwork());
            }
            else{
                JOptionPane.showMessageDialog(this, "Error in creating network.");
            }
        }
    }//GEN-LAST:event_jButtonCreateNetworkActionPerformed
private Boolean validateInputFields(String regionName,String stateName,String cityName) {
        //Function to validate the input fields
        Boolean validated=true;
        if(regionName == null || regionName.isEmpty()){
            JOptionPane.showMessageDialog(this,"Region name cannot be empty.");
            validated=false;
        }
        else if(stateName == null || stateName.isEmpty()){
            JOptionPane.showMessageDialog(this,"State name cannot be empty.");
            validated=false;
        }
        else if(cityName == null || cityName.isEmpty()){
            JOptionPane.showMessageDialog(this,"City name cannot be empty.");
            validated=false;
        }
        return validated;
    }
void populateTable(NetworkDirectory nd){
    ArrayList <Network> networkList= nd.getNetworkList();
    DefaultTableModel model=(DefaultTableModel) jTableNetwork.getModel();
        model.setRowCount(0);
        for (Network n: networkList)
        {
            Object[] row =new Object[4];
            row[0]=n.getCity();
            row[1]=n.getState();
            row[2]=n.getRegion();
            
            model.addRow(row);
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNetwork;
    private javax.swing.JTextField jTextCityName;
    private javax.swing.JTextField jTextRegionName;
    private javax.swing.JTextField jTextStateName;
    // End of variables declaration//GEN-END:variables
}
