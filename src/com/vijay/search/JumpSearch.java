package com.vijay.search;
public class JumpSearch {
	public static void main(String[] args) {
		JumpSearch js = new JumpSearch();
		int array[] = {10, 12, 23, 34, 45, 56, 67};
		int find = 67;
		js.jumpSearch(array, find);
	}

	public int jumpSearch(int arr[], int key) {
		int n = arr.length;
		int m = (int) Math.floor(Math.sqrt(n));
		int prev = 0;
		if (arr[Math.min(m, n)] < key) {
			prev = m;
			m = +(int) Math.floor(Math.sqrt(n));
			if (prev > n)
				return -1;
		}
		while (arr[prev] < key && prev < n - 1) {
			prev++;
			if (arr[prev] == key) {
				System.out.println(
						"Element: " + arr[prev] + " found at: " + (prev + 1));
				return prev + 1;
			} else if (prev == n - 1) {
				System.out.println("Element " + key + " is not found");
				return -1;
			}
		}
		return -1;
	}

}
