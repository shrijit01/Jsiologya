package Lecture11TwoDArray;

import java.util.Scanner;

public class RowWiseSumHMOne6 {
	
	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			sum = 0;
			for (int j = 0; j < mat[0].length; j++) {
				sum += mat[i][j];
			}
			System.out.print(sum+" ");
		}
	}
	
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row Count ");
		int row = s.nextInt();
		System.out.println("Enter Column Count ");
		int cols = s.nextInt();
		
		int[][] arr = new int[row][cols];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter the Element at "+i+" th row "+j+" column");
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	
	
//	
	
	public static void print2DArray(int[][] arr) {
		int row = arr.length,cols = arr[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][]arr=takeInput();
	      rowWiseSum(arr);

	}

}
