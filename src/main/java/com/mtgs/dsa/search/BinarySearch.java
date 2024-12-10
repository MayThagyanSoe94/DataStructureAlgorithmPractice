package com.mtgs.dsa.search;

import com.mtgs.dsa.searching.SearchAlgoirthm;

public class BinarySearch implements SearchAlgoirthm {

	@Override
	public int search(int[] arr, int item) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (item == arr[middle]) {
				return middle;
			} else if (item < arr[middle]) {
				end = middle - 1;
			} else if (item > arr[middle]) {
				start = middle + 1;
			}
		}
		return -1;
	}

}
