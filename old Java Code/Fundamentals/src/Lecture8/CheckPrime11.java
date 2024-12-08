package Lecture8;
import java.util.*;
public class CheckPrime11 {
	public static boolean checkPrime(int n) {
		int div = 2;
		while(div<=n/2) {
			if(n%div == 0) {
				return false;
			}
			div += 1;
		}
		return true;
	}
	
	public static boolean checkPrime2(int n) {
		int div = 2;
		boolean isPrime = true;
		while(div<=n/2) {
			if(n%div == 0) {
				isPrime = false;
				break;
//				return false;
			}
			div += 1;
		}
//		return true;
//		if(isPrime) {
//			return true;
//		}else {
//			return false;
//		}
		return isPrime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n =  c.nextInt();
		boolean isPrime = checkPrime2(n);
		System.out.println(isPrime);
	}

}
