package Lecture9Array;

public class PairSumHMEight19 {
	 public static int pairSum(int arr[], int x) {
	    	//Your code goes here
	        int count = 0;
	        for(int i =0;i<arr.length;i++){
	            for(int j = i+1;j<arr.length;j++){
	                if(arr[i]+arr[j] == x){
	                    count++;
	                }
	            }
	        }
	        return count;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 6, 2, 5, 4, 3, 2, 4};//Bcs there is no pair to get 12
		int x = 12;
		int res = pairSum(arr,x);
		System.out.println(res);
	}

}
