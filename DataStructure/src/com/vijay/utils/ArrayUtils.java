package com.vijay.utils;

import java.util.Arrays;

public class ArrayUtils {

	private static Integer count;;

	public static int count() {
		return count++;
	}

	public static int[] getArray() {
		int[] taskGrades = {1, 2, 3, 4, 11, 22, 3, 4, 5, 6, 6, 8, 7};
		return taskGrades;
	}

	public static int[] getSortedArray() {
		int[] taskGrades = {1, 2, 3, 4, 11, 22, 33, 444, 555, 6666, 7777, 8888,
				9999};
		return taskGrades;
	}

	public static void printArray(int[] arr) {
		Arrays.stream(arr).forEach(System.out::println);
	}

	public static void reverseArray(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (end > start) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
