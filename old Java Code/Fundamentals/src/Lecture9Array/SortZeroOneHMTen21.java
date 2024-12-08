package Lecture9Array;

public class SortZeroOneHMTen21 {
	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here

        int n = arr.length;
        int left = 0,right = n-1;
        int temp ;
        for(int i = 0;i<n;i++){
            if(arr[left]==0){
                left++;
            }
            else if(arr[right]==1){
                right--;
            }
            else{
                temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
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
		int arr[] = {1, 0, 1, 1, 0, 1, 0, 1};
		sortZeroesAndOne(arr);
		printArray(arr);
//		System.out.println();
	}

}
