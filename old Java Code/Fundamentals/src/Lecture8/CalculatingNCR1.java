package Lecture8;
import java.util.*;
public class CalculatingNCR1 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int r = c.nextInt();
		
		
		int factN =1;
		for(int i = 1;i<=n;i++) {
			factN = factN * i;
		}
		
		int factR =1;
		for(int i = 1;i<=r;i++) {
			factR = factR * i;
		}
		
		int factNR =1;
		for(int i = 1;i<=n-r;i++) {
			factNR = factNR * i;
		}
		int res = factN/(factR*factNR) ;
		System.out.println(res);
		
	}

}
