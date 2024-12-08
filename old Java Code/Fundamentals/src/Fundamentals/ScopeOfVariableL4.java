package Fundamentals;

public class ScopeOfVariableL4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		How scopes works with while loop++++++++++++++++++++++++++
		int i = 1;
		int j = 10;
		while(i<=5)
		{
			j = 10;
			System.out.println(j);
			i++;
			j++;//it is not used any where
		}
		System.out.println(i);
		System.out.println(j);
		
		
//		test++++++++++++++++++++++++
//		int a = 10;
//		a = 100;
//		if(a>=100)
//		{
//			int b = 10;
//			System.out.println(b);
//		}else {
//			int c = 20;
//			System.out.println(c);
//		}
//		System.out.println(a);
	}

}
