package Test7;

import java.util.Scanner;

public class TeamSelectionHm3 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		solve(arr, 12, 0, "");
	}

	private static void solve(int[] arr, int r, int vidx, String set) {
		// this must be prior so that last set gets printed when vidx == arr.length
		if (r == 0) {
			System.out.println(set);
			return;
		}

		// base case
		if (vidx == arr.length) {
			return;
		}

		// element gets added to set
		solve(arr, r - 1, vidx + 1, set + arr[vidx] + " ");
		// element is not added to set
		solve(arr, r, vidx + 1, set);
	}
	
	
}
