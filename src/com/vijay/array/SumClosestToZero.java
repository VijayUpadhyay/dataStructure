package com.vijay.array;

public class SumClosestToZero {

	public static void main(String[] args) {
		
		int[] array = {9,12,-4,-11,22};
		int n = array.length;
		
		sumClosestToZero(array,n);
	}
	static void sumClosestToZero(int[] array,int n){
		int l=0, r = n-1;
		
		sort(array,l,r);
		
		int min_sum=9999;
		int min_l=l,min_r = r;
		
		while(l<r){
			int sum = array[l]+array[r];
			
			if(Math.abs(sum)<Math.abs(min_sum)){
				min_sum = sum;
				min_l = l;
				min_r = r;
			}
			
			if(sum<0)
				l++;
			else
				r--;
		}
		System.out.println("The 2 elements whose sum is minimum are : "+array[min_l]+" and "+array[min_r]);

	}
	
	public static int[] sort(int[] arr,int l,int r){
		
		if(r<l)
			System.out.println("Please provide valid input");
		else{
		int pivot = partition(arr,l,r);
		
		sort(arr,l,pivot-1);
		sort(arr,pivot+1,r);
		}
		
		return arr;
	}

	public static int partition(int[] arr,int l, int h){
		int pointer=l-1; // This is to check that how many times pivot element is larger than the elements of given array.
		// This number defines the position of pivot element in array.
		
		int pivot = arr[h];
		for(int i=l;i<h;i++){
			if(pivot>= arr[i]){
				pointer++;
				
				//swap the numbers
				int temp = arr[pointer];
				arr[pointer]=arr[i];
				arr[i]=temp;
			}
			System.out.println("Inside SumClosest to zero sorted array");
			for(int m=0;m<arr.length;m++)
				System.out.println(arr[m]);
			
		}
		
		// After complete swapping in partition method, the array will be like
		System.out.println(" After complete swapping in partition method, the array will be like(SumClosestToZero)");
		for(int m=0;m<arr.length;m++)
			System.out.println(arr[m]);
		
		int temp =arr[h];
 		arr[h] = arr[pointer+1];
		arr[pointer+1]=temp;
		
		return pointer+1;
	}
}
