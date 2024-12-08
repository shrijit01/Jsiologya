package Lecture6;
import java.util.*;

public class InvertedTriangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		
		int i = 1;
		while(i<=n)
		{
			int j = 1;
			while(j<=n-i+1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
