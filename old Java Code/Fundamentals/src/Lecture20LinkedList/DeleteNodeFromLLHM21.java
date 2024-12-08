package Lecture20LinkedList;

public class DeleteNodeFromLLHM21 {
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		// Write your code here.
		if(head == null){
			return null;
		}

		if(pos == 0){
			Node<Integer> prev = head;
			prev = prev.next;
			return prev;
		}
		int count = 0;
		Node<Integer> prev = head;
		while(count < pos -1 && prev.next != null){
			count++;
			prev = prev.next;
		}

		if(prev.next != null){
			prev.next = prev.next.next;
		}
		return head;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
