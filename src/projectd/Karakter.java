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
    
    private Level level;
    private int score;
    private Veld huidigVeld;
    private Veld[][] speelveld;
    private int snelheid;
    private Bazooka bazooka = null;

    
    public Karakter(Level l){
        level = l;
        score = 0;
        speelveld = level.getSpeelveld();
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
        }
    }
    
    public void goUp(){
        if (huidigVeld.getBuur("boven").loopbaar()){
            huidigVeld.setKarakter(null);
            //speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()-1][v.getX()];
        }
    }
    
    public void goRight(){
        if (huidigVeld.getBuur("rechts").loopbaar()){
            huidigVeld.setKarakter(null);
            //speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()][v.getX()+1];
        }
    }
    
    public void goLeft(){
        if (huidigVeld.getBuur("links").loopbaar()){
            huidigVeld.setKarakter(null);
            //speelveld = level.getSpeelveld();
            Veld v = huidigVeld;
            huidigVeld = speelveld[v.getY()][v.getX()-1];
        }
    }
    
    public void checkVoorSpelobject(){
        if (huidigVeld.getSpelObject()== null){
            System.out.println("geen object op dit veld");
        }
        else if (huidigVeld.getSpelObject() instanceof Bazooka){
            bazooka = (Bazooka) huidigVeld.getSpelObject();
            huidigVeld.setSpelObject(null);
        }
        else{
            huidigVeld.getSpelObject().doAction();
        }
    }
    
    public Bazooka getBazooka(){
        return bazooka;
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
    
    
    
    
}
