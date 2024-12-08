package Lecture14Recursion1;

public class CheckNumberInArrayFive11 {
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		return checkNumberHelper(input,0,input.length-1,x);

	
	}
	public static boolean checkNumberHelper(int arr[],int si,int ei,int x){
		if(si>ei){
			return false;
		}

		if(arr[si]==x){
			return true;
		}

		return checkNumberHelper(arr,si+1,arr.length-1,x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9 ,8 ,10};
		boolean res = checkNumber(arr,2);
		System.out.println(res);
		
	}

}
