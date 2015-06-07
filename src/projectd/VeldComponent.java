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

    private final int veldWidth = 40;
    private final int veldHeight = 40;
//    private int xPos = 0;
//    private int yPos = 0;
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
//        for(Veld v: velden){
//            int plaats = 1;
//            if (v.getClass().isInstance(muur)){
//                g.setColor(Color.black);
//                g.fillRect(plaats*hoog, plaats*breed, veldWidth, veldHeight);
//            }
//            else if (v.getClass().isInstance(loopveld)){
//                g.setColor(Color.green);
//                g.fillRect(plaats*hoog, plaats*breed, veldWidth, veldHeight);
//            }
//            plaats++;
//        }
        
        for (Veld v : velden){
            if (v.getClass().getSimpleName().equals("Muur")){
                g.setColor(Color.black);
                g.fillRect(v.getX()*40, v.getY()*40, veldWidth, veldHeight);
            }
            else if (v.getClass().getSimpleName().equals("LoopVeld")){
                g.setColor(Color.green);
                g.fillRect(v.getX()*40, v.getY()*40, veldWidth, veldHeight);
            }
            //System.out.println(v.getClass().getSimpleName());
        }
        
        //teken karakter
        g.setColor(Color.blue);
        g.fillOval(karakter.getX(), karakter.getY(), 39, 39);
        
        //g.fillRect((int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100));
        
    }
    
    
    
}
