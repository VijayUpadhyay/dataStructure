package com.vijay.sorting;

public class InsertionSorting {

	public static void insertionSort(int[] arr){
		int n = arr.length;
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		System.out.println("The sorted array is:");
		for(int p=0;p<arr.length;p++)
			System.out.println(arr[p]);
	}
	public static void main(String[] args) {
		int[] array = {21,33,12,54,3,77,23,9};
		
		insertionSort(array);

	}

}
