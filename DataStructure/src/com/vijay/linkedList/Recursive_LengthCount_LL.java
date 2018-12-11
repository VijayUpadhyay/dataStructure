package com.vijay.linkedList;

public class Recursive_LengthCount_LL {
	
	private Node head;
	public class Node{
		
		private String data;
		private Node next;
	
		Node(String data){
			this.data = data;
			this.next = null;
			
		}
		
		
	}
	
	public void insertNode(String newNode) {
		Node new_Node = new Node(newNode);
		new_Node.next = head;
		head = new_Node;
		
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public int getCount(Node countNodes) {
		
		if(countNodes == null)
			return 0;
		
		return 1+getCount(countNodes.next);
		
		
	}

	public static void main(String[] args) {
		
		Recursive_LengthCount_LL objRecursive_LengthCount_LL = new Recursive_LengthCount_LL();
		
		objRecursive_LengthCount_LL.insertNode("25");
		objRecursive_LengthCount_LL.insertNode("2");
		objRecursive_LengthCount_LL.insertNode("12");
		objRecursive_LengthCount_LL.insertNode("45");
		
		int i = objRecursive_LengthCount_LL.getCount(objRecursive_LengthCount_LL.head);
		System.out.print("The length of LL is: "+i);

	}

}
