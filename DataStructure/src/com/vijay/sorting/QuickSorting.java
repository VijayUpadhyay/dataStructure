package com.vijay.sorting;

public class QuickSorting {

	public static void main(String[] args) {
		int[] arr = {11,1,2,32,12,37,90};
		int l=0,r=arr.length-1;
		quickSort(arr,l,r);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}

	private static void quickSort(int[] arr,int l , int r) {
		if(r>l){
			
			int pivotAt = partition(arr,l,r);
			quickSort(arr, l, pivotAt-1);
			quickSort(arr, pivotAt+1, r);
		}
		
	}

	private static int partition(int[] arr, int l, int r) {
		int pointer=l-1;
		int pivot = arr[r];
		for(int i=l;i<r;i++){
			if(pivot >= arr[i]){
				pointer++;
				
				int temp = arr[pointer];
				arr[pointer] = arr[i];
				arr[i]=temp;
			}
		}
		
		int temp = arr[pointer+1];
		arr[pointer+1] = arr[r];
		arr[r] = temp;
		
		return (pointer+1);
	}

}
