package L10Array;

public class SUmOfTwoSortedArray {
	/*
	Sum of Two Arrays
	
	Two random integer arrays/lists have been given as 
	ARR1 and ARR2 of size N and M respectively. Both the
	arrays/lists contain numbers from 0 to 9(i.e. single 
	digit integer is present at every index). The 
	idea here is to represent each array/list as an integer
	in itself of digits N and M.
	You need to find the sum of both the input arrays/list 
	treating them as two integers and put the result in another
	array/list i.e. output array/list will also contain only
	single digit at every index.
	
	
	Sample Input 1:
		1
		3
		6 2 4
		3
		7 5 6
		
		1 3 8 0
		
		
		2
		3
		8 5 2
		2
		1 3
		4
		9 7 6 1
		3
		4 5 9
		
		
		0 8 6 5
		1 0 2 2 0 
		
		*/
	
	static void printArray(int[] arr3) {
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
	
	public static void sumOf2Arr(int[] arr1,int[] arr2,int output[]) {
		
		int i = arr1.length-1;
		int j = arr2.length-1;
		int carry = 0;
		int k = Math.max(arr1.length,arr2.length);
		
		
		
		while(i >= 0 && j >= 0) {
			int sum = arr1[i] + arr2[j] + carry;//1//1
			output[k] = sum % 10;
			carry = sum / 10;
			i--;
			j--;
			k--;
		}
		
		/* if Arr1 is bigger */
		while(i >= 0) {
			int sum = arr1[i] + carry;
			output[k] = sum % 10;
			carry = sum / 10;
			i--;
			k--;
		}
		
		/* if Arr2 is bigger */
		while(j >= 0) {
			int sum = arr2[j] + carry;
			output[k] = sum / 10;
			j--;
			k--;
		}
		
		output[0] = carry;
	}
	// 	1 4 8 6 9
	
	
	public static void main(String[] args) {
		int arr1[] = {5,8,9,4};
		int arr2[] = {8,9,7,5};
		int m = arr1.length;
		int n = arr2.length;
		int arr3[] = new int[Math.max(m, n)+1];
		sumOf2Arr(arr1,arr2,arr3);
		printArray(arr3);
	}
	
}
