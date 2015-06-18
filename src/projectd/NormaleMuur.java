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
    
    public NormaleMuur(int x, int y, Level l, int aantal){
        setX(x);
        setY(y);
        setLevel(l);
        setAantalSchoten(aantal);
    }
    
    @Override
    public boolean shootable(){
        return true;
    }
    
    @Override
    public int getAantalSchoten(){
        return super.getAantalSchoten();
    }
    
    @Override
    public boolean loopbaar(){
        return false;
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        if (getAantalSchoten() == 1){
            g.setColor(Color.darkGray);
            g.fillRect(getX()*getVeldgrootte(), getY()*getVeldgrootte(), getVeldgrootte(), getVeldgrootte());
            g.setColor(Color.white);
            g.fillRect(getX()*getVeldgrootte()+16, getY()*getVeldgrootte()+5, 8, 30);
            
        }
        else if (getAantalSchoten() == 2){
            g.setColor(Color.darkGray);
            g.fillRect(getX()*getVeldgrootte(), getY()*getVeldgrootte(), getVeldgrootte(), getVeldgrootte());
            g.setColor(Color.white);
            g.fillRect(getX()*getVeldgrootte()+8, getY()*getVeldgrootte()+9, 24, 4);
            g.fillRect(getX()*getVeldgrootte()+28, getY()*getVeldgrootte()+9, 4, 9);
            g.fillRect(getX()*getVeldgrootte()+8, getY()*getVeldgrootte()+18, 24, 4);
            g.fillRect(getX()*getVeldgrootte()+8, getY()*getVeldgrootte()+18, 4, 9);
            g.fillRect(getX()*getVeldgrootte()+8, getY()*getVeldgrootte()+27, 24, 4);
        }
    }
}
