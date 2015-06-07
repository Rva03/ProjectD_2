/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.util.*;

/**
 *
 * @author Robin
 */
public class Level {

    private int levelGrootte;
    private int levelNummer;
    private ArrayList<Veld> velden = new ArrayList<Veld>();
    
    
    
    Level(int[][] maze, int groot, int nummer) {
        levelGrootte = groot;
        levelNummer = nummer;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < levelGrootte; j++) {
                if (maze[i][j] == 0){
                    velden.add(new LoopVeld(j, i));
                }
                else{
                    velden.add(new Muur(j, i));
                }
            }
            
        }
        
    }
    
    public ArrayList<Veld> getVelden(){
        
        return velden;
    }
    
    public int getGrootte(){
        return levelGrootte;
    }
    
}
