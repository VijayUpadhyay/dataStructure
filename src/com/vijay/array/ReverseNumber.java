package com.vijay.array;

public class ReverseNumber {

	public static void main(String[] args) {
		int read = 504000055;
		while(read%10 == 0){
			read = read/10;
		}
		reverseNumber(read);
	}

	public static void reverseNumber(int num){
		int revNo=num,reverseNumber=0;
		while (num>0)
	      {
			reverseNumber=(reverseNumber*10)+(num%10);
			num=num/10;
	      }
		System.out.println("Reverse of "+revNo+" is "+reverseNumber);
	}
}
