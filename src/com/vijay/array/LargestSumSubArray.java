package com.vijay.array;

public class LargestSumSubArray {
    public static void main(String[] args) {
	int[] array = { 2, 1, -3, 2, 5, 7, 2, -6, 1 };
	maxContiguousSum(array);
    }

    public static void maxContiguousSum(int[] arr) {
	int positiveNumberChecker = Integer.MIN_VALUE;
	int maxValueSoFar = 0;
	for (int i = 0; i < arr.length; i++) {
	    positiveNumberChecker += arr[i];
	    if (positiveNumberChecker > maxValueSoFar) {
		maxValueSoFar = positiveNumberChecker;
	    }
	    if (positiveNumberChecker < 0) {
		positiveNumberChecker = 0;
	    }
	}
	System.out.println("The lagest sum of contiguous sub array is " + maxValueSoFar);
    }
}
