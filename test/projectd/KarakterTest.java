/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robin
 */
public class KarakterTest {
    
    private static Veld[][] speelveld;
    private static Level level1;
    
    public KarakterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
        
        speelveld = level1.getSpeelveld();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkVoorSpelobject method, of class Karakter.
     */
    @Test
    public void testCheckVoorSpelobject() {
        Karakter instance = new Karakter(level1);
        boolean expResult;
        boolean result;
        instance.setHuidigVeld(speelveld[1][1]);
        Bazooka bazooka = new Bazooka();
        speelveld[1][1].setSpelObject(bazooka);
        if (instance.getHuidigVeld().getSpelObject() == null){
            expResult = true;
        }
        else{

            expResult = false;
        }
        if (instance.getHuidigVeld().getSpelObject() == null){
            result = true;
        }
        else{

            result = false;
        }
        
        assertEquals(expResult, result);
    }

    
}
