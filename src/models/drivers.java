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
public class drivers {
    public int Driver_id;
    public String First_name;
    public String Last_name;
    public String Gender;
    public int Phone_number;
    
            
    public drivers(int Driver_id,String First_name,String Last_name,String Gender,int Phone_number){
        this.Driver_id=Driver_id;
        this.First_name=First_name;
        this.Last_name=Last_name;
        this.Gender=Gender;
        this.Phone_number=Phone_number;
       }
     public int getDriver_id() {
        return Driver_id;
    }

    public void setDriver_id(int Driver_id) {
        this.Driver_id = Driver_id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {  
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }
       public String getGender() {  
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
       public int getPhone_number() {  
        return Phone_number;
    }

    public void setPhone_number( int phone_number) {
        this.Phone_number =  Phone_number;
    }
    
    
    
    
    
    
}

    
    
    
    
    
    

