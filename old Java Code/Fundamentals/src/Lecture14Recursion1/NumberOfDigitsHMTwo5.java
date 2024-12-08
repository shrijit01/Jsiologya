package Lecture14Recursion1;

public class NumberOfDigitsHMTwo5 {
	public static int count(int n){
		//Write your code here
		if(n == 0){
      		return 0;
    	}
    	return   1 + count(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123;
		int res = count(a);
		System.out.println(res);
	}

}
