package Lecture6;
import java.util.Scanner;
public class IsoscelesTriangle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		
		int i = 1;
		while(i<=n)
		{
			int space = 1;
			while(space <= n-i)
			{
				System.out.print("-");
				space++;
			}
			int num = 1;
			while(num <= i) {
				System.out.print(num);
				num++;
			}
			int dec = i-1;
			while(dec>=1) {
				System.out.print(dec);
				dec--;
			}
			System.out.println();
			i++;
		}
	}

}
