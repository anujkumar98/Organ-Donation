/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Transport;

import java.util.ArrayList;

/**
 *
 * @author anujkumar
 */
public class TransportRequestDirectory {
    
    ArrayList<TransportRequest> transportRequestList;

    public TransportRequestDirectory() {
        this.transportRequestList = new ArrayList();
    }

    public ArrayList<TransportRequest> getTransportRequestList() {
        return transportRequestList;
    }

    public void setTransportRequestList(ArrayList<TransportRequest> transportRequestList) {
        this.transportRequestList = transportRequestList;
    }
    
    
    public ArrayList<TransportRequest> addTransportRequest(TransportRequest tr){
        transportRequestList.add(tr);
        return transportRequestList;
    }
}
