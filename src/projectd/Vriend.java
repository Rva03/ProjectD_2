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
public class Vriend extends SpelObject {
    
    public Vriend(){
        
    }

    @Override
    public void doAction(){
        System.out.println("U heeft gewonnen!");
        JOptionPane.showMessageDialog(null, "Level gehaald!");  
        if (getHuidigVeld().getLevel().getLevelNummer() == 1){
                Doolhof.getFrame1().dispose(); 
        }
        else if (getHuidigVeld().getLevel().getLevelNummer() == 2){
            Doolhof.getFrame2().dispose();
        }
        else if (getHuidigVeld().getLevel().getLevelNummer() == 3){
            Doolhof.getFrame3().dispose();
        }
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        g.setColor(Color.white);
        g.fillOval(getHuidigVeld().getX()*getHuidigVeld().getVeldgrootte(), getHuidigVeld().getY()*getHuidigVeld().getVeldgrootte(), 39, 39);
    }
    
}
