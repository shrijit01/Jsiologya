package Lecture8;

public class FunctionWithVoidReturnType4 {
	public static int divideNum(int num,int deno) {
		if(deno == 0) {
			return Integer.MIN_VALUE;
		}
		return num/deno;
	}
	
	public static void printdivideNumResult(int num,int deno) {
		if(deno == 0) {
//			return ;
			System.out.println("Division by Zero is not Allowed");
		}
		System.out.println(num/deno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =8;
		int deno = 4;
		printdivideNumResult(num,deno);
//		int res = divideNum(num, deno);
//		System.out.println(res);
	}

}
