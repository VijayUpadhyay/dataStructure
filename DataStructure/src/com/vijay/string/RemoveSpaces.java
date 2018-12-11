package com.vijay.string;

public class RemoveSpaces {

	public static void main(String[] args) {
		String s = "abc df ppp dds mkmk";
		String[] s1 =s.split(" ");
		s="";
		for(String str : s1)
			s+= str;
		
		System.out.println(s);
	}
}
