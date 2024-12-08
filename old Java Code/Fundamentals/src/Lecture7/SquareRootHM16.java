package Lecture7;
import java.util.*;
public class SquareRootHM16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		//50% sahi h
		int i = 1,res=1;
		
		while(res<n) {
			i++;
			res=i*i;
//			
//			System.out.println(res);
		}
//		i--;
		System.out.println(i);
	}

}
