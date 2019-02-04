/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.integrationtests;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.HttpClient;

/**
 *
 * @author Madsj
 */
public class WebCalculatorTest {
    HttpClient http = new HttpClient("http://localhost:7777/WebCalculator/Calculator");
    public WebCalculatorTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void add() throws IOException {
     String result = http.makeHttpRequest("?operation=add&n1=2&n2=3");
     assertEquals(result,"Result of: 2+3= 5");
     }
     @Test
     public void sub() throws IOException {
      String result = http.makeHttpRequest("?operation=sub&n1=4&n2=3");
      assertEquals(result,"Result of: 4-3= 1");
     }
     @Test
     public void mul() throws IOException {
      String result = http.makeHttpRequest("?operation=mul&n1=2&n2=3");
      assertEquals(result,"Result of: 2*3= 6");
     }
     @Test
     public void div() throws IOException {
      String result = http.makeHttpRequest("?operation=div&n1=4&n2=2");
      assertEquals(result,"Result of: 4/2= 2");
     }
}
