package Lecture9Array;

public class ArrayOperations3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [10];
		arr[0] = 20;
		arr[1] = 2;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
//		System.out.println(arr[-1]);you can not acces this index 
//		arr[10] = 50;you can not insert element in 10potion of the array if size is 10/
		System.out.println(arr[2]);//bcz we are not inserted any value def is 0
		
		char[] cArray = new char[10];
		double[] dArray = new double[10];
		boolean[] bArray = new boolean[10];
		
		System.out.println(cArray[0]);//default value is null character
		System.out.println(dArray[0]);
		System.out.println(bArray[0]);
		
//		++++++++++++++++++++++++++++++++++++
//		pridict the output
//		int arr[] = new int[5];
//	      arr[1] = 10;
//	      arr = new int[2];
//	      System.out.println(arr[0]); 
	}

}
