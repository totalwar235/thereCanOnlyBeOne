/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package therecanonlybeone;

import world.Build;
import world.Citizens;

/**
 *
 * @author totalwar
 */
public class ThereCanOnlyBeOne {

    private Build world ;
    private Citizens player;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int z = 3;
        int diff = 1;
        Build temp = new Build(x,y,z,diff);
        
    }
    
    public Build getWorld(){
        return world;
    }
    
    public void setWorld(Build temp){
        world = temp;
    }
}
