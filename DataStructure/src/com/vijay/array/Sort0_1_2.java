/**
 * 
 */
package com.vijay.array;

/**
 * @author Vijay Upadhyay
 *
 */
public class Sort0_1_2 {


    // Sort the input array, the array is assumed to
    // have values in {0, 1, 2}
    static void sort012(int a[], int arr_size)
    {
    	
    	/*Dividing the given array into 3 regions wrt to mid's value. If a[mid] is 0 it will swap with its same position
    	 * if a[mid]=1, then it will only increment itself, and if a[mid]=2 then it will move itself to higher position by swapping. 
    	 */
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0,temp=0;
        while (mid <= hi)
        {
            switch (a[mid])
            {
            case 0:
            {
                temp   = a[lo];
                a[lo]  = a[mid];
                a[mid] = temp;
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2:
            {
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        }
    }
 
    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
    }
 
    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1,2};
        int arr_size = arr.length;
        System.out.println("Before seggregation ");
        printArray(arr, arr_size);
        sort012(arr, arr_size);
        
        System.out.println("Array after seggregation ");
        printArray(arr, arr_size);
    }
}
