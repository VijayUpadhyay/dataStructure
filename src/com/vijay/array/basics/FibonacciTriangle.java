package com.vijay.array.basics;

public class FibonacciTriangle {

    public static void main(String[] args) {
        printFibTriangle(6);
    }

    static int[] fibonacciVals(int size) {
        int[] fibVals = new int[size + 1];
        fibVals[1] = 1;
        fibVals[2] = 1;
        for (int i = 3; i <= size; i++) {
            fibVals[i] = fibVals[i - 1] + fibVals[i - 2];
        }
        return fibVals;
    }

    static void printFibTriangle(int n) {
        int noOfElements = n * (n + 1) / 2;
        int[] fibVals = fibonacciVals(noOfElements);
        int fibIndex = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(fibVals[fibIndex++] + " ");
            }
            System.out.println();
        }
    }
}
