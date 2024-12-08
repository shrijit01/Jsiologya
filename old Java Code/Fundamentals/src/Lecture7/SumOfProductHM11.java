package Lecture7;
import java.util.*;
public class SumOfProductHM11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int ch = c.nextInt();
		int sum = 0,prod = 1;
			if(ch == 1) {
				for(int i = 1;i<=n;i++) {
					sum += i;
				}
				System.out.println(sum);
			}
			else if(ch == 2) {
				for(int i = 1;i<=n;i++) {
					prod *= i;
				}
				System.out.println(prod);
			}
			else {
				System.out.print("-1");
			}
	}

}
