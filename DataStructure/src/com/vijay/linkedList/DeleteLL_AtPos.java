package com.vijay.linkedList;

public class DeleteLL_AtPos {
	Node head;
	public class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void insert(String data) {
		Node newNode = new Node(data);
		newNode.next= head;
		head = newNode;					// To insert at starting position.
		
	}
	
	public void deleteAtPos(Node updateNode, int pos){
		if(pos == 0){
			head = updateNode.next;
			return;
		}
		System.out.println(pos);
		for(int i=1; updateNode != null && i < pos-1; i++)
			updateNode = updateNode.next;
		
		System.out.println("Value is: "+updateNode.data);
			
		if(updateNode == null || updateNode.next == null)
			return;
		
		Node unlinkNode = updateNode.next.next;
		updateNode.next = unlinkNode;
	}
	
	public void printLL() {
		Node printLL = head;
		int i=0;
		while(printLL != null){
			System.out.println("Element at "+(i+1)+" is: "+printLL.data);
			printLL = printLL.next;
			i++;
		}
		
	}
	public static void main(String[] args){
		DeleteLL_AtPos objDeleteAtPos = new DeleteLL_AtPos();
		
		objDeleteAtPos.insert("3");
		objDeleteAtPos.insert("5");
		objDeleteAtPos.insert("23");
		objDeleteAtPos.insert("1");
		objDeleteAtPos.insert("27");
		
		objDeleteAtPos.deleteAtPos(objDeleteAtPos.head, 3);
		objDeleteAtPos.printLL();
	}
	

}
