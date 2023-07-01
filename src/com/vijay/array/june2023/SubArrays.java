package com.vijay.array.june2023;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        printSubArrays(arr, 0, 0);
    }

    private static void printSubArrays(int[] arr, int start, int end) {
        if (arr == null || end == arr.length)
            return;
        if (start > end) {
            System.out.println("Inside unexpected for start: " + start + " and end: " + end);
            printSubArrays(arr, 0, end + 1);
        } else {
            System.out.print("[");
            for (int i = start; i < end; i++)
                System.out.print(arr[i] + ", ");
            System.out.println(arr[end] + "]");
            printSubArrays(arr, start + 1, end);
        }
    }
}
