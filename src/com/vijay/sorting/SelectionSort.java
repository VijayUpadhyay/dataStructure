package com.vijay.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSortObj = new SelectionSort();
        int[] array = {1, 2, 3, 4, 243, 1, 3, -1};//{5, 1, 12, -5, 16, 2, 14, 14};
        selectionSortObj.selectionSort(array);
        System.out.println("The sorted array is:");
        Arrays.stream(array).forEach(System.out::println);
    }

    public void selectionSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int smallerNumberAt = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[j]) {
                    smallerNumberAt = i;
                    int smallest = arr[smallerNumberAt];
                    arr[smallerNumberAt] = arr[j];
                    arr[j] = smallest;
                }
            }
        }
    }
}
