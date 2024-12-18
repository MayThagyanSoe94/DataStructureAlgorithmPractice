package com.mtgs.dsa.sort;

import com.mtgs.dsa.sorting.SortingAlgorithm;

public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
