/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.HospitalAdminWorkArea;

import userInterface.DriverRole.*;
import Business.Employee.Employee;
import DatabaseUtility.DatabaseHandelTransportRoles;
import DatabaseUtility.DatabaseHandleHospitalRoles;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author kb282
 */
public class HospitalAdminUpdateProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DriverUpdateProfileJPanel
     */
    Employee emp;
    int id;
    DatabaseHandleHospitalRoles dbCon=new DatabaseHandleHospitalRoles();
    public HospitalAdminUpdateProfileJPanel(Employee e) {
        initComponents();
        this.emp=e;
        this.id=emp.getId();
        jTextDriverUsername.setEditable(false);
        jTextDriverEmail.setEditable(false);
        populateField(emp);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextDriverUpdateProfile = new javax.swing.JButton();
        jTextDriverName = new javax.swing.JTextField();
        jTextDriverEmail = new javax.swing.JTextField();
        jTextDriverAge = new javax.swing.JTextField();
        jTextDriverContact = new javax.swing.JTextField();
        jTextDriverNaAddress = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jTextDriverUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("NAME");

        jLabel2.setText("EMAIL");

        jLabel3.setText("AGE");

        jLabel4.setText("GENDER");

        jLabel5.setText("CONTACT");

        jLabel6.setText("ADDRESS");

        jTextDriverUpdateProfile.setBackground(new java.awt.Color(175, 38, 72));
        jTextDriverUpdateProfile.setForeground(new java.awt.Color(255, 255, 255));
        jTextDriverUpdateProfile.setText("UPDATE PROFILE");
        jTextDriverUpdateProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextDriverUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDriverUpdateProfileActionPerformed(evt);
            }
        });

        jTextDriverName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));
        jTextDriverName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDriverNameActionPerformed(evt);
            }
        });

        jTextDriverEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));
        jTextDriverEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDriverEmailActionPerformed(evt);
            }
        });

        jTextDriverAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));

        jTextDriverContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));

        jTextDriverNaAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Pefer Not to say" }));
        jComboBoxGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));
        jComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGenderActionPerformed(evt);
            }
        });

        jTextDriverUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 51)));
        jTextDriverUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDriverUsernameActionPerformed(evt);
            }
        });

        jLabel7.setText("USERNAME");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("UPDATE PROFILE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(668, 668, 668)
                .addComponent(jLabel8)
                .addContainerGap(727, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(377, 377, 377)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDriverUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDriverUsername)
                            .addComponent(jTextDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDriverEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                            .addComponent(jTextDriverAge)
                            .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDriverContact, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDriverNaAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxGender, jTextDriverAge, jTextDriverContact, jTextDriverEmail, jTextDriverNaAddress, jTextDriverName, jTextDriverUpdateProfile, jTextDriverUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDriverUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDriverEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDriverAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDriverContact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDriverNaAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jTextDriverUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGenderActionPerformed
    void populateField(Employee emp){
        jTextDriverName.setText(emp.getName() == null ? "" : emp.getName());
        jTextDriverUsername.setText(emp.getUsername() == null ? "" : emp.getUsername());
        jTextDriverEmail.setText(emp.getEmail() == null ? "" : emp.getEmail());
        jTextDriverAge.setText(emp.getAge() == 0 ? "" : Integer.toString(emp.getAge()));
        jTextDriverContact.setText(emp.getContactNumber() == null ? "" : emp.getContactNumber());
        jTextDriverNaAddress.setText(emp.getAddress() == null ? "" : emp.getAddress());
    }
    private void jTextDriverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDriverNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDriverNameActionPerformed

    private void jTextDriverUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDriverUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDriverUsernameActionPerformed

    private void jTextDriverEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDriverEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDriverEmailActionPerformed

    private void jTextDriverUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDriverUpdateProfileActionPerformed
        // TODO add your handling code here:
        String name=jTextDriverName.getText();
        int age=Integer.parseInt(jTextDriverAge.getText());
        String contact=jTextDriverContact.getText();
        String address=jTextDriverNaAddress.getText();
        String gender=jComboBoxGender.getSelectedItem().toString();
        Boolean validated= validateInputFields(name,age,contact,address,gender);
        if(validated){
        Boolean status=dbCon.updateProfile(name,contact,age,address,gender,"HOSPITAL_ADMIN",id);
        if (status){
            emp.setName(name);
            emp.setAge(age);
            emp.setGender(gender);
            emp.setContactNumber(contact);
            emp.setAddress(address);
            populateField(emp);
            JOptionPane.showMessageDialog(this, "Profile updated");
        }
        else {
            JOptionPane.showMessageDialog(this, "Error in updating profile. Please check the inputs.");
        }
        }
    }//GEN-LAST:event_jTextDriverUpdateProfileActionPerformed

private Boolean validateInputFields(String name,int age,String contactno,String address,String gender) {
        //Function to validate the input fields
        Pattern patternCellNumber = Pattern.compile("^[+\\d](\\d{11})$");
        Matcher matcherCell = patternCellNumber.matcher(contactno);
        Boolean validated=true;
        
        if(name == null || name.isEmpty()){
            JOptionPane.showMessageDialog(this,"Name cannot be empty.");
            validated=false;
        }
        else if(address == null || address.isEmpty()){
            JOptionPane.showMessageDialog(this,"Address cannot be empty.");
            validated=false;
        }
        else if(contactno == null || contactno.isEmpty()){
            JOptionPane.showMessageDialog(this,"Contact no cannot be empty.");
            validated=false;
        }
        else if (!matcherCell.matches()){
            JOptionPane.showMessageDialog(this,"Contact number should be valid. Must start with +1.");
            validated=false;
        }
        else if(age < 0 || age > 99){
            JOptionPane.showMessageDialog(this,"Age cannot be less than 0");
            validated=false;
        }
        else if(gender == null || gender.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please select gender");
            validated=false;
        }
        
        return validated;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDriverAge;
    private javax.swing.JTextField jTextDriverContact;
    private javax.swing.JTextField jTextDriverEmail;
    private javax.swing.JTextField jTextDriverNaAddress;
    private javax.swing.JTextField jTextDriverName;
    private javax.swing.JButton jTextDriverUpdateProfile;
    private javax.swing.JTextField jTextDriverUsername;
    // End of variables declaration//GEN-END:variables
}
