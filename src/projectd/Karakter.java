/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Rectangle;

/**
 *
 * @author Robin
 */
public class Karakter extends SpelObject {
    
    private final int veldGrootte = 40;
    private Level level;
    private int score;
    private Veld huidigVeld;
    private Veld[][] speelveld;

    
    public Karakter(int x, int y, Level l){
        setX(x);
        setY(y);
        level = l;
        score = 0;
    }
    
    public Karakter(Level l){
        level = l;
    }
    
    public void setHuidigVeld(Veld v){
        huidigVeld = v;
        v.setKarakter(this);
    }
    
    public Veld getHuidigVeld(){
        return huidigVeld;
    }
    
    public void goDown(){
        if (huidigVeld.getBuur("onder").loopbaar()){
            huidigVeld.setKarakter(null);
            speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()+1][v.getX()];
        }
    }
    
    public void goUp(){
        if (huidigVeld.getBuur("boven").loopbaar()){
            huidigVeld.setKarakter(null);
            speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()-1][v.getX()];
        }
    }
    
    public void goRight(){
        if (huidigVeld.getBuur("rechts").loopbaar()){
            huidigVeld.setKarakter(null);
            speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()][v.getX()+1];
        }
    }
    
    public void goLeft(){
        if (huidigVeld.getBuur("links").loopbaar()){
            huidigVeld.setKarakter(null);
            speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()][v.getX()-1];
        }
    }
    
    public void checkVoorVriend(){
        if (huidigVeld.getVriend() == null){
            System.out.println("geen vriend op dit veld");
        }
        else{
            huidigVeld.getVriend().doAction();
        }
    }
    
    
    
    
//    public void up(){
//        Veld v = level.getVelden().get(((super.getY()/veldGrootte)*level.getGrootte()) + (super.getX()/veldGrootte) - level.getGrootte());
//        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
//            super.setY(super.getY()-veldGrootte);
//        }
//    }
//    public void down(){
//        Veld v = level.getVelden().get(((super.getY()/veldGrootte)*level.getGrootte()) + (super.getX()/veldGrootte) + level.getGrootte());
//        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
//            super.setY(super.getY()+veldGrootte);
//        }
//    }
//    public void right(){
//        Veld v = level.getVelden().get(((super.getY()/veldGrootte)*level.getGrootte()) + (super.getX()/veldGrootte) + 1);
//        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
//            super.setX(super.getX()+veldGrootte);
//        }
//    }
//    public void left(){
//        Veld v = level.getVelden().get(((super.getY()/veldGrootte)*level.getGrootte()) + (super.getX()/veldGrootte) - 1);
//        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
//            super.setX(super.getX()-veldGrootte);
//        }
//    }
    
    public boolean checkCollision(Vriend v){
        return false;
    }
    
    
}
