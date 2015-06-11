/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Robin
 */
public class Level extends JPanel{

    private int levelGrootte;
    private int levelNummer;
    private ArrayList<Veld> velden = new ArrayList<Veld>();
    private Veld[][] speelveld;
    
    public Level(int[][] maze, int groot, int nummer) {
        levelGrootte = groot;
        levelNummer = nummer;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < levelGrootte; j++) {
                if (maze[i][j] == 2){
                    velden.add(new RandMuur(j, i));
                }
                else if (maze[i][j] == 1){
                    velden.add(new NormaleMuur(j, i));
                }
                else {
                    velden.add(new LoopVeld(j, i));
                }
            }
            
        }
        speelveld = new Veld[velden.size()/levelGrootte][levelGrootte];
        int i;
        int j;
        int teller = 0;
        for (i = 0;  i < (velden.size()/levelGrootte); i++) {
            for (j = 0;  j < levelGrootte; j++) {
                speelveld[i][j] = velden.get(teller);
                teller++;
            }
        }
        
        
    }
    
    public ArrayList<Veld> getVelden(){
        
        return velden;
    }
    
    public Veld[][] getSpeelveld(){
        return speelveld;
    }
    
    public int getGrootte(){
        return levelGrootte;
    }
    
}
