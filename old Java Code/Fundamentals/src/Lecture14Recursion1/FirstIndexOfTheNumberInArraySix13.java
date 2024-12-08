package Lecture14Recursion1;

public class FirstIndexOfTheNumberInArraySix13 {
	public static int firstIndexHelper(int arr[], int x, int start) {
		if (start == arr.length) {
			return -1;
		}

		if (arr[start] == x) {
			return start;
		}else{
			return  firstIndexHelper(arr,x,start+1);
		}
	}
	
	

	public static int firstIndex(int input[], int x) {
		/*
		 * Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		return firstIndexHelper(input,x,0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9 ,8 ,10 ,8};
		System.out.println(firstIndex(arr,8));
	}

}
