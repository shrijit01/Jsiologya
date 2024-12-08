package Lecture16TimeSpaceComplexityAnalysis;

public class MCQ4WHatIsTimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question
		
//		int sumOfDigits(int n){
//	        int sum;
//	        if(n < 10){
//	            return n;
//	        }
//	        sum = (n % 10) + sumOfDigits(n / 10);
//	        return sum;
//	}
		//Explanation 1+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//		The function sumOfDigits(int n) takes in an integer n as input. It then 
//		checks if n is less than 10. If it is, it returns n as the sum of digits, 
//		otherwise it performs the following:
//
//			It initializes a variable sum
//			It calculates the last digit of n by taking the remainder when 
//			dividing n by 10 and assigns it to sum.
//			It makes a recursive call to the function sumOfDigits(n/10).
//			This call is made to calculate the sum of digits of the remaining
//			digits of n (all digits except the last digit).
//			It adds the return value of the recursive call to the last 
//					digit of n (which is stored in sum)
//			It returns the final sum
//			Let's take an example of n=123
//
//			On the first call, n=123 which is greater than 10, so it initializes sum = 123%10 = 3
//			It makes a recursive call to sumOfDigits(123/10) = sumOfDigits(12)
//			On the second call, n=12 which is greater than 10, so it initializes sum = 12%10 = 2
//			It makes a recursive call to sumOfDigits(12/10) = sumOfDigits(1)
//			On the third call, n=1 which is less than 10, so it returns n = 1
//			On the second call, it adds the return value 1 to 2 and assigns it to sum = 2+1 = 3
//			On the first call, it adds the return value 3 to 3 and assigns it to sum = 3+3 = 6
//			It returns the final sum = 6
//			
//			As you can see it is breaking down the input number into digits recursively
//			and adding them. The time complexity of this function is O(log(n)), where 
//			log(n) is the number of digits in n. Each recursive call reduces the input 
//			size by a factor of 10, and the function will make log(n) recursive calls in total.
		
		
		
		
		//Explanation2 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//		The time complexity of the function sumOfDigits(int n) is O(log(n)) because
//		each recursive call reduces the input size by a factor of 10.
//
//		The function takes an integer n as input and, in each iteration, it divides 
//		n by 10 and makes a recursive call to the function with the new value of n/10 as input.
//
//		Since the number of digits in n is log10(n), with each recursive call
//		the input size is reducing by a factor of 10, so the number of recursive 
//		calls will be log10(n).
//
//		For example, if n = 1234567, the function will make log10(1234567) = 6 
//		recursive calls. The first call will be with n = 1234567, second call 
//		with n = 123456, third call with n = 12345, and so on, the last call will be with n=1.
//
//		In each recursive call, the function performs a constant amount of work, 
//		which is the addition of the last digit of n and the return value of the 
//				recursive call. Since the function is called log10(n) times recursively, 
//				the total amount of work done is log10(n).
//
//		Therefore, the time complexity of this function is O(log(n)) 
//		because the amount of work done is directly proportional to the
//		number of digits in n. As n increases, the amount of work done 
//		increases logarithmically.
	}

}
