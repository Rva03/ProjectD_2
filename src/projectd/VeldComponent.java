/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Robin
 */
public class VeldComponent extends JComponent {

    //private Karakter karakter;
    private Veld[][] speelveld;
    
    public VeldComponent(Veld[][] speelvelden){
        speelveld = speelvelden;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        for (Veld[] veld : speelveld){
            for (Veld v : veld){
                v.tekenJezelf(g);
                if (v.getKarakter() != null){
                    v.getKarakter().tekenJezelf(g);
                }
                else if (v.getSpelObject() != null){
                    v.getSpelObject().tekenJezelf(g);
                }
            }
        }
                  
    }
    
}
