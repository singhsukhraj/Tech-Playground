package com.github.emailsukhraj.playground.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.github.emailsukhraj.datastructure.tree.binarytree.BinaryTree;
import com.github.emailsukhraj.datastructure.tree.binarytree.BinaryTreeNode;

public class SymmetricTree2 {

	Queue<BinaryTreeNode> q= new LinkedList();

	Boolean isSymmetric(BinaryTreeNode root) {
		
		q.add(root.getLeft());
		q.add(root.getRight());
		
		while(!q.isEmpty()){
		
			BinaryTreeNode left = q.poll();
			BinaryTreeNode right = q.poll();
			
			if(left == null && right == null){
				continue;
			}
			
			if(left!=null && right==null || right==null && left!=null){
				return false;
			}
			
			if(left.getData()!=right.getData())
			{
				return false;
			}
			
			q.add(left.getLeft());
			q.add(right.getRight());
			q.add(left.getRight());
			q.add(right.getLeft());
			
			
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
		bt.root.right.right.left = new BinaryTreeNode(8);

		System.out.println(new SymmetricTree2().isSymmetric(bt.root));
	}
}
