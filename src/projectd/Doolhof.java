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
        showStart();
    }
    
    public static Scherm getFrame1(){
        return frame1;
    }
    
    public static Scherm getFrame2(){
        return frame2;
    }

    public static Scherm getFrame3(){
        return frame3;
    }
    
    public static void maakLevel1(){
        int[][] maze1 = { 
            {2,2,2,2,2,2,2,2,2,2,2,2},
            {2,0,1,0,1,0,1,0,0,0,0,2},
            {2,0,1,0,0,0,1,0,1,1,0,2},
            {2,0,0,0,1,1,1,0,0,0,0,2},
            {2,0,1,0,0,0,0,0,1,1,0,2},
            {2,0,1,0,1,1,1,0,3,0,0,2},
            {2,0,1,0,3,0,0,0,0,1,0,2},
            {2,0,1,0,1,1,1,0,1,1,0,2},
            {2,0,0,0,0,3,0,0,0,3,0,2},
            {2,2,2,2,2,2,2,2,2,2,2,2}
        };
        level1 = new Level(maze1, 12, 1);
        
        Veld[][] speelveld = level1.getSpeelveld();
        Vriend vriend = new Vriend();
        vriend.setHuidigVeld(speelveld[8][10]);
        speelveld[8][10].setSpelObject(vriend);
        
        int rand1;
        int rand2;
        for (int i = 0; i < 3; i++) {
            do{
                rand1 = (int)(Math.random()*12);
                rand2 = (int)(Math.random()*10);
                if (speelveld[rand2][rand1].loopbaar()){
                    Bazooka bazooka = new Bazooka();
                    if (speelveld[rand2][rand1].getSpelObject() == null && speelveld[rand2][rand1].getKarakter() == null){
                        bazooka.setHuidigVeld(speelveld[rand2][rand1]);
                        speelveld[rand2][rand1].setSpelObject(bazooka);
                    }
                }
            }while (!speelveld[rand2][rand1].loopbaar());
        }
        
        Munt munt1 = new Munt();
        munt1.setHuidigVeld(speelveld[5][3]);
        speelveld[5][3].setSpelObject(munt1);
        Munt munt2 = new Munt();
        munt2.setHuidigVeld(speelveld[8][8]);
        speelveld[8][8].setSpelObject(munt2);
        Munt munt3 = new Munt();
        munt3.setHuidigVeld(speelveld[3][7]);
        speelveld[3][7].setSpelObject(munt3);
        
        Valsspeler valsspeler1 = new Valsspeler(1);
        valsspeler1.setHuidigVeld(speelveld[8][3]);
        speelveld[8][3].setSpelObject(valsspeler1);
        Valsspeler valsspeler2 = new Valsspeler(2);
        valsspeler2.setHuidigVeld(speelveld[3][8]);
        speelveld[3][8].setSpelObject(valsspeler2);
        
        Helper helper = new Helper();
        helper.setHuidigVeld(speelveld[4][5]);
        speelveld[4][5].setSpelObject(helper);
    }
    
    public static void maakLevel2(){
        int[][] maze1 = { 
            {2,2,2,2,2,2,2,2,2,2,2,2},
            {2,0,1,0,1,0,1,0,0,0,0,2},
            {2,0,1,0,0,0,3,0,1,1,0,2},
            {2,0,0,0,1,1,1,0,0,0,0,2},
            {2,0,1,0,0,0,0,0,0,1,3,2},
            {2,0,1,0,1,1,1,0,1,1,0,2},
            {2,0,1,0,3,0,0,0,0,0,0,2},
            {2,0,1,0,1,1,1,0,1,1,0,2},
            {2,0,0,0,3,0,0,0,0,3,0,2},
            {2,2,2,2,2,2,2,2,2,2,2,2}
        };
        level2 = new Level(maze1, 12, 2);
        
        Veld[][] speelveld = level2.getSpeelveld();
        Vriend vriend = new Vriend();
        vriend.setHuidigVeld(speelveld[8][10]);
        speelveld[8][10].setSpelObject(vriend);
        
        int rand1;
        int rand2;
        for (int i = 0; i < 3; i++) {
            do{
                rand1 = (int)(Math.random()*12);
                rand2 = (int)(Math.random()*10);
                if (speelveld[rand2][rand1].loopbaar()){
                    Bazooka bazooka = new Bazooka();
                    if (speelveld[rand2][rand1].getSpelObject() == null && speelveld[rand2][rand1].getKarakter() == null){
                        bazooka.setHuidigVeld(speelveld[rand2][rand1]);
                        speelveld[rand2][rand1].setSpelObject(bazooka);
                    }
                }
            }while (!speelveld[rand2][rand1].loopbaar());
        }
        
        Munt munt1 = new Munt();
        munt1.setHuidigVeld(speelveld[5][3]);
        speelveld[5][3].setSpelObject(munt1);
        Munt munt2 = new Munt();
        munt2.setHuidigVeld(speelveld[8][8]);
        speelveld[8][8].setSpelObject(munt2);
        Munt munt3 = new Munt();
        munt3.setHuidigVeld(speelveld[3][7]);
        speelveld[3][7].setSpelObject(munt3);
        
        Valsspeler valsspeler1 = new Valsspeler(1);
        valsspeler1.setHuidigVeld(speelveld[8][3]);
        speelveld[8][3].setSpelObject(valsspeler1);
        Valsspeler valsspeler2 = new Valsspeler(2);
        valsspeler2.setHuidigVeld(speelveld[3][8]);
        speelveld[3][8].setSpelObject(valsspeler2);
        
        Helper helper = new Helper();
        helper.setHuidigVeld(speelveld[4][5]);
        speelveld[4][5].setSpelObject(helper);
    }
    
    public static void maakLevel3(){
        int[][] maze1 = { 
            {2,2,2,2,2,2,2,2,2,2,2,2},
            {2,0,0,0,1,0,1,0,0,0,0,2},
            {2,1,1,0,0,0,3,0,1,1,0,2},
            {2,0,0,0,1,1,1,0,0,0,0,2},
            {2,0,1,0,0,0,0,0,1,1,0,2},
            {2,0,1,0,1,1,1,0,3,0,0,2},
            {2,0,1,3,1,0,0,0,0,1,0,2},
            {2,0,1,0,1,1,1,0,1,1,0,2},
            {2,0,3,0,0,0,0,0,0,3,0,2},
            {2,2,2,2,2,2,2,2,2,2,2,2}
        };
        level3 = new Level(maze1, 12, 3);
        
        Veld[][] speelveld = level3.getSpeelveld();
        Vriend vriend = new Vriend();
        vriend.setHuidigVeld(speelveld[8][10]);
        speelveld[8][10].setSpelObject(vriend);
        
        int rand1;
        int rand2;
        for (int i = 0; i < 3; i++) {
            do{
                rand1 = (int)(Math.random()*12);
                rand2 = (int)(Math.random()*10);
                if (speelveld[rand2][rand1].loopbaar()){
                    Bazooka bazooka = new Bazooka();
                    if (speelveld[rand2][rand1].getSpelObject() == null && speelveld[rand2][rand1].getKarakter() == null){
                        bazooka.setHuidigVeld(speelveld[rand2][rand1]);
                        speelveld[rand2][rand1].setSpelObject(bazooka);
                    }
                }
            }while (!speelveld[rand2][rand1].loopbaar());
        }
        
        Munt munt1 = new Munt();
        munt1.setHuidigVeld(speelveld[5][3]);
        speelveld[5][3].setSpelObject(munt1);
        Munt munt2 = new Munt();
        munt2.setHuidigVeld(speelveld[8][8]);
        speelveld[8][8].setSpelObject(munt2);
        Munt munt3 = new Munt();
        munt3.setHuidigVeld(speelveld[3][7]);
        speelveld[3][7].setSpelObject(munt3);
        
        Valsspeler valsspeler1 = new Valsspeler(1);
        valsspeler1.setHuidigVeld(speelveld[8][3]);
        speelveld[8][3].setSpelObject(valsspeler1);
        Valsspeler valsspeler2 = new Valsspeler(2);
        valsspeler2.setHuidigVeld(speelveld[3][8]);
        speelveld[3][8].setSpelObject(valsspeler2);
        
        Helper helper = new Helper();
        helper.setHuidigVeld(speelveld[8][1]);
        speelveld[8][1].setSpelObject(helper);
    }

    public static void startLevel1() {
        maakLevel1();
        Veld[][] speelveld = level1.getSpeelveld();
        
        Karakter karakter = new Karakter(level1);
        karakter.setHuidigVeld(speelveld[1][1]);
        speelveld[1][1].setKarakter(karakter);
        
        VeldComponent component = new VeldComponent(speelveld);
        
        frame1 = new Scherm(karakter, component, level1);
        frame1.setSize(750, 500);
        frame1.setTitle("Doolhof Spel");
        frame1.setLayout(new BorderLayout());
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
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
    
    public static void startLevel2() {
        maakLevel2();
        Veld[][] speelveld = level2.getSpeelveld();
        
        Karakter karakter = new Karakter(level2);
        karakter.setHuidigVeld(speelveld[1][1]);
        speelveld[1][1].setKarakter(karakter);
        
        VeldComponent component = new VeldComponent(speelveld);
        
        frame2 = new Scherm(karakter, component, level2);
        frame2.setSize(750, 500);
        frame2.setTitle("Doolhof Spel");
        frame2.setLayout(new BorderLayout());
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
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
    
    public static void startLevel3() {
        maakLevel3();
        Veld[][] speelveld = level3.getSpeelveld();
        
        Karakter karakter = new Karakter(level3);
        karakter.setHuidigVeld(speelveld[1][1]);
        speelveld[1][1].setKarakter(karakter);
        
        VeldComponent component = new VeldComponent(speelveld);
        
        frame3 = new Scherm(karakter, component, level3);
        frame3.setSize(750, 500);
        frame3.setTitle("Doolhof Spel");
        frame3.setLayout(new BorderLayout());
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
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

    public static void showStart() {
        startscherm = new JFrame();
        startscherm.setSize(750, 500);
        startscherm.setTitle("Doolhof Spel");
        startscherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton start1Button = new JButton( new AbstractAction("Start level 1") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                //startscherm.dispose();
                startLevel1();
            }
        });
        JButton start2Button = new JButton( new AbstractAction("Start level 2") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                //startscherm.dispose();
                startLevel2();
            }
        });
        JButton start3Button = new JButton( new AbstractAction("Start level 3") {
            @Override
            public void actionPerformed( ActionEvent e ) {
                //startscherm.dispose();
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
