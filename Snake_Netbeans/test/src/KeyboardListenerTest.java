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
     * Pressed key is Right
     */
    @Test
    public void testKeyPressed1() {
        System.out.println("keyPressed - Right - not opposite direction");
        ThreadsController.directionSnake = 3;
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
     * Pressed key is Right - is opposite direction
     */
    @Test
    public void testKeyPressed2() {
        System.out.println("keyPressed - Right - IS opposite direction");
        ThreadsController.directionSnake = 2;
        Container c = new Container();
        KeyEvent e;
        e = new KeyEvent(c, 1, 20, 1, 10, 'a');
        e.setKeyCode(39);
        KeyboardListener instance = new KeyboardListener();
        instance.keyPressed(e);
        assertEquals(2, ThreadsController.directionSnake);
    }
    /**
     * Test of keyPressed method, of class KeyboardListener.
     * Pressed key is Left
     */
    @Test
    public void testKeyPressed3() {
        System.out.println("keyPressed - Left - not opposite direction");
        ThreadsController.directionSnake = 4;
        Container c = new Container();
        KeyEvent e;
        e = new KeyEvent(c, 1, 20, 1, 10, 'a');
        e.setKeyCode(37);
        KeyboardListener instance = new KeyboardListener();
        instance.keyPressed(e);
        assertEquals(2, ThreadsController.directionSnake);
    }
    /**
     * Test of keyPressed method, of class KeyboardListener.
     * Pressed key is Left - is opposite direction
     */
    @Test
    public void testKeyPressed4() {
        System.out.println("keyPressed - Left - IS opposite direction");
        ThreadsController.directionSnake = 1;
        Container c = new Container();
        KeyEvent e;
        e = new KeyEvent(c, 1, 20, 1, 10, 'a');
        e.setKeyCode(37);
        KeyboardListener instance = new KeyboardListener();
        instance.keyPressed(e);
        assertEquals(1, ThreadsController.directionSnake);
    }
}
