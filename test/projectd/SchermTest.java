/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectd;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
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
public class SchermTest {
    
    
    private static ArrayList<Veld> velden = new ArrayList<Veld>();
    //private static Karakter k = new Karakter(40, 40);
    private static VeldComponent component;
    private static Level level1;
    private static final int veldGrootte = 40;
    
    public SchermTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        int[][] maze1 = { 
            {1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,1,0,1,0,1,0,0,0,0,1},
            {1,0,1,0,0,0,1,0,1,1,0,1},
            {1,0,0,0,1,1,1,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,1,1,0,1},
            {1,0,1,0,1,1,1,0,1,0,0,1},
            {1,0,1,0,1,0,0,0,0,1,0,1},
            {1,0,1,0,1,1,1,0,1,1,0,1},
            {1,0,0,0,0,0,0,0,0,1,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1}
        };
        int levelGrootte = 12;
        int levelNummer = 1;
        level1 = new Level(maze1, levelGrootte, levelNummer);
        //component = new VeldComponent(level1.getVelden(), level1.getGrootte(), k);
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
     * Test of up method, of class Scherm.
     */
    @Test
    public void testUp() {
        Karakter instance = new Karakter(veldGrootte, 2*veldGrootte, level1);
        instance.up();
        int expResult = 1*veldGrootte;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of down method, of class Scherm.
     */
    @Test
    public void testDown() {
        Karakter instance = new Karakter(veldGrootte, 2*veldGrootte, level1);
        instance.down();
        int expResult = 3*veldGrootte;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of right method, of class Scherm.
     */
    @Test
    public void testRight() {
        Karakter instance = new Karakter(2*veldGrootte, veldGrootte, level1);
        instance.right();
        int expResult = 3*veldGrootte;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of left method, of class Scherm.
     */
    @Test
    public void testLeft() {
        Karakter instance = new Karakter(2*veldGrootte, veldGrootte, level1);
        instance.left();
        int expResult = 1*veldGrootte;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of keyPressed method, of class Scherm.
     */
    //@Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        Scherm instance = null;
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Scherm.
     */
    //@Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Scherm instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
