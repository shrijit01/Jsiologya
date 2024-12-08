package Lecture8;

import java.util.Scanner;

public class ScopeOfVariables10 {
	public static int facto(int num) {
		int fact =1;
		for(int i = 1;i<=num;i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static int  ncr(int n,int r) {
		int factN = facto(n);
		int factR = facto(r);
		int factNR = facto(n-r);
		int res = factN/(factR*factNR) ;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 10;
//		for(int i = 1;i<=n;i++) {
//			int j = 2;
//			System.out.println(i+j);
//		}
//		System.out.println(j);//this var can not be access outside of the scope
		
//		analysing the code+++++++++++++++++++++
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int r = c.nextInt();
		
		//repitative
		//radability
		//testibility
		
		int f = facto(5);
		int nc = ncr(5,2);
		
		System.out.println(f +" "+nc);
	}

}
