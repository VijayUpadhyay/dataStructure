package com.vijay.bitwise;

/*Given a integer x, write a function that multiplies x with 3.5 and returns the integer result. You are not allowed to use %, /, *.

Examples:
Input: 2
Output: 7

Input: 5
Output: 17 (Ignore the digits after decimal point)

Solution:*/
public class MultiplyByThreePoint5 {

	public static void main(String[] args) {
		int p =11;
		p = multiplyByThreePoint5(p);
		System.out.println(p);

	}
	
	public static int multiplyByThreePoint5(int x) {
		int j = (x<<1) + x + (x>>1);
		return j;
	}
}
