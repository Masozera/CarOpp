/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class Garage {
   
    Vehicle nv = new Car("Purple",true);
    Vehicle tp = new Truck("Grey",true);


    public String setVehicle(Vehicle parked){
       return parked.toString();
             
    }
    public String toString(){//overriding the toString() method  
       return "Description of the parked vehicle "+tp.toString()+nv.toString();  
    }
     
}

