/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASOZERA
 */
public class GarageTester {
    public String getExample(){
        Truck tr = new Truck("Black",false);

        Garage gr = new Garage();
        return gr.setVehicle(tr);
    }

}