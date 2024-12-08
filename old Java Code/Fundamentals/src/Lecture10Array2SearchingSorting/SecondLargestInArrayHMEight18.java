package Lecture10Array2SearchingSorting;

public class SecondLargestInArrayHMEight18 {
	public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int first,second;
        first=second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && first !=arr[i]){
              second=arr[i];
             }
        }
        if(second==Integer.MIN_VALUE){
            return Integer.MIN_VALUE ;
        }
        else{
            return second;
        }
     
    }
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2 ,13, 4, 1 ,3, 6, 28};
		int res = secondLargestElement(arr);
		System.out.println(res);
//		printArray(arr);
	}

}
