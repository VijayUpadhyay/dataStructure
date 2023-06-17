package com.vijay.linkedList;

public class LL_InsertionAtAllPositions {
	private Node head;
	
	public static class Node{
		
		 String data;
		 Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}

	public static void main(String[] args) {
		
		LL_InsertionAtAllPositions objLL_InsertionAtAllPositions = new LL_InsertionAtAllPositions();
		objLL_InsertionAtAllPositions.insert("3");
		objLL_InsertionAtAllPositions.insert("19");
		objLL_InsertionAtAllPositions.insertAtEnd("6");
		objLL_InsertionAtAllPositions.insert("5");
		objLL_InsertionAtAllPositions.insertAfter(objLL_InsertionAtAllPositions.head, "6", "7");
		
		objLL_InsertionAtAllPositions.printLL();

	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void insert(String newNode){
		Node new_Node = new Node(newNode);
		new_Node.next = head;
		head = new_Node;
		
	}
	
	public void insertAfter(Node prevNode,String newData,String insertData){
		if(prevNode == null){
			System.out.println("Given node is null");
			return;
		}
		
		while(prevNode.data != newData){
			prevNode = prevNode.next;
		}
		Node newNode = new Node(insertData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		
	}
	
	public void insertAtEnd(String newData) {
		Node newNode = new Node(newData);
		
		if(head == null){
			head = new Node(newData);
			return;
		}
		newNode.next = null;
		
		Node lastNode = head;
		while(lastNode.next != null)
			lastNode = lastNode.next;
		
		lastNode.next = newNode;
		
	}
	
	public void printLL() {
		Node printNode = head;
		int i=0;
		 while(printNode != null){
			 System.out.println("Element at "+(i+1)+" is :"+printNode.data);
			 printNode = printNode.next;
			 i++;
		 }
			
		
	}

}
