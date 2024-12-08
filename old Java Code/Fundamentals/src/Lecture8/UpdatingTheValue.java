package Lecture8;

public class UpdatingTheValue {
	public static int Add(int a,int b) {
		int res = a+b;
		return res;
	}
	//for updating the value collect it on an res varibale
	public static int  incr(int n) {
		n++;
		System.out.println("Increment "+n);
		return n;//
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		n = incr(n);
		System.out.println("Main "+n);
	}

}
