package com.mtgs.dsa.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestUtil {

	@Test
	public void testZeroArry() {
		int[] arr = {};
		Util util = new Util();
		assertTrue(util.isArraySorted(arr));
	}

	@Test
	public void testOneArray() {
		int[] arr = { 1 };
		Util util = new Util();
		assertTrue(util.isArraySorted(arr));
	}

	@Test
	public void testMultipleArray() {
		int[] arr = { -1, -0, 4, 6, 8, 9, 10, 23, 45, 60 };
		Util util = new Util();
		assertTrue(util.isArraySorted(arr));
	}

	@Test
	public void testNegativeCase() {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0 };
		Util util = new Util();
		assertFalse(util.isArraySorted(arr));
	}

}
