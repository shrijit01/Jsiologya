package Lecture10Array2SearchingSorting;

public class RotateArrayHMSeven17 {
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n = arr.length;
        int temp[] = new int[n];
 
    int k = 0;
 
   
    for (int i = d; i < n; i++) {
        temp[k] = arr[i];
        k++;
    }
 
   
    for (int i = 0; i < d; i++) {
        temp[k] = arr[i];
        k++;
    }

    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }
    }
	
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1 ,2 ,3 ,4 ,5 ,6 ,7};
		int d = 2;
		rotate(arr,d);
		printArray(arr);
	}

}
