package Lecture6;

import java.util.Scanner;

public class OddSquareHM12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int i = 1,j;
	    while(i<=n){
	        int odd = 2*i-1;
	        j=n;
	        while(j>=i){
	            System.out.print(odd);
	            odd = odd +2;
	            j--;
	        }
	        j = 1;
	        int  p =1;
	        while(j<=i-1){
	            
	            System.out.print(p);
	            p= p+2;
	            j++;
	        }
	        System.out.println();
	        i++;
	    }
	}

}
