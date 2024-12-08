package Lecture25BinaryTrees2;

public class ConstructTreeUsingInorderAndPreorderHM15 {
//	
//	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
//		//Your code goes here
//		int lengthI = inOrder.length;
//		int lengthP = postOrder.length;
//		if (lengthI == 0 || lengthP == 0 || lengthI != lengthP)
//			return null;
//		return buildTreeHelper(inOrder, 0, lengthI - 1, postOrder, 0, lengthP - 1);
//	}
//
//	public static BinaryTreeNode<Integer> buildTreeHelper(int[] inorder, int startI, int endI, int[] postorder, int startP, int endP) {
//		if (startI > endI || startP > endP)
//			return null;
//		BinaryTreeNode<Integer> parent = new BinaryTreeNode<Integer>(postorder[endP]);
//		int indxOrder = find(inorder, startI, endI, postorder[endP]);
//		int rest = endI - indxOrder;
//		BinaryTreeNode<Integer> left = buildTreeHelper(inorder, startI, indxOrder - 1, postorder, startP, endP - rest - 1);
//		BinaryTreeNode<Integer> right = buildTreeHelper(inorder, indxOrder + 1, endI, postorder, endP - rest, endP - 1);
//		parent.left = left;
//		parent.right = right;
//		return parent;
//	}
//
//	public static int find(int[] inorder, int start, int end, int target) {
//		for (int i = start; i <= end; i++) {
//			if (inorder[i] == target)
//				return i;
//		}
//		return -1;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
