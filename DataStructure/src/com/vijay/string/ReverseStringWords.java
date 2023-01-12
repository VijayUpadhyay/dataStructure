package com.vijay.string;

import java.util.regex.Pattern;

public class ReverseStringWords {

    public static String reverseWord(String str) {
	Pattern pattern = Pattern.compile("\\s");
	String[] string = pattern.split(str);
	String str1 = "";
	for (int i = 0; i < string.length; i++) {
	    str1 = string[i] + str1;
	    if (i < (string.length - 1))
		str1 = " " + str1;
	}
	return str1;
    }

    public static void main(String[] args) {
	String str = "Vijay is Ajay";
	System.out.println(reverseWord(str));
    }
}
