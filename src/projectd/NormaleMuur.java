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
    
    public NormaleMuur(int x, int y){
        setX(x);
        setY(y);
        
    }
    
    @Override
    public boolean loopbaar(){
        return false;
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRect(getX()*40, getY()*40, 40, 40);
    }
}
