package SDE1Questions;
//https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not
//3847/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions
import java.util.HashMap;
public class CheckIFTwoArrayAreEqualOrNOt {
	
	public static void check(long A[],long B[])
	    {
	        //Your code here
	        HashMap<Integer, Integer> HM = new HashMap<Integer, Integer>();
	        
	        for(int i = 0; i < A.length;i++){
	            HM.put(i,(int) A[i]);
	            System.out.println(HM.get(i));
	        }
	    }
	
		//	 public static void printArray(int[] arr) {
		//			for (int i = 0; i < arr.length; i++) {
		//				System.out.print(arr[i]+" ");
		//			}
		//		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long A[] = {1,2,5,4,0};
		long B[] = {2,4,5,0,1};
		check(A,B);
		
	}

}
