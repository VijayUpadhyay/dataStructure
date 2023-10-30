package com.vijay.array.strings;

public class StringRotation {
    public static void main(String[] args) {
        String str = "aaaa";
        int noOfRotations = rotationForOriginalString(str);
        System.out.println(noOfRotations);
    }

    public static int rotationForOriginalString(String str) {
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
