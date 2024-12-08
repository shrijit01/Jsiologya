package Lecture16TimeSpaceComplexityAnalysis;

public class MCQ7Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//understanding about complexity of fibonacci using recursion
		//worked is in rough
		
		
		//Explanation
		
//		The Fibonacci sequence is a series of numbers where each
//		number is the sum of the two preceding ones, usually 
//		starting with 0 and 1. There are several ways to implement
//		the Fibonacci sequence, but one common method is to use 
//		recursion.
//
//		When it comes to the space complexity of the Fibonacci
//		sequence, it is determined by the amount of extra memory 
//		used by the algorithm during its execution.
//
//		Identify the extra memory used: In a recursive implementation
//		of the Fibonacci sequence, a function call creates a new stack 
//		frame on the call stack. Each stack frame contains the 
//		information needed to return to the calling function, 
//				such as the return address and the values of local variables.
//
//		Determine the input size: The input size is the index of
//		the Fibonacci number that we want to find.
//
//		Analyze the algorithm: The algorithm makes recursive calls
//		to itself to calculate the Fibonacci number. Each recursive
//		call creates a new stack frame, and the number of stack frames 
//		depends on the input size. The number of stack frames
//		increases with each recursive call and it's equal to the
//		number of the Fibonacci number that we want to find. Therefore, 
//		the space complexity of the recursive implementation of the 
//		Fibonacci sequence is O(n) where n is the input size.
//
//		In this case, as the recursive calls are made, the call
//		stack keeps growing and each call stack frame contains the
//		information needed to return to the calling function, 
//				this makes the space complexity to be O(n). It
//				means that the space complexity is directly
//				proportional to the input size.
//
//		It's worth noting that, this is not the most efficient
//		way to calculate the Fibonacci numbers, as the time
//		complexity is exponential, O(2^n) and the space complexity is O(n) for the recursion.
//
//		There are other ways to calculate Fibonacci numbers 
//		with better time and space complexity, for example, 
//		using dynamic programming or iterative methods.
		
	}

}
