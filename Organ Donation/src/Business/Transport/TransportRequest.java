/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Transport;

/**
 *
 * @author anujkumar
 */
public class TransportRequest {
    int srcHopitalId;
    int destHopitalId;
    String srcHospitalName;
    String destHospitalName;
    String srcHospitalAddress;
    String destHospitalAddress;
    String requestStatus;
    String organName;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }
    

    public int getSrcHopitalId() {
        return srcHopitalId;
    }

    public void setSrcHopitalId(int srcHopitalId) {
        this.srcHopitalId = srcHopitalId;
    }

    public int getDestHopitalId() {
        return destHopitalId;
    }

    public void setDestHopitalId(int destHopitalId) {
        this.destHopitalId = destHopitalId;
    }

    public String getSrcHospitalName() {
        return srcHospitalName;
    }

    public void setSrcHospitalName(String srcHospitalName) {
        this.srcHospitalName = srcHospitalName;
    }

    public String getDestHospitalName() {
        return destHospitalName;
    }

    public void setDestHospitalName(String destHospitalName) {
        this.destHospitalName = destHospitalName;
    }

    public String getSrcHospitalAddress() {
        return srcHospitalAddress;
    }

    public void setSrcHospitalAddress(String srcHospitalAddress) {
        this.srcHospitalAddress = srcHospitalAddress;
    }

    public String getDestHospitalAddress() {
        return destHospitalAddress;
    }

    public void setDestHospitalAddress(String destHospitalAddress) {
        this.destHospitalAddress = destHospitalAddress;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

   
    
}
