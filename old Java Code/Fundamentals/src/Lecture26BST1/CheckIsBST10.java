package Lecture26BST1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lecture24Trees1.BinaryTreeNode3;
import Lecture25BinaryTrees2.BuildTreeUsingInorderAndPreOrder12;

public class CheckIsBST10 {

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



	//isBSt++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public static int minimum(BinaryTreeNode3<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}

		int lefMin = minimum(root.left);
		int rightMin = minimum(root.right);

		return Math.min(root.data, Math.min(lefMin, rightMin));
	}

	public static int maximum(BinaryTreeNode3<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}

		int leftMax = maximum(root.left);
		int rightMax = maximum(root.right);

		return Math.max(root.data,Math.max(leftMax, rightMax));
	}


	public static boolean isBST(BinaryTreeNode3<Integer> root) {
		if(root == null) {
			return true;
		}

		int leftMax = maximum(root.left);
		if(leftMax >= root.data) {
			return false;
		}


		int rightMin = minimum(root.right);
		if(rightMin < root.data) {
			return false;
		}


		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);

		return isLeftBST && isRightBST;

	}
	
	
	private static BinaryTreeNode3<Integer> buildRecursion(int[] preOrder, int ps, int pe, int[] inOrder, int is, int ie) {
		if (ps > pe || is > ie) return null;
		if (ps == pe) return new BinaryTreeNode3<>(preOrder[ps]);

		int rootVal = preOrder[ps];
		BinaryTreeNode3<Integer> root = new BinaryTreeNode3<>(rootVal);
		int indexInInorder = index(inOrder, rootVal, is, ie);
		int diff = indexInInorder - is;
		int endOfPre = ps + diff;

		root.left = buildRecursion(preOrder, ps + 1, endOfPre, inOrder, is, indexInInorder - 1);
		root.right = buildRecursion(preOrder, endOfPre + 1, pe, inOrder, indexInInorder + 1, ie);
		return root;
	}

	private static int index(int[] inOrder, int rootVal, int is, int ie) {
		for (int i = is + 1; i <= ie; i++) if (inOrder[i] == rootVal) return i;
		return is;
	}
	
	
	public static BinaryTreeNode3<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		return buildRecursion(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
		// BinaryTreeNode<Integer> root = buildTreeHelper(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
		// return root;
	}




	public static void main(String[] args) {
		
//		ISBSTReturn+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		int [] in = {1,2,3,4,5,6,7};
		int [] pre = {4,2,1,3,6,5,7};
		BinaryTreeNode3<Integer> root = buildTree(pre,in);
		printTreeDetailed(root);
//		System.out.print(root,30);
		System.out.println(isBST(root));
		
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//		BinaryTreeNode3<Integer> root = takeTreeInputBetter(true,0,true);
		//		printTreeDetailed(root);
		//		
		//		System.out.println("Num of Nodes : " + numOfNodes(root));
		//		
		//		System.out.println("Largest " + largest(root));
		//		System.out.println("Num Leaves :"+numLeaves(root));
		//		System.out.println("Print At Depth K :");
		//		printAtDepthK(root,2);
		//		
		//		System.out.println("Diameter :" + Diameter(root));
		//		
		//		//		BinaryTreeNode3<Integer> root = takeTreeInput();
		//		//		printTreeDetailed(root);
		//
		//		//		BinaryTreeNode3<Integer> root = new BinaryTreeNode3<>(1);
		//		//		
		//		//		BinaryTreeNode3<Integer> rootleft = new BinaryTreeNode3<>(2);
		//		//		BinaryTreeNode3<Integer> rootright = new BinaryTreeNode3<>(3);
		//		//		root.left = rootleft;
		//		//		root.right = rootright;
		//		////		printTree(root);
		//		//		
		//		//		BinaryTreeNode3<Integer> tworight = new BinaryTreeNode3<>(4);
		//		//		BinaryTreeNode3<Integer> threeleft = new BinaryTreeNode3<>(5);
		//		//		rootleft.right = tworight;
		//		//		rootright.left = threeleft;
		//		//		printTreeDetailed(root);
		//		//		System.out.println(root.data);

	}

}
