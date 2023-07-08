package com.vijay.linkedList;

class LLAtNthPos {
    Node head; // head of the list

    // Driver's code
    public static void main(String[] args) {
        LLAtNthPos llist = new LLAtNthPos();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
        llist.printNthFromLast(5);
    }

    /* Function to get the    Nth node from end of list
     * Follow the given steps to solve the problem:
     * Maintain two pointers main_ptr and ref_ptr
     * Move ref_ptr to the Nth node from the start
     * Now move both main_ptr and ref_ptr, until the ref_ptr reaches the last node
     * Now print the data of the main_ptr, as it is at the Nth node from the end
     * */
    void printNthFromLast(int N) {
        if (head == null)
            return;
        Node main_ptr = head;
        Node ref_ptr = head;
        int count = 0;
        while (count < N) {
            if (ref_ptr == null) {
                System.out.println(N + " is greater than the no of nodes in the list");
                // if want to continue for N>LL length and print modulo nth element
//                N = N - count;
//                ref_ptr = head;
                return;
            }
            ref_ptr = ref_ptr.next;
            count++;
        }
        //if this is last node, nth node will be same
        if (ref_ptr == null) {
            System.out.println("Node no. " + N + " from last is " + main_ptr.data);
        } else {
            while (ref_ptr != null) {
                main_ptr = main_ptr.next;
                ref_ptr = ref_ptr.next;
            }
            System.out.println("Node no. " + N + " from last is " + main_ptr.data);
        }

    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /* Linked List node */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}