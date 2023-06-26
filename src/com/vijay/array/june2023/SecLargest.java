package com.vijay.array.june2023;

public class SecLargest {
    public static int getSecLargest(int[] arr) {
        int firstNo = Integer.MIN_VALUE, secNo = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > firstNo) {
                secNo = firstNo;
                firstNo = j;
            } else if (j < firstNo && j > secNo) {
                secNo = j;
            }
        }
        return secNo;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, -200, 500, 800, 0, 500};
        int val = SecLargest.getSecLargest(arr);
        System.out.println(val);
    }
}
