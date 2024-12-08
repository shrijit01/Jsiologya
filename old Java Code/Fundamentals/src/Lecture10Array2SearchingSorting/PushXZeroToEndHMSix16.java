package Lecture10Array2SearchingSorting;

public class PushXZeroToEndHMSix16 {
	public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int count = 0;  
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < arr.length)
            arr[count++] = 0;
    }
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2 ,0 ,0 ,1 ,3 ,0 ,0};
		pushZerosAtEnd(arr);
		printArray(arr);
	}

}
