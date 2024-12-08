package corejava;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer try
				try {
					
					//inner try
					try {
						int a[]= {1,2,3,4,5,6};
						System.out.println(a[7]);
					}
					catch(ArrayIndexOutOfBoundsException e) {
						System.out.println(e);
						System.out.println("I am in inner try block  ");
					}
					String str=null;
					System.out.println(str.length());
					
				}
				catch(NullPointerException e) {
					System.out.println(e);
					System.out.println("I am outer try block");
				}

	}

}
