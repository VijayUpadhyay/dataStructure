package com.vijay.sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		SelectionSorting obj = new SelectionSorting();
		int[] arr = {33,22,12,31,1,223};
		obj.selectionSort(arr);
		printArray(arr);
	}
	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}
	public void selectionSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int smallerAt = i;
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					smallerAt = j;
					int temp= arr[smallerAt];
					arr[smallerAt]=arr[i];
					arr[i] = temp;
				}
			}
		}
	}

}
