package Lecture6;

import java.util.Scanner;

public class InvertedHumberPatternHM4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		
		int i = n;
		while(i>=1)
		{
			int j = i;
			while(j>=1)
			{
				System.out.print(i);
				j--;
			}
			System.out.println();
			i--;
		}
	}

}
