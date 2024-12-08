package Lecture27BST2;

public class PairSUmINBSTHM13 {
	
//	public static Map<BinaryTreeNode<Integer>, Boolean> map = new HashMap<BinaryTreeNode<Integer>, Boolean>();
//	public static boolean dfs(BinaryTreeNode<Integer> root, int s, BinaryTreeNode<Integer> temp) {
//        if(root == null) {
//            return false;
//        }
//        
//        if(root.data == s && root != temp && !  map.containsKey(temp)) {
//            map.put(root, true);
//            return true;
//        }
//        
//        if(s < root.data) {
//            return dfs(root.left, s, temp);
//        }
//        else{
//            return dfs(root.right, s, temp);
//        } 
//        
//    }
//    public static void helper(BinaryTreeNode<Integer> root, int s, BinaryTreeNode<Integer> OrigenaRroot) {
//    	if(root == null) {
//            return;
//        }
//        
//        if(dfs(OrigenaRroot, s-root.data, root)) {
//            int max = Math.max(root.data, s-root.data);
//            int min = Math.min(root.data, s-root.data);
//            System.out.println(min + " " + max);
//            map.put(root, true);
//        }
//        
//        helper(root.left, s, OrigenaRroot);
//        helper(root.right, s, OrigenaRroot);
//	}
//	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
//		// Write your code here
//        helper(root, s, root);
//    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.....
	}

}
