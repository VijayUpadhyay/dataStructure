package com.vijay.string;

public class Subsequence {
    public static void main(String[] args) {
        Subsequence subsequence = new Subsequence();
        System.out.println(subsequence.isSubsequence("abc", "ahbgdc"));
        System.out.println(subsequence.isSubsequence("axc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int n = s.length(), m = t.length();
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return i == n;
    }
}
