package Lecture27BST2;

public class LevelWiseLinkedListHM11 {
	
//	private static ArrayList<LinkedListNode<Integer>> arr = new ArrayList<LinkedListNode<Integer>>();
//	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
//		// Write your code here
//        if (root==null)
//            return null;
//        
//        Queue<BinaryTreeNode<Integer>> nodesToPrint = new LinkedList<BinaryTreeNode<Integer>>();
//        nodesToPrint.add(root);
//        nodesToPrint.add(null);
//        LinkedListNode<Integer> head = null,tail=null;
//        //arr.add(head);
//        while(!nodesToPrint.isEmpty())
//        {
//            BinaryTreeNode<Integer> front=nodesToPrint.poll();
//            if (front==null)
//            {
//                if (nodesToPrint.isEmpty())
//                    break;
//                else
//                {
//                    //System.out.println();
//                	nodesToPrint.add(null);
//                    tail.next=null;
//                    tail=tail.next;
//                    head=null;
//                    
//                }
//                
//            }
//            else
//            {
//                if (head==null)
//                {
//                    head = new LinkedListNode<Integer>(front.data);
//                    tail=head;
//                    arr.add(head);
//                }
//                else
//                {
//                    tail.next=new LinkedListNode<Integer>(front.data);
//                    tail=tail.next;
//                }
//                //System.out.print(front.data+" ");
//                if (front.left!=null)
//                    nodesToPrint.add(front.left);
//                if (front.right!=null)
//                    nodesToPrint.add(front.right);
//            }
//        }
//        return arr;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
