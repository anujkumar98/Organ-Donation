/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author anujkumar
 */
public class NetworkDirectory {
    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        this.networkList = new ArrayList();
    }
    
    

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetorkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
  
public Network createNetwork(String name,String cityName,String stateName,String regionName){
        Network network = new Network();
        network.setName(name);
        network.setCity(cityName);
        network.setState(stateName);
        network.setRegion(regionName);
        networkList.add(network);
        return network;
    }
//Adding employee details to list 
public ArrayList<Network> addNetwork(Network n){
        networkList.add(n);
        return networkList;
    }
}
