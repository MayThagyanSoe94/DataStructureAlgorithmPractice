package com.mtgs.dsa;

/**
 *
 * @author maythagyansoe
 */
public class LinearSearch {

    public int search(int[] input, int item) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        LinearSearch ls = new LinearSearch();
        System.out.println("search item found at index " + ls.search(input, 1));
    }
}
