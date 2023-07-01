/**
 *
 */
package com.vijay.array.basics;

import java.util.Arrays;

/**
 * @author Vijay Upadhyay
 */
public class BasicOperationsOnSortedArray {//As it is sorted array, we can use Binary Search for search operation.

    public static int searchArray(int[] arr, int n, int key) {
        int l = 0, r = n - 1, pos = -1;
        int mid = (l + r) / 2;
        for (int i = 0; i <= mid; i++) {
            if (key == arr[i])
                pos = i;

            if (key >= arr[i])
                i = (i + mid) / 2;
            else
                mid = i / 2;
        }
        if (pos == -1) {
            System.out.println("Element is not found");
            return -1;
        } else
            return pos;

    }

    public static void insertElement(int[] arr, int n, int key, int capacity) {
        int i = 0;

        if (arr.length <= capacity)
            System.out.println("Unable to insert the element: " + key);

        while (arr[i] < key)
            i++;                   //To get the position from where elements needs to be added.


        System.out.println("I is" + i);
        int temp = arr[i];
        arr[i] = key;
        for (int j = i + 1; j < arr.length; j++) {
            int temp1 = arr[j];
            arr[j] = temp;
            temp = temp1;

        }
        System.out.println("The array after inserting " + key + " is:");
        for (int m = 0; m < arr.length; m++)
            System.out.println(arr[m]);
    }

    public static void deleteElement(int[] arr, int key) {
        int pos = searchArray(arr, arr.length, key);

        System.out.println("To delete " + key + ", its available position is: " + pos);

        while (pos < arr.length - 1) {
            arr[pos] = arr[++pos];

        }

        arr[arr.length - 1] = 0;

        System.out.println("Array after deleting " + key + " is");
        for (int m = 0; m < arr.length; m++)
            System.out.println(arr[m]);

    }

    public static void main(String[] args) {
        int[] array = {22, 34, 43, 56, 78, 90};
        int n = array.length;
        int key = 43;
        int pos = searchArray(array, n, key);
        if (pos >= 0)
            System.out.println("Element is found at " + pos);

        //for insertion
        int insertKey = 53;
        int[] insertInArray = new int[10];
        insertInArray[0] = 10;
        insertInArray[1] = 22;
        insertInArray[2] = 25;
        insertInArray[3] = 39;
        insertInArray[4] = 56;
        insertInArray[5] = 89;
        int n1 = insertInArray.length;
        int capacity = 6;
        insertElement(insertInArray, n1, insertKey, capacity);

        //to delete an element
        int deleteElement = 43;
        deleteElement(array, deleteElement);
    }

    public static class OddNumberOfOccurence {
        public static void main(String[] args) {
            int[] array = {2, 6, 3, 1, 6, 5, 3, 1, 2};

            int num = oddNumberOfOccurence(array);

            System.out.println("The odd number times occured element is " + num);
        }

        public static int oddNumberOfOccurence(int[] arr) {
            int number = 0;
            for (int i = 0; i < arr.length; i++) {
                number ^= arr[i];
            }
            return number;
        }
    }

    //(j == N.length) ||
    public static class Merge2SortedArrays {
        public static void main(String[] args) {
            int[] MplusN = {1, -1, -1, 5, 7, 12, -1, 15, -1, 22};
            int[] N = {2, 4, 14, 17};
            moveToEnd(MplusN, N);
        }

        public static void mergeTwoArrays(int[] MplusN, int[] N) {
            int j = 0, i = N.length, k = 0;
            while (k < MplusN.length) {
                // (j == N.length) || --> Used to specify if there is no element
                // remaining in 2nd array,
                // we can continue with the first element
                if ((j == N.length) || (i < MplusN.length && MplusN[i] <= N[j])) {
                    MplusN[k] = MplusN[i];
                    k++;
                    i++;
                } else {
                    MplusN[k] = N[j];
                    j++;
                    k++;
                }
            }
            System.out.println("Merged Array is:");
            for (int n = 0; n < MplusN.length; n++)
                System.out.println(MplusN[n]);
        }

        public static void moveToEnd(int[] MplusN, int[] N) {
            int i = MplusN.length - 1;
            for (int p = MplusN.length - 1; p >= 0; p--) {
                if (MplusN[p] != -1) {
                    MplusN[i] = MplusN[p];
                    i--;
                }
            }
            // 1-1-15157121522 ----> this array will come as first 4 indexes are not
            // considered because that is the required for array N and its elements
            mergeTwoArrays(MplusN, N);
        }
    }

    public static class MoveZerosAtEnd {

        public static void main(String[] args) {
            int[] arr = {3, 4, 2, 1, 0, 0, 0, 0, 0, 4, 6, 10, 0, 0, 0, 0, 9, 0};
            moveZeroesToEnd(arr);
            System.out.println("Array after moving zero at end:");
            Arrays.stream(arr).forEach(System.out::println);
        }

        private static void moveZeroesToEnd(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    // continue;
                } else {
                    arr[count] = arr[i];
                    count++;
                }
            }
            // fill with zero
            for (int i = count; i < arr.length; i++) {
                arr[i] = 0;
            }
        }
    }

    public static class MissingNumber {

        public static void main(String[] args) {
            // int[] array = {9,10,11,12,14,15,16};
            int[] array = {1, 2, 3, 4, 5, 6, 7, 9};
            findMissingNumber(array);
        }

        public static void findMissingNumber(int[] arr) {
            int n = arr.length;

            int x1 = arr[0], x2 = 0;

            for (int i = 1; i < n; i++)
                x1 = x1 ^ arr[i];

            for (int i = arr[0]; i <= arr.length + arr[0]; i++) {
                System.out.println("The element in the array is " + i);
                x2 = x2 ^ i;
            }

            int num = x1 ^ x2;
            System.out.println("The missing element in the array is " + num);
        }
    }

    public static class OccurencesOfNumber {

        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 3, 3, 3};
            int number = 3;
            int count = count(arr, number);
            System.out.println(number + " is available at: " + count + " places");
        }

        public static int firstOccurence(int[] arr, int n, int lo, int hi) {
            if (hi >= lo) {
                int mid = (lo + hi) / 2;
                if ((mid == 0 || n > arr[mid - 1]) && arr[mid] == n)
                    return mid;
                else if (n > arr[mid])
                    return firstOccurence(arr, n, mid + 1, hi);
                else
                    return firstOccurence(arr, n, lo, mid - 1);
            }
            return -1;
        }

        public static int lastOccurence(int[] arr, int n, int lo, int hi) {
            int mid = (lo + hi) / 2;
            if (hi >= lo) {
                if ((mid == arr.length - 1 || n < arr[mid + 1]) && arr[mid] == n)
                    return mid;
                else if (n < arr[mid])
                    return lastOccurence(arr, n, lo, mid - 1);
                else
                    return lastOccurence(arr, n, mid + 1, hi);
            }
            return -1;
        }

        public static int count(int[] arr, int n) {
            int size = arr.length;
            int lo = 0, hi = size - 1;

            int first = firstOccurence(arr, n, lo, hi);
            int last = lastOccurence(arr, n, lo, hi);

            int count = last - first + 1;

            return count;
        }

    }

    public static class NumberOfRotationInArray {

        public static void main(String[] args) {
            int[] arr = {3, 4, 5, 6, 1, 2};
            // int[] arr = {3,4,5,6,7,8,9,1,2};
            int l = 0, h = arr.length - 1, max = arr[0];
            int maxPos = 0;
            maxPos = findMaxElementPos(arr, l, h, max, maxPos);
            System.out.println("Greatest element is " + arr[maxPos]);
        }

        public static int findMaxElementPos(int[] arr, int l, int h, int max, int pos) {

            if (h == l)
                return l;

            int mid = (l + h) / 2;
            if ((arr[l] <= arr[mid]) && mid > l) {
                if (max < arr[mid]) {
                    max = arr[mid];
                    pos = mid;
                    return findMaxElementPos(arr, mid + 1, h, max, pos);
                }
            }
            if (arr[l] > max && l < mid) {
                max = arr[l];
                pos = l;
                return findMaxElementPos(arr, l, mid - 1, max, pos);
            }
            if (arr[h] > max && h > mid) {
                return findMaxElementPos(arr, l, max - 1, max, pos);
            }

            return pos;
        }

    }

    static class MergeSortedArray {
        public static void main(String[] args) {
            int[] arr1 = {1, 5, 9, 10, 15, 20, 1000};
            int[] arr2 = {2, 3, 8, 13};
            int m = arr1.length;
            int n = arr2.length;
            mergeArray(arr1, arr2);
            System.out.print("\nAfter Merging \nFirst Array: ");
            for (int i = 0; i < m; i++)
                System.out.print(arr1[i] + " ");
            System.out.print("\nSecond Array: ");
            for (int i = 0; i < n; i++)
                System.out.print(arr2[i] + " ");
        }

        public static void mergeArray(int[] arr1, int[] arr2) {
            // length of first arr1
            int n = arr1.length;
            // length of second arr2
            int m = arr2.length;
            // Now traverse the array1 and if arr2 first element
            // is less than arr1 then swap
            for (int i = 0; i < n; i++) {
                if (arr1[i] > arr2[0]) {
                    // swap
                    int temp = arr1[i];
                    arr1[i] = arr2[0];
                    arr2[0] = temp;
                    // after swapping we have to sort the array2 again so that it
                    // can be again swap with arr1
                    // we will store the firstElement of array2 and left shift all
                    // the element and store
                    // the firstElement in arr2[k-1]
                    int firstElement = arr2[0];
                    int k;
                    for (k = 1; k < m && arr2[k] < firstElement; k++) {
                        arr2[k - 1] = arr2[k];
                    }
                    arr2[k - 1] = firstElement;
                }
            }
            for (int i : arr1) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i : arr2) {
                System.out.print(i + " ");
            }
        }
    }

    public static class MedianOfTwoSortedArray {

        public static void main(String[] args) {

            //We can give odd or even number of elements in each array, finally the number of elements will be even as (n+n=2n).
            int[] firstArray = {11, 22, 67, 88, 90};
            int[] secondArray = {12, 23, 34, 56, 98};
            /*int[] firstArray = {11,22,67};
            int[] secondArray = {12,23,34};*/

            if (firstArray.length == secondArray.length)
                medianOfTwoArrays(firstArray, secondArray);
        }

        public static void medianOfTwoArrays(int[] firstArray, int[] secondArray) {

            int i = 0, j = 0;
            int m1 = -1, m2 = -1, count = 0;
            for (count = 0; count <= firstArray.length; count++) {

                if (firstArray[i] >= secondArray[j]) {
                    m2 = m1;
                    m1 = secondArray[j];
                    j++;
                } else {
                    m2 = m1;
                    m1 = firstArray[i];
                    i++;
                }
            }

            System.out.println("Median of the merged array is: " + (m1 + m2) / 2);
        }
    }
}
