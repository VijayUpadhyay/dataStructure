package com.vijay.array;

public class SubarrayWithSum {
	public static void main(String[] args) {
		SubarrayWithSum arraysum = new SubarrayWithSum();
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
		int l = 0;
		// int n = arr.length;
		int sum = 33;
		int curr_sum = 0;
		while (curr_sum < sum) {
			curr_sum += arr[l];
			l++;
		}
		int res = arraysum.subArraySum(arr, sum, curr_sum, l, 0);
		System.out.println("Received result: " + res);
	}
	int subArraySum(int[] arr, int sum, int curr_sum, int l, int start_pos) {
		if (curr_sum == sum) {
			System.out.println("Found sum at: " + start_pos + " till pos: " + (l - 1));
			return l;
		}
		if (l > arr.length - 1)
			return l;
		curr_sum = curr_sum - arr[start_pos];
		start_pos++;
		while (curr_sum < sum) {
			curr_sum += arr[l];
			l++;
		}
		return subArraySum(arr, sum, curr_sum, l, start_pos);
	}
}
