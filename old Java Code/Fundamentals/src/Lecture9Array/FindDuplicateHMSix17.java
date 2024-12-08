package Lecture9Array;

public class FindDuplicateHMSix17 {
	public static int findDuplicate(int arr[]) {
		int ans = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			ans += arr[i];
		}
		return ans -((n-2)*(n-1))/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0 ,4 ,1 ,5 ,4 ,3 ,2};
		int res = findDuplicate(arr);
		System.out.println(res);
	}

}
