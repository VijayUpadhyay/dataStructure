package com.vijay.array.rotation;

import java.util.Arrays;

public class LeftRightRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; // rotation number
        d = d % arr.length;
        // leftRotate(arr, d, arr.length);
        rightRotate(arr, d, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void leftRotate(int[] arr, int d, int n) {
        swapByNumber(arr, 0, d - 1);
        swapByNumber(arr, d, n - 1);
        swapByNumber(arr, 0, n - 1);
    }

    static void rightRotate(int[] arr, int d, int n) {
        swapByNumber(arr, 0, n - d - 1);
        swapByNumber(arr, n - d, n - 1);
        swapByNumber(arr, 0, n - 1);
    }

    static void swapByNumber(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }


}
