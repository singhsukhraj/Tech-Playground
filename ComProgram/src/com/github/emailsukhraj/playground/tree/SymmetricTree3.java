package com.github.emailsukhraj.playground.tree;

import java.util.Stack;

import com.github.emailsukhraj.datastructure.tree.binarytree.BinaryTree;
import com.github.emailsukhraj.datastructure.tree.binarytree.BinaryTreeNode;

public class SymmetricTree3 {

	Stack<BinaryTreeNode> left = new Stack();
	Stack<BinaryTreeNode> right = new Stack();

	Boolean isSymmetric(BinaryTreeNode left,BinaryTreeNode right ) {

		if (left == null && right == null) 
	      return true; 
		
		if (left != null && right != null && left.data == right.data) 
            return (isSymmetric(left.left, right.right) 
                    && isSymmetric(left.right, right.left));

		
		return false;
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

		System.out.println(new SymmetricTree3().isSymmetric(bt.root.left,bt.root.right));
	}
}
