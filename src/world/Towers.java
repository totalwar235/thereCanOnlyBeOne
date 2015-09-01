/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.util.Random;

/**
 *
 * @author totalwar
 */
public class Towers {
    private boolean alarms = false;
    private boolean locks = false;
    
    public Towers(int z){
        Citizens[] leasers = new Citizens[z];
        
        Random creation = new Random();
        creation.setSeed(z);
        
        if(creation.nextBoolean()){
            locks = true;
            if(creation.nextBoolean()){
                alarms = true;
            }
        }
    }
}
