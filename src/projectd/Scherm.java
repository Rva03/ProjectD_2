/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Robin
 */
public class Scherm extends JFrame implements ActionListener, KeyListener{

    private Timer t = new Timer(5, this);
    private Karakter karakter;
    private VeldComponent component;
    private Level level;
    //private ArrayList<Veld> velden;
    //private final int veldGrootte = 40;
    
    public Scherm(Karakter k, VeldComponent vc, Level l){
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        karakter = k;
        component = vc;
        level = l;
        //velden = level.getVelden();
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP){
            karakter.up();
        }
        if (code == KeyEvent.VK_DOWN){
            karakter.down();
        }
        if (code == KeyEvent.VK_RIGHT){
            karakter.right();
        }
        if (code == KeyEvent.VK_LEFT){
            karakter.left();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        component.repaint();
    }

    
//    public void up(){
//        Veld v = velden.get(((karakter.getY()/veldGrootte)*level.getGrootte()) + (karakter.getX()/veldGrootte) - level.getGrootte());
//        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
//            karakter.setY(karakter.getY()-veldGrootte);
//        }
//    }
//    public void down(){
//        Veld v = velden.get(((karakter.getY()/veldGrootte)*level.getGrootte()) + (karakter.getX()/veldGrootte) + level.getGrootte());
//        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
//            karakter.setY(karakter.getY()+veldGrootte);
//        }
//    }
//    public void right(){
//        Veld v = velden.get(((karakter.getY()/veldGrootte)*level.getGrootte()) + (karakter.getX()/veldGrootte) + 1);
//        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
//            karakter.setX(karakter.getX()+veldGrootte);
//        }
//    }
//    public void left(){
//        Veld v = velden.get(((karakter.getY()/veldGrootte)*level.getGrootte()) + (karakter.getX()/veldGrootte) - 1);
//        if (!(v instanceof RandMuur) && !(v instanceof NormaleMuur)){
//            karakter.setX(karakter.getX()-veldGrootte);
//        }
//    }
    
}
