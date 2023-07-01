package com.vijay.array.basics;

import java.util.Arrays;

public class MaxSumWithIndexByArrEle {
    static int[] arr = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        System.out.println("Max sum is " + maxSum());
    }

    // Returns max possible value of i*arr[i]
    static int maxSum() {
        // Find array sum and i*arr[i] with no rotation
        int arrSum = 0; // Stores sum of arr[i]
        int currVal = 0; // Stores sum of i*arr[i]
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
            currVal = currVal + (i * arr[i]);
        }
        // Initialize result as 0 rotation sum
        int maxVal = currVal;
        // Try all rotations one by one and find the maximum rotation sum.
        for (int j = 1; j < arr.length; j++) {
            currVal = currVal + arrSum - arr.length * arr[arr.length - j];
            if (currVal > maxVal)
                maxVal = currVal;
        }
        return maxVal;
    }

    public static class SumClosestToZero {

        public static void main(String[] args) {

            int[] array = {9, 12, -4, -11, 22};
            int n = array.length;

            sumClosestToZero(array, n);
        }

        static void sumClosestToZero(int[] array, int n) {
            int l = 0, r = n - 1;

            sort(array, l, r);

            int min_sum = 9999;
            int min_l = l, min_r = r;

            while (l < r) {
                int sum = array[l] + array[r];

                if (Math.abs(sum) < Math.abs(min_sum)) {
                    min_sum = sum;
                    min_l = l;
                    min_r = r;
                }

                if (sum < 0)
                    l++;
                else
                    r--;
            }
            System.out.println("The 2 elements whose sum is minimum are : " + array[min_l] + " and " + array[min_r]);

        }

        public static int[] sort(int[] arr, int l, int r) {

            if (r < l)
                System.out.println("Please provide valid input");
            else {
                int pivot = partition(arr, l, r);

                sort(arr, l, pivot - 1);
                sort(arr, pivot + 1, r);
            }

            return arr;
        }

        public static int partition(int[] arr, int l, int h) {
            int pointer = l - 1; // This is to check that how many times pivot element is larger than the elements of given array.
            // This number defines the position of pivot element in array.

            int pivot = arr[h];
            for (int i = l; i < h; i++) {
                if (pivot >= arr[i]) {
                    pointer++;

                    //swap the numbers
                    int temp = arr[pointer];
                    arr[pointer] = arr[i];
                    arr[i] = temp;
                }
                System.out.println("Inside SumClosest to zero sorted array");
                for (int m = 0; m < arr.length; m++)
                    System.out.println(arr[m]);

            }

            // After complete swapping in partition method, the array will be like
            System.out.println(" After complete swapping in partition method, the array will be like(SumClosestToZero)");
            for (int m = 0; m < arr.length; m++)
                System.out.println(arr[m]);

            int temp = arr[h];
            arr[h] = arr[pointer + 1];
            arr[pointer + 1] = temp;

            return pointer + 1;
        }
    }

    public static class SubarrayWithSum {
        public static void main(String[] args) {
            SubarrayWithSum arraysum = new SubarrayWithSum();
            int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
            int l = 0;
            // int n = arr.length;
            int sum = 33;
            int curr_sum = 0;
            while (curr_sum < sum) {
                curr_sum += arr[l];
                l++;
            }
            int res = arraysum.subArraySum(arr, sum, curr_sum, l, 0);
            System.out.println("Received result: " + res);
        }

        int subArraySum(int[] arr, int sum, int curr_sum, int l, int start_pos) {
            if (curr_sum == sum) {
                System.out.println("Found sum at: " + start_pos + " till pos: " + (l - 1));
                return l;
            }
            if (l > arr.length - 1)
                return l;
            curr_sum = curr_sum - arr[start_pos];
            start_pos++;
            while (curr_sum < sum) {
                curr_sum += arr[l];
                l++;
            }
            return subArraySum(arr, sum, curr_sum, l, start_pos);
        }
    }

    /**
     * @author Vijay Upadhyay
     */
    public static class Sort0_1_2 {
        public static void main(String[] args) {
            int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1, 2};
            int arr_size = arr.length;
            System.out.println("Before seggregation ");
            printArray(arr, arr_size);
            sort012(arr, arr_size);
            System.out.println("Array after seggregation ");
            printArray(arr, arr_size);
        }

        static void printArray(int[] arr, int arr_size) {
            int i;
            for (i = 0; i < arr_size; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Sort the input array, the array is assumed to
        // have values in {0, 1, 2}
        static void sort012(int[] a, int arr_size) {
            /*
             * Dividing the given array into 3 regions wrt to mid's value. If a[mid]
             * is 0 it will swap with its same position if a[mid]=1, then it will
             * only increment itself, and if a[mid]=2 then it will move itself to
             * higher position by swapping.
             */
            int lo = 0;
            int hi = arr_size - 1;
            int mid = 0, temp = 0;
            while (mid <= hi) {
                switch (a[mid]) {
                    case 0: {
                        temp = a[lo];
                        a[lo] = a[mid];
                        a[mid] = temp;
                        lo++;
                        mid++;
                        break;
                    }
                    case 1:
                        mid++;
                        break;
                    case 2: {
                        temp = a[mid];
                        a[mid] = a[hi];
                        a[hi] = temp;
                        hi--;
                        break;
                    }
                }
            }
        }
    }

    public static class SubarraySum {
        public static void main(String[] args) {
            SubarraySum arraysum = new SubarraySum();
            int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
            int n = arr.length;
            int sum = 33;
            arraysum.subArraySum(arr, n, sum);
        }

        /*
         * Returns true if the there is a subarray of arr[] with sum equal to 'sum'
         * otherwise returns false. Also, prints the result
         */
        int subArraySum(int[] arr, int n, int sum) {
            int currentSum = arr[0], start = 0, i;
            // Pick a starting point
            for (i = 1; i <= n; i++) {
                // If currentSum exceeds the sum, then remove the starting
                // elements
                while (currentSum > sum && start < i - 1) {
                    currentSum = currentSum - arr[start];
                    start++;
                }

                // If currentSum becomes equal to sum,
                // then return true
                if (currentSum == sum) {
                    int p = i - 1;
                    System.out.println("Sum found between indexes " + start + " and " + p);
                    return 1;
                }

                // Add this element to curr_sum
                if (i < n)
                    currentSum = currentSum + arr[i];
            }

            System.out.println("No subarray found");
            return 0;
        }
    }

    public static class ReverseArray {

        public static void main(String[] args) {
            int[] array = {22, 12, 34, 65, 76, 88, 90};
            String str = "prague";
            reverseIntegerArray(array);
            for (int x : array)
                System.out.println(x);
            reverseStringArray(str);
        }


        public static void reverseIntegerArray(int[] array) {
            int n = array.length;
            int i = 0, j = n - 1;

            for (int p = 0; p < n / 2; p++) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            System.out.println("The reversed integer is");
            for (int k = 0; k < n; k++)
                System.out.println(array[k]);
        }

        public static void reverseStringArray(String str) {
            char[] string = str.toCharArray();
            int n = string.length;
            int i = 0, j = n - 1;
            for (int p = 0; p < n / 2; p++) {
                char temp = string[i];
                string[i] = string[j];
                string[j] = temp;
                i++;
                j--;
            }
            System.out.println("The reversed string is");
            for (int k = 0; k < n; k++)
                System.out.println(string[k]);

        }

    }

    public static class SearchInSortedAndRotatedArray {
        public static void main(String[] args) {
            int[] array = {6, 7, 2, 3, 4, 5};
            int key = 4, h = array.length - 1, l = 0;
            int keyPos = searchInSortedAndRotatedrray(array, l, h, key);
            System.out.println("Key is found at position " + (keyPos + 1));
            if (keyPos == -1)
                System.out.println(key + " is not found");
        }

        public static int searchInSortedAndRotatedrray(int[] arr, int l, int h,
                                                       int key) {
            int mid = (h + l) / 2;
            if (l > h)
                return -1;
            if (arr[mid] == key)
                return mid;
            // To check the array is sorted or not
            if (arr[l] <= arr[mid]) {
                // To check that the Key is existing in between index l to mid or
                // not
                if (key >= arr[l] && key <= arr[mid])
                    return searchInSortedAndRotatedrray(arr, l, mid - 1, key);
                // If key doesn't exist in between l....(m-1) change the search
                // operation form l...(m-1) to (m+1)....h.
                return searchInSortedAndRotatedrray(arr, mid + 1, h, key);
            }
            if (key >= arr[mid] && key <= arr[h])
                return searchInSortedAndRotatedrray(arr, mid + 1, h, key);
            return searchInSortedAndRotatedrray(arr, l, mid - 1, key);
        }
    }

    public static class ReverseNumber {

        public static void main(String[] args) {
            int read = 504000055;
            while (read % 10 == 0) {
                read = read / 10;
            }
            reverseNumber(read);
        }

        public static void reverseNumber(int num) {
            int revNo = num, reverseNumber = 0;
            while (num > 0) {
                reverseNumber = (reverseNumber * 10) + (num % 10);
                num = num / 10;
            }
            System.out.println("Reverse of " + revNo + " is " + reverseNumber);
        }
    }

    public static class SegregateOddEven {
        public static int count = 0;

        public static void main(String[] args) {
            // int[] arr = {3, 5, 7, 1, 2, 3, 4, 2, 46, 0, 8, 9};
            int[] arr = {3, 5, 7, 1, 3, 5, 7, 9};
            segregateEvenOddNo(arr);
            Arrays.stream(arr).forEach(System.out::println);
            System.out.println("Count is: " + count);
        }

        static void segregateEvenOddNo(int[] arr) {
            int n = arr.length;
            int i = -1, j = 0;
            while (j != n) {
                if (arr[j] % 2 == 0) {
                    i++;
                    // Swapping even and odd numbers
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
                count++;
            }
        }
    }

    public static class SqRootDecompositionAlgo {
        static int MAXN = 10000;
        static int SQRSIZE = 100;
        static int[] arr = new int[MAXN]; // original array
        static int[] block = new int[SQRSIZE]; // decomposed array
        static int blk_sz; // block size

        public static void main(String[] args) {
            int[] input = {1, 5, 2, 4, 6, 1, 3, 5, 7, 10};
            int n = input.length;
            preprocess(input, n);
            System.out.println("query(3, 8) : " + query(3, 8));
            System.out.println("query(1, 6) : " + query(1, 6));
            update(8, 0);
            System.out.println("query(8, 8) : " + query(8, 8));
        }

        // Fills values in input[]
        static void preprocess(int[] input, int n) {
            // initiating block pointer
            int blk_idx = -1;
            // calculating size of block
            blk_sz = (int) Math.sqrt(n);
            // building the decomposed array
            for (int i = 0; i < n; i++) {
                arr[i] = input[i];
                if (i % blk_sz == 0) {
                    // entering next block
                    // incrementing block pointer
                    blk_idx++;
                }
                // else keep adding the value at that index.
                block[blk_idx] += arr[i];
            }
        }

        // Time Complexity : O(sqrt(n))
        static int query(int l, int r) {
            int sum = 0;
            while (l < r && l % blk_sz != 0 && l != 0) {
                // traversing first block in range
                sum += arr[l];
                l++;
            }
            while (l + blk_sz - 1 <= r) {
                // traversing completely overlapped blocks in range
                sum += block[l / blk_sz];
                l += blk_sz;
            }
            while (l <= r) {
                // traversing last block in range
                sum += arr[l];
                l++;
            }
            return sum;
        }

        // Time Complexity : O(1)
        static void update(int idx, int val) {
            int blockNumber = idx / blk_sz;
            block[blockNumber] += val - arr[idx];
            arr[idx] = val;
        }
    }

    public static class PairInArrayWithSumX {

        public static void main(String[] args) {
            int[] arr = {23, 21, 20, 44, 45, 47};
            int sum = 43, l = 0;
            int[] sortedArray = SumClosestToZero.sort(arr, l, arr.length - 1);

            System.out.println("The sorted array is:");
            for (int p = 0; p < sortedArray.length; p++)
                System.out.println(sortedArray[p]);

            pairInArrayWithSumX(sortedArray, sum);
        }

        public static void pairInArrayWithSumX(int[] arr, int sum) {
            int min_l = 0, min_r = arr.length - 1;
            int l = 0, r = arr.length - 1;


            while (l < r) {
                int sum1 = arr[l] + arr[r];
                if (sum1 < sum) {
                    l++;
                } else if (sum1 == sum) {

                    min_l = l;
                    min_r = r;
                    break;
                } else
                    r--;
            }

            System.out.println("The 2 elements whose sum is " + sum + " are : " + arr[min_l] + " and " + arr[min_r]);
        }
    }

    public static class SecondHighestNo {

        public static void main(String[] args) {
            int[] arr = {100, 2, 22, 333, 44, 556, 678, 899, 899, 999};
            printFirstTwoLargestNo(arr);
        }

        private static void printFirstTwoLargestNo(int[] arr) {
            int firstNo = Integer.MIN_VALUE, secondNo = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > firstNo) {
                    secondNo = firstNo;
                    firstNo = arr[i];
                } else if (arr[i] != firstNo && arr[i] > secondNo)
                    secondNo = arr[i];
            }
            System.out.println("Largest No: " + firstNo);
            System.out.println("Second Largest No: " + secondNo);
        }

    }
}
