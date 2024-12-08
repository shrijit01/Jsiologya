package Lecture23Queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueHM12 {
	
	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
		Stack<Integer> stack = new Stack<>();

		while(!input.isEmpty()){
			stack.push(input.peek());
			input.remove();
		}

		while(!stack.isEmpty()){
			input.add(stack.peek());
			stack.pop();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
