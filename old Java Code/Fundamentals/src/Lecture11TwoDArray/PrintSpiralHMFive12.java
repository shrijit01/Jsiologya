package Lecture11TwoDArray;

public class PrintSpiralHMFive12 {
	public static void spiralPrint(int matrix[][]){
		if (matrix.length!=0) {
            int x = matrix[0].length;
            int y = matrix.length;
//        System.out.println(x+" "+y);
            for (int i = 0; i < x / 2+1; i++) {
                for (int j = i; j < x - i; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
//            System.out.println("First Loop Over");
                for (int j = i + 1; j < y - i; j++) {
                    System.out.print(matrix[j][x - 1 - i] + " ");
                }
//            System.out.println("Secound Loop Over");
                for (int j = x - 2 - i; j >= i; j--) {
                    System.out.print(matrix[y - 1 - i][j] + " ");
                }
//            System.out.println("Third Loop Over");
                for (int j = y - 2 - i; j >= i + 1; j--) {
                    System.out.print(matrix[j][i] + " ");
                }
//            System.out.println("Forth Loop Over");
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1 , 2,  3,  4}, {5,  6,  7,  8},{ 9 ,10 ,11 ,12},{13,14,15,16}};
		spiralPrint(arr);
	}

}
