package Lecture9Array;

public class LinearSearchHMtwo8 {
	public static int LinearSearch(int arr[],int x) {
		int i;
		for( i = 0;i<arr.length;i++) {
			if(arr[i] == x) {
				System.out.println(i); 
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [3];
		arr[0] = 5;
		arr[1] = 8;
		arr[2] = 9;
		int x = 8;
		int ls = LinearSearch(arr, x);
		System.out.println(ls);
	}

}
