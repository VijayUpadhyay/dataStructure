package com.vijay.sorting;

public class CountingSort {
    public void countingSort(char[] arr) {
	int n = arr.length;
	char[] output = new char[n];

	int[] count = new int['?'];
	for (int i = 0; i < 256; i++) {
	    count[i] = 0;
	}
	for (int i = 0; i < n; i++) {
	    count[arr[i]] += 1;
	}
	for (int i = 1; i < 256; i++) {
	    count[i] += count[(i - 1)];
	}
	for (int i = 0; i < n; i++) {
	    output[(count[arr[i]] - 1)] = arr[i];
	    count[arr[i]] -= 1;
	}
	System.out.println("The sorted array is: ");
	for (int i = 0; i < n; i++) {
	    arr[i] = output[i];
	    System.out.print(arr[i]);
	}
    }

    public static void main(String[] args) {
	char[] array = { 'a', 'd', 'a', 'p', 'k', 'd', 'v', 'i', 'j', 'a', 'y' };
	CountingSort objCountingSort = new CountingSort();
	objCountingSort.countingSort(array);
    }
}
