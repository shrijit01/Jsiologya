package Lecture8;
import java.util.*;
public class WhatandWhyofFunction2 {
	
	public static int facto(int num) {
		int fact =1;
		for(int i = 1;i<=num;i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int r = c.nextInt();
		
		int factN = facto(n);
		int factR = facto(r);
		int factNR = facto(n-r);
		//repitative
		//radability
		//testibility
		
		int res = factN/(factR*factNR) ;
		System.out.println(res);
		
		
		
	}

}
