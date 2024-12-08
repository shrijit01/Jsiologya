package AssignmentRecursion;

public class CheckPalindromeRecursive2 {
	
	public static boolean isStringPalindromeHelper(String str,int s,int e) {
		// Base case : this condition is added to stop
		//the recursion when the starting index 's' 
		// is greater than or equal to the ending index
		//'e' and return true, as we have reached the end of the string
		// or passed it.
		if(s >= e) {
			return true;
		}

		// If the characters at the starting index 's' and ending index 'e' are equal
		// Make a recursive call to the helper method, passing s+1 as the starting index and e-1 as the ending index
		if(str.charAt(s) == str.charAt(e)){
			return isStringPalindromeHelper(str,s+1,e-1);
		}else{
			// If the characters are not equal, return false, indicating that the input string is not a palindrome
			return false;
		}
	}

	public static boolean isStringPalindrome(String input) {
		// calling the helper method and passing the 
		//input string, starting index, and ending index
		return isStringPalindromeHelper(input,0,input.length()-1);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "malayalam";
		boolean res = isStringPalindrome(s);
		System.out.println(res);
	}

}
