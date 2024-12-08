package Lecture36DP2;

public class KnapsackRecursiveCode16 {
	
	public static int knapsack(int w ,int val[],int wt[],int i) {
		if(i == val.length) {
			return 0;
		}
		
		int ans;
		
		if(wt[i] <= w) {
			//including the item
			int ans1 = val[i] + knapsack(w-wt[i],val,wt,i+1);
			//excluding the item
			int ans2 = knapsack(w,val,wt,i+1);
			ans = Math.max(ans1, ans2);
		}else {
			ans = knapsack(w,val,wt,i+1);
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		//understand Recursive code 
		int val[] = {200,300,100};
		int wt[] = {20,25,30};
		
		int w = 50;
		int ans = knapsack(w,val,wt,0);
		System.out.println(ans);
	}
	
}
