package corejava;

public class jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[4];
		
		int x=10;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=x;
				x=x+10;
						
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println();
					for(int j=0;j<a[i].length;j++) {
						System.out.print(a[i][j]+"  ");
					}

	}

	}

}
