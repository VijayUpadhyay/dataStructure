package com.vijay.array;

public class OccurencesOfNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 3, 3, 3 };
		int number = 3;
		int count = count(arr, number);
		System.out.println(number + " is available at: " + count + " places");
	}

	public static int firstOccurence(int[] arr, int n, int lo, int hi) {
		if (hi >= lo) {
			int mid = (lo + hi) / 2;
			if ((mid == 0 || n > arr[mid - 1]) && arr[mid] == n)
				return mid;
			else if (n > arr[mid])
				return firstOccurence(arr, n, mid + 1, hi);
			else
				return firstOccurence(arr, n, lo, mid - 1);
		}
		return -1;
	}

	public static int lastOccurence(int[] arr, int n, int lo, int hi) {
		int mid = (lo + hi) / 2;
		if (hi >= lo) {
			if ((mid == arr.length - 1 || n < arr[mid + 1]) && arr[mid] == n)
				return mid;
			else if (n < arr[mid])
				return lastOccurence(arr, n, lo, mid - 1);
			else
				return lastOccurence(arr, n, mid + 1, hi);
		}
		return -1;
	}

	public static int count(int[] arr, int n) {
		int size = arr.length;
		int lo = 0, hi = size - 1;

		int first = firstOccurence(arr, n, lo, hi);
		int last = lastOccurence(arr, n, lo, hi);

		int count = last - first + 1;

		return count;
	}

}
