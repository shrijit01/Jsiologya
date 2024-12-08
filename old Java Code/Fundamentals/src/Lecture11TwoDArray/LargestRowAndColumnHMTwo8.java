package Lecture11TwoDArray;

public class LargestRowAndColumnHMTwo8 {
	public static void findLargest(int mat[][]){
		//Your code goes here
		
		//Your code goes here
        boolean isRow = true;
        int maxm = Integer.MIN_VALUE;
        int rows = mat.length;
        int idx = 0;


        if(rows==0){ //for blank array
          System.out.println("row "+idx+" "+ maxm);
          return;
        }


        int cols= mat[0].length;
        //Program to calculate RowSum
        for(int i=0;i<rows;i++){
            int RSum = 0;
            for(int j=0;j<cols;j++){
               RSum += mat[i][j];
            }
            if(RSum>maxm){
                maxm = RSum;
                idx = i;
            }
        }


        //Program to Calculate ColumnSum
        for(int j=0;j<cols;j++){
            int cSum = 0;
            for(int i=0;i<rows;i++){
                cSum += mat[i][j];
            }
            if(cSum>maxm){
                maxm = cSum;
                idx = j;
                isRow = false; //to show colSum is greater than RowSum
            }
        }


        //Now check which has higher sum row or column
        if(isRow){
            System.out.println("row "+idx+ " "+maxm);
        }else{
            System.out.println("column "+ idx+ " "+ maxm);
        }        
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,1},{1,1}};
		findLargest(arr);
//		print2DArray(arr);
	}

}
