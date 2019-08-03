package com.github.emailsukhraj.playground.tree;

import com.github.emailsukhraj.datastructure.tree.binarytree.BinaryTree;
import com.github.emailsukhraj.datastructure.tree.binarytree.BinaryTreeNode;

public class BinaryTreeTransversalRecursive {
	
	static void inorder(BinaryTreeNode node){
		if(node ==null){
			return;
		}
		
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	
	static void preorder(BinaryTreeNode node){
		if(node ==null){
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	
	static void postorder(BinaryTreeNode node){
		if(node ==null){
			return;
		}
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");

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
		
		inorder(bt.root);
		System.out.println();
		postorder(bt.root);
		System.out.println();
		preorder(bt.root);
	}
	
}
