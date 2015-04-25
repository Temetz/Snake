/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TEMETZ
 */
public class TupleTest {
    
    public TupleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of ChangeData method, of class Tuple.
     */
    @Test
    public void testChangeData() {
        System.out.println("ChangeData");
        int x = 0;
        int y = 2;
        Tuple instance = new Tuple(0,0);
        instance.ChangeData(x, y);
        assertEquals(x, instance.getX());
        assertEquals(y, instance.getY());
    }    
    
    /**
     * Test of Constructor method, of class Tuple.
     */
    @Test
    public void testTuple() {
        System.out.println("Constructor");
        int x = 12;
        int y = 15;
        Tuple instance = new Tuple(x,y);
        assertEquals(x, instance.getX());
        assertEquals(y, instance.getY());
    }

    /**
     * Test of getX method, of class Tuple.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Tuple instance = new Tuple(5,0);
        int expResult = 5;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Tuple.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Tuple instance = new Tuple(4,2);
        int expResult = 2;
        int result = instance.getY();
        assertEquals(expResult, result);
    }
    
}
