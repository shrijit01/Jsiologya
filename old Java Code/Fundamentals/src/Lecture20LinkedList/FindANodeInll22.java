package Lecture20LinkedList;

public class FindANodeInll22 {
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> curr = head;
		if(curr == null){
			return -1;
		}
		
		int count = 0;
		while(curr != null){
			if(curr.data == n){
				return count;
			}
				count++;
				curr = curr.next;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
