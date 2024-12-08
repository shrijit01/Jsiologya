package Lecture18WritingCodeUsingInhe;

public class ExceptionHandling10 {
	
//	public static int fact(int n) {
//		
//	}
	
	public static int divide(int a,int b)throws   DevideByZeroException10{
		if(b==0) {
			throw new DevideByZeroException10();
//			throw new ArithmeticException();
		}
		return a/b;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
//		String s  = null;
//		System.out.println(s.length());
//		System.out.println(4/0);
//		System.out.println("Main");
		try {
			divide(10, 5);
			System.out.println("With in try");
		} catch (DevideByZeroException10 e) {
			// TODO Auto-generated catch block
			System.out.println("DevideByZeroException ");
//			e.printStackTrace();
		}
		System.out.println("Main");
	}

}
