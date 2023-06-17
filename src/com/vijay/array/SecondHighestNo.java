package com.vijay.array;

public class SecondHighestNo {

	public static void main(String[] args) {
		int[] arr = {100, 2, 22, 333, 44, 556, 678, 899, 899, 999};
		printFirstTwoLargestNo(arr);
	}

	private static void printFirstTwoLargestNo(int[] arr) {
		int firstNo = Integer.MIN_VALUE, secondNo = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstNo) {
				secondNo = firstNo;
				firstNo = arr[i];
			} else if (arr[i] != firstNo && arr[i] > secondNo)
				secondNo = arr[i];
		}
		System.out.println("Largest No: " + firstNo);
		System.out.println("Second Largest No: " + secondNo);
	}

}
