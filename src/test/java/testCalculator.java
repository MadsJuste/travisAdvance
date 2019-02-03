/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Madsj
 */
public class testCalculator {
    Calculator calc = new Calculator();
    public testCalculator() {
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

    
     @Test
     public void add() {
     int result = calc.add(1, 2);
     assertEquals(result,3);
     }
     
     @Test
     public void sub() {
     int result = calc.sub(2, 1);
     assertEquals(result,1);
     }
     
     @Test
     public void mul() {
     int result = calc.mul(2, 2);
     assertEquals(result,4);}
     
     @Test
     public void div() {
     int result = calc.div(2, 2);
     assertEquals(result,1);
     }
}
