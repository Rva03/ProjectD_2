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
    private int veldenBreed;
    //private int y = 40;
    private Karakter karakter;
    private VeldComponent component;
    private Level level;
    private ArrayList<Veld> velden;
    
    public Scherm(Karakter k, VeldComponent vc, Level l){
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        karakter = k;
        component = vc;
        level = l;
        velden = level.getVelden();
        veldenBreed = level.getGrootte();
        
    }
    
    
    public void up(){
        Veld v = velden.get(((karakter.getY()/40)*12) + (karakter.getX()/40) - veldenBreed);
        if (!v.getClass().getSimpleName().equals("Muur")){
            karakter.setY(karakter.getY()-40);
        }
    }
    public void down(){
        Veld v = velden.get(((karakter.getY()/40)*12) + (karakter.getX()/40) + veldenBreed);
        if (!v.getClass().getSimpleName().equals("Muur")){
            karakter.setY(karakter.getY()+40);
        }
    }
    public void right(){
        Veld v = velden.get(((karakter.getY()/40)*12) + (karakter.getX()/40) + 1);
        if (!v.getClass().getSimpleName().equals("Muur")){
            karakter.setX(karakter.getX()+40);
        }
    }
    public void left(){
        Veld v = velden.get(((karakter.getY()/40)*12) + (karakter.getX()/40) - 1);
        if (!v.getClass().getSimpleName().equals("Muur")){
            karakter.setX(karakter.getX()-40);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP){
            up();
        }
        if (code == KeyEvent.VK_DOWN){
            down();
        }
        if (code == KeyEvent.VK_RIGHT){
            right();
        }
        if (code == KeyEvent.VK_LEFT){
            left();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        component.repaint();
    }

    
}
