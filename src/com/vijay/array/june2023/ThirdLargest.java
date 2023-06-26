package com.vijay.array.june2023;

public class ThirdLargest {
    public static int getThirdLargest(int[] arr) {
        int firstNo = Integer.MIN_VALUE, secNo = Integer.MIN_VALUE, thirdNo = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > firstNo) {
                thirdNo = secNo;
                secNo = firstNo;
                firstNo = j;
            } else if (j < firstNo && j > secNo) {
                thirdNo = secNo;
                secNo = j;
            } else if (j < secNo && j > thirdNo) {
                thirdNo = j;
            }
        }
        return thirdNo;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, -200, 500, 800, 0, 500};
        int val = ThirdLargest.getThirdLargest(arr);
        System.out.println(val);
    }
}
