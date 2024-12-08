package Lecture11TwoDArray;

public class TotalSumOfTheBoundriesHMThree10 {
	//first approch 
	public static int getFirstDiagonalSum(int arr[][], int dimension){
        //here we start from 1st row 1st element
        int currRow = 0;
        int currCol = 0;
        int diagonalSum = 0;
        while(currRow < dimension && currCol < dimension){
            diagonalSum += arr[currRow][currCol];
            currCol++;
            currRow++;
        }
        return diagonalSum;
    }
    public static int getSecondDiagonalSum(int arr[][], int dimension){
      //here we start from 1st row last element
      int currRow = 0;
      int currCol = dimension - 1;
      int diagonalSum = 0;
      while(currRow<dimension && currCol >=0){
          diagonalSum += arr[currRow][currCol];
          currRow++;
          currCol--;
      }
      return diagonalSum;
    } 
    public static int getBoundarySum(int arr[][], int dimension){
        int sum = 0;
        for(int i=1;i<dimension-1;i++){
            //upper side 
            sum = sum + arr[0][i]; //row fixed increase col from 1 to 2nd last
            //lower side 
            sum = sum + arr[dimension-1][i]; //row fixed last row, col from 1 to 2nd last.
            //left side
            sum = sum + arr[i][0]; //col fixed , go from 2nd row to 2nd last row.
            //right side
            sum = sum + arr[i][dimension-1]; //col fixed, last column go from 2ndrow to 2nd last Row.
        }
        return sum;
    }
    public static void totalSum(int[][] arr) {
		//Your code goes here
        int n = arr.length;
        int sum = 0;
        if(n==0){
            System.out.println(sum);
            return;
        }
        int totalSum = getFirstDiagonalSum(arr, n) + getSecondDiagonalSum(arr, n)+ getBoundarySum(arr, n);
        if(n%2!=0){
            totalSum = totalSum - arr[n/2][n/2]; //because for odd numbers it is added twice
        }
        System.out.println(totalSum);
	}
    
    //second approch 
    public static void totalSu(int[][] mat) {
		//Your code goes here
		int horizontal=mat.length-1;
        if (horizontal==-1) {
            System.out.println(0);
            System.exit(0);
        }
        
        
        int vertically=mat[0].length-1;
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i==0 | j==0 | i==horizontal | j==vertically |i==j | j==horizontal-i){
//                    System.out.print(mat[i][j]+" ");
                    sum+=mat[i][j];
                }
            }
        }
//        return sum;
        System.out.print(sum);
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{ 1 ,2 ,3},{4, 5, 6},{7, 8 ,9}};
		totalSu(arr);
				
			
	}

}
