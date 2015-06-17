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
public class Valsspeler extends SpelObject{
    
    private int waarde;
    
    public Valsspeler(int w){
        waarde = w;
    }
    
    @Override
    public void doAction(){
        this.getHuidigVeld().getKarakter().setLevens(waarde);
        this.getHuidigVeld().setSpelObject(null);
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        g.setColor(Color.red);
        g.fillOval(this.getHuidigVeld().getX()*this.getHuidigVeld().getVeldgrootte(), this.getHuidigVeld().getY()*this.getHuidigVeld().getVeldgrootte(), 39, 39);
    }
    
}
