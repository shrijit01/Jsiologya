package Lecture20LinkedList;

import java.util.LinkedList;

//class LinkedListNode<T> {
//    T data;
//    LinkedListNode<T> next;
//    
//    public LinkedListNode(T data) {
//        this.data = data;
//    }
//}

	
public class LengthofLLHMOne12 {
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
//		System.out.println("n1->" + n1 +" data-> " + n1.data + " next-> " + n1.next);
		n2.next = n3;
//		System.out.println("n2-> " + n2 +" data-> " + n2.data + " next-> " + n2.next);
		n3.next = n4;
//		System.out.println("n3-> " + n3 +" data-> " + n3.data + " next-> " + n3.next);
//		System.out.println("n4-> " + n4 +" data-> " + n4.data + " next-> " + n4.next);
		return n1;
		
	}
	
	public static int length(Node<Integer> head){
		//Your code goes here
		int count = 0;
		while(head != null){
			count++;
			head= head.next;

		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head  = createLinkedList();
		System.out.println(length(head));
//		Node<Integer> head = cre
	}

}
