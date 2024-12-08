package Lecture21LL2;

import Lecture20LinkedList.Node;

public class DeleteNodeRecursivlyHM25 {
	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    	//Your code goes here
        if(head == null){
            return head;
        }
        if(pos == 0){
            return head.next;
        }

        // while(head != null){
            head.next = deleteNodeRec(head.next,pos-1);
           
        // }
        return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
