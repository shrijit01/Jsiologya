package Lecture7;
import java.util.*;
public class TermOfAPHM12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; count<n;i++) //i<n 1 2 3 4 5 6 7 8 9 10
        {
            int ap = 3*i+2;
            if(ap%4!=0)
            {
                System.out.print(ap+" "); 
                count++;
            }

        }
	}

}
