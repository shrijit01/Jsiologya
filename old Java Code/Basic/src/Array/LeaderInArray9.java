package Array;

public class LeaderInArray9 {

	// TC 0(N*N)
	public static void leader(int arr[]) {
		int n = arr.length;// i = 5
		for (int i = 0; i < n; i++) {// 0//1//2//3//4//5
			int j;
			for (j = i + 1; j < n; j++) {// 2
				if (arr[i] <= arr[j]) {
					break;
				}
			}
			if (j == n) {// 1
				System.out.println(arr[i] + " ");// 17//5//2
			}
		}
	}

	
	//TC = o(n)
	public static void leader2(int arr[]) {
		int n = arr.length;
		int max = arr[n-1];
		
		System.out.println("max :-" + max);
		for (int i = n - 2; i >= 0; i--) {
			if(max < arr[i]) {
				max = arr[i];
				System.out.println("max :-" + max);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		leader2(arr);
	}

}
