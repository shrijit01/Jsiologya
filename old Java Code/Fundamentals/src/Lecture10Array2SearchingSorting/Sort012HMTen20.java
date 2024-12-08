package Lecture10Array2SearchingSorting;

public class Sort012HMTen20 {
	public static void sort012(int[] arr){
    	//Your code goes here
        int indexOf0 = 0;
        int IndexOf2 = arr.length -1;
        int i = 1;
        int temp = 0;
        while(i < arr.length )  {
            if(arr[i] == 0 && i > indexOf0) {
                temp = arr[i];
                arr[i] = arr[indexOf0];
                arr[indexOf0] = temp;
                indexOf0++;
            } else if(arr[i] == 2 && i < IndexOf2) {
                temp = arr[i];
                arr[i] = arr[IndexOf2];
                arr[IndexOf2] = temp;
                IndexOf2--;
            } else
                i++;
        }
    }
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0 ,1 ,2 ,0 ,2 ,0, 1};
		sort012(arr);
		printArray(arr);
	}

}
