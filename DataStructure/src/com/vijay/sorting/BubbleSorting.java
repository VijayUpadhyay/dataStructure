package com.vijay.sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		BubbleSorting OBJ = new BubbleSorting();
		int[] arr = {22,3,24,56,12,45};
		OBJ.bubbleSort(arr);
		printArray(arr);
	}
	public void bubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
