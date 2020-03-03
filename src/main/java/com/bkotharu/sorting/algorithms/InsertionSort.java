package com.bkotharu.sorting.algorithms;

import java.util.Arrays;

/**
 * Insertion Sort
 * 
 * @author bhargavakotharu
 *
 */
public class InsertionSort {

	public static void main(String[] args) {

		InsertionSort insertionSort = new InsertionSort();
		int array[] = { 5, 2, 3, 4, 1 };

		System.out.println("Before Sorting - " + Arrays.toString(array));
		int sortedArray[] = insertionSort.sort(array);
		System.out.println("After Sorting - " + Arrays.toString(sortedArray));

	}

	public int[] sort(int[] array) {

		for (int j = 1; j < array.length; j++) {

			int start = array[j];
			int i = j - 1;

			while (i > -1 && array[i] > start) {
				array[i+1] = array[i];
				i--;
			}
			array[i + 1] = start;
		}
		return array;
	}
}