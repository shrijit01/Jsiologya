package Lecture21LL2;

import java.util.Scanner;

import Lecture20LinkedList.Node;

public class PrintRecursive1 {
	
	public static void printR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.println(head.data +" ");
		printR(head.next);
	}
//	
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
////				Node<Integer>tail = head;
////				while(tail.next != null) {
////					tail = tail.next;
////				}
//				tail.next = currentNode;
//				tail= currentNode;
//			}
//			data = s.nextInt();
//		}
//		return head;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Node<Integer> head = takeInput();
	}

}
