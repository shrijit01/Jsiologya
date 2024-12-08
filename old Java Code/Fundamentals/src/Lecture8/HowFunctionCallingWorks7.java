package Lecture8;

public class HowFunctionCallingWorks7 {
//	public static int Add(int a,int b) {
//		int res = a+b;
//		return res;
//	}
	public static void func2()
	{
	    System.out.print("#");
	}
	public static void func1()
	{
	    System.out.print("*");
	    func2();
	}
	public static void main (String[] args) {
	    func2();
	    func1();
	}
//	public static void b() {
//		System.out.println("inside b");
//	}
//	public static void a() {
//		b();
//		System.out.println("inside a");
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		a();
//		System.out.println("inside Main");
//		
//		
//		
//		
////		int res = Add(10,50);
////		System.out.println(res);
//	}

}
