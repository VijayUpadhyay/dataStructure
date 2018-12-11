package com.vijay.search;

public class JumpSearch {
	private int flag;

	public int jumpSearch(int arr[],int find){
		int n =arr.length;
		int m =(int) Math.floor(Math.sqrt(n));
		
		int prev=0;
		if(arr[Math.min(m,n)]<find){
			prev=m;
			m= + (int) Math.floor(Math.sqrt(n));;
			if(prev>n)
				return -1;
		}
		
		while (arr[prev]< find){
			prev++;
			
			if(arr[prev]==find){
				flag=prev+1;
				System.out.println("Element: "+arr[prev]+" found at: "+flag);
			}
				
		}
		
		return flag;
	}
	public static void main(String[] args) {
		
		JumpSearch js =new JumpSearch();
		int array[] ={10,12,23,34,45,56,67};
		int find = 23;
		js.jumpSearch(array,find);

	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
