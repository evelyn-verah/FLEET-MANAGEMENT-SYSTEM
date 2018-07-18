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
public class vehicles1 {
    public String vehicle_id;
    public String model;
    public String type;
    public String color;
    
    
    public vehicles1(){}
         public vehicles1(String vehicle_id,String model,String type,String color){
             this.vehicle_id = vehicle_id;
             this.model = model;
             this.type = type;
             this.color = color;
             }
         public String getVehicle_id(){
             return vehicle_id;
         }
         public void setVehicle_id(String vehicle_id){
             this.vehicle_id= vehicle_id;
             }
               public String getModel(){
             return model;
         }
               public void setModel(String model){
             this.model= model;
             }
                public String getType(){
             return type;
         }
         public void setType(String type){
             this.type= type;
             }
          public String getColor(){
             return color;
         }
         public void setColor(String color){
             this.color= color;
             }
               
        
         
}
         
    
    
    
    
   
    
    
    
    
