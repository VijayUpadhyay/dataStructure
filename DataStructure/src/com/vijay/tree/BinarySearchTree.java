package com.vijay.tree;

public class BinarySearchTree {

    class Node {
	int key;
	Node right, left;

	Node(int key) {
	    this.key = key;
	    right = left = null;
	}

	@Override
	public String toString() {
	    return "Node [key=" + key + ", right=" + right + ", left=" + left + "]";
	}
    }

    Node root;

    public BinarySearchTree() {
	root = null;
    }

    void insert(int key) {
	root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
	if (root == null) {
	    root = new Node(key);
	    return root;
	}
	if (key < root.key)
	    root.left = insertRec(root.left, key);
	else if (key > root.key)
	    root.right = insertRec(root.right, key);

	return root;
    }

    public void printTreeInorder() {
	printTree(root);
    }

    void printTree(Node root) {
	if (root != null) {
	    printTree(root.left);
	    System.out.println(root.key);
	    printTree(root.right);
	}
    }

    public static void main(String[] args) {
	BinarySearchTree bst = new BinarySearchTree();
	bst.insert(22);
	bst.insert(24);
	bst.insert(25);
	bst.insert(2);
	bst.insert(7);
	bst.insert(1);

	// bst.printTree(bst.root);
	bst.printTreeInorder();
    }

}
