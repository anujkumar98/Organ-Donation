/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.RecepitionistRole;

import Business.Employee.Employee;
import DatabaseUtility.DatabaseHandleHospitalRoles;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class AppointDoctorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AppointDoctorsJPanel
     */
    DatabaseHandleHospitalRoles dbo;
    Employee emp;
    int receptionistId;
    ArrayList<Employee> docList;
    public AppointDoctorsJPanel(Employee e) {
        initComponents();
        dbo=new DatabaseHandleHospitalRoles();
        this.emp=e;
        this.receptionistId=emp.getId();
        populateTable(dbo.fetchPatient(receptionistId));
        docList=dbo.fetchDoctor(receptionistId); // All available doctors in the hospital;
        populateDoctorList(docList);
        setInactive();
        jButtonAppointDoctor.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextPatientID = new javax.swing.JTextField();
        jTextPatientType = new javax.swing.JTextField();
        jTextPatientAge = new javax.swing.JTextField();
        jTextPatientGender = new javax.swing.JTextField();
        jTextPatientContact = new javax.swing.JTextField();
        jButtonAppointDoctor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePatients = new javax.swing.JTable();
        jComboBoxDoctorName = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("VIEW PATIENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("PATIENT NAME");

        jLabel2.setText("PATIENT ID");

        jLabel3.setText("PATIENT TYPE");

        jLabel4.setText("AGE");

        jLabel5.setText("GENDER");

        jLabel6.setText("CONTACT");

        jButtonAppointDoctor.setBackground(new java.awt.Color(204, 0, 0));
        jButtonAppointDoctor.setText("APPOINT DOCTOR");
        jButtonAppointDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAppointDoctorActionPerformed(evt);
            }
        });

        jLabel7.setText("SELECT DOCTOR");

        jTablePatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "Email", "Gender", "Type", "Contact", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePatients);

        jComboBoxDoctorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAppointDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addComponent(jTextPatientContact)
                            .addComponent(jTextPatientGender)
                            .addComponent(jTextPatientAge)
                            .addComponent(jTextPatientType)
                            .addComponent(jTextPatientID)
                            .addComponent(jTextFieldName)
                            .addComponent(jComboBoxDoctorName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPatientContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addComponent(jButtonAppointDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTablePatients.getSelectedRow();
        if (selectedIndex != -1){
            int patientId= Integer.parseInt(jTablePatients.getValueAt(selectedIndex,0).toString());
            jTextFieldName.setText(jTablePatients.getValueAt(selectedIndex,1).toString());
            jTextPatientID.setText(Integer.toString(patientId));
            jTextPatientAge.setText(jTablePatients.getValueAt(selectedIndex,2).toString());
            jTextPatientGender.setText(jTablePatients.getValueAt(selectedIndex,4).toString());
            jTextPatientType.setText(jTablePatients.getValueAt(selectedIndex,5).toString());
            jTextPatientContact.setText(jTablePatients.getValueAt(selectedIndex,6).toString());
            jButtonAppointDoctor.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Please select patient from table to create visit.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAppointDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppointDoctorActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTablePatients.getSelectedRow();
        if (selectedIndex != -1){
        int patientId= Integer.parseInt(jTablePatients.getValueAt(selectedIndex,0).toString());
        int docIndex=jComboBoxDoctorName.getSelectedIndex();
        int docID=docList.get(docIndex).getId();
            //System.out.println(docID);
            Boolean status = dbo.creatVisit(patientId,docID);
            if (status){
                JOptionPane.showMessageDialog(this, "Visit created");
                jTextFieldName.setText("");
                jTextPatientID.setText("");
                jTextPatientAge.setText("");
                jTextPatientGender.setText("");
                jTextPatientType.setText("");
                jTextPatientContact.setText("");
                jButtonAppointDoctor.setText("");
                jButtonAppointDoctor.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(this, "Error in creating visit. Check input fields");
            }
        }
    }//GEN-LAST:event_jButtonAppointDoctorActionPerformed
private void populateTable(ArrayList<Employee> emp){
        DefaultTableModel model=(DefaultTableModel) jTablePatients.getModel();
        model.setRowCount(0);
        for (Employee e: emp)
        {
            Object[] row =new Object[8];
            row[0]=e.getId();
            row[1]=e.getName();
            row[2]=e.getAge();
            row[3]=e.getEmail();
            row[4]=e.getGender();
            row[5]=e.getRole();row[0]=e.getId(); //Patient type is stored in role
            row[6]=e.getContactNumber();
            row[7]=e.getAddress();
            model.addRow(row);
        }
    }
private void populateDoctorList(ArrayList<Employee> emp){
    System.out.println(emp.size());
    for(Employee e:emp){
      jComboBoxDoctorName.addItem("Dr. "+e.getName());
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAppointDoctor;
    private javax.swing.JComboBox<String> jComboBoxDoctorName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePatients;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextPatientAge;
    private javax.swing.JTextField jTextPatientContact;
    private javax.swing.JTextField jTextPatientGender;
    private javax.swing.JTextField jTextPatientID;
    private javax.swing.JTextField jTextPatientType;
    // End of variables declaration//GEN-END:variables

    private void setInactive() {
        jTextFieldName.setEditable(false);
        jTextPatientID.setEditable(false);
        jTextPatientAge.setEditable(false);
        jTextPatientGender.setEditable(false);
        jTextPatientType.setEditable(false);
        jTextPatientContact.setEditable(false);
    }
}
