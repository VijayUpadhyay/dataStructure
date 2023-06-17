package com.vijay.array;

import java.util.Arrays;

public class SegregateOddEven {
	public static int count = 0;
	public static void main(String[] args) {
		// int[] arr = {3, 5, 7, 1, 2, 3, 4, 2, 46, 0, 8, 9};
		int[] arr = {3, 5, 7, 1, 3, 5, 7, 9};
		segregateEvenOddNo(arr);
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("Count is: " + count);
	}

	static void segregateEvenOddNo(int arr[]) {
		int n = arr.length;
		int i = -1, j = 0;
		while (j != n) {
			if (arr[j] % 2 == 0) {
				i++;
				// Swapping even and odd numbers
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
			count++;
		}
	}
}
