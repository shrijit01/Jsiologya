package Lecture21LL2;

import java.util.Scanner;

import Lecture20LinkedList.Node;

public class SolutionInsertRecursive3 {
	
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
	
	public static Node<Integer> insertRec(Node<Integer> head,int elem,int pos){
		if(head == null && pos > 0) {
			return head;
		}
		
		if(pos == 0) {
			Node<Integer> newNode = new Node<Integer>(elem);
			newNode.next = head;
			return newNode;
		}else {
			head.next = insertRec(head.next,elem,pos-1);
			return head;
		}
	}
	
	
	
//	public static Node<Integer> takeInput(){
//		Scanner s = new Scanner(System.in);
//		int data = s.nextInt();
//		Node<Integer>head = null,tail = null;
//		while(data != -1) {
//			Node<Integer>currentNode = new Node<Integer>(data);
//			if(head != null) {
// 				head = currentNode;
//				tail = currentNode;
//			}else {
//				tail.next = currentNode;
//				tail= currentNode;
//			}
//			data = s.nextInt();
//		}
//		return head;
//	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = insertRec(head, 20, 0);
	}

}
