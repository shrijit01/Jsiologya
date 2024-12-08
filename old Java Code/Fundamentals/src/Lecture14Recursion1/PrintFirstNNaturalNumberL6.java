package Lecture14Recursion1;

public class PrintFirstNNaturalNumberL6 {
	//factorial using recursion
//	public static int fact(int n){
//        if(n==0){
//            return 1;
//        }
//        int smallOutput=fact(n-1);
//        int output=n*smallOutput;
//        return output;
//        
//    }
	
//	sum n of n number using recursion
//    public static int sumn(int n){
//        if(n==0){
//            return 0;
//        }
//        int smallOutput=sumn(n-1);
//        int output=n+smallOutput;
//        return output;
//        
//        
//    }
    public static void print1ton(int n){
        if(n==0){
            return;
        }
        
        print1ton(n-1);
        System.out.println(n);
    }
    
    
    public static void main(String[] args){
        //System.out.println(fact(5));
        //System.out.println(sumn(4));
        print1ton(5);
    }
	
}
