package com.vijay.array.basics;

import java.util.Arrays;

//Rearrange an array in maximum minimum form using Two Pointer Technique
public class ArraySortedArrayAsMaxMin {

    public static void main(String[] args) {
        int[] arr = {12, 14, 33, 55, 67, 89, 100};
        rearrangeArrayAsMaxMin(arr);
    }

    private static void rearrangeArrayAsMaxMin(int[] arr) {
        int large = arr.length - 1;
        int small = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[large];
            if (i + 1 >= arr.length) {
                break;
            }
            temp[i + 1] = arr[small];
            i++;
            large--;
            small++;
        }
        Arrays.stream(temp).forEach(System.out::println);
    }
}
