package com.vijay.array.basics;

public class MedianOfSortedArray {

    public static void main(String[] args) {
        int[] array = {11, 22, 34, 44, 55, 66};

        findMedian(array);

    }

    // If the number of elements in array is odd: sort the array and its middle element is median
    //Since size of the set for which we are looking for median is even (2n),
    //we take average of middle two numbers in all below solutions and return floor of the average.
    public static void findMedian(int[] array) {
        int n = array.length;
        int medianPos = -1;
        int median;
        if (n % 2 == 1) {
            medianPos = (n / 2);
            median = array[medianPos];
        } else {
            median = (array[n / 2 - 1] + array[n / 2]) / 2;
        }

        System.out.println("Median of given array is " + median);

    }


}
