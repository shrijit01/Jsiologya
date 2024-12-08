package Lecture9Array;

public class TripletSumHMNine20 {
	public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for(int k = j+1;k<arr.length;k++){
                    if (arr[i] + arr[j]+arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4 ,5 ,6, 7 };//Bcs there is no Triplet pair to get 19
		int x = 19;
		int res = findTriplet(arr,x);
		System.out.println(res);
	}

}
