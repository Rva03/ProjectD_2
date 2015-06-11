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
    private Veld buurBoven;
    private Veld buurOnder;
    private Veld buurRechts;
    private Veld buurLinks;
    
    public Veld getBuur(String richting){
        Veld[][] speelveld = Level.getLevelSpeelveld();
        if (richting.equals("boven")){
            buurBoven = speelveld[yPos-1][xPos];
            return buurBoven;
        }
        else if (richting.equals("onder")){
            buurOnder = speelveld[yPos+1][xPos];
            return buurOnder;
        }
        else if (richting.equals("rechts")){
            buurRechts = speelveld[yPos][xPos+1];
            return buurRechts;
        }
        else if (richting.equals("links")){
            buurLinks = speelveld[yPos][xPos-1];
            return buurLinks;
        }
        else {
            return this;
        }
    }
    
    public boolean loopbaar(){
        return false;
    }
    
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

    public void setVriend(Vriend v) {
        vriend = v;
    }
    
    public Vriend getVriend(){
        return vriend;
    }
    
}
