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
public class Build {
    public Build(int x, int y, int z, int dif){
        Towers[][] world = null;
        
        for(int i = 0; i < x; i++){
            Towers[] length = null;
            for(int b = 0; b < y; b++){
                Random height = new Random();
                height.setSeed(b);
                Towers temp = new Towers(height.nextInt((z - dif) + 1) + dif);
                length[b] = temp;
            }
            world[i] = length;
        }
    }

}
