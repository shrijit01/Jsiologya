package Basic;

import java.util.Scanner;

public class Palindrome {
	
	/******************* TO CHECK NUMBER PALINDROM *************************/
	public static boolean  palin(int n) {
		int originalNum = n;
		int rev = 0;
		//int count = 1;
		while(n > 0) {
			//count++;
			int digit = n%10;
			rev = rev * 10 + digit;
			n = n /10;
			
		}
		return originalNum == rev;
	}
	
	/******************* TO CHECK STRING PALINDROM *************************/
	/* TIME COMPLEXITY O(n) */
	/* Space ComplexityO(1) */
	
	public static boolean isStringPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }
	
	
	public static void main(String[] args) {
		try (/* PALINDROME NUMBER CHECK HERE */
		Scanner scanner = new Scanner(System.in)) {
			
			/* FOR NUMBER */
			System.out.print("Enter a number: ");
			int n = scanner.nextInt();

			if(palin(n)) {
				System.out.println("True");
			}else {
				System.err.println("False");
			}
			
			
			/* FOR STRING */
			/*System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        if (isStringPalindrome(input)) {
	            System.out.println("The input string is a palindrome.");
	        } else {
	            System.err.println("The input string is not a palindrome.");
	        }*/
		}
	}
	
	
}
