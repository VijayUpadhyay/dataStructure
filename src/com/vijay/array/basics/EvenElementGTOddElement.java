package com.vijay.array.basics;

import java.util.Arrays;
import java.util.stream.Stream;

public class EvenElementGTOddElement {

    private static void arrangeArrayHavingEvenPosGTOddPos(int[] arr) {
        int evenPos = 0, oddPos = 1;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[evenPos] < arr[oddPos]) {
                int temp = arr[evenPos];
                arr[evenPos] = arr[oddPos];
                arr[oddPos] = temp;
            }
            evenPos += 2;
            oddPos += 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 22, 6, 7, 8, 10};
        arrangeArrayHavingEvenPosGTOddPos(arr);
        Stream.of(arr).flatMapToInt(Arrays::stream)
                .forEach(System.out::println);
    }
}
