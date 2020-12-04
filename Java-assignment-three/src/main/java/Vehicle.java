/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class Vehicle {
    public String color="Yellow"; 
    
   public String getColor(String vehiclecolor){
       return vehiclecolor;
   }
   
    @Override
   public String toString(){
       return "This vehicle is" + getColor(color);
   }
   
   // constructor
   
   }

