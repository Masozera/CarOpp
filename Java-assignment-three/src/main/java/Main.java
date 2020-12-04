/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class Main {

    public static void main(String[] args) {
        
        Vehicle bencar = new Car("Yellow",true);
        Vehicle petetruck = new Truck("Green",true);
        
        
        System.out.println(bencar.toString());
        System.out.println(petetruck.toString());
        
        
        GarageTester gt = new GarageTester();
        System.out.println("Garage Tester: "+gt.getExample());
        
        Customer nc1 = new Customer("Masozera","Kampala");
        Customer nc2 = new Customer("Karani","Toronto");
        
        Vehicle chevroletCar = new Car("Grey",true);
        
       
        CarRentalContract cc3 = new CarRentalContract(nc2,chevroletCar);
        
        CarRental cr = new CarRental();
        cr.addContract(cc3);
       

        System.out.println("My Contracts:");
        System.out.println(cr.displayContracts());
        
       
        
    
    }
    
}