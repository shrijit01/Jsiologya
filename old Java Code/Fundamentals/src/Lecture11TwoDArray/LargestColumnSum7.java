package Lecture11TwoDArray;
import java.util.Scanner;
public class LargestColumnSum7 {
	
	public static int[][] takeInput(){
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number of rows");
	    int rows=s.nextInt();
	    System.out.println("Enter number of cols");
	    int cols=s.nextInt();
	    int[][] arr=new int[rows][cols];
	    for(int i=0;i<rows;i++){
	        for(int j=0;j<cols;j++){
	            System.out.println("Enter the element at "+ i+ " row "+j+"column");
	            arr[i][j]=s.nextInt();
	        }
	    }
	    return arr;
	}
	
	public static int largest(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		int largest = Integer.MIN_VALUE;
		for (int j = 0; j < col; j++) {
			int sum = 0;
			for (int i = 0; i < row; i++) {
				sum += arr[i][j];
			}
			if(sum > largest ) {
				largest = sum;
			}
		}
		return largest;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][]arr=takeInput();
	      int larColSum=largest(arr);
	      System.out.println(larColSum);
	}

}
