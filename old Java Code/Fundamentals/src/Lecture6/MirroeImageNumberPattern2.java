package Lecture6;

import java.util.Scanner;

public class MirroeImageNumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while (i <= n) {
		
		int space = 1;
		while (space <= n-i) {
			System.out.print(' ');
			space++;
		}
		int col = 1;
		while(col<=i)
		{
			System.out.print(col);
			col++;
		}
		System.out.println();
		i++;
	}
	}

}
