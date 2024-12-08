package Lecture11TwoDArray;

public class BasicOf2DArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int [3][4];
		System.out.println(arr[1][2]);
		
		arr[2][1] = 12;
		System.out.println(arr[2][1]);
		System.out.println(arr[3][1]);// row index out of length Exception  Array Index OutOfBounds Exception:
		System.out.println(arr[1][4]);//Column index out of length Exception  Array Index OutOfBounds Exception:
	}

}
