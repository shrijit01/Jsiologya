package Lecture14Recursion1;

public class PrintFirstnNaturalNumberHMThree7 {
	public static void print(int n){
		//Write your code here
		if(n == 0)
			{
				return;
			}
	
		print(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
	}

}
