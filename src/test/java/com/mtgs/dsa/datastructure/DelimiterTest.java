package com.mtgs.dsa.datastructure;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DelimiterTest {

	//Delimiter delimiter = new Delimiter();
	//DelimiterRefactor delimiter = new DelimiterRefactor();
	DelimiterBestPractice delimiter = new DelimiterBestPractice();

	@ParameterizedTest
	@CsvSource(value = {
			"'',true",
			"c[d],true",
			"c[d,false",
			"a{bd}e,true",
			"a{bde,false",
			"a(bd)e,true",
			"ab(c,false",
			"a[b{c}d]e},false",
			"a[b{c}d]e),false",
			"a[b{c}d]e],false",
			})
	void testDelimiter(String input, boolean expected) {
		System.out.println("Input >>> " + input + " Result >>> " + expected);
		boolean result = delimiter.isValid(input);
		assertEquals(expected, result);
	}
	

// 	@Test
//	public void testEmpty() {
//		boolean valid = delimiter.isValid("");
//		assertTrue(valid);
//	}

//	@Test
//	public void testBracketDelimiter() {
//		boolean valid = delimiter.isValid("c[d]");
//		assertTrue(valid);
//	}

	
//	@Test
//	public void testBracketDelimiterNegative() {
//		assertFalse(delimiter.isValid("c[d"));
//	}
	
//	@Test
//	public void testCurlyBraceDelimiter() {
//		assertTrue(delimiter.isValid("a{bd}e"));
//	}

//	@Test
//	public void testCurlyBraceNegativeCase() {
//		assertFalse(delimiter.isValid("a{bde"));
//	}

//	@Test
//	public void testparenthesesDelimiter() {
//		assertTrue(delimiter.isValid("a(bd)e"));
//	}

//	@Test
//	public void testparenthesesNegative() {
//		assertFalse(delimiter.isValid("ab(c"));
//	}

//	@Test
//	public void testMultiDelimiterNegativeCase() {
//		assertFalse(delimiter.isValid("a[b{c}d]e}"));
//		assertFalse(delimiter.isValid("a[b{c}d]e)"));
//		assertFalse(delimiter.isValid("a[b{c}d]e]"));
//	}

}
