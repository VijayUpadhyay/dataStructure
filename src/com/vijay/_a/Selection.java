package com.vijay._a;

import java.util.stream.IntStream;

public class Selection {
    static void selectionSOrt(int[] arr) {
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 243, 1, 3, -1};
        selectionSOrt(arr);
        IntStream.of(arr).forEach(System.out::println);
    }
}
