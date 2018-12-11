package com.vijay.array;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		
	//We can give odd or even number of elements in each array, finally the number of elements will be even as (n+n=2n).
		int[] firstArray = {11,22,67,88,90};
		int[] secondArray = {12,23,34,56,98};
		/*int[] firstArray = {11,22,67};
		int[] secondArray = {12,23,34};*/

		if(firstArray.length == secondArray.length)
			medianOfTwoArrays(firstArray,secondArray);
	}

	public static void medianOfTwoArrays(int[] firstArray, int[] secondArray){
		
		int i=0,j=0;
		int m1 = -1,m2 = -1,count=0;
		for(count=0;count<=firstArray.length;count++){
			
			if(firstArray[i] >=  secondArray[j]){
				m2 = m1;
				m1 = secondArray[j];
				j++;
			}
			else{
				m2 = m1;
				m1 = firstArray[i];
				i++;
			}
		}
		
		System.out.println("Median of the merged array is: "+(m1+m2)/2);
	}
}
