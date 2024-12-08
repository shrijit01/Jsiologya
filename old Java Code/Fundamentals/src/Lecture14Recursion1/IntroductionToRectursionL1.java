package Lecture14Recursion1;

public class IntroductionToRectursionL1 {
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		int smallOutput = fact(n-1);
		int op = n*smallOutput;
		return op;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

}
