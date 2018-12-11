package com.vijay.sorting;

public class SelectionSort
{
  public void selectionSort(int[] arr)
  {
    for (int j = 0; j < arr.length; j++)
    {
      int smallerNumberAt = j;
      for (int i = j + 1; i < arr.length; i++)
      {
        if (arr[i] < arr[j])
        {
          smallerNumberAt = i;
          
          int smallest = arr[smallerNumberAt];
          arr[smallerNumberAt] = arr[j];
          arr[j] = smallest;
        }
        System.out.println("After each swap , array is ");
        for (int p = 0; p < arr.length; p++) {
          System.out.println("The element at " + p + " is:  " + arr[p]);
        }
      }
      System.out.println("After " + (j + 1) + " complete iteration, array is: ");
      for (int p = 0; p < arr.length; p++) {
        System.out.println("The element at " + p + " is:  " + arr[p]);
      }
    }
    System.out.println("The sorted array is: ");
    for (int p = 0; p < arr.length; p++) {
      System.out.println("The element at " + p + " is:  " + arr[p]);
    }
  }
  
  public static void main(String[] args)
  {
    SelectionSort selectionSortObj = new SelectionSort();
    
    int[] array = { 5, 1, 12, -5, 16, 2, 14, 14 };
    System.out.println("The given array is:");
    for (int i = 0; i <= array.length - 1; i++) {
      System.out.println(array[i] + "  Array index is: " + i);
    }
    selectionSortObj.selectionSort(array);
  }
}
