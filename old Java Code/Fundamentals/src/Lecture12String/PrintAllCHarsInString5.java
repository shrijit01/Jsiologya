package Lecture12String;
import java.util.*;
public class PrintAllCHarsInString5 {
	public static void printChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = "Apna College";
		printChars(str);
	}

}
