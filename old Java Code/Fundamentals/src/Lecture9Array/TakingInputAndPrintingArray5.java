package Lecture9Array;
import java.util.*;
public class TakingInputAndPrintingArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int [n];
		
		System.out.println("Taking input for " +n+" length array ");
		
		for(int i = 0;i<n;i++) {
			System.out.println("Enter value for "+ i +" th index");
			arr[i] = s.nextInt();
		}
		
		for(int i = 0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
