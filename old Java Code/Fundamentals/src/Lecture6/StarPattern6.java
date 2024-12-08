package Lecture6;
import java.util.*;
public class StarPattern6 {

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
			int star = 1;
			while(star <= i) {
				System.out.print('*');
				star++;
			}
			int decstr = i-1;
			while(decstr>=1) {
				System.out.print('*');
				decstr--;
			}
			System.out.println();
			i++;
		}
	}

}
