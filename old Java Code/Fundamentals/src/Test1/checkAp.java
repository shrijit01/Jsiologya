package Test1;
import java.util.*;
public class checkAp {
	
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);	
		int n = c.nextInt();

		int i ,j;
		int space = 0;
		for(i = 0;i<n;i++){
			for(j = 1;j<=space;j++){
				System.out.print(" ");
			}
			for(j=1;j<=n;j++){
				if(j<=(n-i)){
					System.out.print(j);
				}else{
					System.out.print("*");
				}
				// 
			}
//		}
			while(j>0){
				if(j>(n-i)){
					System.out.print("*");
				}
				else{
					System.out.print(j);
					j--;
				}
				if((n-i)>9){
					space++;
					System.out.println();
//					i++;
				}
				System.out.println();
				i++;
			}
//				System.out.println();
//				i++;
		}
//		int a=5,b=4;
//		  System.out.println(a*=b);//line 1
//		  System.out.println(a=(a==b));//line 2
//		  System.out.println(a==b);//line 3
//		+++++++++++++++++++++
//		int i = 0; 
//	    for (System.out.print("Hi"); i < 1; i++) 
//	        System.out.print("Ninjas"); 
//		predict uotput  test 2+++++++++++++++++++
//		short i;
//	    for(i=1;i>0;i++)
//	    {
//
//	    }
//	    System.out.print(i);
//		+++++++++++++++++++++++++++++++++
		// TODO Auto-generated method stub
//		Scanner c = new Scanner(System.in);
//		int n = c.nextInt();
//		int a, b, d = 0;
//		a = c.nextInt();
//		boolean ans = true;
//
//		for (int i = 0; i < n - 1; i++) {
//			b = c.nextInt();
//			if (i == 0)
//				d = b - a;
//			if (b - a != d) {
//				ans = false;
//			}
//			a = b;
//		}
//		
//		if (ans) {
//			System.out.print("true");
//		} else {
//			System.out.print("false");
//		}
		
		
//		testing output+++++++++++++++++++++++++++++++++++
//		 int n=10,r=6;
//		    int factn=1,factr=1,factnr=1;
//		    for(int i=2;i<=n;)//2//3//4//5//6//7//8//9//10
//		    {
//		        factn*=i;//2//6//24//480//2880//20,160//161280//14,51,520//14,515,200
//		        if(i<=r)//2//3//4//5//6
//		            factr*=i;//2//6//24//480//2880
//		        if(i<=n-r)//2//3//4//5 //stoped at 5
//		            factnr*=i;//2//6//24
//		        i++;
//		    }
//		    
//		    int ncr=factn/(factr*factnr);
//		    System.out.print(ncr);
	}

}
