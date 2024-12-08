package Lecture6;
import java.util.Scanner;
public class ParllelogramPatternHM10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		       for(int i=1; i<=n; i++)
		        {
		             for(int k=1; k<=i-1; k++)
		             {
		             System.out.print(" ");
		             }

		             for(int j=1; j<=n; j++)
		             {
		             System.out.print("*");
		              }
		          System.out.println();
		      }
		    
	}

}
