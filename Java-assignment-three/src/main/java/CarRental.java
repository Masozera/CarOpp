/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
import java.util.Arrays;


public class CarRental {
    String carArray[] = new String[CarRentalContract.carObjects];
    
    void addContract(CarRentalContract c1){

        for(int i=0; i<carArray.length; i++){
            carArray[i] = c1.toString(); 
        }
    }
    

    
    String displayContracts(){
          
        //return Arrays.toString(carArray);
        if(carArray.length > 0){
           for (String contract : carArray){
               //return contract.toString();
               System.out.println(contract);
            } 
        }
        else{            
            return "No Car Rental Contracts";
        }
        return "";
    }
    
    
}

