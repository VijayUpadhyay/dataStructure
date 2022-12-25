package com.vijay.sorting;
public class HeapSorting {
	private static void heapify(int[] arr, int i, int n) {
		int largest = i;
		int leftNode = 2 * i + 1;
		int rightNode = 2 * i + 2;
		if (leftNode < n && arr[leftNode] > arr[largest])
			largest = leftNode;
		if (rightNode < n && arr[rightNode] > arr[largest])
			largest = rightNode;
		if (largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr, largest, n);
		}
	}
	private static void heapSort(int[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, i, n);
		}
		System.out.println("After preparing the tree");
		printArray(arr);
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, 0, i);
		}
	}
	public static void main(String[] args) {
		int[] arr = {33, 2, 12, 34, 55, 31};
		heapSort(arr);
		System.out.println("After sorting the array");
		printArray(arr);
	}
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
