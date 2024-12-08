package Lecture8;
import java.util.*;
public class FahrenhiteToCelciousTableHMOne5 {
	public static void FtoC(int s,int e,int w) {
		int cel = 0 ;
		for(int i = s;i<=e;i+=w)
		{
			// System.out.print(i+" ");
			cel = ((i-32)*5)/9;
			System.out.println(i+"	"+cel);
			// i = i +20;
		}	
//		return cel;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner c = new Scanner(System.in);
		 int s = c.nextInt();
		 int e = c.nextInt();
		 int w = c.nextInt();
		 FtoC(s,e,w);
//		 System.out.println(res);
		 
	}

}
