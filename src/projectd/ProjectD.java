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
public class ProjectD {

    /**
     * @param args the command line arguments
     */
    private static JFrame frame;
    private static JFrame gameFrame;
    private static JPanel panel;
    private static JPanel gamePanel;
    private static JButton startButton;
    private static JButton level1Button;
    private static Level level1;
    private static Level level2;
    private static Level level3;
    
    public static void main(String[] args) {

        maakLevel1();
        startLevel1();
        
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
        ArrayList<Veld> velden = level1.getVelden();
        
    }

    private static void startLevel1() {
        Karakter karakter = new Karakter(40, 40, level1);
        VeldComponent component = new VeldComponent(level1.getVelden(), level1.getGrootte(), karakter);
        
        Scherm frame = new Scherm(karakter, component, level1);
        frame.setSize(750, 500);
        frame.setTitle("Doolhof Spel");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.red);
//        Dimension panelSize = new Dimension(800, 40);
//        panel.setPreferredSize(panelSize);
        
//        JPanel panel2 = new JPanel();
//        panel2.setBackground(Color.yellow);
//        Dimension panel2Size = new Dimension(800, 100);
//        panel2.setPreferredSize(panel2Size); 
        
        frame.add(component);
        
        JButton startButton = new JButton("Level 1");
        Dimension startButtonSize = new Dimension(100, 25);
        startButton.setPreferredSize(startButtonSize);
        frame.add(startButton, BorderLayout.NORTH);
        ClickListener listener = new ClickListener(component, frame);
        startButton.addActionListener(listener);
        
        //frame.add(panel, BorderLayout.SOUTH);
        //frame.add(panel2, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
    
    
    
}
