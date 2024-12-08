package Lecture16TimeSpaceComplexityAnalysis;

public class MCQ3WhatIsTimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int multiplyRec(int m, int n){
//		    if(n == 1)
//		        return m;
//		    return m + multiplyRec(m,  n - 1);  
//		}
		
		//Answer 
//		O(n)

//		The function multiplyRec(int m, int n) takes in two integers m and n
//		as input. It then checks if n is equal to 1. If it is, it returns m, 
//		otherwise it makes a recursive call to itself with the input m and n-1.
//
//		Each time the function is called recursively, it performs a constant
//		amount of work, which is the addition of m and the return value of the 
//				recursive call. Since the function is called n times recursively,
//				the total amount of work done is n*m.
//
//		Therefore, the time complexity of this function is O(n) because the amount
//		of work done is directly proportional to the input size n. As n increases, 
//		the amount of work done also increases in a linear fashion.
	}

}
