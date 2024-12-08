
package Lecture35DP1;

public class MinSquareToRepresentNCode13 {
	
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
		int dp[] = new int[n+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		int ans = minSquare(n, dp);
		System.out.println(ans);
	}
	
	
}
