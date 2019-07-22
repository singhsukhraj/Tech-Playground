package com.github.emailsukhraj.datastructure.tree.binarytree;

public class BinaryTree {

	public BinaryTreeNode root;

	public BinaryTree(int key) {
		root = new BinaryTreeNode(key);
	}

	BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(1);

		bt.root.left = new BinaryTreeNode(2);
		bt.root.right = new BinaryTreeNode(2);

		bt.root.left.left = new BinaryTreeNode(3);
		bt.root.left.right = new BinaryTreeNode(4);
		
		bt.root.right.left = new BinaryTreeNode(4);
		bt.root.right.right = new BinaryTreeNode(3);
		
		bt.root.left.left.left = new BinaryTreeNode(8);
		bt.root.right.right.right = new BinaryTreeNode(8);
		//  5
		// / \
		// 3 4
		// / \
		// 1 2

	}
}
