package com.github.emailsukhraj.playground.tree;

import java.util.Stack;

import com.github.emailsukhraj.datastructure.tree.binarytree.BinaryTree;
import com.github.emailsukhraj.datastructure.tree.binarytree.BinaryTreeNode;

public class SymmetricTree {

	Stack<BinaryTreeNode> left = new Stack();
	Stack<BinaryTreeNode> right = new Stack();

	Boolean isSymmetric(BinaryTreeNode root) {

		if (root.getLeft() == null || root.getRight() == null) {
			return false;
		}

		if (root.getLeft() != null && root.getRight() != null) {
			left.add(root.getLeft());
			right.add(root.getRight());

			while ((left.size() == right.size())) {

				if (left.isEmpty() && right.isEmpty()) {
					return true;
				}

				BinaryTreeNode leftNode = left.pop();
				BinaryTreeNode rightNode = right.pop();

				if (leftNode.getData() != rightNode.getData()) {
					return false;
				} else {
					if (leftNode.getLeft() != null && rightNode.getRight() != null) {
						if (leftNode.getLeft().getData() == rightNode.getRight().getData()) {
							left.push(leftNode.getLeft());
							right.push(rightNode.getRight());
						} else {
							return false;
						}
					} else if ((leftNode.getLeft() != null && rightNode.getRight() == null)
							|| leftNode.getLeft() == null && rightNode.getRight() != null) {
						return false;
					}

					if (leftNode.getRight() != null && rightNode.getLeft() != null) {
						if (leftNode.getRight().getData() == rightNode.getLeft().getData()) {
							left.push(leftNode.getRight());
							right.push(rightNode.getLeft());
						} else {
							return false;
						}
					} else if ((leftNode.getRight() == null && rightNode.getLeft() != null)
							|| (leftNode.getRight() != null && rightNode.getLeft() == null)) {
						return false;
					}
				}

			}
		}

		return true;
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

		System.out.println(new SymmetricTree().isSymmetric(bt.root));
	}
}
