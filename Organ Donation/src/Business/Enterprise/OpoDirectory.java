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
public class OpoDirectory {
     public ArrayList<OpoEnterprise> opoDirectory;

    public ArrayList<OpoEnterprise> getOpoDirectory() {
        return opoDirectory;
    }
    
    public OpoDirectory(){
        opoDirectory=new ArrayList<>();
    }
    
    public void addOpo(OpoEnterprise opo){
        opoDirectory.add(opo);
    }
}
