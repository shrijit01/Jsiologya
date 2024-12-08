package Lecture8;

public class WritingMoreFunction3 {
	public static double add(int a ,int b,double c) {
		double ans = a + b + c;
		return ans;
	}
//	all even between 1 to hundred+++++++++++++++
	public static void evenNumber() {
		for(int i = 2;i<=100;i+=2) {
			System.out.println(i);
		}
	}
	
//	start to end even number 
	
	public static void starttiEndEven(int s ,int e) {
		if(s%2 != 0) {
			s++;
		}
		for(int i = s;i<=e;i+=2) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		starttiEndEven(3,20);
//		all even between 1 to hundred+++++++
//		evenNumber();
		
		
		
		
		
		
		
		
		
//		==============================
//		int a = 10,b=16;
//		
////		sum(a,b,10.5);
//		double res = add(a,b,10.5);
//		
//		System.out.println(res);
	}

}
