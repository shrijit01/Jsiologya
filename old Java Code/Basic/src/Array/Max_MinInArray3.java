package Array;

public class Max_MinInArray3 {

	public static void getMinMax(long[] arr, long n) {
		long min = arr[0];
		long max = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("Min is :- " + min);
		System.out.println("Max is :- " + max);
	}

	public static void main(String[] args) {
		long arr[] = { 1, 5, 8, 287, 96, 0 };
		long n = arr.length;
		getMinMax(arr, n);
	}

}
