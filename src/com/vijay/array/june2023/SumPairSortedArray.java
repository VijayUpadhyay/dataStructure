package com.vijay.array.june2023;

public class SumPairSortedArray {
    static int[] twoSum(int[] numbers, int target) {
        int[] resp = new int[2];
        // declare two pointers
        int lPos = 0, rPos = numbers.length - 1;
        while (lPos < rPos) {
            if (numbers[lPos] + numbers[rPos] == target) {
                resp[0] = lPos + 1;
                resp[1] = rPos + 1;
                return resp;
            } else if (numbers[lPos] + numbers[rPos] > target) {
                rPos--;
            } else if (numbers[lPos] + numbers[rPos] < target) {
                lPos++;
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 45, 46, 50, 58, 68};
        int n = 95;
        int[] resp = twoSum(A, n);
        System.out.println("Sum fount at index: " + resp[0] + " and " + resp[1]);
    }
}
