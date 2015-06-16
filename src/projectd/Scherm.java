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
    
    public Scherm(Karakter k, VeldComponent vc, Level l){
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        karakter = k;
        component = vc;
        level = l;
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_H){
            JOptionPane.showMessageDialog(component, "Welkom bij de help! \nU kunt bewegen met de pijltjestoetsen, schieten met spatiebalk als u een bazooka heeft en info opvragen met S.");
        }
        if (code == KeyEvent.VK_S){
            String bazooka = "";
            if (karakter.getBazooka() == null){
                bazooka = "nee"; 
            }
            else {
                bazooka = "ja";
            }
            int score = karakter.getScore();
            int levens = karakter.getLevens();
            JOptionPane.showMessageDialog(component, "Level: " + level.getLevelNummer() + "\nBazooka: " + bazooka + "\nScore: " + score + "\nLevens: " + levens);
        }
        if (code == KeyEvent.VK_UP){
            karakter.goUp();
            karakter.checkVoorSpelobject();
            karakter.setDirection("boven");
        }
        if (code == KeyEvent.VK_DOWN){
            karakter.goDown();
            karakter.checkVoorSpelobject();
            karakter.setDirection("onder");
        }
        if (code == KeyEvent.VK_RIGHT){
            karakter.goRight();
            karakter.checkVoorSpelobject();
            karakter.setDirection("rechts");
        }
        if (code == KeyEvent.VK_LEFT){
            karakter.goLeft();
            karakter.checkVoorSpelobject();
            karakter.setDirection("links");
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
