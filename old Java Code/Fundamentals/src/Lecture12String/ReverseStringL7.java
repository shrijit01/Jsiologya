package Lecture12String;

public class ReverseStringL7 {
	public static String reverseString(String str) {
		String reverString ="";
//		for (int i = str.length()-1; i >=0; i--) {
//			reverString += str.charAt(i);
//		}
		for (int i = 0; i < str.length(); i++) {
			reverString = str.charAt(i) + reverString;
		}
		return reverString;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcde";
		String res = reverseString(str);
		System.out.println(res);
	}

}
