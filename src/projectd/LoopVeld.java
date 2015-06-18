/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Robin
 */
public class LoopVeld extends Veld {
    
    public LoopVeld(int x, int y, Level l){
        setX(x);
        setY(y);
        setLevel(l);
    }
    
    @Override
    public boolean loopbaar(){
        return true;
    }
    
    @Override
    public boolean shootable(){
        return false;
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        if (this.getOplossingVeld()){
            g.setColor(Color.green);
            g.fillRect(getX()*getVeldgrootte(), getY()*getVeldgrootte(), getVeldgrootte(), getVeldgrootte());
            g.setColor(Color.blue);
            g.fillOval(getX()*getVeldgrootte()+12, getY()*getVeldgrootte()+12, 16, 16);
        }
        else{
            g.setColor(Color.green);
            g.fillRect(getX()*getVeldgrootte(), getY()*getVeldgrootte(), getVeldgrootte(), getVeldgrootte());
        }
    }
    
}
