package Lecture6;
import java.util.*;
public class DimondOfStars8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int jg= s.nextInt();//3
        int p1=(jg+1)/2;//2
        int p2=jg/2;//1
        for (int i=1;i<=p1;i++){//i=1//p1=2
            for (int g=1;g<p1+1-i;g++){//p1=2
                System.out.print(" ");
            }
            for (int j=1;j<(i*2);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1;i<=p2;i++){
            for (int s2=1;s2<=i;s2++){
                System.out.print(" ");
            }
            int loo=((p2-i+1)*2);
            for (int p=1;p<loo;p++){
                System.out.print("*");
            }
            System.out.println();

        }
	}

}
