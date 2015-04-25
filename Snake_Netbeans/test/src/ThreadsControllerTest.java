/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SSDTEMETZ
 */
public class ThreadsControllerTest {
    
    Window ins;
    public ThreadsControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.ins = new Window();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test that we have a food block at the start of the game.
     */
    @Test
    public void foodSpawnTest() {
        System.out.println("food spawned correctly?");
        ThreadsController instance = ins.c;
        boolean foodfound = false;
        for(int i = 0; i < instance.Squares.size(); i++){
            for(int x = 0; x < instance.Squares.get(i).size(); x++){
                if(instance.Squares.get(i).get(x).color == 1){
                    foodfound = true;
                }
            }  
        }
        assertEquals(true,foodfound);
        
    }    
    
    /**
     * Test snakes head is in the start position.
     */
    @Test
    public void snakeSpawnTest() {
        System.out.println("snake spawned inside window?");
        Window win = new Window();
        ThreadsController instance = ins.c;
        boolean snakefound = false;
        for(int i = 0; i < instance.Squares.size(); i++){
            for(int x = 0; x < instance.Squares.get(i).size(); x++){
                if(instance.Squares.get(i).get(x).color == 0){
                    snakefound = true;
                }
            }  
        }
        assertEquals(true,snakefound); 
    }    
}
