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
    
    private Veld huidigveld;
    
    public Vriend(){
        
    }
    
    public void doAction(){
        System.out.println("U heeft gewonnen!");
        JOptionPane.showMessageDialog(null, "Level gehaald!");  
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        g.setColor(Color.white);
        g.fillOval(huidigveld.getX()*40, huidigveld.getY()*40, 39, 39);
    }

    void setHuidigVeld(Veld v) {
        huidigveld = v;
    }
    
    public Veld getHuidigVeld(){
        return huidigveld;
    }
    
    
}
