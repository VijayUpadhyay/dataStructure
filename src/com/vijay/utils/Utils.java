package com.vijay.utils;

public class Utils {

    public static void main(String[] args) {
        swap(2, 3);
    }

    public static void swap(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Val1: " + x + " Val2: " + y);
    }

    public static void printArray(int[][] arr, int size) {
        for (int ele = 0; ele < size; ele++) {
            for (int col = 0; col < size; col++) {
                System.out.println("ELEMENT AT [" + ele + "][" + col + "] is: " + arr[ele][col]);
            }
        }
    }

    public static void printArrayByRow(int[][] arr, int size) {
        for (int ele = 0; ele < size; ele++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < size; col++) {
                sb.append(" ");
                sb.append(arr[ele][col]);
            }
            System.out.println("Value at row: " + (ele + 1) + " is: " + sb);
        }
    }
}
