package Lecture15Recursion2;

public class RemoveXHMOne2 {
	public static String removeX(String input) {
		if(input.length()==0) {
			return input;
		}
		
		if(input.charAt(0) == 'x') {
			return removeX(input.substring(1));
		}
		else {
			return input.charAt(0)+removeX(input.substring(1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xaxb";
		System.out.println(removeX(s));
	}

}
