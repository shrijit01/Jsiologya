package Lecture36DP2;

public class MinCostPathProblemHM2 {
	
	public static int minCostPath(int[][] input) {
		//Your code goes here
		int m = input.length;
		int n = input[0].length;

		int[][] dp = new int[m+1][n+1];
		for(int i = 0;i<dp.length;i++){
			for(int j = 0;j<dp[0].length;j++){
				dp[i][j] = Integer.MAX_VALUE;
			}
		}

		//we start filling (m-1)(n-1) from (0,0)

		for(int i = m-1;i>=0;i--){
			for(int j = n-1;j>=0;j--){
				if(i == m-1 && j == n-1){
					dp[i][j] = input[i][j];
					continue;
				}
				int ans1 = dp[i+1][j];
				int ans2 = dp[i][j+1];
				int ans3 = dp[i + 1][j + 1];

				dp[i][j] = input[i][j] + Math.min(ans1,Math.min(ans2,ans3));
			}
		}
		return dp[0][0];

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
