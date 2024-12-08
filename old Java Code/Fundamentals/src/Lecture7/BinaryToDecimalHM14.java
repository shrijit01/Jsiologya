package Lecture7;
import java.util.*;
public class BinaryToDecimalHM14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		
		int ans = 0,por = 1;
		
		while(n>0) {
			int ls = n%10;
			ans += ls*por;
			por *= 2;
			n/=10;
		}
		System.out.println(ans);
	}

}
