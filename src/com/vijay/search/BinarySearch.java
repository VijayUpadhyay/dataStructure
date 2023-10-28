package com.vijay.search;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {2, 3, 4, 6, 90, 99};
        int find = 99;
        int l = 0;
        int r = array.length;
        int pos = bs.binarySearch(array, l, r, find);

        System.out.println("The position of element is:: " + (pos + 1));
    }

    public int binarySearch(int[] arr, int l, int r, int x) {
        int mid = (l + r) / 2;
        if (arr[mid] == x) {
            return mid;
        }
        if (arr[mid] > x) {
            return binarySearch(arr, l, mid, x);
        }
        return binarySearch(arr, mid, r, x);
    }
}
