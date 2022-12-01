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
public class NgoDirectory {
     public ArrayList<NgoEnterprise> ngoDirectory;

    public ArrayList<NgoEnterprise> getNgoDirectory() {
        return ngoDirectory;
    }
    
    public NgoDirectory(){
        ngoDirectory=new ArrayList<>();
    }
    
    public void addNgo(NgoEnterprise ngo){
        ngoDirectory.add(ngo);
    }
}
