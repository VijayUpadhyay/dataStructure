package com.vijay.linkedList;

import java.util.Stack;

public class ReverseLL_Stack {
    ReversingLL.Node reverseUsingStack(ReversingLL.Node node) {
        Stack<ReversingLL.Node> nodeStack = new Stack<>();
        ReversingLL.Node temp = node;
        while (temp.next != null) {
            nodeStack.add(node);
            temp = temp.next;
        }
        // reset header to end
        node = temp;
        while (nodeStack.isEmpty()) {
            temp.next = nodeStack.peek();
            nodeStack.pop();
            temp = temp.next;
        }
        temp.next = null;
        return node;
    }
}
