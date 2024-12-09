package com.mtgs.dsa.tdd.search;

import com.mtgs.dsa.LinearSearch;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author maythagyansoe
 */
public class LinearTestSearch {

    @Test
    public void testBestCaseSearch() {
        LinearSearch lsAlgo = new LinearSearch();
        int[] input = {1, 2, 3, 4, 5};

        int index = lsAlgo.search(input, 1);
        assertEquals(0, index);
    }

    @Test
    public void testAverageCaseSearch() {
        LinearSearch lsAlgo = new LinearSearch();
        int[] input = {1, 2, 3, 4, 5};

        int index = lsAlgo.search(input, 3);
        assertEquals(2, index);
    }

    @Test
    public void testWorstCaseSearch() {
        LinearSearch lsAlgo = new LinearSearch();
        int[] input = {1, 2, 3, 4, 5};

        int index = lsAlgo.search(input, 5);
        assertEquals(4, index);
    }

    @Test
    public void testEmptyWorstCaseSearch() {
        LinearSearch lsAlgo = new LinearSearch();
        int[] input = {1, 2, 3, 4, 5};

        int index = lsAlgo.search(input, -1);
        assertEquals(-1, index);
    }

    @Test
    public void testEdgeCaseSearch() {
        LinearSearch lsAlgo = new LinearSearch();
        int[] input = {1, 2, 3, 4, 5, -1};

        int index = lsAlgo.search(input, -1);
        assertEquals(5, index);
    }
}
