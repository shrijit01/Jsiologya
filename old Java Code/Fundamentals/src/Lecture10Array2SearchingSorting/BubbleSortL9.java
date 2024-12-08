package Lecture10Array2SearchingSorting;

public class BubbleSortL9 {
	public static void bubbleSort(int[] arr){
    	//Your code goes here
        int n = arr.length;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
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
		int arr[] = {9 ,3 ,6 ,2 ,0};
		bubbleSort(arr);
		printArray(arr);
	}

}
