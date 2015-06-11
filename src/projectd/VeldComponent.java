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
    private Vriend vriend;
    private Veld[][] speelveld;
    
    
    
    public VeldComponent(ArrayList<Veld> veld, int groot, Karakter k, Vriend v){
        velden = veld;
        breed = groot;
        hoog = (velden.size()/groot);
        karakter = k;
        vriend = v;
    }
    
    public VeldComponent(Veld[][] speelvelden, Karakter k){
        speelveld = speelvelden;
        karakter = k;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        for (Veld[] veld : speelveld){
            for (Veld v : veld){
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
        }
        //Teken karakter
        g.setColor(Color.blue);
        g.fillOval(karakter.getHuidigVeld().getX()*veldGrootte, karakter.getHuidigVeld().getY()*veldGrootte, 39, 39);
             
    }
    
//    @Override
//    protected void paintComponent(Graphics g) {
//        
//        for (Veld v : velden){
//            if (v instanceof RandMuur){
//                g.setColor(Color.black);
//                g.fillRect(v.getX()*veldGrootte, v.getY()*veldGrootte, veldGrootte, veldGrootte);
//            }
//            else if (v instanceof NormaleMuur){
//                g.setColor(Color.darkGray);
//                g.fillRect(v.getX()*veldGrootte, v.getY()*veldGrootte, veldGrootte, veldGrootte);
//            }
//            else if (v instanceof LoopVeld){
//                g.setColor(Color.green);
//                g.fillRect(v.getX()*veldGrootte, v.getY()*veldGrootte, veldGrootte, veldGrootte);
//            }
//        }
//        
//        //Teken vriend
//        g.setColor(Color.WHITE);
//        g.fillOval(vriend.getX(), vriend.getY(), 39, 39);
//        
//        //Teken karakter
//        g.setColor(Color.blue);
//        g.fillOval(karakter.getX(), karakter.getY(), 39, 39);
//        
//        
//    }
    
    
    
}
