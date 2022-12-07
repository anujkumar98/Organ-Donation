/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author anujkumar
 */
public class PatientVisitDirectory {
    ArrayList <PatientVisit> patientVisits=new ArrayList();
    
    void PatientVisitDirectory(){
        patientVisits=new ArrayList();
        
    }

    public ArrayList<PatientVisit> getPatientVisits() {
        return patientVisits;
    }

    public void setPatientVisits(ArrayList<PatientVisit> patientVisits) {
        this.patientVisits = patientVisits;
    }
    
    public ArrayList<PatientVisit> addPatientsVisits(PatientVisit pv){
        patientVisits.add(pv);
        return patientVisits;
    }
    
}
