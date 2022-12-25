package com.vijay.array;

import java.util.Arrays;

public class MoveZerosAtEnd {

	public static void main(String[] args) {
		int[] arr = {3, 4, 2, 1, 0, 0, 0, 0, 0, 4, 6, 10, 0, 0, 0, 0, 9, 0};
		moveZeroesToEnd(arr);
		System.out.println("Array after moving zero at end:");
		Arrays.stream(arr).forEach(System.out::println);
	}

	private static void moveZeroesToEnd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				// continue;
			} else {
				arr[count] = arr[i];
				count++;
			}
		}
		// fill with zero
		for (int i = count; i < arr.length; i++) {
			arr[i] = 0;
		}
	}
}
