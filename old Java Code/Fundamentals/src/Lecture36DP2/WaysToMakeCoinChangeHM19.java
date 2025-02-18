package Lecture36DP2;

public class WaysToMakeCoinChangeHM19 {
	
	public static int countWaysToMakeChange(int denominations[], int value){
        // Write your code here
		/*if (value==0)
            return 1;
        
        if (value<0)
            return 0;
        
        int finalAns=0;
        for (int i=0;i<denominations.length;i++)
        {
            finalAns=finalAns+countWaysToMakeChange(denominations,value-denominations[i]);
        }
        return finalAns;
        */
        int[] dp = new int[value+1];
        dp[0]=1;
        for (int i=0;i<denominations.length;i++)
        {
            for (int j=0;j<=value;j++)
            {
                if (j>=denominations[i])
                {
                    dp[j]=dp[j]+dp[j-denominations[i]];
                }
            }
        }
        return dp[value];
	}
	
	
	public static void main(String[] args) {
		//Code
	}

}
