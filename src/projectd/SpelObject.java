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
public abstract class SpelObject {
    
    private Veld huidigVeld;
    
    public void setHuidigVeld(Veld v){
        huidigVeld = v;
    }
    
    public Veld getHuidigVeld(){
        return huidigVeld;
    }

    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void tekenJezelf(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
