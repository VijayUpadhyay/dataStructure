package com.vijay.linkedList;

public class DeletionInLinkedList {
	
	private Node head;
	
	public static class Node{
		 Node next;
		 int data;
		
		Node(int n){
			//this.setData(n);
			this.data = n;
			next = null;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
	}
	
	private void printList() {
		int i=0;
		Node tNode = head;
		while(tNode != null){
			i++;
			System.out.println("Element at "+i+" is "+ tNode.getData());
			tNode = tNode.next;
		}
		
	}

	public static void main(String[] args) {
		int k=4;
		
		//System.out.print(b);
		
		DeletionInLinkedList objDeletionInLinkedList = new DeletionInLinkedList();
		//DeletionInLinkedList.Node head = objDeletionInLinkedList.getHead();

		objDeletionInLinkedList.insert(2);
		objDeletionInLinkedList.insert(4);
		objDeletionInLinkedList.insert(20);
		objDeletionInLinkedList.insert(5);
		
		System.out.println("\nCreated Linked list is:");
		objDeletionInLinkedList.printList();
		
		objDeletionInLinkedList.deleteNode(k);
		
		System.out.println("\nLinked List after Deletion of node having value equals to 4:");
		objDeletionInLinkedList.printList();
	}

	private void deleteNode(int k) {
		Node temp = head, prev= null;
		
		if(temp != null && temp.data == k){
			head = temp.getNext();
			return;
		}
		
		while(temp != null && temp.getData() != k){
			prev = temp;
			temp = temp.getNext();
		}
		
		if(temp == null)
			return;
		prev.next = temp.getNext();
		
	}

	

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	
	// To add nodes into LL with their values.
	public void insert(int n){
		Node newNode = new Node(n);  // newNode represents the Tail node.
		newNode.next = head;
		head = newNode;
	}


}
