package Lecture5;

import java.util.Scanner;

public class AlphaPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int  n= c.nextInt();
		int i =1;
		char jc = (char)('A');
		while(i<=n)
		{
			int j = 1;
			while(j<=i)
			{
				System.out.print(jc);
				j+=1;
			}
			jc += 1;
			System.out.println();
			i +=1;
		}
	}

}
