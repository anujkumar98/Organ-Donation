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
public class TransportDirectory {
     public ArrayList<TransportEnterprise> transportDirectory;

    public ArrayList<TransportEnterprise> getTransportDirectory() {
        return transportDirectory;
    }
    
    public TransportDirectory(){
        transportDirectory=new ArrayList<>();
    }
    
    public void addTransport(TransportEnterprise transport){
        transportDirectory.add(transport);
    }
}
