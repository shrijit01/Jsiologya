package Lecture10Array2SearchingSorting;

public class INsertionSortL12 {
	public static void insertionSort(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            for(;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
	
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//Implimentation of insertion sort
		int arr[] = {2 ,13, 4, 1, 3, 6 ,28};
		insertionSort(arr);
		printArray(arr);
	}

}
