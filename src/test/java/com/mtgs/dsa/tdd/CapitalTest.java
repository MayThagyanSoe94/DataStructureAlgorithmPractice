package com.mtgs.dsa.tdd;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author maythagyansoe
 */
public class CapitalTest {
    
    @Test
    public void testEmpty(){
        Capital cap = new Capital();
        String output = cap.toCapital("");
        
        TestCase.assertEquals("",output);
    }
    
    @Test
    public void testNull(){
        Capital cap = new Capital();
        String output = cap.toCapital(null);
        
        TestCase.assertEquals("",output);
    }
    
    @Test
    public void testSingleWord(){
        Capital cap = new Capital();
        String output = cap.toCapital("apple");
        TestCase.assertEquals("Apple",output);
        
        output = cap.toCapital("apple");
        TestCase.assertEquals("Apple",output);
    }
    
        @Test
    public void testMultipleWord(){
        Capital cap = new Capital();
        String output = cap.toCapital("apple orange");
        TestCase.assertEquals("Apple Orange",output);
        
        output = cap.toCapital("Apple Orange");
        TestCase.assertEquals("Apple Orange",output);
    }
}
