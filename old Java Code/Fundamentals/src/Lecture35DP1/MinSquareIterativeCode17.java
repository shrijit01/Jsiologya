package Lecture35DP1;

public class MinSquareIterativeCode17 {
	
	//Memoization
	public static int minSquareIterative(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		for (int i = 1; i <= n; i++) {
			int minAns = Integer.MAX_VALUE;
			for (int j = 1; j*j <= i; j++) {
				int currAns = dp[i-(j*j)];
				if(minAns > currAns) {
					minAns = currAns;
				}
			}
			dp[i] = 1 + minAns;
		}
		return dp[n];
	}
	
	
	public static int minSquare(int n,int[] dp) {

		if(n == 0) {
			return 0;
		}

		int minAns = Integer.MAX_VALUE;

		for (int i = 1; i*i <= n; i++) {
			int currAns;
			if(dp[n-(i*i)] == -1) {
				currAns = minSquare(n-(i*i),dp);
			}else {
				currAns = dp[n-(i*i)];
			}
			if(minAns > currAns) {
				minAns = currAns;
			}
		}

		int myAns = 1 + minAns;

		return myAns;

	}


	public static void main(String[] args) {
		int n = 41;
		int ans = minSquareIterative(n);
		System.out.println(ans);

	}

}
