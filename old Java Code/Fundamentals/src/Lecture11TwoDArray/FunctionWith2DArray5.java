package Lecture11TwoDArray;

import java.util.Scanner;

public class FunctionWith2DArray5 {
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
	
	public static void print2DArray(int[][] arr) {
		int row = arr.length,cols = arr[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
//	public static void  fun(int[][] arr2d)
//	{
//
//	    for(int i=0;i<arr2d.length;i++)
//	    {
//	        for(int j=0;j<arr2d[i].length;j++)
//	        {
//	            arr2d[i][j]=2*i+j;
//	        }
//	    }
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]input=takeInput();
		print2DArray(input);
//		 int[][] arr = new int[2][2]; 
//		    fun(arr);
//		    for(int i=0;i<2;i++)
//		    {
//		        for(int j=0;j<2;j++)
//		        {
//		            System.out.print(arr[i][j]+" " );
//		        }
//		    }
		
		
	}

}
