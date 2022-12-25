package com.vijay.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort OBJ = new InsertionSort();
		int[] arr = {22, 3, 24, 56, 12, 45};
		OBJ.insertionSort(arr);
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

	private void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
