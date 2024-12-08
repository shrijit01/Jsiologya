package Array;

public class ArrayOPeration1 {
	
	public boolean searchEle(int a[],int x)
    {
		//add code here.
		for(int i  =0;i<a.length;i++){
		    if(a[i] == x){
		        return true;
		    }
		}
		return false;
	}
	
	public boolean insertEle(int a[],int y,int yi)
     {
           //add code here.
           for(int i  = 0; i < a.length;i++){
             if(yi < a.length){
                 a[yi] = y;
                 return true;
             }
           }
           return false;
	}
	
	public boolean deleteEle(int a[],int z)
     {
		//add code here.
	    int n = a.length;
	    for(int i = 0; i< n;i++){
	        if(a[i] == z){
	            a[i] = a[i+1];
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		/* Functions to perform operation in array */
	}
	
}
