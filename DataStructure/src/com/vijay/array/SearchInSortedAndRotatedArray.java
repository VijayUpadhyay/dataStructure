package com.vijay.array;
public class SearchInSortedAndRotatedArray {
	public static void main(String[] args) {
		int array[] = {6, 7, 2, 3, 4, 5};
		int key = 4, h = array.length - 1, l = 0;
		int keyPos = searchInSortedAndRotatedrray(array, l, h, key);
		System.out.println("Key is found at position " + (keyPos + 1));
		if (keyPos == -1)
			System.out.println(key + " is not found");
	}
	public static int searchInSortedAndRotatedrray(int[] arr, int l, int h,
			int key) {
		int mid = (h + l) / 2;
		if (l > h)
			return -1;
		if (arr[mid] == key)
			return mid;
		// To check the array is sorted or not
		if (arr[l] <= arr[mid]) {
			// To check that the Key is existing in between index l to mid or
			// not
			if (key >= arr[l] && key <= arr[mid])
				return searchInSortedAndRotatedrray(arr, l, mid - 1, key);
			// If key doesn't exist in between l....(m-1) change the search
			// operation form l...(m-1) to (m+1)....h.
			return searchInSortedAndRotatedrray(arr, mid + 1, h, key);
		}
		if (key >= arr[mid] && key <= arr[h])
			return searchInSortedAndRotatedrray(arr, mid + 1, h, key);
		return searchInSortedAndRotatedrray(arr, l, mid - 1, key);
	}
}
