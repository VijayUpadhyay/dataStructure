package com.vijay.array;

public class Sorting_012 {

	public static void main(String[] args) {
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1,2};
        int arr_size = arr.length;
        sort(arr,arr_size);
        

	}
	public static void sort(int[] arr,int size){
		int lo=0,mid=0,hi=arr.length-1,temp=0;
		while(mid<=hi){
			switch(arr[mid]){
			case 0: 
				temp = arr[mid];
				arr[mid] = arr[lo];
				arr[lo] = temp;
				lo++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
				break;
			}
		}
		System.out.println("Sorted Array");
        for(int i : arr){
        	System.out.println(i);
        }
	}

}
