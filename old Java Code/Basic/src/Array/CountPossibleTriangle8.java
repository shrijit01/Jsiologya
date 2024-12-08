package Array;


public class CountPossibleTriangle8 {
	//Time Complexity: O(N3)
	//Auxiliary Space: O(1)
	public static int triangelCount(int arr[]) {
		int n  = arr.length;
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int  k = j+1; k< n;k++) {
					if(arr[i] + arr[j] > arr[k] 
						&& arr[j] + arr[k] > arr[i] 
						&& arr[k] + arr[i] > arr[j]) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	
	//Time Complexity: O(N^2)
	//Auxiliary Space: O(1)
	
	public static int checkTrin(int arr[]) {
		int n  = arr.length;
		int count = 0;
		for (int i = n-1; i >= 1; i--) {
			int l = 0,r = i-1;
			while(l < r) {
				if(arr[l] + arr[r] > arr[i]) {
					count += r-l;
					r--;
				}else {
					l++;
				}
			}
		}
		return  count;
	}
	
	
	
	public static void main(String[] args) {
		int arr[] =  { 10, 21, 22, 100, 101, 200, 300 };
		int res = triangelCount(arr);
		System.out.println(res);
	}
	
	
}
