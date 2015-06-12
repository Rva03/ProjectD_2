/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import javax.swing.JOptionPane;

/**
 *
 * @author Robin
 */
public class Vriend extends SpelObject {
    
    public Vriend(){
        
    }
    
    public void doAction(){
        System.out.println("U heeft gewonnen!");
        JOptionPane.showMessageDialog(null, "Level gehaald!");  
    }
    
    
}
