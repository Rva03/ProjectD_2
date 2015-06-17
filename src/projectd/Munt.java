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
    
    public Munt(){
        
    }

    @Override
    public void doAction(){
        this.getHuidigVeld().getKarakter().setScore(1);
        System.out.println("U score is met 1 munt verhoogd tot een score van: " + this.getHuidigVeld().getKarakter().getScore() + "!");
        this.getHuidigVeld().setSpelObject(null);
        if (this.getHuidigVeld().getKarakter().getScore() == 3){
            JOptionPane.showMessageDialog(null, "U heeft alle muntjes gevonden!\nEr verschijnt een extra bazooka in dit level!");
            int rand1;
            int rand2;
            do{
            rand1 = (int)(Math.random()*12);
            rand2 = (int)(Math.random()*10);
            if (getHuidigVeld().getLevel().getSpeelveld()[rand2][rand1].loopbaar()){
                Bazooka bazooka = new Bazooka();
                bazooka.setHuidigVeld(getHuidigVeld().getLevel().getSpeelveld()[rand2][rand1]);
                getHuidigVeld().getLevel().getSpeelveld()[rand2][rand1].setSpelObject(bazooka);
            }
            }while (!getHuidigVeld().getLevel().getSpeelveld()[rand2][rand1].loopbaar());
        }
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(this.getHuidigVeld().getX()*this.getHuidigVeld().getVeldgrootte()+5, this.getHuidigVeld().getY()*this.getHuidigVeld().getVeldgrootte()+5, 30, 30);
    }
    
}
