package com.mtgs.dsa.sort;

import com.mtgs.dsa.sorting.SortingAlgorithm;
import com.mtgs.dsa.util.Util;

public class InsertionSort implements SortingAlgorithm {
	Util util = new Util();

	@Override
	public void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				System.out.println(" i >>> " + i + " j >>> " + j + " Array >>> " + util.arrayToString(arr));
				j--;
			}
		}
	}
}
