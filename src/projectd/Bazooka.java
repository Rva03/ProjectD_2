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
public class Bazooka extends SpelObject{
    
    private Veld huidigveld;
    
    public Bazooka(){
        
    }
    
    public Veld getHuidigveld(){
        return huidigveld;
    }
    
    public void setHuidigveld(Veld v){
        huidigveld = v;
    }
    
    
    @Override
    public void doAction(){
        System.out.println("ik ben een bazooka");
        if (huidigveld.getKarakter() != null){
            huidigveld.getKarakter().setBazooka((Bazooka)huidigveld.getSpelObject());
        }
        huidigveld.setSpelObject(null);
    }
    
    @Override
    public void tekenJezelf(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(huidigveld.getX()*40+5, huidigveld.getY()*40+12, 30, 16);
    }
    
    public void schiet(){
        System.out.println("ik heb geschoten in de richting: " + huidigveld.getKarakter().getDirection());
    }
    
}
