package Lecture36DP2;

public class LCSProblemHM8 {
	
	public static int lcs(String s, String t) {
		// Your code goes here
		int[][] dp = new int[s.length() + 1][t.length() + 1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		return lcsHelper(s, 0, t, 0, dp);
	}

	private static int lcsHelper(String s, int i, String t, int j, int[][] dp) {
		if (i == s.length() || j == t.length()) {
			return 0;
		}

		if (s.charAt(i) == t.charAt(j)) {
			if (dp[i + 1][j + 1] == -1) {
				dp[i + 1][j + 1] = lcsHelper(s, i + 1, t, j + 1, dp);
			}
			dp[i][j] = 1 + dp[i + 1][j + 1];
		} else {
			if (dp[i + 1][j] == -1) {
				dp[i + 1][j] = lcsHelper(s, i + 1, t, j, dp);
			}
			int ans1 = dp[i + 1][j];

			if (dp[i][j + 1] == -1) {
				dp[i][j + 1] = lcsHelper(s, i, t, j + 1, dp);
			}
			int ans2 = dp[i][j + 1];

			dp[i][j] = Math.max(ans1, ans2);
		}
		return dp[i][j];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
