package com.vijay.sorting;

public class QuickSort {
	public static void main(String[] args) {
		QuickSort objQuickSort = new QuickSort();
		int[] arr = {20, 5, 10, 2, 15, 20, 5};
		int l = 0;
		int h = arr.length - 1;
		objQuickSort.quickSort(arr, l, h);
	}

	public int partition(int[] arr, int l, int h) {
		int pivot = arr[h];
		int i = l - 1;
		System.out.println("partition called");
		for (int j = l; j < h; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swap = arr[i];
				arr[i] = arr[j];
				arr[j] = swap;
			}
		}
		int swap = arr[(i + 1)];
		arr[(i + 1)] = arr[h];
		arr[h] = swap;

		System.out.println("The sorted array after each partition call :");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		return i + 1;
	}

	public void quickSort(int[] arr, int l, int h) {
		if (l < h) {
			int pivotAt = partition(arr, l, h);

			System.out.println("quickSort till mid:");
			quickSort(arr, l, pivotAt - 1);
			System.out.println("quickSort after mid:");
			quickSort(arr, pivotAt + 1, h);
			System.out.println("The sorted array after each quickSort call :");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("The sorted array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
