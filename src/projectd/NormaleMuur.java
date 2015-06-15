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
public class NormaleMuur extends Muur {
    
    public NormaleMuur(int x, int y, Level l){
        setX(x);
        setY(y);
        setLevel(l);
    }
    
    @Override
    public boolean shootable(){
        return true;
    }
    
    @Override
    public boolean loopbaar(){
        return false;
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRect(getX()*getVeldgrootte(), getY()*getVeldgrootte(), getVeldgrootte(), getVeldgrootte());
    }
}
