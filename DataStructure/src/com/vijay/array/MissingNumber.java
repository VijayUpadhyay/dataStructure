package com.vijay.array;

public class MissingNumber {

	public static void main(String[] args) {
		//int[] array = {9,10,11,12,14,15,16};
		int[] array = {1,2,3,4,5,6,7,9};
		
		findMissingNumber(array);
		
	}

	public static void findMissingNumber(int[] arr){
		int n = arr.length;
		
		int x1=arr[0], x2 = 0;
		
		for(int i=1;i<n;i++)
			x1 = x1^arr[i];
		
		for(int i=arr[0];i<=arr.length+arr[0];i++){
			System.out.println("The element in the array is "+i);
			x2 = x2^i;
		}
			
	
		int num = x1^x2;
		System.out.println("The missing element in the array is "+num);
	}
}
