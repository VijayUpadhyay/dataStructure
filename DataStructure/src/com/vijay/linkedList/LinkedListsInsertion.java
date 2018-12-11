/**
 * 
 */
package com.vijay.linkedList;

/**
 * @author Vijay Upadhyay(978804)
 *
 * 
 */
public class LinkedListsInsertion {


	public static void main(String[] args) {
		int i=0;
		// Insertion in LL
		LinkedListCreation objLinkedListCreation = new LinkedListCreation();
		LinkedListCreation.Node head = objLinkedListCreation.getHead();
		
		objLinkedListCreation.insert(new LinkedListCreation.Node("2"));
		objLinkedListCreation.insert(new LinkedListCreation.Node("6"));
		objLinkedListCreation.insert(new LinkedListCreation.Node("8"));
		
		LinkedListCreation.Node current = head;
		
		while(current.getNext() != null){// current.getData() != null || current.getNext() != null
			i++;
			System.out.println("The element at "+i+" is :"+current.getData());
			
			current = current.getNext();
		}
		
		System.out.print("The element at "+(i+1)+" is :"+current.getData());
		
	}
	
	

}

 class LinkedListCreation{
	 
	 private Node head;
	 private Node tail;
	 
	 public LinkedListCreation() {
		this.head = new Node("head");
		tail = head;
	}
	 
	 public Node getHead(){
	        return head;
	    }
	 
	 public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	// Used to add a new Node into the Tail LL and shift the position of tail to the new Node.
	public void insert(Node node){
		tail.next = node;
		tail = node;
	}

	
	// Node Class
	public static class Node{
		private Node next;
		private String data;
		
		// Used to assign the Data into the node.
		public Node(String data){
			 this.data = data;
			 next = null;
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
	
}
