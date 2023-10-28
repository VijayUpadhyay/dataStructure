package com.vijay.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeHeight {
    static Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        temp.left = temp.right = null;
        return temp;
    }

    public static int height(Node root) {
        // Initialising a variable to count the height of tree
        int depth = 0;
        Queue<Node> q = new LinkedList<>();
        // Pushing first level element along with null
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            // When null encountered, increment the value
            if (temp == null) {
                depth++;
            }
            // If null not encountered, keep moving
            if (temp != null) {
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            } else if (!q.isEmpty()) { // If queue still have elements left, push null again to the queue.
                q.add(null);
            }
        }
        return depth;
    }

    // Driver Code
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        System.out.println("Height(Depth) of tree is: " + height(root));
        System.out.println("Height of tree is: " + findHeight(root));
    }

    static int findHeight(Node node) {
        if (node == null)
            return 0;
        // Compute height of each subtree
        int lHeight = height(node.left);
        int rHeight = height(node.right);
        // use the larger one
        if (lHeight > rHeight)
            return (lHeight + 1);
        else
            return (rHeight + 1);
    }

    static class Node {
        int key;
        Node left;
        Node right;
    }
}

