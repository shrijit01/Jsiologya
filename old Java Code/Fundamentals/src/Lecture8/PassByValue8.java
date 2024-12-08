package Lecture8;
import java.util.*;
public class PassByValue8 {
//	public static void incr(int n) {
//		n++;
//	}
//	predict the output +++++++++++++++++
	public static void c(int n) {
		System.out.println("incide c "+ n);
		n++;
	}
	
	public static void b(int n) {
		c(n);
		System.out.println("incide b "+ n);
		n++;
	}
	
	public static void a(int n) {
		b(n);
		System.out.println("incide a "+ n);
		n++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		a(n);
		System.out.println("insidew main "+ n);
	}

}
