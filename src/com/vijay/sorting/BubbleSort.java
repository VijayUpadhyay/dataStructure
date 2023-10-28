package com.vijay.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort objBubbleSort = new BubbleSort();
        int[] array = {22, 2, 4, 1, 90, 32, 45, 10};
        System.out.println("The given array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int[] sorted = objBubbleSort.bubbleSort(array);
        System.out.println("The sorted array is:");
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
        // Arrays.asList(sorted).stream().forEach(System.out::println); //
        // [I@30f39991
        // works
        /*
         * Arrays.asList(sorted).stream().flatMapToInt(Arrays::stream)
         * .forEach(System.out::println);
         * Arrays.stream(sorted).forEach(System.out::println);
         */
    }

    public int[] bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length - j - 1; k++) {
                if (arr[(k + 1)] < arr[k]) {
                    int smaller = arr[(k + 1)];
                    arr[(k + 1)] = arr[k];
                    arr[k] = smaller;
                }
                System.out.println("The given array is after each swap:");
                for (int value : arr) {
                    System.out.println(value);
                }
            }
        }

        return arr;
    }
}
