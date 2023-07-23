package com.vijay.linkedList;

public class LinkedListSwap {

    Node head;

    public static void main(String[] args) {

        LinkedListSwap objLinkedListSwap = new LinkedListSwap();

        objLinkedListSwap.insertFirst(33);
        objLinkedListSwap.insertFirst(11);
        objLinkedListSwap.insertFirst(2);
        objLinkedListSwap.insertFirst(67);
        objLinkedListSwap.insertFirst(22);
        objLinkedListSwap.insertFirst(55);

        objLinkedListSwap.printLL();
        objLinkedListSwap.swap(11, 22);

        System.out.println("After Swap");
        objLinkedListSwap.printLL();

    }

    public void insertFirst(int newNodeData) {
        Node new_Node = new Node(newNodeData);
        new_Node.next = head;
        head = new_Node;

    }

    public void swap(int x, int y) {
        if (x == y)
            return;
        //Finding the position for X
        Node prevNodeX = null, currentNodeX = head;
        while (currentNodeX != null && currentNodeX.data != x) {
            prevNodeX = currentNodeX;
            currentNodeX = currentNodeX.next;
        }

        // Finding the position for Y
        Node prevNodeY = null, currentNodeY = head;
        while (currentNodeY != null && currentNodeY.data != y) {
            prevNodeY = currentNodeY;
            currentNodeY = currentNodeY.next;
        }

        // If any of them is not available in the given LL
        if (currentNodeX == null || currentNodeY == null)
            return;

        //If X is not the head of LL
        if (prevNodeX != null)
            prevNodeX.next = currentNodeY;
        else// make Y as new Head
            head = currentNodeY;

        //If Y is not the Head of LL
        if (prevNodeY != null)
            prevNodeY.next = currentNodeX;
        else//make as the Head of LL
            head = currentNodeX;

        //Swap of elements having nodes in-between them
        Node temp = currentNodeX.next;
        currentNodeX.next = currentNodeY.next;
        currentNodeY.next = temp;
    }

    public void printLL() {
        Node printLL = head;
        int i = 0;
        while (printLL != null) {
            System.out.println("Element at " + (i + 1) + " is: " + printLL.data);
            printLL = printLL.next;
            i++;
        }

    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
