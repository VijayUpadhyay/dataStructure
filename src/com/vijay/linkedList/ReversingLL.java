package com.vijay.linkedList;

public class ReversingLL {

    public Node head;

    public static void main(String[] args) {

        ReversingLL objReversingLL = new ReversingLL();

        objReversingLL.insert("33");
        objReversingLL.insert("12");
        objReversingLL.insert("56");
        objReversingLL.insert("1");
		/*objReversingLL.head = new Node("85");
		objReversingLL.head.next = new Node("15");
		objReversingLL.head.next.next = new Node("4");
		objReversingLL.head.next.next.next = new Node("20");*/
        System.out.println("Given LL is:");
        objReversingLL.printLL(objReversingLL.head);

       /* Node reverseHead = objReversingLL.reverse(objReversingLL.head);
        System.out.println("Reversed LL is:");
        objReversingLL.printLL(reverseHead);*/

        Node reverseHead2 = objReversingLL.reverseLL(objReversingLL.head);
        System.out.println("Again Reversed LL is:");
        objReversingLL.printLL(reverseHead2);

    }

    //append
    public void insert(String newNode) {
        Node new_Node = new Node(newNode);
        new_Node.next = head;
        head = new_Node;

    }

    //iterative
    public Node reverse(Node reverseNode) {
        Node current = reverseNode;
        Node next = null;
        Node prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        reverseNode = prev;
        return reverseNode;
    }

    Node reverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public void printLL(Node node) {
        Node printLL = node;
        int i = 0;
        while (printLL != null) {
            System.out.println("Element at " + (i + 1) + " is: " + printLL.data);
            printLL = printLL.next;
            i++;
        }
    }

    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

}
