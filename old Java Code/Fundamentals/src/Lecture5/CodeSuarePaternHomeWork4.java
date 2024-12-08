package Lecture5;
import java.util.*;
public class CodeSuarePaternHomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		completed task
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		while(row<=n)
		{
			int col =1;
			while(col<=n)
			{
				System.out.print(n);
				col = col+1;
			}
			System.out.println();
			row = row + 1;
		}
	}

}
