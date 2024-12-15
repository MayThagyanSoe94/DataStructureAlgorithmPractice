package com.mtgs.dsa.sort;

import com.mtgs.dsa.sorting.SortingAlgorithm;

public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
