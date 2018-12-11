package com.vijay.linkedList;

public class TraversalCircularLL {
	
	Node head;
	
	public class Node{
		String data;
		Node next;
		
		Node(String data, Node node){
			this.data = data;
			this.next = head;
		}
	}

	public void insertAtFirst(String newNode,Node nodes){
		Node new_Node = new Node(newNode,nodes);
		new_Node.next = head;
	}
	public static void main(String[] args) {
		

	}

}
