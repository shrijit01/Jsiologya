package Lecture25BinaryTrees2;

public class PrintNodeFromDistanceKFromNodeHM20 {
	
//	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
//	    //Your code goes here
//        print(root,node,k);
//        
//        
//	}
//    
//    private static int print(BinaryTreeNode<Integer> root, int node, int k)
//    {
//        //If tree is empty return -1
//        if (root==null)
//            return -1;
//        
//        int rootData=root.data;
//        if (rootData==node)
//        {
//            printNodesAtDistanceK(root, k);
//            return 0;
//        }
//        
//        int leftSubTreeDist=0,rightSubTreeDist=0;
//        
//        leftSubTreeDist=print(root.left,node,k);
//        if (leftSubTreeDist!=-1)
//        {
//            if(leftSubTreeDist+1==k)
//            {
//                System.out.println(rootData);
//            }
//            else
//            {
//                rightSubTreeDist=k-(leftSubTreeDist+1)-1;
//                printNodesAtDistanceK(root.right, rightSubTreeDist);
//            }
//            return leftSubTreeDist+1;
//        }
//        
//        rightSubTreeDist=print(root.right,node,k);
//        if (rightSubTreeDist!=-1)
//        {
//            if(rightSubTreeDist+1==k)
//            {
//                System.out.println(rootData);
//            }
//            else
//            {
//                leftSubTreeDist=k-(rightSubTreeDist+1)-1;
//                printNodesAtDistanceK(root.left, leftSubTreeDist);
//            }
//            return rightSubTreeDist+1;
//        }
//        return -1;
//    }
//    
//    private static void printNodesAtDistanceK(BinaryTreeNode<Integer> root, int k)
//    {
//        if (root==null || k<0)
//        	return;
//        
//        if (k == 0)  
//        { 
//            System.out.println(root.data); 
//            return; 
//        }
//        
//        printNodesAtDistanceK(root.left,k-1);
//        printNodesAtDistanceK(root.right,k-1);
//    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Code
	}

}
