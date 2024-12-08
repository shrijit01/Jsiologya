package Lecture21LL2;

import Lecture20LinkedList.Node;

public class MergeTwoSortedArraySolution16 {
//	//right code
//	public static Node<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
//        //Your code goes here
//        if(head1 == null){
//            return head2;
//        }
//
//        if (head2 == null) {
//            return head1;
//        }
//
//       
//
//        Node<Integer> t1 = head1,t2 = head2;
//        Node<Integer> head = null,tail = null;
//
//        if(t1.data <= t2.data){
//            head = t1;
//            tail = t1;
//            t1 = t1.next;
//        }else{
//            head = t2;
//            tail = t2;
//            t2 = t2.next;
//        }
//
//
//
//        while(t1 != null && t2 != null){
//            if(t1.data <=  t2.data){
//                tail.next = t1;
//                tail = t1;
//                t1 = t1.next;
//            }else{
//                tail.next = t2;
//                tail = t2;
//                t2 = t2.next;
//            }
//        }
//
//        if(t1 != null){
//            tail.next = t1;
//        }else{
//            tail.next = t2;
//        }
//        return head;
//    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Working on solution
	}

}
