package com.vijay.cisco;


//func
// array - {0,1,0,1,1,0,1} - 4 - 0,3 - 1, n
// i/p: array, arr.len - integers


public class Test {

    static boolean checkArray(int[] arr, int n) {
        int countOfOne = 0;
        int countOfZero = 0;


        if (arr == null || arr.length == 0) {
            return true;
        }

        return n % 2 == 0;

        //
       /* for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    countOfZero++;
                case 1:
                    countOfOne++;
                default:
                    System.out.println("Given value is not zero/one: " + arr[i]);
            }
        }

        // check even
        return (countOfZero % 2 == 0 && countOfOne % 2 == 0) || (countOfZero % 2 == 1 && countOfOne % 2 == 1);*/
    }
}


