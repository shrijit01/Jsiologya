package corejava;

public class laddercatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int a[]= {1,2,3,4,5,6};
			System.out.println(a[7]);
		}	
	
	
	catch(ArithmeticException e) {
		System.out.println(e);
	
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		System.out.println("I am from ArrayIndex");
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("I am super class");
		}

	}

}
