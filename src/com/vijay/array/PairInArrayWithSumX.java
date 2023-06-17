package com.vijay.array;

public class PairInArrayWithSumX {

	public static void main(String[] args) {
		int arr[] = {23,21,20,44,45,47};
		int sum =43,l=0;
		int[] sortedArray = SumClosestToZero.sort(arr, l, arr.length-1);
		 
		System.out.println("The sorted array is:");
		for(int p=0;p<sortedArray.length;p++)
			System.out.println(sortedArray[p]);
	
		pairInArrayWithSumX(sortedArray,sum);
	}
	
	public static void pairInArrayWithSumX(int[] arr,int sum){
		int min_l = 0, min_r=arr.length-1;
		int l=0,r=arr.length-1;
		
		
		while(l<r){
			int sum1 = arr[l] + arr[r];
			if(sum1<sum){
				l++;
			}
			else if (sum1 == sum){
				
				min_l=l;
				min_r=r;
				break;
				}
			else
				r--;
		}
		
		System.out.println("The 2 elements whose sum is "+sum+" are : "+arr[min_l]+" and "+arr[min_r]);
	}
}