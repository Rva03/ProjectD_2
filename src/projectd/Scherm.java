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
            karakter.goUp();
            karakter.checkVoorSpelobject();
            karakter.setDirection(0);
        }
        if (code == KeyEvent.VK_DOWN){
            karakter.goDown();
            karakter.checkVoorSpelobject();
            karakter.setDirection(2);
        }
        if (code == KeyEvent.VK_RIGHT){
            karakter.goRight();
            karakter.checkVoorSpelobject();
            karakter.setDirection(1);
        }
        if (code == KeyEvent.VK_LEFT){
            karakter.goLeft();
            karakter.checkVoorSpelobject();
            karakter.setDirection(3);
        }
        if (code == KeyEvent.VK_SPACE){
            karakter.schiet();
        }
        if (karakter.getBazooka() != null){
            karakter.getBazooka().setHuidigveld(karakter.getHuidigVeld());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        component.repaint();
    }

    
}
