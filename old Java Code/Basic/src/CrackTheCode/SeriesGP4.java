package CrackTheCode;

public class SeriesGP4 {
	
	/*******************Nth_Term**************/
	/*Time complexity: O(log N) 
	 Auxiliary Space: O(1)
	*/
	
	public static int nth_GP(int a ,int r,int n) {
		int MOD = 1000000007;
        long x = (long) a * power(r,n-1) % MOD;
        return (int ) x;
	}
	
	public static long power(int r,int n){
        int m = 1000000007;
        if(n == 0){
            return 1;
        }
        
        long t = power(r,n/2) % m;
        t  = (t*t) % m;
        if(n%2 == 0){
            return t%m;
        }
        
        return (r * t) % m;
    }
	
	/* print 1 to N GP series */
	public static void print1ToN(int a,int r,int n) {
		int curr = a;//2	//5
		for (int i = 0; i < n; i++) {
			System.out.println(curr);
			curr *= r;//3
		}
	}
	
	
	public static void main(String[] args) {
		
		int a = 2;
		int r = 3;
		int n = 5;
		
		int res = nth_GP(a,r,n);
		System.out.println(res);
		
		
		/*print 1 to n GP */
		/*int a = 2;
		int r = 3;
		int n  = 5;
		
		print1ToN(a,r,n);*/
	}
	
}
