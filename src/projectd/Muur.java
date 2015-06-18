/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Graphics;

/**
 *
 * @author Robin
 */
public abstract class Muur extends Veld {
    
    @Override
    public boolean shootable(){
        return false;
    }
    
    @Override
    public void setAantalSchoten(int aantal){
        super.setAantalSchoten(aantal);
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
        
    }
    
    
}
