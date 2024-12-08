package Lecture20LinkedList;

public class AppaendLastNToFirstHM23 {
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		if(head == null || n == 0){
			return head;
		}
		Node<Integer> temp = head;
		int len = 0;

		while(temp != null){
			len++;
			temp = temp.next;
		}

		Node<Integer> tail = head;

		int i = 1;

		while(i<len-n){
			tail = tail.next;
			i++;
		}

		Node<Integer> newHead = tail.next;
		tail.next = null;
		tail = newHead;
		i = 1;

		while(i<n){
			tail = tail.next;
			i++;
		}
		tail.next = head;
		return newHead;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
