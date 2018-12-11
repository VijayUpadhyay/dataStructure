package com.vijay.array;

public class ArrayRotationJugglingAlgo {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		//int[] arr = { 1, 2, 3, 4, 5, 6, 7};
		int rotateBy = 2;
		rotateArray(arr, rotateBy);
		System.out.println("Rotated Array");
		for(int i : arr)
			System.out.println(i); 
	}
	public static void rotateArray(int[] arr, int d) {
		int n = arr.length;
		int gcd = gcd(d, n);
		for (int i = 0; i < gcd; i++) {
			int j=i;
			int temp = arr[i];
			
			// 
			//If gcd is 1 --> it will execute for all of the elements of array as the for loop will execute for i=0 only
			//else it will satisfy for the break condition for each ith value.
			while(true){
				int k= d+j;
				if(k >= n)
					k= k-n;
				if(k==i)
					break;
				arr[j] = arr[k];
				j=k;
				
				System.out.println("Rotated Array for j: "+j);
				for(int p : arr){
					System.out.print("  ");
					System.out.print(p);
				}
				System.out.println();
				
				
			} 
			
			System.out.println("Out of while for: "+i);
			System.out.println("Rotated Array for i: "+i);
			for(int p : arr){
				System.out.print("  ");
				System.out.print(p);
				}
			System.out.println();
			arr[j] = temp;
		}
	}
	public static int gcd(int d, int n) {
		if (n == 0)
			return d;
		else
			return gcd(n, d % n);
	}
}
