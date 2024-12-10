package com.mtgs.dsa.tdd.search;

import static junit.framework.TestCase.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.mtgs.dsa.search.BinarySearch;
import com.mtgs.dsa.searching.SearchAlgoirthm;

public class BinarySearchTest {
	SearchAlgoirthm algo = new BinarySearch();
	int[] input = { 1, 12, 20, 22, 25, 30, 50, 100 };

	@ParameterizedTest
	@CsvSource(value = {
			"22,3",
			"12,1",
			"25,4",
			"100,7",
			"120,-1",
			"0,-1",
			"23,-1"
			})
	void testSearchWithParameterizedTest(int item, int expected) {
		int index = algo.search(input, item);
		assertEquals(expected, index);
	}
}
