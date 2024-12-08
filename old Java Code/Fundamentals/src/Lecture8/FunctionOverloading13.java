package Lecture8;

public class FunctionOverloading13 {
	public static int sum(int a,int b) {
		int res = a+b;
		return res;
	}
	
	public static double sum(double a,double b) {
		double res = a+b;
		return res;
	}
	
	public static int sum(int a) {
		return a+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		System.out.println(sum(a));
		System.out.println(sum(a,b));
		System.out.println(sum(10.6,1.8));
	}

}
