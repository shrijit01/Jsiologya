package Infy;

import java.util.Scanner;

public class infypratice {
	
/*	factorial of n number  */
	/*
	static int factorial(int num) {
		if(num == 0) {
			return 1;
		}
		int res  = 1, i;
		
		for(i = 2;i <= num;i++) {
			res *= i;
		}
		
		return res;
	}
	
	//RECURSIVE
	static int factorialRec(int num) {
		if(num == 0) {
			return 1;
		}
		return num * factorialRec(num-1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		System.out.println(factorial(num)); //RECURSIVE
		System.out.println(factorialRec(num));
		
	}
	*/
	
	
	/*PRIME NUMBER*/
	/**/
	/* public static void main(String[] args) {
		int n = 1483;
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				cnt++;
				
			}
		}
		
		if(cnt == 2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not a Prime");
		}
	} */

}
