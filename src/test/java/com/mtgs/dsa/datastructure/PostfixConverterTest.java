package com.mtgs.dsa.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostfixConverterTest {

    PostfixConverter postfixConverter = new PostfixConverter();

    @Test
    public void testBaseCase1(){
        String postfix = postfixConverter.toPostfix("a+b");
        assertEquals("ab+",postfix);
    }

    @Test
    public void testBaseCase2(){
        String postfix = postfixConverter.toPostfix("a-b");
        assertEquals("ab-",postfix);

    }

    @Test
    public void testBaseCase3(){
        String postfix = postfixConverter.toPostfix("a*b");
        assertEquals("ab*",postfix);
    }

    @Test
    public void testBaseCase4(){
        String postfix = postfixConverter.toPostfix("a/b");
        assertEquals("ab/",postfix);
    }

    @Test
    public void testMoreThanTwoOperand1(){
        String postfix = postfixConverter.toPostfix("a+b+c");
        assertEquals("ab+c+",postfix);
    }

    @Test
    public void testMoreThanTwoOperand2(){
        String postfix = postfixConverter.toPostfix("a+b-c");
        assertEquals("ab+c-",postfix);
    }

    @Test
    public void testMoreThanTwoOperand3(){
        String postfix = postfixConverter.toPostfix("a+b/c");
        assertEquals("abc/+",postfix);
    }

    @Test
    public void testMoreThanTwoOperand4(){
        String postfix = postfixConverter.toPostfix("a*b+c");
        assertEquals("ab*c+",postfix);
    }

    @Test
    public void testMoreThanTwoOperand5(){
        String postfix = postfixConverter.toPostfix("a+b*c");
        assertEquals("abc*+",postfix);
    }

    @Test
    public void testMoreThanTwoOperand6(){
        String postfix = postfixConverter.toPostfix("a+b*c/d");
        assertEquals("abc*d/+",postfix);
    }

    @Test
    public void testMoreThanTwoOperand7(){
        String postfix = postfixConverter.toPostfix("a*b+c*d");
        assertEquals("ab*cd*+",postfix);
    }

    @Test
    public void testMoreThanTwoOperand8(){
        String postfix = postfixConverter.toPostfix("a/b+c*d");
        assertEquals("ab/cd*+",postfix);
    }

    @Test
    public void testMoreThanTwoOperand9(){
        String postfix = postfixConverter.toPostfix("a+b/c*d");
        assertEquals("abc/d*+",postfix);
    }

    @Test
    public void testWithParenthesis(){
        String postfix = postfixConverter.toPostfix("(a+b)*c");
        assertEquals("ab+c*",postfix);
    }
}
