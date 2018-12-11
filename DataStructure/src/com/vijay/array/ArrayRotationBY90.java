package com.vijay.array;

public class ArrayRotationBY90 {
public static final int size=4;
	public static void main(String[] args) {
		int[][] arr = { {1, 2, 3, 4},
		        {5, 6, 7, 8},
		        {9, 10, 11, 12},
		        {13, 14, 15, 16}
		    };
		
		rotateBy90(arr);
		printArray(arr);
	}
	
	public static void rotateBy90(int[][] arr){
		transpose(arr);
		reverseColumns(arr);
	}

	public static void transpose(int[][] arr){
		for(int i=0;i<size;i++){
			for(int j=i;j<size;j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
				//swap(arr[i][j],arr[j][i]);
		}
	}
	
	public static void swap(int x,int y){
		x= x+y;
		y=x-y;
		x=x-y;
	}
	
	public static void reverseColumns(int[][] arr){
		for(int i = 0;i<size;i++){
			for(int j=0,k=size-1;j<k;j++,k--){
				int temp = arr[j][i];
				arr[j][i] = arr[k][i];
				arr[k][i] = temp;
				
				//swap(arr[j][i],arr[k][i]);
			}
		}
	}
	
	public static void printArray(int[][] arr){
		for(int ele=0;ele<size;ele++){
			for(int col=0;col<size;col++){
				System.out.println("ELEMENT AT ["+ele+"]["+col+"] is: "+arr[ele][col]);
			}
		}
	}
}
