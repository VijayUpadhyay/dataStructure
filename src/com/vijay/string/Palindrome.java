package com.vijay.string;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String val = "A man, a plan, a canal: Panama";
        val = "race a car";
        System.out.println(p.isPalindrome(val));
    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.equals(""))
            return true;
        char[] rev = s.toCharArray();
        int i = 0, j = rev.length - 1;
        while (i <= j) {
            if (rev[i] != rev[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

}
