package Lecture15Recursion2;

public class BinarySearchUsingRecursion5 {
	public static int binarySearchRecursive(int a[],int si,int ei,int x) {
		if(si>ei) {
			return -1;
		}
		int midIndex = si+(ei-si)/2;
		
		if(a[midIndex] == x) {
			return midIndex;
		}else if(a[midIndex] < x) {
			return binarySearchRecursive(a, midIndex+1, ei, x);
		}
		else {
			return binarySearchRecursive(a, si, midIndex-1, x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,7,11,14};
		int res = binarySearchRecursive(arr, 0, 5, 1);
		System.out.println(res);
	}

}
