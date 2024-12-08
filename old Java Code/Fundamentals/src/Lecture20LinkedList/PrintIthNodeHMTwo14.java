package Lecture20LinkedList;

public class PrintIthNodeHMTwo14 {
	
	public static void printIthNode(Node<Integer> head, int i){
		//Your code goes here
		Node<Integer> curr = head;
		int count = 0;

		while(curr != null){
			if(count == i ){
				System.out.print(curr.data);
				break;
			}
			curr = curr.next;
			count++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
