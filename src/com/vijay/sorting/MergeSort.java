package com.vijay.sorting;

public class MergeSort {
	public static void main(String[] args) {
		MergeSort objMergeSort = new MergeSort();
		int[] array = {13, 122, 111, 34, 16, 1};
		System.out.print("The given array is:");
		for (int p = 0; p < array.length; p++) {
			System.out.println(array[p]);
		}
		int l = 0;
		objMergeSort.mergeSort(array, l, array.length - 1);
	}

	public void mergeArray(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int[] L = new int[n1];
		int[] R = new int[n2];
		System.out.println("Size of Left array is : " + L.length
				+ " Size of right array is: " + R.length);
		for (int i = 0; i < n1; i++) {
			L[i] = arr[(l + i)];
			System.out.println("Element at L[" + i + "] is " + L[i]);
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[(m + 1 + j)];
			System.out.println("Element at R[" + j + "] is " + R[j]);
		}
		int i = 0;
		int j = 0;

		int k = l;
		do {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
			if (i >= n1) {
				break;
			}
		} while (j < n2);
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		System.out.println("The sorted array is:");
		System.out.println("Length of array is: " + arr.length);
		for (int p = 0; p < arr.length - 1; p++) {
			System.out.println("The element at " + (p + 1) + " is " + arr[p]);
		}
	}

	public void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;

			System.out.println("sort till mid is called");
			mergeSort(arr, l, mid);

			System.out.println("sort from mid till end is called");
			mergeSort(arr, mid + 1, r);

			mergeArray(arr, l, mid, r);
		}
	}
}
