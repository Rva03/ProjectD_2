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
    
    //private Veld huidigveld;
    
    public Bazooka(){
        
    }
    
//    public Veld getHuidigveld(){
//        return huidigveld;
//    }
//    
//    public void setHuidigveld(Veld v){
//        huidigveld = v;
//    }
    
    @Override
    public void doAction(){
        System.out.println("Bazooka gevonden!");
        if (getHuidigVeld().getKarakter() != null){
            if (getHuidigVeld().getKarakter().getBazooka() == null){
                System.out.println("Bazooka opgepakt!");
                getHuidigVeld().getKarakter().setBazooka((Bazooka)getHuidigVeld().getSpelObject());
                getHuidigVeld().setSpelObject(null);
            }
        }
    }
    
    @Override
    public void tekenJezelf(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(getHuidigVeld().getX()*getHuidigVeld().getVeldgrootte()+5, getHuidigVeld().getY()*getHuidigVeld().getVeldgrootte()+12, 30, 16);
    }
    
    public void schiet(){
        Veld muur = vindEersteMuur();
        Veld[][] speelveld = getHuidigVeld().getLevel().getSpeelveld();
        //System.out.println("ik heb geschoten in de richting: " + getHuidigVeld().getKarakter().getDirection());
        if (muur.shootable() && muur.getAantalSchoten() == 1){
            speelveld[muur.getY()][muur.getX()] = new LoopVeld(muur.getX(), muur.getY(), getHuidigVeld().getLevel());
            getHuidigVeld().getKarakter().setBazooka(null);
        }
        else if (muur.shootable() && muur.getAantalSchoten() == 2){
            muur.setAantalSchoten(1);
            getHuidigVeld().getKarakter().setBazooka(null);
        }
    }
    
    public Veld vindEersteMuur(){
        String direction = getHuidigVeld().getKarakter().getDirection();
        Veld veld = getHuidigVeld();
        while (veld.loopbaar()) {
            veld = veld.getBuur(direction);
        }
        //System.out.println(veld.getX() + ":" + veld.getY());
        return veld;
    }
    
}
