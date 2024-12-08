package Lecture14Recursion1;

public class CheckIfTHeArrayISSortedL9 {

	public static boolean isSorted(int a[]){
        if(a.length==1){
            return true;
        }
        if(a[0]>a[1]){
            return false;
        }
        int smallArray[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        boolean isSmallArraySorted=isSorted(smallArray);
        return isSmallArraySorted;
    }
    public static void main(String[] args){
        //System.out.println(fact(5));
        //System.out.println(sumn(4));
        //print1ton(5);
//        System.out.println(fib(5));
        
    }

}
