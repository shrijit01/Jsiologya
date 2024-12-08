package Lecture22Stack;

//import Node;
//Stack using ll 7 lecture 
//IMplimenting Stack using ll 8 lecture 
public class StackUsingLL7<T> {

	
	private Node<T> head;
	private  int size;
	
	public StackUsingLL7() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	
	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public T top() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		return  head.data;
	}
	
	public T pop() throws StackEmptyException {
		if(head == null) {
			throw new StackEmptyException();
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
}
