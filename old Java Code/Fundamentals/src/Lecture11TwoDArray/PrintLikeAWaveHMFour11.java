package Lecture11TwoDArray;

public class PrintLikeAWaveHMFour11 {
	public static void wavePrint(int mat[][]){
        if (mat.length==0) System.exit(0);
        int p=mat[0].length-1;
        for (int j = 0; j < mat[0].length ; j++) {
            for (int i = 0; i < mat.length; i++) {
                System.out.print(mat[i][j]+" ");
            }
            j++;
            if (j==mat[0].length) System.exit(0);
            for (int i = mat.length-1; i >= 0; i--) {
                System.out.print(mat[i][j]+" ");
            }
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1 , 2,  3,  4}, {5,  6,  7,  8},{ 9 ,10 ,11 ,12}};	
		wavePrint(arr);
	}

}
