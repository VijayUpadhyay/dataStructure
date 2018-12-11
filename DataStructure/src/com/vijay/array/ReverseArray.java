package com.vijay.array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = {22,12,34,65,76,88,90};
		String str = "prague";
		reverseIntegerArray(array);
		for(int x:array)
			System.out.println(x);
		reverseStringArray(str);
	}
	
	
	public static void reverseIntegerArray(int[] array){
		int n = array.length;
		int i=0,j=n-1;
		
		for(int p =0; p< n/2;p++){
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	
		System.out.println("The reversed integer is");
		for(int k=0;k<n;k++)
			System.out.println(array[k]);
	}
	
	public static void reverseStringArray(String str){
		char[] string = str.toCharArray();
		int n = string.length;
		int i=0,j=n-1;
		for(int p =0; p< n/2;p++){
			char temp = string[i];
			string[i] = string[j];
			string[j] = temp;
			i++;
			j--;
		}
		System.out.println("The reversed string is");
		for(int k=0;k<n;k++)
			System.out.println(string[k]);
		
	}

}
