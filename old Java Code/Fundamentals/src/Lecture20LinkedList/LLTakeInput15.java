package Lecture20LinkedList;

import java.util.Scanner;

public class LLTakeInput15 {
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);//data
		int data = s.nextInt();//
		Node<Integer>head = null;
		while(data != -1) {
			Node<Integer>currentNode = new Node<Integer>(data);
//			
			if(head == null) {
				head = currentNode;
			}else {
				Node<Integer>tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				tail.next = currentNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
//		System.out.println("print "+head);
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		System.out.println();
		// this is not work bcz head is null
//		while(head != null) {
//			System.out.println(head.data);
//			head = head.next;
//		}
		
//		System.out.println(head.data);
//		System.out.println(head.next);
//		System.out.println(head.next.data);
//		System.out.println(head.next.next.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		print(head);
	}

}
