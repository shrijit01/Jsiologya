package Array;

public class RotateArray6 {
	
	/* USING EXTRA SPACE */
	public static void rotateArray(int [] arr,int d) {
		
		int n =  arr.length;
		int temp[] = new int[n];
		//int k = 0;
		
		for (int i = 0; i < n; i++) {
			temp[i] = arr[(i+d)%n];
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
		
		/*for(int i = d; i < n; i++) {
			temp[k++] = arr[i];
		}*/
		/*
		for(int i = 0; i < d; i++) {
			temp[k++] = arr[i];
		}*/
		
		/*for(int p = 0; p < n; p++) {
			arr[p] = temp[p];
		}*/
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int d = 2;
		rotateArray(arr,d);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	
}
