/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora2.Calculadora2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class CalculadoraTest2 {
    Calculadora2 calc;
    public CalculadoraTest2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void Before(){
        System.out.println("Before()");
        calc=new Calculadora2();
        
    }
    
    @After
    public void after(){
        System.out.println("after");
        calc.clear();
    }
     @Test
    public void testsuma(){
        System.out.println("test suma");
        int resultado=calc.suma(3,2);
        int esperado=5;
        assertEquals(esperado, resultado);
    }
    @Test
    public void testanssuma(){
        System.out.println("test anssuma");
        calc.suma(3,2);
        int resultado=calc.ans();
        int esperado=5;
        assertEquals(esperado,resultado);
    }
}

