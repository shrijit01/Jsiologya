package CrackTheCode;

public class PrintThePatternSet1 {
	public static void main(String[] args) {
		int n = 2;
		for(int i = n; i>0;i--) {
			for(int j = n;j>0;j--) {
				for(int c = 0;c < i;c++) {
					System.out.print(j+" ");
				}
			}
			System.out.print("$");
		}
	}
}


