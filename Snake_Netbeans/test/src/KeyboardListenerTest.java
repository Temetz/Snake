/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Button;
import java.awt.Container;
import java.awt.event.KeyEvent;
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
public class KeyboardListenerTest {
    
    public KeyboardListenerTest() {
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
     * Test of keyPressed method, of class KeyboardListener.
     */
    @Test
    public void testKeyPressed1() {
        System.out.println("keyPressed - Right");
        ThreadsController.directionSnake = 3;
        //Button a = new Button("click");
        Container b = new Container();
        KeyEvent e;
        e = new KeyEvent(b, 1, 20, 1, 10, 'a');
        e.setKeyCode(39);
        KeyboardListener instance = new KeyboardListener();
        instance.keyPressed(e);
        assertEquals(1, ThreadsController.directionSnake);
    }
        /**
     * Test of keyPressed method, of class KeyboardListener.
     */
    @Test
    public void testKeyPressed2() {
        System.out.println("keyPressed - Left");
        ThreadsController.directionSnake = 4;
        //Button a = new Button("click");
        //KeyEvent e;
        //e = new KeyEvent(a, 1, 20, 1, 10, 'a');
        //e.setKeyCode(37);
        //KeyboardListener instance = new KeyboardListener();
        //instance.keyPressed(e);
        assertEquals(2, ThreadsController.directionSnake);
    }
}
