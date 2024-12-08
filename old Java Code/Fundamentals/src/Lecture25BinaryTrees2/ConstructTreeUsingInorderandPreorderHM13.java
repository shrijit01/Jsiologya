package Lecture25BinaryTrees2;

public class ConstructTreeUsingInorderandPreorderHM13 {
	
//	private static BinaryTreeNode<Integer> buildRecursion(int[] preOrder, int ps, int pe, int[] inOrder, int is, int ie) {
//		if (ps > pe || is > ie) return null;
//		if (ps == pe) return new BinaryTreeNode<>(preOrder[ps]);
//
//		int rootVal = preOrder[ps];
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootVal);
//		int indexInInorder = index(inOrder, rootVal, is, ie);
//		int diff = indexInInorder - is;
//		int endOfPre = ps + diff;
//
//		root.left = buildRecursion(preOrder, ps + 1, endOfPre, inOrder, is, indexInInorder - 1);
//		root.right = buildRecursion(preOrder, endOfPre + 1, pe, inOrder, indexInInorder + 1, ie);
//		return root;
//	}
//
//	private static int index(int[] inOrder, int rootVal, int is, int ie) {
//		for (int i = is + 1; i <= ie; i++) if (inOrder[i] == rootVal) return i;
//		return is;
//	}
//	
//	
//	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
//		//Your code goes here
//		return buildRecursion(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
//		// BinaryTreeNode<Integer> root = buildTreeHelper(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
//		// return root;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Code 
	}

}
