package Lecture9Array;
import java.util.*;
public class MoreAboutDataType10 {
	public static int[] takeInput(int arr[],int n) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int[] arr1 = new int [n1];
		for (int i = 0;i<n1;i++) {
//			type type = (type) iterator.next();
			arr1[i] = s.nextInt();
		}
//		return ;
		return arr1;
	}
	
	public static void printOutput(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int [n];
		int arr1[] = takeInput(arr,n);
		printOutput(arr);
		System.out.println(arr1);
	}

}
