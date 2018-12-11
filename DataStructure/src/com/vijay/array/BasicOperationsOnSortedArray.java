/**
 * 
 */
package com.vijay.array;

/**
 * @author Vijay Upadhyay
 *
 */
public class BasicOperationsOnSortedArray {//As it is sorted array, we can use Binary Search for search operation.

	public static int searchArray(int[] arr,int n,int key){
		int l=0,r=n-1,pos=-1;
		int mid = (l+r)/2;
		for(int i=0;i<=mid;i++){
			if(key==arr[i])
				pos = i;
			
			if(key>=arr[i])
				i=(i+mid)/2;
			else
				mid=i/2;
		}
		if(pos== -1){
			System.out.println("Element is not found");
			return -1;
		}
		else
			return pos;
		
	}
	public static void insertElement(int[] arr, int n,int key, int capacity){
		int i=0;
		
		if(arr.length <= capacity)
			System.out.println("Unable to insert the element: "+key);
		
		while(arr[i]<key)
			i++;                   //To get the position from where elements needs to be added.
		
		
		System.out.println("I is"+i);
		int temp = arr[i];
		arr[i]=key;
		for(int j=i+1;j<arr.length;j++){
			int temp1 = arr[j];
			arr[j]=temp;
			temp=temp1;
		
		}
		System.out.println("The array after inserting "+key+" is:");
		for(int m=0;m<arr.length;m++)
			System.out.println(arr[m]);
	}
	
	public static void deleteElement(int[] arr, int key){
		int pos = searchArray(arr,arr.length, key);
		
		System.out.println("To delete "+key+", its available position is: "+pos);
		
		while(pos<arr.length-1){
			arr[pos]=arr[++pos];
			
			}
		
		arr[arr.length-1] = 0;
		
		System.out.println("Array after deleting "+key+" is");
		for(int m=0;m<arr.length;m++)
			System.out.println(arr[m]);
		
	}
	public static void main(String[] args) {
		int[] array = {22,34,43,56,78,90};
		int n = array.length;
		int key = 43;
		int pos = searchArray(array,n,key);
		if(pos>=0)
		System.out.println("Element is found at "+pos);

		//for insertion
		int insertKey =53;
		int[] insertInArray = new int[10];
		insertInArray[0]=10;
		insertInArray[1]=22;
		insertInArray[2]=25;
		insertInArray[3]=39;
		insertInArray[4]=56;
		insertInArray[5]=89;
		int n1=insertInArray.length;
		int capacity =6;
		insertElement(insertInArray,n1,insertKey,capacity);
		
		//to delete an element
		int deleteElement =43;
		deleteElement(array,deleteElement);
	}

}
