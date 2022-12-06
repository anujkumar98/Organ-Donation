/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author anujkumar
 */
public class HospitalDirectory {
    public ArrayList<HospitalEnterprise> hospitalDirectory;

    public ArrayList<HospitalEnterprise> getHospitalDirectory() {
        return hospitalDirectory;
    }
    
    public HospitalDirectory(){
        hospitalDirectory=new ArrayList<>();
    }

    public void addHospital(HospitalEnterprise hospital){
        hospitalDirectory.add(hospital);
    }
    
    
}
