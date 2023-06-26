package com.vijay.array.june2023;

import java.util.HashSet;

public class SumPair {
    static void printPairs(int[] arr, int sum) {
        HashSet<Integer> s = new HashSet<>();
        for (int j : arr) {
            int temp = sum - j;
            // checking for condition
            if (s.contains(temp)) {
                System.out.println("Yes");
                System.out.println("Pair is: " + j + " and " + temp);
                // return; if want to find only one pair
            }
            s.add(j);
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 45, 6, 10, 8, 8};
        int n = 16;
        printPairs(A, n);
    }
}
