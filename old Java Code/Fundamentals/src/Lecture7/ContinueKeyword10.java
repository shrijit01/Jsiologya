package Lecture7;

public class ContinueKeyword10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for( int i = 1; i <= n ;i++) {
			if(i ==4) {
				continue;
			}
//			i++;// it giver a infinite loop//
			System.out.println(i);
		}
		
		
//		int i = 1;
//		int n  = 5;
//		while(i<=n) {
////			i++;
//			if(i ==4) {
//				i++;
////				break;
//				continue;
//			}
//			i++;
//			System.out.println(i);
//		}
	}

}
