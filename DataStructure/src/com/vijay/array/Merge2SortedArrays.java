package com.vijay.array;

//(j == N.length) || 
public class Merge2SortedArrays {

	public static void main(String[] args) {

		int[] MplusN = { 1, -1, -1, 5, 7, 12, -1, 15, -1, 22 };
		int[] N = { 2, 4, 14, 17 };

		moveToEnd(MplusN, N);

	}

	public static void moveToEnd(int[] MplusN, int[] N) {
		int i = MplusN.length - 1;

		for (int p = MplusN.length - 1; p >= 0; p--) {

			if (MplusN[p] != -1) {
				MplusN[i] = MplusN[p];
				i--;
			}
		}

		// 1-1-15157121522 ----> this array will come as first 4 indexes are not
		// considered because that is the required for array N and its elements

		mergeTwoArrays(MplusN, N);
	}

	public static void mergeTwoArrays(int[] MplusN, int[] N) {

		int j = 0, i = N.length, k = 0;

		while (k < MplusN.length) {

			// (j == N.length) || --> Used to specify if there is no element remaining in
			// 2nd array,
			// we can continue with the first element

			if ((j == N.length) || (i < MplusN.length && MplusN[i] <= N[j])) {
				MplusN[k] = MplusN[i];
				k++;
				i++;
			}

			else {
				MplusN[k] = N[j];
				j++;
				k++;
			}

		}

		System.out.println("Merged Array is:");
		for (int n = 0; n < MplusN.length; n++)
			System.out.println(MplusN[n]);

	}

}
