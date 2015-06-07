/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Robin
 */
public class ClickListener implements ActionListener {
       
    private JFrame frame;
    private JComponent panel;
    
    public ClickListener(JFrame frame){
        this.frame = frame;
    }
    
    public ClickListener(JComponent paneel, JFrame frame){
        panel = paneel;
        this.frame = frame;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent event){
        System.out.println("Start Game!");
        panel.repaint();
        frame.requestFocus();

    }
    
    
}
