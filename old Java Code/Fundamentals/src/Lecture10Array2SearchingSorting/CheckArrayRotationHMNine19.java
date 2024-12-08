package Lecture10Array2SearchingSorting;

public class CheckArrayRotationHMNine19 {
	public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        //
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                return i+1;
        }
        return 0;

    }
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5 ,6 ,1 ,2, 3, 4};
		int res = arrayRotateCheck(arr);
		System.out.println(res);
	}

}
