package CrackTheCode;

import java.util.Arrays;

public class SeriesAP3 {

	/*Time Complexity: O(n). 
	Auxiliary Space: O(1)*/
	public static void printAp(int a,int d,int n) {
		int curr = a;
		for(int i = 1; i < n ; i++) {
			System.out.println(curr);
			curr += d;
		}
	}
	
	/*Time Complexity: O(n Log n). 
	Auxiliary Space: O(1)*/
	public static boolean checkAp(int arr[], int n) {
		if(n == 1) return true;
		
		Arrays.sort(arr);
		
		int d = arr[1] - arr[0];
		for(int i = 2; i<n; i++) {
			if(arr[i] - arr[i-1] != d) {
				return false;
			}
		}
		return true;
	}
	
	/************************nthTerm*********************************/
	public static int nthTerm(int a,int b,int n) {
		
		
		int nth =  a + (n-2)*(b-a);
		return nth;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* FOR AP FROM 1 TO N BY D*/
		/*int a = 2,d = 3 , n = 10;
		printAp(a,d,n);*/
		
		
		
		/* Check is given array is in AP ****************************/
		
		/*int arr[] = {20,50,15,5,10};
		int n = arr.length;
		if(checkAp(arr,n)) {
			System.out.println("YES");
		}else {
			System.err.println("NO");
		}*/
		
		 /*Only nth term of AP  *********************/
		int a = 2;
		int b = 5;
		int n = 10;
		int res = nthTerm(a,b,n);
		System.out.println(res);
		
	}

}


/*
	Given the first 2 terms A1 and A2 of an Arithmetic Series.Find the Nth term of the series. 
	
	Example 1:
	
	Input:
	A1=2
	A2=3
	N=4
	Output:
	5
	Explanation:
	The series is 2,3,4,5,6....
	Thus,4th term is 5.
*/

/*
 * int nthTermOfAP(int A1, int A2, int N) {
        // code here
        int d = A2 - A1;
        int nth = A1 + (N-1)* d;
        return nth;
    }
 * */

