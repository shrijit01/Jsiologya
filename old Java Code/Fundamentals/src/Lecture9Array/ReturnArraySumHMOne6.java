package Lecture9Array;
import java.util.Scanner;

public class ReturnArraySumHMOne6 {
	public static int arraySum(int arr[]) {
		
//		int sz = arr.length;
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
//			arr[i]= s.nextInt();
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int sum = 0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		int sum = arraySum(arr);
		System.out.println(sum);
		
	}

}
