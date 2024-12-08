/**
 * 
 */
package TwoDArray10;


public class TwoDArray {
	/* BINARY SEARCH */

	/*
	public static int binarySearch(int[] arr , int x) {

		int n = arr.length;
		int s = 0,e = n-1;
		int mid = s+(e-s)/2;
		while(s <= e) {
			
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid] > x) {
				e = mid -1;
			}else {
				///* if (arr[mid] < x )
				s = mid + 1;
			}
			
			mid = s+(e-s)/2;
			
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1, 3, 7, 9, 11, 12, 45};
		int res = binarySearch(arr,3);
		System.out.println(res);
	}
	
	*/
	
	/* SELECTION SORT */
	/*
	//In every round we getting a small elem and shifting it to there relevent position
	 * 
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			int min_idx = i;
			for (int j = i+1; j < n ; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx  = j;
				}	
				
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {8,9,2,1,11};//2 13 4 1 3 6 
		selectionSort(arr);
		printArray(arr);
	}
	
	*/
	
	/* 	BUBBLE SORT */
	/*0(n^2)
	 * 0(1)
	public static void fun(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {0,5,3,2};
		System.out.println(arr.length);
		
		bubbleSort(arr);
		printArray(arr);
	}
	*/
	
	
	
	/*  INSERTION SORT TC = 0(N^2), SC = o(1);********************
	 * 
	Insertion sort is a simple sorting algorithm that works 
	similar to the way you sort playing cards in your hands.
	The array is virtually split into a sorted and an unsorted part.
	Values from the unsorted part are picked and placed at the correct
	position in the sorted part.
	
	*/
	/*Article Link*/
	//https://www.geeksforgeeks.org/insertion-sort/
	
	/* START FROM 0 INDEX COMPARE IT WITH NEXT_INDEX 
	 * IF LEFT IS LESS THAN RIGHT THEN ITIS GOOD IF IT 
	 * IS GREATER SWAP THEM */
	
	/*
	public static void insertionSort(int[] arr) {
		int n  = arr.length;
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,8,0,6,1};
		insertionSort(arr);
		printArray(arr);
	}
	*/
	
	
	/* MERGE TWO SORTED ARRAY  */

	/* public static int[] mergeArray(int[] arr1,int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int i = 0;
		int j = 0;
		int k = 0;
		
		int arr3[] = new int[m+n];
		while(i < m && j < n) {
			if(arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			}else {
				arr3[k++] = arr2[j++];
			}
		}
		while(i < m) {
			arr3[k++] = arr1[i++];
		}
		while(j<n) {
			arr3[k++] = arr2[j++];
		}
		return arr3;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr1[] = {2,5,8};
		int arr2[] = {8,9 ,25};
		int res[] = mergeArray(arr1,arr2);
		printArray(res);
	}
	*/

	/* ASSIGNMENTS */
	
	
}
