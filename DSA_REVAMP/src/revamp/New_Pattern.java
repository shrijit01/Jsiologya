package revamp;


	public class New_Pattern {
//		*****
//		*****
//		*****
//		*****
//		*****
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i <= n; i++ ) {
//				for(int j = 1; j <= n; j++ ) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			
//		}
		
		
//		public static void main(String[] args) {
//			1111
//			2222
//			3333
//			4444
	//
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i <= n; i++ ) {
//				for(int j = 1; j <= n; j++ ) {
//					System.out.print(i);
//				}
//				System.out.println();
//			}
//		}
		
		
//		public static void main(String[] args) {
//			123
//			123
//			123
	//
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i <= n; i++ ) {
//				for(int j = 1; j <= n; j++ ) {
//					System.out.print(j);
//				}
//				System.out.println();
//			}
//		}
		
		
//		public static void main(String[] args) {
//			4321
//			4321
//			4321
//			4321  

//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i <= n; i++ ) {
//				for(int j = 1; j <= n; j++ ) {
//					System.out.print(n-j+1);
//				}
//				System.out.println();
//			}
//		}
		
//		public static void main(String[] args) {
//			1
//			12
//			123
//			1234
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i <= n;i++) {
//				for(int j = 1; j <= i; j++) {
//					System.out.print(j);
//				}
//				System.out.println();
//			}
//		}
		
//		public static void main(String[] args) {
//			*
//			**
//			***
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i <= n ; i++) {
//				for(int j = 1; j <= i;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
		
		/* watch this */
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i <= n; i++) {
//				
//				for(int j = 1; j <= n-i ; j++) {
//					System.out.print(" ");
//				}
//				for(int k = 1; k <= i; k++) {
//					System.out.print(" *");
//				}
//				System.out.println();
//			}
			
		/*	copied code */
//			int i, j, row = 6;       
//			for (i=0; i<row; i++) {  
//				for (j=2*(row-i); j>=0; j--){  
//					System.out.print(" ");   
//				}   
//				for (j=0; j<=i; j++ ) {   
//					System.out.print("* ");   
//				}   
//					System.out.println();   
//			}   
//		}
		
//		public static void main(String[] args) {
//			   *
//			  **
//			 ***
	//
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i<=n;i++) {
//				for(int j = 1; j <= n-i;j++) {
//					System.out.print(" ");
//				}
//				for(int k = 1 ; k <= i;k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
		
		/* Right Triangle Star Pattern */
//		public static void main(String[] args) {
//			*
//			**
//			***
//			****
//			*****

//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			for(int i = 1; i <= n; i++) {
//				for(int j = 1; j <= i; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//				
//		}
		
		 /* Left Triangle Star Pattern */
//		public static void main(String[] args) {
//		     *
//		    **
//		   ***
//		  ****
//		 *****
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i <= n ; i++) {
//				for(int j = 1; j <= n-i; j++ ) {
//					System.out.print(" ");
//				}
//				for(int k = 1; k <= i;k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
			
//		}
		
		
		 /* Downward Triangle Star Pattern */
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
			
//			for(int i = 1; i <= n; i++) {
//				for(int j = 1; j <= n-i+1;j++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
			
//		}
		
		/* Mirrored Right Triangle Star Program */
//		   *
//	    **
	//   ***
	//  ****
	// *****
	//******
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int row = 1; row <= n; row++) {
//				for(int col = 1; col <= n-row;col++) {
//					System.out.print(" ");
//				}
//				for(int elem = 1 ;elem <= row ; elem++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
		
		/* Pyramid pattern */
//	    * 
	//   * * 
	//  * * * 
	// * * * * 
	//* * * * * 
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int row = 1; row <= n; row++) {
//				for(int col = 1; col <= n-row;col++) {
//					System.out.print(" ");
//				}
//				for(int elem = 1 ;elem <= row ; elem++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//		}
		
		/* Reversed Pyramid Star Pattern */
//		public static void main(String[] args) {
//			 * * * * * 
//			  * * * * 
//			   * * * 
//			    * * 
//			     * 
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			 for(int i = 0; i <= n; i++) {
//				 for(int j = 0; j <= i;j++) {
//					 System.out.print(" ");
//				 }
//				 for(int k = 0; k <= n-1-i;k++) {
//					 System.out.print("* ");
//				 }
//				 System.out.println();
//			 }
//		}
		
		/*****************17/03/24 *****************/            
		
//		 Right down Mirror Star Pattern                         /* Moderate */
//		*****
//		 ****
//		  ***
//		   **
//		    *
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = n;i>= 1;i--) {
//				for (int j = n; j > i ; j--) {
//					System.out.print(" ");
//				}
//				for (int k = 1; k <= i; k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
		
		
		/* Triangle star pattern */                              /*Moderate*/
//	    *
	//   * *
	//  *   *
	// *     *
	//*********
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for (int i = 1; i <= n; i++) {
//				for (int j = i; j < n; j++) {
//					System.out.print(" ");
//				}
//				for(int k = 1;k <= (2*i-1);k++) {
//					if(k==1 || i == n || k ==(2*i-1)) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}
//		}
		
		/*  Simple number program */                           /* Easy */
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i <= n ;i++) {
//				for(int j = 1; j<= i;j++) {
//					System.out.print(j);
//				}
//				System.out.println();
//			}
//		}
		
		
		/* Number Pattern Program in java */                        /* Easy */
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
		
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			int k = 1;
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= i; j++) {
//					System.out.print(k++ +" ");
//				}
//				System.out.println();
//			}
//		}
		
		
		/* Number Pattern Programs in Java */
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for(int i = 1; i<= n;i++) {
//				for (int j = 1; j <= i; j++) {
//					System.out.print(i+" ");
//				}
//				System.out.println();
//			}
//		}
		
		/*  Descending order Pattern */
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1
		
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
	//
//			for(int i = n;i>= 1; i--) {
//				for(int j = n; j >= i;j--) {
//					System.out.print(j + " ");
//				}
//				System.out.println();
//			}
//			
//		}
		
		
	    /* Right Triangle Numeric Pattern */
		
//		1 
//		2 1 
//		3 2 1 
//		4 3 2 1 
//		5 4 3 2 1
		
//		public static void main(String[] args) {
//			Scanner s = new Scanner(System.in);
//			int n = s.nextInt();
//			
//			for (int i = 1; i <= n; i++) {
//				for(int j = i ; j >= 1;j--) {
//					System.out.print(j+ " ");
//				}
//				System.out.println();
//			}
//		}
		
		
	    // *****************************
	    // 1
	    // 1 2 
	    // 1 2 3
	    // public static void pattern1(int n){
	    //     for(int i = 1; i <= n; i++){
	    //         for(int j = 1; j<= i;j++){
	    //             System.out.print(j+" ");
	    //         }
	    //             System.out.println();
	    //     }
	    // }
	    // *******************************
	    // 1 
	    // 2 2 
	    // 3 3 3 
	    // 4 4 4 4 
	    // 5 5 5 5 5 
	     /* public static void pattern2(int n){
	        for(int i = 1; i <= n; i++){
	            for(int j = 1; j <= i; j++){
	                System.out.print(i+" ");
	            }
	            System.out.println();
	        }
	    } */
	    
	    
	    // * * * * * 
	    // * * * * 
	    // * * * 
	    // * * 
	    // * 
	    /* public static void pattern3(int n){
	        for(int i = 1; i <= n; i++){
	            for(int j = 1; j <= (n-i+1); j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }*/
	    
	    
	    // 1 2 3 4 5 
	    // 1 2 3 4 
	    // 1 2 3 
	    // 1 2 
	    // 1 
	    /* public static void pattern4(int n){
	        for(int i = 1; i <= n; i++){
	            for(int j = 1; j <= (n-i+1); j++){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }
	    }*/
	    
	    
	    //      *
	    //     * *
	    //    * * *
	    //   * * * *
	    //  * * * * *
//	      public static void pattern5(int n){

//	         for(int i = 1; i <= n; i++) {
//	 			for(int j = 1; j <= n-i ; j++) {
//	 				System.out.print(" ");
//	 			}
//	 			for(int k = 1; k <= i; k++) {
//	 				System.out.print(" *");
//	 			}
//	 			System.out.println();
//	 		}
//	     }
		
//		***********************
		//    *    
		//   ***   
		//  *****  
		// ******* 
		//*********

		/*public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				for(int i = 0 ; i < n ; i++) {
					for (int j = 0; j < n-i-1; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < 2*i+1; j++) {
						System.out.print("*");
					}
					for (int j = 0; j < n-i-1; j++) {
						System.out.print(" ");
					}
					System.out.println();
				}
		}*/
		
		
//		*********
//		 ******* 
//		  *****  
//		   ***   
//		    *  
		/*
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			for(int i = 0; i < n ; i++) {//0
				for(int j= 0; j < i;j++) {//
					System.out.print(" ");
				}
				for(int j= 0; j< 2*n-(2*i+1);j++) {
					System.out.print("*");
				}
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		*/
		
//		public static void main(String[] args) {
//			combination of  
			  //    *    
			  //   ***   
			  //  *****  
			  // ******* 
			  //*********
		//		*********
		//		 ******* 
		//		  *****  
		//		   ***   
		//		    *  
//		}
		
		
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			for(int i = 1; i<= 2*n -1 ;i++) {//
				int star = i;
				if(i > n) star = 2*n-i;
				for(int j = 1; j<= star ;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}*/
		
		
//		1
//		01
//		101
//		0101
//		10101

		/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int star = 1;
			
			for(int i = 0;i< n ;i++) {//0//1
				if(i%2 == 0) {
//					System.out.print("1");
					star = 1;
				}else {
					star =0;
				}
				for (int j = 0; j <= i; j++) {
					System.out.print(star);
					star = 1-star;
				}
				System.out.println();
			}
		}*/
		
		
//		1      1
//		12    21
//		123  321
//		12344321

		/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int space = 2*(n-1);
			for(int i = 1; i<=n;i++) {
//				numer 
				for(int j = 1; j <= i;j++) {
					System.out.print(j);
				}
				
//				space 
				for(int j = 1;j<= space;j++) {
					System.out.print(" ");
				}
				
//				numer 
				for(int j = i; j >= 1;j--) {
					System.out.print(j);
				}
				System.out.println();
				space -= 2;
			}
		}*/
		
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 

		/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int count = 1;
			for(int i= 1 ; i <= n ;i++) {
				for(int j = 1; j <= i;j++) {
					System.out.print(count++ +" ");
				}
				System.out.println();
			}
		}*/
		
		
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
		/*
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			for(int i = 1; i <= n;i++) {//1//2//3
				for(char ch = 'A'; ch < 'A' + i;ch++) {
					System.out.print(ch +" ");
				}
				System.out.println();
			}
		}*/
		
		
//		A B C D E 
//		A B C D 
//		A B C 
//		A B 
//		A 
		/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			for(int i = 0; i< n ;i++) {
				for(char ch = 'A'; ch<= 'A'+(n-i-1);ch++) {
					System.out.print(ch+" ");
				}
				System.out.println();
			}
		}*/
		
		
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE

		/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			for(int i= 0; i<n;i++) {
				char ch = (char) ('A' + i);
				for(int j = 0; j<=i;j++) {
					System.out.print(ch);
				}
				System.out.println();
			}
		}*/
		
		
//	    A    
	//   ABA   
	//  ABCBA  
	// ABCDCBA 
	//ABCDEDCBA
		/* static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n-i-1; j++) {
					System.out.print(" ");
				}
//				character 
				char ch = 'A';
				int br = (2*i+1)/2;
				for (int j = 1; j <= 2*i+1; j++) {
					System.out.print(ch);
					if(j <= br) {
						ch++;
					}else {
						ch--;
					}
				}
				
				for (int j = 0; j < n-i-1; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}*/
		
		
//		E 
//		D E 
//		C D E 
//		B C D E 
//		A B C D E 
		/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			for (int i = 0; i < n; i++) {//1
				for(char ch = (char)(int)('A'+n-1-i);ch<= (char)(int)('A'+n-1);ch++) {
					System.out.print(ch + " ");
				}
				System.out.println();
			}
		}*/
		
		
	//	
//		**********
//		****  ****
//		***    ***
//		**      **
//		*        *
//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
		/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int inis = 0;
//			star 
			for(int i = 0; i<n;i++) {
//				star 
				for(int j = 1; j<=n-i;j++) {
					System.out.print("*");
				}
				
				for(int j = 0;j< inis;j++) {
					System.out.print(" ");
				}
//				star 
				for(int j = 1; j<=n-i;j++) {
					System.out.print("*");
				}
				inis += 2;
				System.out.println();
			}
			
			inis = 8;
			for(int i = 1; i<= n;i++) {
//				star 
				for(int j = 1; j<= i;j++) {
					System.out.print("*");
				}
				
				for(int j = 0;j< inis;j++) {
					System.out.print(" ");
				}
//				star 
				for(int j = 1; j<= i;j++) {
					System.out.print("*");
				}
				inis -= 2;
				System.out.println();
			}
			
		}*/
		
		
		
//		*         *
//		**       **
//		***     ***
//		****   ****
//		***** *****
//		****   ****
//		***     ***
//		**       **
//		*         *

		/*public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			int space = 2*n-2;
			for(int i = 1; i <= 2*n-1;i++) {
				int star = i;
				if(i > n) star = 2*n-i;
//				star 
				for(int j = 1; j <= star;j++) {
					System.out.print('*');
				}
				//space
				for(int j = 0; j<= space;j++) {
					System.out.print(" ");
				}
//				star 
				for(int j = 1; j <= star;j++) {
					System.out.print('*');
				}
				System.out.println();
				if(i<n) space -= 2;
				else space += 2;
				
			}
		}*/
		
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		/*
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			 for(int i = 0; i < n ;i++) {
				 for(int j = 0; j<n;j++) {
					 if(i == 0|| i == n-1 || j == 0|| j == n-1) {
						 System.out.print("*");
					 }else {
						 System.out.print(" ");
					 }
				 }
				 System.out.println();
			 }
		}*/
		
		
		
		
	}


