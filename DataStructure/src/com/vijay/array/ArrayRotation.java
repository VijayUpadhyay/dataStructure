package com.vijay.array;

public class ArrayRotation {

    public static void main(String[] args) {
	int[] array = { 22, 3, 44, 56, 75, 89, 12, 322 };
	int rotateBy = 2;
	int j = array.length - 1;
	for (int i = 0; i < rotateBy; i++) {
	    rotateOneByOne(array, i, j);
	    j--;
	}

    }

    public static void rotateOneByOne(int[] arr, int i, int j) {

	// int temp = arr[i];

    }

}
