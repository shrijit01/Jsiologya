package Lecture9Array;

import java.util.Scanner;

public class ArrangeNumberInArrayHMThree9 {
	 public static void arrange(int[] arr, int n) {
	    	//Your code goes here
	        int left = 0;
			int right = n - 1;
			int counter = 1;
			
			while(left <= right) {
				
				if(counter%2 == 0) {
					arr[right] = counter;
					counter++;
					right--;
				}
				else {
					arr[left] = counter;
					counter++;
					left++;
				}
		}
}
	 public static void printArray(int[] arr) {
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
		int arr[] = new int [5];
		arrange(arr,5);
		printArray(arr);
//		System.out.print();
	}
	
}
