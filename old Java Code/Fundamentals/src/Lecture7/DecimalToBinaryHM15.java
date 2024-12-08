package Lecture7;

import java.util.Scanner;
import java.util.*;
public class DecimalToBinaryHM15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		
		int ans = 0,por = 1;
		
		while(n>0) {
			int pd = n%2;
			ans += pd*por;
			por *= 10;
			n/=2;
		}
		System.out.println(ans);
	}

}
