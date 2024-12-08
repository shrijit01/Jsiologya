package Basic;

public class Fibonachii {
	
	/* ITERATIVE APPROCH */
	//Time Complexity: O(n) 
	//Auxiliary Space: O(1)
	public static int fib(int n) {

		int a = 0,b = 1,c;
		if(n == 0) {
			return a;
		}
		if(n == 1) {
			return b;
		}
		
		for(int i = 2;i<= n;i++) {
			
			/* printing all num between 1 to n*/
			System.out.println(a);
			
			c = a + b;
			a = b;
			b = c;
		}
		return b;
		
	}
	
	
	/* RECURSIVE APPROCH */
	//Time Complexity: O(2N)  
	//Auxiliary Space: O(1)
	public static int  fibonacciRec(int n) {
		/* EDGE CASE */
		
		/*
		 * 
		 * if(n == 0) return 0;
		 * if(n == 1) return 1;
		 * 
		*/
		
		if(n <= 1) return n;
		
		return fibonacciRec(n-1) + fibonacciRec(n-2);
		
	}
	
	public static void main(String []args) {
		int n = 9;
		
		/* For normal printing all num between 1 to n*/
		System.out.println(fib(n));
		
		/* For Rec printing all num between 1 to n*/
		//for (int i = 0; i < n; i++) {
			System.out.print(fibonacciRec(n) + " ");
		//}
	}

}
