package com.vijay.sorting;
public class HeapSort
{
  public void heapSort(int[] arr)
  {
    int n = arr.length;
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, i, n);
    System.out.println("Going for swap");
    for (int i = n - 1; i >= 0; i--)
    {
      int swap = arr[i];
      arr[i] = arr[0];
      arr[0] = swap;
      heapify(arr, 0, i);
    }
  }
  public void heapify(int[] arr, int i, int n)
  {
    int largest = i;
    int leftNode = 2 * i + 1;
    int rightNode = 2 * i + 2;
    if ((leftNode < n) && (arr[leftNode] > arr[largest]))
      largest = leftNode;
    if ((rightNode < n) && (arr[rightNode] > arr[largest])) 
      largest = rightNode;
    if (largest != i)
    {
      int swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;
      System.out.println("heapifying again "+largest);
      printArray(arr);
      heapify(arr, largest, n);
    }
  }
  
  public static void main(String[] args)
  {
    HeapSort objHeapSort = new HeapSort();
    int[] arr = { 22, 12, 34, 235, 78, 89 };
    System.out.println("The given array is:");
    printArray(arr);
    objHeapSort.heapSort(arr);
    System.out.println("After heap  sort");
    printArray(arr);
    
  }
  public static void printArray(int[] arr){
	  for (int i = 0; i < arr.length; i++) 
	      System.out.println(arr[i]);
  }
}
