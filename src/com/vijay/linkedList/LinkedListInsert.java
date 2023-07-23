package com.vijay.linkedList;

public class LinkedListInsert {

    private Node head;

    public static void main(String[] args) {


    }

    public void insertAtStart(int data) {//Time complexity of push() is O(1) as it does constant amount of work.-->4 step process
        Node newNode = new Node(data);
        newNode.next = head;
        newNode = head;
    }

    //Time complexity of insertAfter() is O(1) as it does constant amount of work.--> 5 step process
    public void insertInMiddle(Node prevData, int data) {
        Node newNode = new Node(data);
        while (prevData.next != null) {
        }
        newNode.next = head;
        newNode = head;
    }

    public void insertAtEnd(int data) {//Time complexity of append is O(n) where n is the number of nodes in linked list.
        //Since there is a loop from head to end, the function does O(n) work.
        //This method can also be optimized to work in O(1) by keeping an extra pointer to tail of linked list--> 6 step process
        Node newNode = new Node(data);
        //while()
        newNode.next = head;
        newNode = head;
    }

    class Node {
        public Node next;
        public int data;

        Node(int value) {
            this.data = value;
            next = null;
        }
    }

}
