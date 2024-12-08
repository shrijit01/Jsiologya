package Lecture18WritingCodeUsingInhe;

public class ExceptionHandlingTwo11 {

	public static int fact(int n) throws NegativeNumberException {
		if(n<0) {
			throw new NegativeNumberException();
		}
		int ans = 1;
		for (int i = 2; i <= n; i++) {
			ans *= i;
		}
		return ans;
	}
	
	public static int divide(int a,int b)throws   DevideByZeroException10{
		if(b==0) {
			throw new DevideByZeroException10();
//			throw new ArithmeticException();
		}
		return a/b;
	}
	
	public static void main(String[] args){
		try {
			divide(10, 5);
			System.out.println("With in try");
			System.out.println(fact(-2));
		} catch (DevideByZeroException10 e) {
			System.out.println("DevideByZeroException ");
//			e.printStackTrace();
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			System.out.println("NegativeNumberException ");
//			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Generic Exception ");
		}
		System.out.println("Main");
	}

}
