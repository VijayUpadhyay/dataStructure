package com.vijay.search;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {2, 3, 4, 6, 90, 99};
        int find = 19;
        int l = 0;
        int r = array.length - 1;
        int pos = bs.binarySearch(array, l, r, find);
        if (pos == -1) {
            System.out.println("Element not found");
            return;
        }

        System.out.println("The position of element is:: " + (pos + 1));
    }

    public int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

}
