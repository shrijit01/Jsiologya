package Lecture11TwoDArray;

import java.util.Scanner;

public class InputAndPrinting2DArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
