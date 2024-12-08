package Lecture14Recursion1;

public class SumOfArray10 {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		if(input.length == 1){
			return input[0];
		}

		int sum = 0;
//		int smallArray[] = new int [input.length-1];
		for(int i = 1 ;i<input.length;i++){
			sum += input[i];
		}
		return input[0]+sum;
		
	}
	public static void main(String[] args){
    	int arr[] = {1,2,3,4,5};
        System.out.println(sum(arr));
        
    }

}
