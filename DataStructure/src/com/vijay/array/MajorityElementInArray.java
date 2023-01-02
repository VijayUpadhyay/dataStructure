package com.vijay.array;

public class MajorityElementInArray {

	public static void findMajorityElement(int[] arr) {
		int n = arr.length, count = 1, maxElementPos = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxElementPos] == arr[i])
				count++;
			else
				count--;
			if (count == 0) {
				maxElementPos = i;
				count = 1;
			}
			if (count > n / 2) {
				break;
			}
		}
		System.out.println("Majority element is " + arr[maxElementPos]);
	}

	public static void main(String[] args) {
		int[] array = {3, 3, 2, 1, 2, 3, 2, 2, 2, 2, 6, 5, 9, 2};
		findMajorityElement(array);
	}
}
