package Lecture35DP1;

public class ByteLanDianHM18 {
	public static long bytelandian(long n, HashMap<Long, Long> memo) {
		// Write your code here
		// Handle base case for n=0,1
		if (n < 12) {
			memo.put(n, n);
			return n;
		}

		if (!memo.containsKey(n)) {
			long ans1 = bytelandian(n / 2, memo);
			long ans2 = bytelandian(n / 3, memo);
			long ans3 = bytelandian(n / 4, memo);

			long currVal = ans1 + ans2 + ans3;
			if (currVal > n)
				memo.put(n, currVal);
			else
				memo.put(n, n);

		}

		return memo.get(n);

		/*
		 * //Recursive solution
		 * 
		 * memo.put((long)0,(long)0);
		 * memo.put((long)1,(long)1);
		 * 
		 * for (int i=2;i<=n;i++)
		 * {
		 * long ans1=memo.get(i/2);
		 * long ans2=memo.get(i/3);
		 * long ans3=memo.get(i/4);
		 * 
		 * long currentVal=ans1+ans2+ans3;
		 * if (currentVal>i)
		 * {
		 * memo.put((long)i,currentVal);
		 * }
		 * else
		 * {
		 * memo.put((long)i,(long)i);
		 * }
		 * }
		 * 
		 * return memo.get(n);
		 */
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
