/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class CarRentalContract {
    
    Customer cm;
    Vehicle vh;
    
    CarRentalContract(Customer customer, Vehicle vom){
        cm =  customer;
        vh =  vom;
    }
    
    static int carObjects =0;
    {
    carObjects +=1;
    }
    
    public String toString(){
        return cm.name + ":" + vh.toString();
    }
    
}
