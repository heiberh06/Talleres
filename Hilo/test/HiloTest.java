/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hilo.Hilo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author USUARIO
 */
public class HiloTest {
    
    public HiloTest() {
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

      @Test(timeout = 5000)
    public void hilotest(){
        Hilo.hilolargo();
    }
    @Test(expected = ArithmeticException.class)
    public void divtest(){
        System.out.println(Hilo.div(3,2));
        //Hilos.div(3,0);
        
    }
}

