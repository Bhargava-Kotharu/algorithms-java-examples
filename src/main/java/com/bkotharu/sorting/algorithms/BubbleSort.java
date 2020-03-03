package com.bkotharu.sorting.algorithms;

import java.util.Arrays;

/**
 * Bubble Sort - Compare each element with next element and swap if not in
 * required order. This process is to be repeated until the complete array is
 * ordered. Time Complexity - O(n^2)
 * 
 * @author bhargavakotharu
 *
 */
public class BubbleSort {

	public static void main(String args[]) {
		BubbleSort bubbleSort = new BubbleSort();

		int array[] = { 5, 2, 3, 4, 1 };

		System.out.println("Before Sorting - " + Arrays.toString(array));
		int sortedArray[] = bubbleSort.sort(array);
		System.out.println("After Sorting - " + Arrays.toString(sortedArray));

	}

	public int[] sort(int[] array) {

		boolean sorted = false;
		int swap;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap = array[i];
					array[i] = array[i + 1];
					array[i + 1] = swap;
					sorted = false;
				}
			}
		}

		return array;
	}

}
