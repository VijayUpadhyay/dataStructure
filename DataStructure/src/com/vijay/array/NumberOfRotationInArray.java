package com.vijay.array;

public class NumberOfRotationInArray {

	public static void main(String[] args) {
		int[] arr = {3,4,5,6,1,2};
		//int[] arr = {3,4,5,6,7,8,9,1,2};
		int l=0, h = arr.length-1,max=arr[0];
		int maxPos=0;
		maxPos = findMaxElementPos(arr,l,h,max,maxPos);
		System.out.println("Greatest element is "+arr[maxPos]);

	}
	public static int findMaxElementPos(int[] arr,int l,int h,int max,int pos){
		
		if(h==l)
			return l;
		
		int mid = (l+h)/2;
		if((arr[l] <= arr[mid]) && mid > l){
			   if(max < arr[mid]){
				   max = arr[mid];
				   pos = mid;
				   return findMaxElementPos(arr, mid+1, h, max, pos);
			   }
		}
		if(arr[l]> max && l<mid){
			   max = arr[l];
			   pos=l;
			   return findMaxElementPos(arr, l, mid-1, max, pos);
		   }
		   if(arr[h]>max  && h > mid){
			   return findMaxElementPos(arr, l, max-1, max, pos);
		   }
		
		return pos;
	}

}
