/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Robin
 */
public class Munt extends SpelObject{
    
    //private Veld huidigVeld;
    
    public Munt(){
        
    }
    
//    public void setHuidigVeld(Veld v){
//        huidigVeld = v;
//    }
    
    @Override
    public void doAction(){
        this.getHuidigVeld().getKarakter().setScore(1);
        this.getHuidigVeld().setSpelObject(null);
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(this.getHuidigVeld().getX()*this.getHuidigVeld().getVeldgrootte()+5, this.getHuidigVeld().getY()*this.getHuidigVeld().getVeldgrootte()+5, 30, 30);
    }
    
}
