package com.vijay.tree;


import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class LevelOrderTraversal {

    // Root of the Binary Tree
    Node root;

    public LevelOrderTraversal() {
        root = null;
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }

    // Function to print level order traversal of tree
    void printLevelOrder() {
        int h = height(root);
        int i;
        System.out.println("Height: " + h);
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    // the number of nodes along the longest path from the root node
    // down to the farthest leaf node.
    int height(Node root) {
        if (root == null)
            return 0;
        else {
            // Compute height of each subtree
            int lHeight = height(root.left);
            int rHeight = height(root.right);
            // use the larger one
            if (lHeight > rHeight)
                return (lHeight + 1);
            else
                return (rHeight + 1);
        }
    }

    // Print nodes at the current level
    void printCurrentLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    void printLevelOrderUsingQueue() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            // poll() removes the present head.
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}

