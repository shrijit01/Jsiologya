package Lecture7;

public class ReverseOfaNumber13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1980,rev = 0;
		
		while(n>0) {
			int ls = n%10;
			rev = rev*10+ls;
			n/=10;
		}
		System.out.println(rev);
		
	}

}
