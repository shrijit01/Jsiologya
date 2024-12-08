package Lecture9Array;

//import java.util.Iterator;

public class SwapAlternateHMFour15 {
	public static void swapAlternate(int[] arr) {
		for (int i = 0; i < arr.length; i+=2) {
			if(i+1<arr.length) {
				int temp = arr[i];
				arr[i]= arr[i+1];
				arr[i+1]=temp;
			}
		}
		
	}
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		swapAlternate(arr);
		printArray(arr);
//		System.out.println(swapAlternate(arr));
	}

}
