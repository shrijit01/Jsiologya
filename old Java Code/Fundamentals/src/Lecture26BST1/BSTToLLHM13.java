package Lecture26BST1;

public class BSTToLLHM13 {
	
//	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
//		if (root == null)
//			return root;
//		// Or if it is a leaf node
//		if (root.left == null && root.right == null)
//			return root;
//		// If root.left children exists then we have to make
//		// it node.right (where node is root)
//		if (root.left != null) {
//			// Move left recursively
//			constructLinkedList(root.left);
//			// Store the node.right in Node named tempNode
//			BinaryTreeNode<Integer> tempNode = root.right;
//			root.right = root.left;
//			root.left = null;
//			// Find the position to insert the stored value
//			BinaryTreeNode<Integer> curr = root.right;
//			while (curr.right != null)
//				curr = curr.right;
//			// Insert the stored value
//			curr.right = tempNode;
//		}
//		// Now call the same function for node.right
//		constructLinkedList(root.right);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
