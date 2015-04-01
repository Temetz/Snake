/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
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
public class ThreadsControllerTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class ThreadsController.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        boolean test = false;
        Window testwindow = new Window();
        Tuple pd = new Tuple(10,10);
        ThreadsController instance = new ThreadsController(pd);
        ExecutorService executor = Executors.newCachedThreadPool();
        Runnable task = new Runnable() {
            public void run() {
                instance.run();
            }
        };
        Future future = executor.submit(task);
        try {
            Object result = future.get(5, TimeUnit.SECONDS);          
        } catch (TimeoutException ex) {
            // handle the timeout
            test = true;
            future.cancel(true); // true to interrupt if running
        } catch (InterruptedException e) {
            // handle the interrupts
            test = false;
        } catch (ExecutionException e) {
            // handle other exceptions
            test = false;
        } finally {
            assertEquals(true, test);
        }
        
    }
    
}
