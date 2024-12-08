package Lecture25BinaryTrees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lecture24Trees1.BinaryTreeNode3;

public class DiameterOfBinaryTreeHMTwo8 {
	
	public static BinaryTreeNode3<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data :");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of :"+ parentData);
			}else {
				System.out.println("Enter Right child of :"+ parentData);
			}
		}

		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();

		if(rootData == -1) {
			return null;
		}

		BinaryTreeNode3<Integer> root =  new BinaryTreeNode3<Integer>(rootData);
		BinaryTreeNode3<Integer> leftChild = takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode3<Integer> rightChild = takeTreeInputBetter(false,rootData,true);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//Input of binary Tree Lecture 6
	public static BinaryTreeNode3<Integer> takeTreeInput(){
		System.out.println("Enter root data :");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();

		if(rootData == -1) {
			return null;
		}

		BinaryTreeNode3<Integer> root =  new BinaryTreeNode3<Integer>(rootData);
		BinaryTreeNode3<Integer> leftChild = takeTreeInput();
		BinaryTreeNode3<Integer> rightChild = takeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}

	public static void printTreeDetailed(BinaryTreeNode3<Integer> root ) {
		if(root == null) {
			return;
		}

		System.out.print(root.data + ":");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);	
		//		if(root.left != null) {
		//			printTree(root.left);			
		//		}
		//		if(root.right != null) {
		//			printTree(root.right);			
		//		}
	}

	public static void printTree(BinaryTreeNode3<Integer> root ) {
		if(root == null) {
			return;
		}

		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);	
		//		if(root.left != null) {
		//			printTree(root.left);			
		//		}
		//		if(root.right != null) {
		//			printTree(root.right);			
		//		}
	}
	
	
	public static int numOfNodes(BinaryTreeNode3<Integer> root) {
		if(root ==  null) {
			return 0;
		}
		
		int leftNodeCount = numOfNodes(root.left);
		int rightNodeCount = numOfNodes(root.right);
		
		return 1 + leftNodeCount + rightNodeCount;
	}
	
	// Root with largest data lecture 14
	public static int largest(BinaryTreeNode3<Integer> root) {
		if(root == null) {
			return -1;
		}
		
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		
		return Math.max(root.data,Math.max(largestLeft, largestRight));
	}
	
	
	//Lecture 18
	public static int numLeaves(BinaryTreeNode3<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		return numLeaves(root.left) + numLeaves(root.right);
	}
	
	//print Node at Depth k Lecture 19
	public static void printAtDepthK(BinaryTreeNode3<Integer> root,int k) {
		if(root == null) {
			return;
		}
		
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
		
	}
	
	
	//Level Wise Input Binary Tree lecture 7
	
	public static BinaryTreeNode3<Integer> takeInputLevelWise(BinaryTreeNode3<Integer> root){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Rott :");
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode3<Integer> root = new BinaryTreeNode3<Integer>(rootData);
		Queue<BinaryTreeNode3<Integer>> pendingChildren = new LinkedList<BinaryTreeNode3<Integer>>();
		
		pendingChildren.add(root);
		
		while ( !pendingChildren.isEmpty()) {
			
			BinaryTreeNode3<Integer> front = pendingChildren.poll();
			System.out.println("Enter Left Child of : " + front.data);
			
			int left = s.nextInt();
			
			if(left != -1) {
				BinaryTreeNode3<Integer> leftChild = new BinaryTreeNode3<Integer>(left);
				front.left =  leftChild;
				pendingChildren.add(leftChild);
			}
			
			System.out.println("Enter right Child of : " + front.data);
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode3<Integer> rightChild = new BinaryTreeNode3<Integer>(right);
				front.right =  rightChild;
				pendingChildren.add(rightChild);
			}
			
		}
		return root;
	}
	
	//Lecture 8 problem
	
	public static int Diameter(BinaryTreeNode3<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int option1 = height(root.left) + height(root.right);
		int option2 = Diameter(root.left);
		int option3 = Diameter(root.right);
		
		return Math.max(option1,Math.max(option2, option3));
		
	}
	

	public static int height(BinaryTreeNode3<Integer> root) {
		if(root == null) {
			return 0;			
		}
		
		int lh = height(root.left);
		int rh = height(root.right);
		return 1 + Math.max(lh, rh);
	}
	
	
	
	public static void main(String[] args) {

		BinaryTreeNode3<Integer> root = takeTreeInputBetter(true,0,true);
		printTreeDetailed(root);
		
		System.out.println("Num of Nodes : " + numOfNodes(root));
		
		System.out.println("Largest " + largest(root));
		System.out.println("Num Leaves :"+numLeaves(root));
		System.out.println("Print At Depth K :");
		printAtDepthK(root,2);
		
		System.out.println("Diameter :" + Diameter(root));
		
		//		BinaryTreeNode3<Integer> root = takeTreeInput();
		//		printTreeDetailed(root);

		//		BinaryTreeNode3<Integer> root = new BinaryTreeNode3<>(1);
		//		
		//		BinaryTreeNode3<Integer> rootleft = new BinaryTreeNode3<>(2);
		//		BinaryTreeNode3<Integer> rootright = new BinaryTreeNode3<>(3);
		//		root.left = rootleft;
		//		root.right = rootright;
		////		printTree(root);
		//		
		//		BinaryTreeNode3<Integer> tworight = new BinaryTreeNode3<>(4);
		//		BinaryTreeNode3<Integer> threeleft = new BinaryTreeNode3<>(5);
		//		rootleft.right = tworight;
		//		rootright.left = threeleft;
		//		printTreeDetailed(root);
		//		System.out.println(root.data);

	}

}
