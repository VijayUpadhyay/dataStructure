package com.vijay.array;

// Whenever we pass an array, it consumes all of its indexes.If we have assigned 5 values at 5 indexes in an array of capacity 10, 
//while passing this array it will assign 0 to the remaining 5 indexes and passes them to the respective method.



public class BasicOpererationOnUnsortedArray {               //Search, Insert and Delete
	static int occupiedIndexes=0;
	
	public static boolean insertInArray(int[] arr, int key,int occupiedIndexes){
		int n=arr.length;
		if(occupiedIndexes< n){
		arr[occupiedIndexes] = key;
		occupiedIndexes++;
		return true;
		}
		else
		return false;
	}

	public static int searchElement(int arr[],int occupiedIndexes,int searchElement){
		for(int i=0;i<occupiedIndexes;i++){
			
			if(arr[i]==searchElement){
				display(arr);
				return i;
			}
		}
		
	        return -1;
	}
	
	// To delete an element
	
	public static int deleteElement(int[] arr, int deleteElement){
		
		int pos = searchElement(arr, occupiedIndexes, deleteElement);
		
		if(pos== -1){
			System.out.println("Element doesnot exist.So, unable to delete it.");
			return -1;
			}
		else{
			for(int i=pos;i<occupiedIndexes;++i){
				arr[i] = arr[i+1];
			}
		}
		
		System.out.println("Array after deleting "+deleteElement+" is:");
		display(arr);
		
		return pos;
	}
	
	public static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		int[] array = new int[10];
		/*for(int i=0; i<=5; i++)
			array[i]=i;*/

		array[0]=8;
		array[1]=18;
		array[2]=81;
		array[3]=118;
		array[4]=811;
		array[5]=181;
		int key =11;
		occupiedIndexes=6;              
	//occupiedIndexes=array.length; --> we should know the number of indexes are filled of a particular array before performing insertion on it.As .length is giving array's capacity.
		boolean result = insertInArray(array,key,occupiedIndexes);
		if(result){
			System.out.println(key+" is inserted and the array is:");
			for(int i=0;i<array.length;i++)
				System.out.println(array[i]);
		}
		else
			System.out.println("Unable to insert the value into array");
		

		//to search an element
		
		int searchElement =118;
		int searchResult = searchElement(array,occupiedIndexes,searchElement);
		
		System.out.println("The element is found at: "+searchResult);
		
		int deleteElement = 18;
		
		int deleteResult = deleteElement(array,deleteElement);
		
		System.out.println("Element is deleted at "+deleteResult);
	}

}
