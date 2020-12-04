/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class Car extends Vehicle {
    
    boolean hasWinterTires = false;
    
    Car(String carcolor,boolean hasWint){
        
        this.color = carcolor;
        hasWinterTires = hasWint;
    }
    
    public String toString(){
        
        return "The Vehicle is:"+getColor(color)+" Has Winter Tires "+hasWinterTires;
    }
}
