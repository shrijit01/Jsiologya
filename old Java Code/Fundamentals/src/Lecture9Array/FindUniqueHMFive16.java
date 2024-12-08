package Lecture9Array;

public class FindUniqueHMFive16 {
	public static int  findUnique(int arr[]) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans^arr[i];
		}

//		System.out.println(ans);
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,3,3,4};
		int res = findUnique(arr);
//		System.out.println(res);
//		printArray(arr);
	}

}
