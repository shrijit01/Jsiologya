package Lecture10Array2SearchingSorting;

public class BinarySearch3 {
	public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int s =  0,e=arr.length-1;
        int mid = s+(e-s)/2;

        while(s<=e){
            if(arr[mid] == x){
                return mid;
            }
            else if(x > arr[mid]){
                s=mid+1;
            }
            else{//x < arr[mid]//
                e = mid -1;
            }
            mid = s+(e-s)/2;
            // return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int index = binarySearch(arr,5);
		System.out.println(index);
	}

}
