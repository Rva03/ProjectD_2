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
    private static VeldComponent component;
    private static Level level1;
    private static Karakter instance;
    private static final int veldGrootte = 40;
    
    public SchermTest() {
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
        instance = new Karakter(level1);
        component = new VeldComponent(level1.getSpeelveld());
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
     * Test of up method, of class Karakter.
     */
    @Test
    public void testUp() {
        instance.setHuidigVeld(level1.getSpeelveld()[2][1]);
        instance.goUp();
        Veld expResult;
        if (level1.getSpeelveld()[1][1].loopbaar()){
            expResult = level1.getSpeelveld()[1][1];
        }
        else{
            expResult = level1.getSpeelveld()[2][1];
        }
        Veld result = instance.getHuidigVeld();
        assertEquals(expResult, result);
    }

    /**
     * Test of down method, of class Karakter.
     */
    @Test
    public void testDown() {
        instance.setHuidigVeld(level1.getSpeelveld()[2][1]);
        instance.goDown();
        Veld expResult;
        if (level1.getSpeelveld()[3][1].loopbaar()){
            expResult = level1.getSpeelveld()[3][1];
        }
        else{
            expResult = level1.getSpeelveld()[2][1];
        }
        Veld result = instance.getHuidigVeld();
        assertEquals(expResult, result);
    }

    /**
     * Test of right method, of class Karakter.
     */
    @Test
    public void testRight() {
        instance.setHuidigVeld(level1.getSpeelveld()[3][1]);
        instance.goRight();
        Veld expResult;
        if (level1.getSpeelveld()[3][2].loopbaar()){
            expResult = level1.getSpeelveld()[3][2];
        }
        else{
            expResult = level1.getSpeelveld()[3][1];
        }
        Veld result = instance.getHuidigVeld();
        assertEquals(expResult, result);
    }

    /**
     * Test of left method, of class Karakter.
     */
    @Test
    public void testLeft() {
        instance.setHuidigVeld(level1.getSpeelveld()[3][2]);
        instance.goLeft();
        Veld expResult;
        if (level1.getSpeelveld()[3][1].loopbaar()){
            expResult = level1.getSpeelveld()[3][1];
        }
        else{
            expResult = level1.getSpeelveld()[3][2];
        }
        Veld result = instance.getHuidigVeld();
        assertEquals(expResult, result);
    }

    
    
}
