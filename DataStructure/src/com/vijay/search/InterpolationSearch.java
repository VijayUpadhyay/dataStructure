package com.vijay.search;

public class InterpolationSearch {

	static int pos;
	public static void main(String[] args) {
		InterpolationSearch intrpolationSearch = new InterpolationSearch();
		int array[] = {2, 8, 9, 10, 18, 23, 31, 37};
		int find = 9;
		pos = intrpolationSearch.interpolationSearch(array, find);
		System.out.println("Element found at: " + pos);
	}

	public int interpolationSearch(int arr[], int x) {
		int lo = 0, hi = arr.length - 1;
		float pos1 = hi - lo;
		float pos2 = arr[hi] - arr[lo];
		float cal = pos1 / pos2;
		float cal1 = x - arr[lo];
		float result = cal * cal1;
		pos = (int) result;
		System.out.println("Pos value " + pos1 + "\nPos1 value: " + pos2
				+ "\nCal value: " + cal + "\nCal1 value:  " + cal1
				+ "\nResult value:  " + result);
		while (hi >= lo && arr[hi] >= x && x >= arr[lo]) {
			if (arr[(int) result] == x)
				return (int) result;
			if (arr[(int) result] < x) {
				lo = (int) result + 1;
				return lo;
			}

			else {
				hi = (int) result - 1;
				return hi;
			}
		}
		return -1;
	}

}
