package Array;

public class Multidivadd {
	int mul;
	double div;
	int add;
	
	Multidivadd(int m,double d, int a){
		mul = m;
		div = d;
		add = a;
	}

}

class Test{
	static Multidivadd getMultidivadd(int a, int b) {
		return new Multidivadd(a*b,(double)a/b,(a+b));
	}
	
	public static void main(String[]args) {
		Multidivadd ans = getMultidivadd(10,20);
		System.out.println("Mul ="+ ans.mul);
		System.out.println("Div ="+ ans.div);
		System.out.println("Add ="+ ans.add);
	}
}
