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
public class view_fuelling {
    public int fuelling_id;
    public String vehicle_id;
    public String fuel_reading_before;
    public String  fuel_reading_after;
    public int  Amount;
    public int  litres;
    public String Date;
   // public String startmileage;
   // public String endmileage;
    
    public view_fuelling(int fuelling_id,String vehicle_id,String fuel_reading_before,String fuel_reading_after ,int Amount,int litres,String Date)
    
    {
    this.fuelling_id = fuelling_id;
     this.vehicle_id =vehicle_id ;
    this.fuel_reading_before= fuel_reading_before;
    this.fuel_reading_after=fuel_reading_after;
    this. Amount= Amount;
     this.litres = litres;
      this. Date= Date;
      //this.endtime = endtime;
      //this.startmileage = startmileage;
      //this.endmileage = endmileage; 
    
    }
     public int getFuelling_id() {
        return fuelling_id;
    }

    public void setFuelling_id(int fuelling_id) {
        this.fuelling_id= fuelling_id;
    }
     public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id= vehicle_id;
    }
    public String getFuel_reading_before () {
        return fuel_reading_before;
    }

    public void setFuel_reading_before(String fuel_reading_before) {
        this.fuel_reading_before= fuel_reading_before;
    }
    
    
     public String getFuel_reading_after() {
        return fuel_reading_after;
    }

    public void setFuel_reading_after(String fuel_reading_after) {
        this.fuel_reading_after = fuel_reading_after;
    }
     public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount= Amount;
    }
     public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }

    
     public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    }
    
    
    
    
    
    
    
    

