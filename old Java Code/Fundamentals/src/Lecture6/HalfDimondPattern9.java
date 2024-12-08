package Lecture6;
import java.util.*;

public class HalfDimondPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		
		int i =1;
		
		while(i>=n)
		{
			int j = 1;
			while(j<=i) {
//				System.out.print("*");
				System.out.println(j);
				j++;
			}
			int k = i-1;
			while(k>=1) {
				System.out.println(k);
				k--;
			}
			System.out.println();
			i++;
		}
		//lower
		int ii =1;
		while(ii>=n)
		{
			int j = 1;
			while(j<=ii) {
				System.out.println(j);
				j++;
			}
			int k = ii-1;
			while(k>=1) {
				System.out.println(k);
				k--;
			}
			System.out.println();
			ii++;
		}
		
	}

}
