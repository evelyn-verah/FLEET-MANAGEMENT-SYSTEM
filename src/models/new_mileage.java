/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author EVELYN
 */
public class new_mileage {
    public int mileage_id;
    public String vehicle_id;
    public String startpoint;
    public String endpoint;
    public String driver_id;
    public String starttime;
    public String endtime;
    public String startmileage;
    public String endmileage;
    public new_mileage(int mileage_id,String vehicle_id,String startpoint,String endpoint,String driver_id,String starttime,String endtime, String startmileage,String endmileage)
    
    {
    this.mileage_id = mileage_id;
    this.driver_id = driver_id;
    this.vehicle_id=vehicle_id;
    this.startpoint = startpoint;
     this.endpoint = endpoint;
      this.starttime = starttime;
      this.endtime = endtime;
      this.startmileage = startmileage;
      this.endmileage = endmileage; 
    
    }
     public int getMileage_id() {
        return mileage_id;
    }

    public void setMileage_id(int mileage_id) {
        this.mileage_id = mileage_id;
    }
     public String getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(String driver_id) {
        this.driver_id = driver_id;
    }
    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id= vehicle_id;
    }
    
    
     public String getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(String startpoint) {
        this.startpoint = startpoint;
    }
     public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
     public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    
     public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
     public String getStartmileage() {
        return startmileage;
    }

    public void setStartmileage(String startmileage) {
        this.startmileage = startmileage;
    }
     public String getEndmileage() {
        return endmileage;
    }

    public void setEndmileage(String endmileage) {
        this.endmileage = endmileage;
    }
    
    
    
    
    
    
    
    
}
