package com.vijay.bitwise;

import java.util.Scanner;

public class FindOddOrEven {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		findOddOrEven(num);
		sc.close();
	}
	public static void findOddOrEven(Integer n) {
		int p=1;
		if((n&p) == 1){
			System.out.println("Odd");
		}else{
			System.out.println("Even");
		}
		
	}
}
