package com.vijay.array;

public class NewSorting
{
  public static void main(String[] args)
  {
    int[] array = { 22, 1, 33, 445, 2, 4, 55 };
    int[] sampleArray = new int[array.length];
    int pos = 0;
    sortArray(array, pos, sampleArray);
    
    System.out.println("The sorted array is:");
    for (int i = 0; i < sampleArray.length; i++) {
      System.out.println(sampleArray[i]);
    }
  }
  
  public static void sortArray(int[] arr, int pos, int[] sampleArray)
  {
    if (pos >= arr.length) {
      return;
    }
    int smallest = arr[pos];
    for (int i = pos; i < arr.length; i++) {
      if (arr[i] <= smallest) {
        smallest = arr[i];
      }
    }
    sampleArray[pos] = smallest;
    pos++;
    
    sortArray(arr, pos, sampleArray);
  }
}
