/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Robin
 */
public class Helper extends SpelObject{
    
    private Veld eindveld;
    private ArrayList<Veld> oplossing= new ArrayList<>();
    private int[][] veldTeller;
    
    public Helper(){
        
    }
    
    public void setEindveld(){
        Veld[][] speelveld = getHuidigVeld().getLevel().getSpeelveld();
        eindveld = speelveld[speelveld.length-2][getHuidigVeld().getLevel().getGrootte()-2];
        //System.out.println(eindveld.getX() + ":" + eindveld.getY());
    }
    
    @Override
    public void doAction(){
        System.out.println("De oplossing is gevonden!");
        setEindveld();
        veldTeller = new int[10][12];
        
        int i=0;
        int j;
        for(int[] rij :veldTeller){ 
            j=0;
            for(int veld: rij)
            {
               veldTeller[i][j] = Integer.MAX_VALUE;
               j++;
            }
            i++;
        }
        losRecursiefOp(getHuidigVeld(), 0);
        losOp(eindveld);
        
        for (Veld v : oplossing){
            v.setOplossing(true);
        }
    }
    
    public void losRecursiefOp(Veld veld, int teller){   
        if(veldTeller[veld.getY()][veld.getX()] < teller){
            return;
        }
        veldTeller[veld.getY()][veld.getX()] = teller; 
        if(veld.getBuur("links")!= null && veld.getBuur("links").loopbaar()){
            losRecursiefOp(veld.getBuur("links"), (teller+1));
        }
        if(veld.getBuur("rechts")!= null && veld.getBuur("rechts").loopbaar()){
            losRecursiefOp(veld.getBuur("rechts"), (teller+1));
        }
        if(veld.getBuur("boven")!= null && veld.getBuur("boven").loopbaar()){
            losRecursiefOp(veld.getBuur("boven"), (teller+1));
        }
        if(veld.getBuur("onder")!= null && veld.getBuur("onder").loopbaar()){
            losRecursiefOp(veld.getBuur("onder"), (teller+1));
        }
    }
    private void losOp(Veld veld){
        int x = veld.getX();
        int y = veld.getY();
        oplossing.add(veld);
        
        if(veldTeller[veld.getY()][veld.getX()-1] < veldTeller[veld.getY()][veld.getX()]){
            losOp(getHuidigVeld().getLevel().getSpeelveld()[y][x-1]);
        }
        if(veldTeller[veld.getY()][veld.getX()+1] < veldTeller[veld.getY()][veld.getX()]){
            losOp(getHuidigVeld().getLevel().getSpeelveld()[y][x+1]);
        }
        if(veldTeller[veld.getY()-1][veld.getX()] < veldTeller[veld.getY()][veld.getX()]){
            losOp(getHuidigVeld().getLevel().getSpeelveld()[y-1][x]);
        }
        if(veldTeller[veld.getY()+1][veld.getX()] < veldTeller[veld.getY()][veld.getX()]){
            losOp(getHuidigVeld().getLevel().getSpeelveld()[y+1][x]);
        }
    }
    
    @Override
    public void tekenJezelf(Graphics g){
        g.setColor(Color.orange);
        g.fillOval(this.getHuidigVeld().getX()*this.getHuidigVeld().getVeldgrootte(), this.getHuidigVeld().getY()*this.getHuidigVeld().getVeldgrootte(), 39, 39);
    }
    
    
}
