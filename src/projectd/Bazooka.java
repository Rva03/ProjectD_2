/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

/**
 *
 * @author Robin
 */
public class Bazooka extends SpelObject{
    
    public Bazooka(){
        
    }
    
    @Override
    public void doAction(){
        System.out.println("ik ben een bazooka");
    }
    
    public void schiet(){
        System.out.println("ik heb geschoten");
    }
    
}
