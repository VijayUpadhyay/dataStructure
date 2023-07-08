package com.vijay.linkedList.doubly;

class DoublyLLReverse {

    static Node head;

    // Driver's code
    public static void main(String[] args) {
        DoublyLLReverse list = new DoublyLLReverse();
        // Let us create a sorted linked list to test the functions Created linked list will be 10->8->4->2
        list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);

        System.out.println("Original linked list ");
        list.printList(head);

        // Function call
        list.reverse();

        System.out.println();
        System.out.println("The reversed Linked List is ");
        list.printList(head);
    }

    /* Function to reverse a Doubly Linked List */
    void reverse() {
        if (head == null || head.next == null)
            return;
        Node temp = null;
        Node current = head;
        /* swap next and prev for all nodes of doubly linked list */
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        head = temp.prev;
    }

    /* Function to insert a node at the beginning of the Doubly Linked List */
    void push(int new_data) {
        Node new_node = new Node(new_data);
        /* since we are adding at the beginning, prev is always NULL */
        new_node.prev = null;
        /* link the old list of the new node */
        new_node.next = head;
        /* change prev of head node to new node */
        if (head != null) {
            head.prev = new_node;
        }

        /* move the head to point to the new node */
        head = new_node;
    }

    /* Function to print nodes in a given doubly linked list
        This function is same as printList() of singly linked list */
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }
}