/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;

/**
 *
 * @author anujkumar
 */
public class PatientVisit {
    int id;
    int patientId;
    String name;
    String gender;
    int age;
    int doctorId;
    int hospitalId;
    int vitalId;
    int reportId;
    String type;
    String reportStatus;
    String vitalStatus;
    String bloodType;
    String tissueCondition;
    String address;
    String date;
    String organ;
    String organStatus;

    public String getOrganStatus() {
        return organStatus;
    }

    public void setOrganStatus(String organStatus) {
        this.organStatus = organStatus;
    }
    
    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getTissueCondition() {
        return tissueCondition;
    }

    public void setTissueCondition(String tissueCondition) {
        this.tissueCondition = tissueCondition;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getVitalStatus() {
        return vitalStatus;
    }

    public void setVitalStatus(String vitalStatus) {
        this.vitalStatus = vitalStatus;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getVitalId() {
        return vitalId;
    }

    public void setVitalId(int vitalId) {
        this.vitalId = vitalId;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }
    
}
