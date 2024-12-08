package Basic;

public class Factorial {
	
	/* ITERATIVE APP */
	//Time Complexity: O(n)
	//Auxiliary Space: O(1)
	public static int fact(int n) {
		/*/
		* 
		*	if( n == 0) {
		*		return 1;
		*	}
		*
		*/
		
		int res = 1,i;
		for( i = 2; i <= n ; i++) {
			res *= i;
		}
		return res;
		
	}
	
	/* Recursive Approch */
	//Time Complexity: O(n)
	//Auxiliary Space: O(1)
	
	public static int fibRec(int n) {
		
		if(n == 0) return 1;
		
		return n * fibRec(n-1);
	}
	
	public static void main(String[] args) {
		// FOR NORMAL 
		int res = fact(5);
		System.out.println(res);
		
		
		/* FOR RECURSIVE */
		int res2 = fibRec(6);
		System.out.println(res2);
	}
	
}
