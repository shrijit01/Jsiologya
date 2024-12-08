package Lecture22Stack;

import java.util.Stack;

public class ReverseStackHint13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,7,1,9};
		
		Stack<Integer> stack = new Stack();
		Stack<Integer> Helper = new Stack();
		
		for(int elem : arr) {
			stack.push(elem);
		}
		
		reverseStack(stack,Helper);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
	}

	private static void reverseStack(Stack<Integer> stack, Stack<Integer> helper) {
		
		
		
	}

}
