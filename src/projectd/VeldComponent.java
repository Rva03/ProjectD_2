/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
import javax.swing.*;
import java.lang.*;

/**
 *
 * @author Robin
 */
public class VeldComponent extends JComponent {

    private final int veldGrootte = 40;
    private ArrayList<Veld> velden;
    private int breed;
    private int hoog;
    private Karakter karakter;
    
    
    
    public VeldComponent(ArrayList<Veld> veld, int groot, Karakter k){
        velden = veld;
        breed = groot;
        hoog = (velden.size()/groot);
        karakter = k;
    }
    
    public VeldComponent(){
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        for (Veld v : velden){
            if (v instanceof RandMuur){
                g.setColor(Color.black);
                g.fillRect(v.getX()*veldGrootte, v.getY()*veldGrootte, veldGrootte, veldGrootte);
            }
            else if (v instanceof NormaleMuur){
                g.setColor(Color.darkGray);
                g.fillRect(v.getX()*veldGrootte, v.getY()*veldGrootte, veldGrootte, veldGrootte);
            }
            else if (v instanceof LoopVeld){
                g.setColor(Color.green);
                g.fillRect(v.getX()*veldGrootte, v.getY()*veldGrootte, veldGrootte, veldGrootte);
            }
        }
        
        //teken karakter
        g.setColor(Color.blue);
        g.fillOval(karakter.getX(), karakter.getY(), 39, 39);
        
        
    }
    
    
    
}
