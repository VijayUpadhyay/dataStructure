package com.vijay.again;

// Java program for the above approach

class GFG {
    // Function of return the number of
    // palindromic strings of length N with
    // first K alphabets possible
    static int lengthNPalindrome(int N, int K) {
        int half = N / 2;

        // If N is odd, half + 1 position
        // can be filled to cope with the
        // extra middle element
        if (N % 2 == 1) {
            half += 1;
        }

        int ans = 1;
        for (int i = 1; i <= half; i++) {
            ans *= K;

            // K is reduced by one, because
            // count of choices for the next
            // position is reduced by 1 as
            // a element can only once
            K--;
        }

        // Return the possible count
        return ans;
    }

    // Function to find the count of palindromic
    // string of first K characters according
    // to the given criteria
    static int palindromicStrings(int N, int K) {
        // If N=1, then only K palindromic
        // strings possible.
        if (N == 1) {
            return K;
        }

        // If N=2, the 2*K palindromic strings
        // possible, K for N=1 and K for N=2
        if (N == 2) {
            return 2 * K;
        }

        int ans = 0;

        // Initialize ans with the count of
        // strings possible till N = 2
        ans += (2 * K);

        for (int i = 3; i <= N; i++) {
            ans += lengthNPalindrome(i, K);
        }

        // Return the possible count
        return ans;
    }

    // Driver Code
    public static void main(String[] args) {
        int N = 4, K = 3;

        System.out.println(palindromicStrings(N, K));
    }
}
// This code is contributed by Potta Lokesh

