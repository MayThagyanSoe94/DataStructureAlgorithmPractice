package com.mtgs.dsa.tdd.search;

import static junit.framework.TestCase.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.mtgs.dsa.LinearSearch;

/**
 *
 * @author maythagyansoe
 */
public class LinearTestSearch {

    LinearSearch lsAlgo = new LinearSearch();
    int[] input = {1, 2, 3, 4, 5, -1};

    @ParameterizedTest
    @CsvSource(value = {
        "1,0",
        "3,2",
        "-1,5",
        "120,-1",
    })
    void testSearchWithParameterizedTest(int item, int expected) {
        int index = lsAlgo.search(input, item);
        assertEquals(expected, index);
    }

    /*    
    @Test
    public void testBestCaseSearch() {
        int index = lsAlgo.search(input, 1);
        assertEquals(0, index);
    }

    @Test
    public void testAverageCaseSearch() {
        int index = lsAlgo.search(input, 3);
        assertEquals(2, index);
    }

    @Test
    public void testWorstCaseSearch() {
        int index = lsAlgo.search(input, 5);
        assertEquals(4, index);
    }

    @Test
    public void testEmptyWorstCaseSearch() {
        int index = lsAlgo.search(input, -2);
        assertEquals(-1, index);
    }

    @Test
    public void testEdgeCaseSearch() {
        int index = lsAlgo.search(input, -1);
        assertEquals(5, index);
    }
     */
}
