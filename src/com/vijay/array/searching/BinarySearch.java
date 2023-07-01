package com.vijay.array.searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key, int l, int r) {
        if (arr == null || arr.length == 0) return -1;
        int mid = (l + r) / 2;
        if (l < r) {// l <= r this check is imp else we will get StackOverFlowError
            if (arr[mid] == key) return mid + 1;
            if (key > arr[mid] && mid < r)
                return binarySearch(arr, key, mid + 1, r);
            return binarySearch(arr, key, l, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 14, 33, 55, 67, 89, 100};
        System.out.println(binarySearch(arr, 100, 0, arr.length));
    }
}
