package com.vijay.linkedList;

import java.util.Scanner;

public class LinkedListDeletion<Node> {
	
	
	public void deleteNode(LinkedListInsertion.Node current,String value){
		
		System.out.println("To delete node");
		LinkedListInsertion.Node temp =  current;
		LinkedListInsertion.Node prev = null;
		
		if(temp != null &&  temp.getData() == value ){
			current =  temp.getNext();
			
		}
		
		while(current != null &&  current.getData() != value){
			prev =  current;
			current = current.getNext();
			System.out.println("while");
		}
		
		if(current == null){
			return;
		}
		
		System.out.println("Shifting prev Node");
		 prev.setNext(current.getNext());
		 
		 while(prev != null){
			 int i =1;
			 System.out.println("Element at "+i+" is : "+ prev.getData());
		 }
		
	}

	public static void main(String[] args) {
		
		
		LinkedListInsertion objLinkedListInsertion = new LinkedListInsertion();
		LinkedListInsertion.Node head = objLinkedListInsertion.getHead();
		
		objLinkedListInsertion.insertion(new LinkedListInsertion.Node("3"));
		objLinkedListInsertion.insertion(new LinkedListInsertion.Node("9"));
		objLinkedListInsertion.insertion(new LinkedListInsertion.Node("30"));
		objLinkedListInsertion.insertion(new LinkedListInsertion.Node("33"));
		
		LinkedListInsertion.Node currentNode = head;
		
		while(currentNode.getNext() != null){
			System.out.println("The value is "+ currentNode.getData());
			currentNode = currentNode.getNext();
		}
		//currentNode = currentNode.getNext();   --> it will give NullPointerException
		System.out.println("The value is "+ currentNode.getData());
		
		
		System.out.println("Enter the value of node");
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine(); // =   5 
		
		System.out.println("Going to delete node");
		
		LinkedListDeletion<String> objLinkedListDeletion = new LinkedListDeletion<String>();
		objLinkedListDeletion.deleteNode(currentNode,key);
		
	}

}

class LinkedListInsertion{
	
	private Node head;
	private Node tail;
	
	LinkedListInsertion(){
		
		this.head = new Node("Head");
		tail = head;
	}
	
	public void insertion(Node node){
		tail.next = node;
		tail = node;
	}
	
	public static class Node{
		private Node next;
		private String data;
		
		public Node(String data){
			this.setData(data);
			setNext(null);
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}
		
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}
}
