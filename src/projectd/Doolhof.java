/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Robin
 */
public class Doolhof {

    /**
     * @param args the command line arguments
     */
    
    private static Level level1;
    private static Level level2;
    private static Level level3;
    private static JFrame startscherm;
    private static Scherm frame1;
    private static Scherm frame2;
    private static Scherm frame3;
    
    public static void main(String[] args) {

        //maakLevels();
        showStart();
        
        
    }
    
    public static void maakLevels(){
        maakLevel1();
        maakLevel2();
        maakLevel3();
    }
    
    public static void maakLevel1(){
        int[][] maze1 = { 
            {2,2,2,2,2,2,2,2,2,2,2,2},
            {2,0,1,0,1,0,1,0,0,0,0,2},
            {2,0,1,0,0,0,1,0,1,1,0,2},
            {2,0,0,0,1,1,1,0,0,0,0,2},
            {2,0,1,0,0,0,0,0,1,1,0,2},
            {2,0,1,0,1,1,1,0,1,0,0,2},
            {2,0,1,0,1,0,0,0,0,1,0,2},
            {2,0,1,0,1,1,1,0,1,1,0,2},
            {2,0,0,0,0,0,0,0,0,1,0,2},
            {2,2,2,2,2,2,2,2,2,2,2,2}
        };
        level1 = new Level(maze1, 12, 1);
        
    }
    
    public static void maakLevel2(){
        int[][] maze1 = { 
            {2,2,2,2,2,2,2,2,2,2,2,2},
            {2,0,1,0,1,0,1,0,0,0,0,2},
            {2,0,1,0,0,0,1,0,1,1,0,2},
            {2,0,0,0,1,1,1,0,0,0,0,2},
            {2,0,1,0,0,0,0,0,0,1,1,2},
            {2,0,1,0,1,1,1,0,1,1,0,2},
            {2,0,1,0,1,0,0,0,0,0,0,2},
            {2,0,1,0,1,1,1,0,1,1,0,2},
            {2,0,0,0,0,0,0,0,0,1,0,2},
            {2,2,2,2,2,2,2,2,2,2,2,2}
        };
        level2 = new Level(maze1, 12, 2);
        
    }
    
    public static void maakLevel3(){
        int[][] maze1 = { 
            {2,2,2,2,2,2,2,2,2,2,2,2},
            {2,0,0,0,1,0,1,0,0,0,0,2},
            {2,1,1,0,0,0,1,0,1,1,0,2},
            {2,0,0,0,1,1,1,0,0,0,0,2},
            {2,0,1,0,0,0,0,0,1,1,0,2},
            {2,0,1,0,1,1,1,0,1,0,0,2},
            {2,0,1,1,1,0,0,0,0,1,0,2},
            {2,0,1,0,1,1,1,0,1,1,0,2},
            {2,0,0,0,0,0,0,0,0,1,0,2},
            {2,2,2,2,2,2,2,2,2,2,2,2}
        };
        level3 = new Level(maze1, 12, 3);
        
    }

    private static void startLevel1() {
        maakLevel1();
        //Karakter karakter = new Karakter(40, 40, level1);
        //Vriend vriend = new Vriend(400, 320);
        //VeldComponent component = new VeldComponent(level1.getVelden(), level1.getGrootte(), karakter, vriend);
        Karakter karakter = new Karakter(level1);
        Veld[][] speelveld = level1.getSpeelveld();
        karakter.setHuidigVeld(speelveld[1][1]);
        Vriend vriend = new Vriend();
        speelveld[8][10].setVriend(vriend);
        
        VeldComponent component = new VeldComponent(speelveld, karakter);
        
        frame1 = new Scherm(karakter, component, level1);
        frame1.setSize(750, 500);
        frame1.setTitle("Doolhof Spel");
        frame1.setLayout(new BorderLayout());
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame1.add(component);
        
        JButton startButton = new JButton( new AbstractAction("Start level 1 opnieuw") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                frame1.dispose();
                startLevel1();
            }
        });
        frame1.add(startButton, BorderLayout.NORTH);
        
        frame1.setVisible(true);
    }
    
    private static void startLevel2() {
        maakLevel2();
//        Karakter karakter = new Karakter(40, 40, level2);
//        Vriend vriend = new Vriend(400, 320);
//        VeldComponent component = new VeldComponent(level2.getVelden(), level2.getGrootte(), karakter, vriend);
        Karakter karakter = new Karakter(level2);
        Veld[][] speelveld = level2.getSpeelveld();
        karakter.setHuidigVeld(speelveld[1][1]);
        Vriend vriend = new Vriend();
        speelveld[8][10].setVriend(vriend);
        
        VeldComponent component = new VeldComponent(speelveld, karakter);
        
        frame2 = new Scherm(karakter, component, level2);
        frame2.setSize(750, 500);
        frame2.setTitle("Doolhof Spel");
        frame2.setLayout(new BorderLayout());
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame2.add(component);
        
        JButton startButton = new JButton( new AbstractAction("Start level 2 opnieuw") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                frame2.dispose();
                startLevel2();
            }
        });
        frame2.add(startButton, BorderLayout.NORTH);
        
        frame2.setVisible(true);
    }
    
    private static void startLevel3() {
        maakLevel3();
//        Karakter karakter = new Karakter(40, 40, level3);
//        Vriend vriend = new Vriend(400, 320);
//        VeldComponent component = new VeldComponent(level3.getVelden(), level3.getGrootte(), karakter, vriend);
        Karakter karakter = new Karakter(level3);
        Veld[][] speelveld = level3.getSpeelveld();
        karakter.setHuidigVeld(speelveld[1][1]);
        Vriend vriend = new Vriend();
        speelveld[8][10].setVriend(vriend);
        
        VeldComponent component = new VeldComponent(speelveld, karakter);
        
        frame3 = new Scherm(karakter, component, level3);
        frame3.setSize(750, 500);
        frame3.setTitle("Doolhof Spel");
        frame3.setLayout(new BorderLayout());
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame3.add(component);
        
        JButton startButton = new JButton( new AbstractAction("Start level 3 opnieuw") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                frame3.dispose();
                startLevel3();
            }
        });
        frame3.add(startButton, BorderLayout.NORTH);
        
        frame3.setVisible(true);
    }

    private static void showStart() {
        startscherm = new JFrame();
        startscherm.setSize(750, 500);
        startscherm.setTitle("Doolhof Spel");
        startscherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton start1Button = new JButton( new AbstractAction("Start level 1") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                startscherm.dispose();
                startLevel1();
            }
        });
        JButton start2Button = new JButton( new AbstractAction("Start level 2") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                startscherm.dispose();
                startLevel2();
            }
        });
        JButton start3Button = new JButton( new AbstractAction("Start level 3") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                startscherm.dispose();
                startLevel3();
            }
        });
        JPanel startpanel = new JPanel();
        startpanel.setLayout(new BorderLayout());
        JLabel titel = new JLabel("Het enige echte Doolhof-Doolhof spel!");
        JLabel creators = new JLabel("Gemaakt door: Robin van Aalst");
        startpanel.add(titel, BorderLayout.NORTH);
        startpanel.add(start1Button, BorderLayout.WEST);
        startpanel.add(start2Button, BorderLayout.CENTER);
        startpanel.add(start3Button, BorderLayout.EAST);
        startpanel.add(creators, BorderLayout.SOUTH);
        startscherm.add(startpanel);
        startscherm.setVisible(true);
    }
    
    
    
    
}
