package com.mtgs.dsa.sorting;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.mtgs.dsa.sort.BubbleSort;
import com.mtgs.dsa.sort.InsertionSort;
import com.mtgs.dsa.sort.SelectionSort;
import com.mtgs.dsa.util.Util;

public class SortingTest {
	Util util = new Util();
	// SortingAlgorithm sortingAlgorithm = new BubbleSort();
	// SortingAlgorithm sortingAlgorithm = new SelectionSort();
	SortingAlgorithm sortingAlgorithm = new InsertionSort();

	@Test
	public void testEmptySort() {
		int[] arr = {};
		sortingAlgorithm.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}

	@Test
	public void testSingleSort() {
		int[] arr = { 3 };
		sortingAlgorithm.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}

	@Test
	public void testTwoSort() {
		int[] arr = { 3, 2 };
		sortingAlgorithm.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}

	@Test
	public void testBubbleSort() {
		int[] arr = { 3, 1, 3 };
		sortingAlgorithm.sort(arr);
		assertTrue(util.isArraySorted(arr));
	}

	@Test
	public void testRandomSort() {
		int[] arr = util.createRandomArray(10);
		System.out.println("Input  >>> " + util.arrayToString(arr));
		sortingAlgorithm.sort(arr);
		System.out.println("Sorted >>> " + util.arrayToString(arr));
		assertTrue(util.isArraySorted(arr));
	}

}
