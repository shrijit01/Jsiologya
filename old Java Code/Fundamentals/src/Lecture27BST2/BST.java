package Lecture27BST2;

import Lecture24Trees1.BinaryTreeNode3;

public class BST {
	
	private BinaryTreeNode3<Integer> root;
	private int size;
	
	//BST class Search and print lecture 4
	private static boolean isPresentHelper(BinaryTreeNode3<Integer> node,int x) {
		if(node == null) {
			return false;
		}
		
		if(node.data == x) {
			return true;
		}
		
		if(x < node.data) {
			return isPresentHelper(node.left, x);
		}else {
			return isPresentHelper(node.right, x);
		}
		
	}
	
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}
	
	//BST class Search and print lecture 5
	public static BinaryTreeNode3<Integer> insertHelper(BinaryTreeNode3<Integer> root,int x){
		if(root == null) {
			BinaryTreeNode3<Integer> newRoot = new BinaryTreeNode3<Integer>(x);
			return newRoot;
		}
		
		if(x >= root.data) {
			root.right = insertHelper(root.right,x);
		}else {
			root.left = insertHelper(root.left,x);
		}
		return root;
		
	}
	
	
	public void insert(int x) {
		root = insertHelper(root,x);
		size++;
	}
	
	
	//BST class Search and print lecture 6
	
	private static int minimum(BinaryTreeNode3<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int minLeft = minimum(root.left);
		int minright = minimum(root.right);
		return Math.min(root.data, Math.min(minLeft, minright));
	}
	private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode3<Integer> root ,int x) {
		if(root == null) {
			return new BSTDeleteReturn(null, false);
		}
		
		if(root.data < x) {
			BSTDeleteReturn outputRight = deleteDataHelper(root.right, x);
			root.right = outputRight.root;
			outputRight.root = root;
			return outputRight;   
		}
		
		if(root.data > x ) {
			BSTDeleteReturn outputLeft = deleteDataHelper(root.left, x);
			root.left = outputLeft.root;
			outputLeft.root = root;
			return outputLeft; 
		}
		
		//0 child
		if(root.left == null && root.right  == null) {
			return new BSTDeleteReturn(null, true);
		}
		
		//only left chile
		if(root.left != null && root.right  == null) {
			return new BSTDeleteReturn(root.left, true);
		}
		
		//right child
		if(root.left == null && root.right  != null) {
			return new BSTDeleteReturn(root.right, true);
		}
		
		//BOTH ARE PRESENT
		int rightMin =  minimum(root.right);
		root.data = rightMin;
		BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMin);
		root.right = outputRight.root;
		return new BSTDeleteReturn(root, true);
	}
	public boolean deleteData(int x) {
		BSTDeleteReturn output = deleteDataHelper(root,x);
		root = output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}
	
	public int size() {
		return size;
	}
	
	
	//BST class Search and print lecture 4
	private static void printTreeHelper(BinaryTreeNode3<Integer> root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data +":");
		if(root.left != null) {
			System.out.print("L" + root.left.data +",");
		}
		
		if(root.right!= null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		printTreeHelper(root.left);
		printTreeHelper(root.right);
		
	}
	
	public void printTree() {
		printTreeHelper(root);
	}
	
}
