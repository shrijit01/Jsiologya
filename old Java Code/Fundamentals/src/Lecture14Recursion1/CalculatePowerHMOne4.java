package Lecture14Recursion1;

public class CalculatePowerHMOne4 {
	public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		
		// if(x == 0){
		// 	return 0;
		// }

		if (n==0){
			return 1;
		}
//		 int small = power(x,n-1);
//		 int op = n*small;
		return x * power(x, n - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(power(3,4)+" ");
	}

}
