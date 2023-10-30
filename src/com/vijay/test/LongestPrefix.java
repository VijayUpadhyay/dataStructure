package com.vijay.test;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strings = {"HPE", "HPEnterprise", "HP"};
        int index = getLargestString(strings);
        if (index == -1) {
            System.out.println("No common prefix");
        } else {
            System.out.println("Common prefix is: " + strings[0].substring(0, index));
        }
    }

    static int getLargestString(String[] strings) {
        int count = 0;
        // check if any element is empty
        for (String s : strings) {
            if (s == null || s == "")
                return -1;
        }
        // iterate over given strings
        // List<Character> characters = new ArrayList<>(strings.length);
        String s = strings[0];
        while (s.length() >= 0) {
            boolean isStringIterated = false;
            for (int i = 1; i < strings.length; i++) {
                if (strings[i].length() == count) {
                    isStringIterated = true;
                    break;
                }
                if (s.charAt(count) != strings[i].charAt(count)) {
                    break;
                } else {
                    count++;
                }

                if (isStringIterated) {
                    break;
                }
            }
        }

        return count;

    }
}
