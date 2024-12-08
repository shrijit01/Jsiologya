package Lecture12String;

public class StringSubStringFunction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="coding";
		String subStr = str.substring(6);

//		all str bETWEEN TWO INDEXES
		String subStr1 = str.substring(0, 6);
		
		System.out.println(subStr1);
		
		
		
//		System.out.println(str.substring(0));
//		System.out.println(str.substring(-1));//it gives error
		System.out.println(subStr.length());
		
		
		
		
	}

}
