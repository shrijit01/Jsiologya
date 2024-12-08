package Lecture10Array2SearchingSorting;

public class SumOfTwoArrayHMEleven21 {
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i = arr1.length-1;//6980
        int j = arr2.length-1;//   592      7572
        int carry = 0;//1
        int k = Math.max(arr1.length, arr2.length); //k is the last index of output array.
        while(i>=0 && j>=0){//0 -1
            int sum = arr1[i] + arr2[j] + carry;////5
            output[k] = sum%10;//5
            carry = sum/10;//1
            i--;
            j--;
            k--;
        }
        while(i>=0){//if arrr1 is bigger
            int sum = arr1[i]+carry;//
            output[k] = sum%10;//7
            carry = sum/10;
            i--;
            k--;
        }
        while(j>=0){
            int sum = arr2[j]+carry;
            output[k] = sum%10;
            carry = sum/10;
            j--;
            k--;
        } 
        output[0]=carry;
    }
	
	public static void printArray(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			if(i == 0 && arr[i] == 0) {
				continue;
			}
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {7, 5, 6};
		int arr2[] = {6 ,2 ,4};
		int[] output = new int [4];
		sumOfTwoArrays(arr1, arr2, output );
		printArray(output);
	}

}
