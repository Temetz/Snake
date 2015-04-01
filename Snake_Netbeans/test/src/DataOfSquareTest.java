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
 * @author Tarleena_2
 */
public class DataOfSquareTest {
    
    public DataOfSquareTest() {
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
     * Test of lightMeUp method, of class DataOfSquare.
     * When block is blue (food)
     */
    @Test
    public void testLightMeUp1() {
        System.out.println("lightMeUp - food, blue, 1");
        int c = 1;
        DataOfSquare instance = new DataOfSquare(0);
        instance.lightMeUp(c);
        assertEquals(instance.square.getBackground(), instance.C.get(c));
    }
    /**
     * Test of lightMeUp method, of class DataOfSquare.
     * When block is darkGray (empty)
     */
    @Test
    public void testLightMeUp2() {
        System.out.println("lightMeUp - empty, Dark Gray, 0");
        int c = 0;
        DataOfSquare instance = new DataOfSquare(1);
        instance.lightMeUp(c);
        assertEquals(instance.square.getBackground(), instance.C.get(c));
    }
        /**
     * Test of lightMeUp method, of class DataOfSquare.
     * When block is white (snake)
     */
    @Test
    public void testLightMeUp3() {
        System.out.println("lightMeUp - snake, white, 2");
        int c = 2;
        DataOfSquare instance = new DataOfSquare(0);
        instance.lightMeUp(c);
        assertEquals(instance.square.getBackground(), instance.C.get(c));
    }
}
