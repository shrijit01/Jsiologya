package Lecture5;
import java.util.*;
import java.util.Scanner;

public class Alltestings {

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
//		+++++++++++++++++++++++
//		1
//		21
//		321
//		4321
//		int i =1;
//		while(i<=n)
//		{
//			int j = 1;
//			while(j<=i)
//			{
//				System.out.print(i+1-j+" ");
//				j+=1;
//			}
//			System.out.println();
//			i +=1;
//		}
	}

}
