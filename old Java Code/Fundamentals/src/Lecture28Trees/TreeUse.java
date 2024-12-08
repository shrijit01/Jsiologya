package Lecture28Trees;

import java.util.Scanner;

import Lecture23Queue.QueueEmptyException;
import Lecture23Queue.QueueUsingLL6;

public class TreeUse {
	//Take input level Wise Lecture 9  ?+++++++++++++++something is wrong and missing+++++++++++++++++++++++++++++++++++++++++
	public static TreeNode<Integer> takeInput() throws QueueEmptyException{
		Scanner s = new Scanner(System.in);
		QueueUsingLL6<TreeNode<Integer>> pendingNodes  = new QueueUsingLL6<>();
		
		System.out.println("Enter the root data ");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter the number of children for : "+front.data);
			int numChild = s.nextInt();
			for (int i = 0; i < numChild; i++) {
				System.out.println("Enter the "+i+"th child data for "+front.data);
				int childData = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(childData);
				front.children.add(childNode);
				pendingNodes.enqueue(childNode);
				
				
			}
			
			
		}
		return root;
		
	}
	
	
	//print Find Number of Nodes Lecture 6 
	
	
	public static int numberOfNode(TreeNode<Integer>root) {
		int count = 1;
		
		for (int i = 0; i < root.children.size(); i++) {
			int childCount = numberOfNode(root.children.get(i));
			count += childCount;
		}
		return count;
	}
	
	
	
	//print Tree -1 Lecture 3 
	public static void printTree(TreeNode<Integer>root) {
		//this is apecial case not a base case
		if(root == null) {
			return;
		}
		//First print yourSelf bc prer order
		System.out.print(root.data +" ");
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
		
	}
	
	
	//print Tree -1 Lecture 4 
	public static void printTreeBetter(TreeNode<Integer>root) {
		//this is apecial case not a base case
		if(root == null) {
			return;
		}
		//First print yourSelf bc prer order
		System.out.print(root.data +": ");
		for (int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTreeBetter(child);
		}
		
		
	}
	
	
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(1);
//		TreeNode<Integer> node4 = new TreeNode<>(5);
//		TreeNode<Integer> node5 = new TreeNode<>(6);
//		
////		nodes are adding in the root array list
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		//children are adding in node 3 children arqy list
//		node2.children.add(node4);
//		node2.children.add(node5);
//		printTree(root);
		TreeNode<Integer> root = takeInput();
		printTreeBetter(root);
//		System.out.println("Number of Nodes are :"+numberOfNode(root));
	}

}
