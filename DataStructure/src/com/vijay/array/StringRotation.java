package com.vijay.array;

public class StringRotation {

	public static void main(String[] args) {

		String str = "aaaa";
		int noOfRotations = rotationForOriginatlString(str);

		System.out.println(noOfRotations);

	}

	public static int rotationForOriginatlString(String str) {
		String temp = str + str;
		int length = str.length();

		for (int i = 1; i <= length; i++) {
			String s = temp.substring(i, str.length());

			if (str.equals(s))
				return i;
		}
		return str.length();
	}
}
