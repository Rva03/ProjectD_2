/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Robin
 */
public class Karakter extends SpelObject {
    
    private Level level;
    private int score;
    private Veld huidigVeld;
    private Veld[][] speelveld;
    private int snelheid;
    private Bazooka bazooka = null;
    private String direction = "boven";
    private int levens;

    
    public Karakter(Level l){
        level = l;
        score = 0;
        levens = 3;
        speelveld = level.getSpeelveld();
    }
    
    public void setDirection(String d){
        direction = d;
    }
    
    public String getDirection(){
        return direction;
    }
    
    public void setHuidigVeld(Veld v){
        huidigVeld = v;
        v.setKarakter(this);
    }
    
    public Veld getHuidigVeld(){
        return huidigVeld;
    }
    
    public void schiet(){
        if (bazooka != null){
            bazooka.schiet();
        }
    }
    
    public void goDown(){
        if (huidigVeld.getBuur("onder").loopbaar()){
            huidigVeld.setKarakter(null);
            //speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()+1][v.getX()];
            huidigVeld.setKarakter(this);
        }
    }
    
    public void goUp(){
        if (huidigVeld.getBuur("boven").loopbaar()){
            huidigVeld.setKarakter(null);
            //speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()-1][v.getX()];
            huidigVeld.setKarakter(this);
        }
    }
    
    public void goRight(){
        if (huidigVeld.getBuur("rechts").loopbaar()){
            huidigVeld.setKarakter(null);
            //speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()][v.getX()+1];
            huidigVeld.setKarakter(this);
        }
    }
    
    public void goLeft(){
        if (huidigVeld.getBuur("links").loopbaar()){
            huidigVeld.setKarakter(null);
            //speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()][v.getX()-1];
            huidigVeld.setKarakter(this);
        }
    }
    
    public void checkVoorSpelobject(){
        if (huidigVeld.getSpelObject()== null){
            System.out.println("geen object op dit veld");
        }
        else{
            huidigVeld.getSpelObject().doAction();
        }
    }
    
    public Bazooka getBazooka(){
        return bazooka;
    }
    
    public void setBazooka(Bazooka b){
        bazooka = b;
    }
    
    @Override
    public void tekenJezelf(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(huidigVeld.getX()*huidigVeld.getVeldgrootte(), huidigVeld.getY()*huidigVeld.getVeldgrootte(), 39, 39);
        if(bazooka != null){
            bazooka.tekenJezelf(g);
        }
    }

    public int getScore() {
        return score;
    }

    public int getLevens() {
        return levens;
    }
    
}
