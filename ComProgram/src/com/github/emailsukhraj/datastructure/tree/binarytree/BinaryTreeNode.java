package com.github.emailsukhraj.datastructure.tree.binarytree;

public class BinaryTreeNode {

	public BinaryTreeNode left;
	public BinaryTreeNode right;
	public Integer data;
	
	public BinaryTreeNode(Integer data) {
		super();
		this.left = null;
		this.right = null;
		this.data = data;
	}
	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		String data= this.data.toString();
		String leftData= left!=null?left.data.toString():null;
		String rightData= right!=null?right.data.toString():null;		
		return "Data : "+data+" \n leftData : "+leftData +" \n rightData : "+rightData;
	}
	
	
	
}
