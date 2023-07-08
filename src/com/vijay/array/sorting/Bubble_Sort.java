package com.vijay.array.sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 22, 6, 7, 8, 10, -1, 1};
        bubble_sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void bubble_sort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        //for loop for picking the element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
