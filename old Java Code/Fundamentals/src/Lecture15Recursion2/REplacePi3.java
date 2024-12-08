package Lecture15Recursion2;

public class REplacePi3 {
	public static String replacePi(String s) {
		if(s.length() <= 1) {
			return s;
		}
		
		if(s.charAt(0) =='p'&& s.charAt(1)=='i') {
			String smallOutput = replacePi(s.substring(2));
			return "3.14"+smallOutput;
		}
		else {

			String smallOutput = replacePi(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "apipipiip";
		System.out.println(replacePi(s));

	}

}
