/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.HospitalAdminWorkArea;

import Business.Employee.Employee;
import Business.Enterprise.HospitalEnterprise;
import DatabaseUtility.DatabaseHandleHospitalRoles;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class CreateRolesHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageReceiptionstJPanel
     */
    
    private static Employee emp;
    private DatabaseHandleHospitalRoles dbo;
    int id=-1;
    public CreateRolesHospitalJPanel(Employee e) {
        initComponents();
        this.emp=e;
        this.id=emp.getId();
        jComboHospitalRole.addItem("DOCTOR");
        jComboHospitalRole.addItem("RECEPTIONIST");
        jComboHospitalRole.addItem("PATHOLOGIST");
        dbo=new DatabaseHandleHospitalRoles();
        populateTable(dbo.employeeList(id));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHospitalStaff = new javax.swing.JTable();
        jLabelHospitalCreateRole = new javax.swing.JLabel();
        jLabelHospitalRoleLoginID = new javax.swing.JLabel();
        jLabelHospitalRolePassword = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextHospitalRoleLoginID = new javax.swing.JTextField();
        jTextHospitalRolePassword = new javax.swing.JTextField();
        jComboHospitalRole = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelHospitalRoleLoginID1 = new javax.swing.JLabel();
        jTextHospitalRoleLoginName = new javax.swing.JTextField();
        jLabelHospitalRolePassword1 = new javax.swing.JLabel();
        jTextHospitalRoleEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jTableHospitalStaff.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jTableHospitalStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "ROLE", "NAME", "USERNAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableHospitalStaff.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(jTableHospitalStaff);

        jLabelHospitalCreateRole.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabelHospitalCreateRole.setText("CREATE ROLE");

        jLabelHospitalRoleLoginID.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabelHospitalRoleLoginID.setText("LOGIN USERNAME");

        jLabelHospitalRolePassword.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabelHospitalRolePassword.setText("PASSWORD");

        jButton1.setBackground(new java.awt.Color(175, 38, 72));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREATE");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextHospitalRoleLoginID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 0, 0)));

        jTextHospitalRolePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 0, 0)));

        jComboHospitalRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboHospitalRole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CREATE ROLES AND CREDENTIALS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(543, 543, 543))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );

        jLabelHospitalRoleLoginID1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabelHospitalRoleLoginID1.setText("NAME");

        jTextHospitalRoleLoginName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 0, 0)));

        jLabelHospitalRolePassword1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabelHospitalRolePassword1.setText("EMAIL");

        jTextHospitalRoleEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelHospitalRolePassword1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextHospitalRoleEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelHospitalRoleLoginID1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextHospitalRoleLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelHospitalRolePassword)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextHospitalRolePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelHospitalRoleLoginID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextHospitalRoleLoginID, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelHospitalCreateRole, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81)
                            .addComponent(jComboHospitalRole, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHospitalCreateRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboHospitalRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHospitalRoleLoginID1)
                    .addComponent(jTextHospitalRoleLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHospitalRoleLoginID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHospitalRoleLoginID))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHospitalRolePassword)
                    .addComponent(jTextHospitalRolePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHospitalRoleEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHospitalRolePassword1))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Validations
        String role=jComboHospitalRole.getSelectedItem().toString();
        String username = jTextHospitalRoleLoginID.getText();
        String password=jTextHospitalRolePassword.getText();
        String name=jTextHospitalRoleLoginName.getText();
        String email=jTextHospitalRoleEmail.getText();
        Boolean validation=validateInputFields(username,name,password,email);
        Boolean status=false;
        if (validation){  
        switch (role){
            case "DOCTOR" -> {
                if(dbo.checkUniqueUserName(username,"HOSPITAL_DOCTOR")){
                    status=dbo.createLogin(name,username,email,password,"DOCTOR",id,"HOSPITAL_DOCTOR");
                    if(status){
                        JOptionPane.showMessageDialog(this, "Doctor Created");
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Error in creating doctor");
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Username already exists");
                }
                }
            case "RECEPTIONIST" -> {
                if(dbo.checkUniqueUserName(username,"HOSPITAL_RECEPTIONIST")){
                    status=dbo.createLogin(name,username,email,password,"RECEPTIONIST",id,"HOSPITAL_RECEPTIONIST");
                    if (status){
                        JOptionPane.showMessageDialog(this, "Receptionist Created");
                    }else{
                        JOptionPane.showMessageDialog(this, "Error in creating receptionist");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Username already exists");
                }
                }
            case "PATHOLOGIST" -> {
                if(dbo.checkUniqueUserName(username,"HOSPITAL_PATHOLOGIST")){
                    status=dbo.createLogin(name,username,email,password,"PATHOLOGIST",id,"HOSPITAL_PATHOLOGIST");
                    if (status){
                        JOptionPane.showMessageDialog(this, "Pathologist Created");
                    }else{
                        JOptionPane.showMessageDialog(this, "Error in creating pathologist");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Username already exists");
                }
                }
           
                
        }
        }
        if (status){
            populateTable(dbo.employeeList(id));
            jTextHospitalRoleLoginID.setText("");
            jTextHospitalRolePassword.setText("");
            jTextHospitalRoleLoginName.setText("");
            jTextHospitalRoleEmail.setText("");
        }
        
                
    }//GEN-LAST:event_jButton1ActionPerformed

    void populateTable(ArrayList<Employee> emp){
        DefaultTableModel model=(DefaultTableModel) jTableHospitalStaff.getModel();
        model.setRowCount(0);
        for (Employee e: emp)
        {
            Object[] row =new Object[7];
            row[0]=e.getId();
            row[1]=e.getRole();
            row[2]=e.getName();
            row[3]=e.getUsername();
            model.addRow(row);
        }
    }
    
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboHospitalRole;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelHospitalCreateRole;
    private javax.swing.JLabel jLabelHospitalRoleLoginID;
    private javax.swing.JLabel jLabelHospitalRoleLoginID1;
    private javax.swing.JLabel jLabelHospitalRolePassword;
    private javax.swing.JLabel jLabelHospitalRolePassword1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHospitalStaff;
    private javax.swing.JTextField jTextHospitalRoleEmail;
    private javax.swing.JTextField jTextHospitalRoleLoginID;
    private javax.swing.JTextField jTextHospitalRoleLoginName;
    private javax.swing.JTextField jTextHospitalRolePassword;
    // End of variables declaration//GEN-END:variables
}
