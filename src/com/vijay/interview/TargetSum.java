package com.vijay.interview;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int targetValue = 5;
        if (arr == null) {
            System.out.println("Array is invalid");
            return;
        }
        if (arr.length == 1 && arr[0] == targetValue) {
            System.out.println("Target sum is fount at index 0");
        } else if (arr.length == 1 && arr[0] == targetValue) {
            System.out.println("Target sum is not fount at index 0");
        }
        int[] trackArr = {0, 0, 0, 0};
        findSummations(arr, targetValue, trackArr, 0, 0);
    }

    // Iterate over array by fixing index in first for loop
    // Use 2nd for loop to iterate over each index


    static void findSummations(int[] arr, int targetValue, int[] trackArr, int index, int sum) {
        if (index >= arr.length) {
            return;
        }
        if (sum < targetValue) {
            trackArr[index] = arr[index];
            sum = sum + arr[index];
            index++;
            findSummations(arr, targetValue, trackArr, index, sum);
        } else if (sum == targetValue) {
            System.out.println(trackArr);
        } else {
            System.out.println("Target sum is not found");
        }

    }
}

// {1, 2, 3, 5}, 5
// trackArr: [1,2,3], index: 2, sum: 6