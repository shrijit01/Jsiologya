package Array;

public class SumOfArray5 {
	/*
	Expected Time Complexity: O(n).
	Expected Auxiliary Space: O(1).*/
	static int sumOfArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {2,4,5,6,7};
		int res  = sumOfArray(arr);
		System.out.println(res);
	}
	
	
}
