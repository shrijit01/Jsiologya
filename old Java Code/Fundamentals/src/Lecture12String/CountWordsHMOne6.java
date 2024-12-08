package Lecture12String;

public class CountWordsHMOne6 {
	public static int countWords(String str) {	
		//Your code goes here
		int n = str.length();
		if (n == 0) {
			return 0;
		}
		int count = 1;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Coding Ninjas!";
		int res =countWords(str);
		System.out.println(res);
	}

}
