package Lecture6;

import java.util.Scanner;

public class TriangleOfNumbers7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		
		int i =1;
		while(i<=n) {
			int space =1;
			while(space <= n-i)
			{
				System.out.print(' ');
				space++;
			}
			int num = 1;
			
			while(num <= i)
			{
				
				System.out.print(i+num-1);
				num++;
			}
			int dec = i;
			while(dec > 1) {
				System.out.print(dec+i-2);
				dec--;
			}
			
			System.out.println();
			i++;
		}
	}

}
