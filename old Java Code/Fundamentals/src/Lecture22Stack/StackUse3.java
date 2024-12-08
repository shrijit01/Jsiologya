package Lecture22Stack;

public class StackUse3 {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		
//		StackUsingArray3 stack = new StackUsingArray3();
		StackUsingLL7<Integer> stack = new StackUsingLL7<>();
		int arr[] = {5,6,7,1,9};
		
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		
		System.out.println(stack);
		
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
//		stack.push(10);
//		System.out.println(stack.top());
//		stack.pop();
//		stack.size();
//		System.out.println(stack.isEmpty());
//		stack.isEmpty();
		
	}

}
