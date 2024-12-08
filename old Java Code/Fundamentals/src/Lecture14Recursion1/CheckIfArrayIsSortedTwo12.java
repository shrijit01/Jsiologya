package Lecture14Recursion1;

public class CheckIfArrayIsSortedTwo12 {

	 public static boolean isSortedBetter(int a[],int si){
	        if(si==a.length-1){
	            return true;
	        }
	        if(a[si]>a[si+1]){
	            return false;
	        }
	        boolean isSmallArraySorted=isSortedBetter(a,si+1);
	        return isSmallArraySorted;
	    }
	    public static void main(String[] args){
	        //System.out.println(fact(5));
	        //System.out.println(sumn(4));
	        //print1ton(5);
	    	int arr[] = {1,2,3,4,5};
	        System.out.println(isSortedBetter(arr,4));
	        
	    }

}
