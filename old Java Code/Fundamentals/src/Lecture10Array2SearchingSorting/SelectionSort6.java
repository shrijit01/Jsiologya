package Lecture10Array2SearchingSorting;

public class SelectionSort6 {
	public static void selectionSort(int[] arr) {
    	//Your code goes here
        for(int i= 0;i <arr.length-1;i++){
            int minIndex = i;//3

            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }   
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 13 ,4 ,1 ,3 ,6 ,28};
		selectionSort(arr);
		printArray(arr);
	}

}
