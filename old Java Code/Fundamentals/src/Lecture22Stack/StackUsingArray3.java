package Lecture22Stack;
//stack using array code 4 is written here 
public class StackUsingArray3 {
	
	
	private int data[];
	private int topIndex;	// index of the top most elem of the stack
	
	public StackUsingArray3() {
		data = new int[10];
		topIndex = -1;
	}
	
	
	public StackUsingArray3(int size) {
		data = new int[size];
		topIndex = -1;
	}
	
	
	public int size() {//TC -> O(1)
		return topIndex + 1;
	}
	
	public boolean isEmpty() {//TC -> O(1)
//		if(topIndex == -1) {
//			return true;
//		}else {
//			return false;
//		}
		return topIndex == -1;
	}
	
	
	//TC -> O(1)
	public void push(int elem) throws StackFullException {
//		if stack is full
		if(topIndex == data.length-1) {
			//Throw Exception
//			StackFullException e = new StackFullException
//			throw new StackFullException();
			doubleCapacity();
		}
		data[++topIndex] = elem;
	}
	
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * data.length];
		
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
		
	}


	//TC -> O(1)
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}

	
	//TC -> O(1)
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
		
	}

	
	
}