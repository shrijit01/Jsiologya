package Lecture5;
import java.util.*;
import java.util.Scanner;

public class TriangularStarPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int  n= c.nextInt();
		
		int i =1;
		while(i<=n)
		{
			int j = 1;
			while(j<=i)
			{
				System.out.print('*');
				j+=1;
			}
			System.out.println();
			i +=1;
		}
	}

}
