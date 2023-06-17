package com.vijay.array;

public class OddNumberOfOccurence
{
  public static void main(String[] args)
  {
    int[] array = { 2, 6, 3, 1, 6, 5, 3, 1, 2 };
    
    int num = oddNumberOfOccurence(array);
    
    System.out.println("The odd number times occured element is " + num);
  }
  
  public static int oddNumberOfOccurence(int[] arr)
  {
    int number = 0;
    for (int i = 0; i < arr.length; i++) {
      number ^= arr[i];
    }
    return number;
  }
}
