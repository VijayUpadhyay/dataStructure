package com.vijay.sorting;

public class MergeSorting {

	public static void main(String[] args) {
		int[] arr = {21,12,33,2,332,122};
		int l=0;int r= arr.length-1;
		divide(arr,l,r);
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}

	private static void divide(int[] arr,int l,int r) {
		if(l<r){
			int mid = (l+r)/2;
			divide(arr, l, mid);
			divide(arr, mid+1, r);
			
			conquer(arr,l,mid,r);
		}
		
	}

	private static void conquer(int[] arr, int l, int m, int r) {
		 int n1 = m-l+1;
		 int n2 = r-m;
		 
		 int[] L = new int[n1];
		 int[] R = new int[n2];
		 int i,j;
		 for(i=0;i<L.length;i++)
			 L[i] = arr[i+l];
		 for(j=0;j<R.length;j++)
			 R[j] = arr[j+m+1];
		 
		i=0;j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(R[j]>=L[i]){
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k]= R[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k]=R[j];
			j++;
			k++;
		}
	}

}
