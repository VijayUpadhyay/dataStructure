package com.vijay.array.sliding_window;

import com.vijay.utils.ArrayUtils;

public class MaxSumWindow {

	private static int findMaxValueWindow(int[] arr, int sum, int maxSum, int l,
			int windowSize) {
		if ((l + windowSize) >= arr.length) {
			return maxSum;
		}
		sum = sum - arr[l] + arr[l + windowSize];
		l++;
		System.out.println("Got sum: " + sum + " and l is: " + l);
		if (sum > maxSum)
			maxSum = sum;

		return findMaxValueWindow(arr, sum, maxSum, l, windowSize);
	}

	public static void main(String[] args) {
		// {1, 2, 3, 4, 11, 0, 3, 4, 5, 6, 6, 8, 7}
		int[] arr = ArrayUtils.getArray();
		int windowSize = 3, l = 0;
		if (arr.length < windowSize)
			return;
		int sum = 0;
		// Prepare sum for initial window
		for (int i = 0; i <= windowSize - 1; i++)
			sum += arr[i];
		System.out.println("Init sum with window size 3 is: " + sum);
		int maxSum = findMaxValueWindow(arr, sum, sum, l, windowSize);
		System.out.println("Max sum with window size 3 is: " + maxSum);
	}

}
