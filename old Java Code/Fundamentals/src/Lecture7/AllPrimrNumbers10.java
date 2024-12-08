package Lecture7;
//import java.util.*;
public class AllPrimrNumbers10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 9, count;

		  for (int i = 2; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  }

	}
}
