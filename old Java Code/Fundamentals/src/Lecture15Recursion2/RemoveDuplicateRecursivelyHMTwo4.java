package Lecture15Recursion2;

public class RemoveDuplicateRecursivelyHMTwo4 {
	
	public static String removeConsecutiveDuplicates(String s) {
		  // Base case: if the input string is empty or has only one character, return it
		  if (s.length() <= 1) {
		    return s;
		  }

		  // Recursive case: remove consecutive duplicates from the rest of the string
		  String smallOutput = removeConsecutiveDuplicates(s.substring(1));

		  // If the first two characters are the same, return the result of the recursive call
		  if (s.charAt(0) == s.charAt(1)) {
		    return smallOutput;
		  }
		  // Otherwise, return the first character concatenated with the result of the recursive call
		  else {
		    return s.charAt(0) + smallOutput;
		  }
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xxxyyyzwwzzz";
		System.out.println(removeConsecutiveDuplicates(s));
	}

}
