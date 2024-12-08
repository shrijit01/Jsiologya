package Basic;

import java.util.Scanner;

public class PrimeNumber {

		
		/* PRIME NUMBER */
	/* SIMPLE APPROCH */
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		
		for(int i = 2; i < n ;i++) {
			if(n % i == 0) {
				return false;
			}

		}
		return true;
	}
	
	
	/* IMPROVED APPROCH 
	public static boolean isPrime(int n) {
		if (n <= 1)
            return false;
  
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
  
        return true;
	}
	*/
	/* OPTIMIZED  TC => Root n
	 * 
	public static boolean isPrime(int n) {
		if (n <= 1)
            return false;
  
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
  		}
        return true;
	}
	*/
	
	/* Prime numbers between 1 to n: */
	 public static boolean  printPrimeTrial(int num ) {
		if (num <= 1) {
            return false;
        }
		
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
  		}
        return true;
	}
	
	
	/*  "Trial Division" */
	/*public static int  printPrime(int num ) {
		if (num <= 1) {
            return 0;
        }
		
        for (int i = 2; i*i <= num; i++){
            if (num % i == 0){
                return 0;
            }
  		}
        return 1;
	}*/
	
	public static void main(String[] args) {
			try (Scanner s = new Scanner(System.in)) {
				System.out.print("Enter the value of n: ");
				
				int n = s.nextInt();
				if(isPrime(n)) {
					System.out.println("Yes");
				}else {
					System.err.println("No");
				}
			}catch (Exception e) {
				System.err.println(e);
			}
			
			//for checking is prime between 1 to n
			 int n = 17;
			 System.out.println("Prime numbers between 1 and " + n + ":");
			for (int i = 2; i <= n; i++) {
			    if (printPrimeTrial(i)) {
			        System.out.print(i + " ");
			    }
			}

	}
	
}
