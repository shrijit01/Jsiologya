package Fundamentals;

import java.util.*;

public class SumOfnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;//next number to be added
		int sum = 0;
		while(i<=n) 
		{
			sum = sum + i;
			i = i+1;
		}
		System.out.println("Sum of Natural number is "+sum);
	}

}
