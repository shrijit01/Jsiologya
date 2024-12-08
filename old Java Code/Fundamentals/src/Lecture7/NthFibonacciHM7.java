package Lecture7;

public class NthFibonacciHM7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int fib,num1 = 0,num2 =1 ;
		for(int i = 0; i<n;i++) {
			fib =  num1 +  num2;
			num1 = num2;
			num2 = fib;
		}
		System.out.println(num1);
	}

}
