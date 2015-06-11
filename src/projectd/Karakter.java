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

    
    public Karakter(int x, int y, Level l){
        setX(x);
        setY(y);
        level = l;
        score = 0;
    }
    
    
    public void up(){
        Veld v = level.getVelden().get(((super.getY()/veldGrootte)*level.getGrootte()) + (super.getX()/veldGrootte) - level.getGrootte());
        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
            super.setY(super.getY()-veldGrootte);
        }
    }
    public void down(){
        Veld v = level.getVelden().get(((super.getY()/veldGrootte)*level.getGrootte()) + (super.getX()/veldGrootte) + level.getGrootte());
        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
            super.setY(super.getY()+veldGrootte);
        }
    }
    public void right(){
        Veld v = level.getVelden().get(((super.getY()/veldGrootte)*level.getGrootte()) + (super.getX()/veldGrootte) + 1);
        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
            super.setX(super.getX()+veldGrootte);
        }
    }
    public void left(){
        Veld v = level.getVelden().get(((super.getY()/veldGrootte)*level.getGrootte()) + (super.getX()/veldGrootte) - 1);
        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
            super.setX(super.getX()-veldGrootte);
        }
    }
    
    public boolean checkCollision(Vriend v){
        return false;
    }
    
    
}
