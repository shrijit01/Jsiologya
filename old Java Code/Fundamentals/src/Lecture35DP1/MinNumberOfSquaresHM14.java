package Lecture35DP1;

public class MinNumberOfSquaresHM14 {
	
	public static int minCount(int n) {
		int dp[] = new int[n+1];
		for (int i = 0; i < n+1; i++) {
			dp[i] = -1;
		}
		return minCountHelper(n,dp);
		
	}
	
	private static int minCountHelper(int n, int[] dp) {
		if(n == 0) return 0;
		int minValue = Integer.MAX_VALUE;
		
		for(int i = 1;i*i <= n; i++) {
			if(dp[n-(i*i)] == -1) {
				dp[n-(i*i)] = minCountHelper(n-(i*i),dp);
				int currVal = dp[n-(i*i)];
				if(currVal < minValue) {
					minValue = currVal;
				}
			}
			return minValue + 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int n = 41;
		int ans = minCount(n);
		System.out.println(ans);

	}

}
