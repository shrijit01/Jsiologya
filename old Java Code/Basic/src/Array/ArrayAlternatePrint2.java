package Array;

public class ArrayAlternatePrint2 {
	
	/*Expected Time Complexity: O(n)
	Expected Auxiliary Space: O(1)*/
	public static void print(int arr[], int n)
    {
		
        for(int i = 0;i<n;i++){
        	//mod index with 2
            if(i%2 == 0){
                System.out.print(arr[i]+" ");
            }
            
        }
        
    }
	
	
	public static void main(String[] args) {
		/*	ARRAY ALTERNATE PRINT */
		
	}
	
	
}
