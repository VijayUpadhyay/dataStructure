package com.vijay.array;
class MergeSortedArray {
	public static void main(String[] args) {
		int arr1[] = {1, 5, 9, 10, 15, 20, 1000};
		int arr2[] = {2, 3, 8, 13};
		int m = arr1.length;
		int n = arr2.length;
		// merge(arr1, arr2, m, n);
		mergeArray(arr1, arr2);
		System.out.print("After Merging \nFirst Array: ");
		for (int i = 0; i < m; i++)
			System.out.print(arr1[i] + " ");
		System.out.print("\nSecond Array: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr2[i] + " ");
	}
	public static void mergeArray(int[] arr1, int[] arr2) {
		// length of first arr1
		int n = arr1.length;
		// length of second arr2
		int m = arr2.length;
		// Now traverse the array1 and if arr2 first element
		// is less than arr1 then swap
		for (int i = 0; i < n; i++) {
			if (arr1[i] > arr2[0]) {
				// swap
				int temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0] = temp;
				// after swapping we have to sort the array2 again so that it
				// can be again swap with arr1
				// we will store the firstElement of array2 and left shift all
				// the element and store
				// the firstElement in arr2[k-1]
				int firstElement = arr2[0];
				int k;
				for (k = 1; k < m && arr2[k] < firstElement; k++) {
					arr2[k - 1] = arr2[k];
				}
				arr2[k - 1] = firstElement;
			}
		}
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}
}
