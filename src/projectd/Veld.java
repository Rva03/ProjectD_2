/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Robin
 */
public class Veld {
    
    private int xPos;
    private int yPos;
    private Karakter karakter;
    private SpelObject spelobject;
    private Vriend vriend;
    private static final int veldGrootte = 40;
    
    public void setKarakter(Karakter k){
        karakter = k;
    }
    
    public Karakter getKarakter(){
        return karakter;
    }
    
    public void setX(int x){
        xPos = x;
    }
    
    public int getX(){
        return xPos;
    }
    
    public void setY(int y){
        yPos = y;
    }
    
    public int getY(){
        return yPos;
    }
    
}
