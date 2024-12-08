package GettingStartedWithJAVA;

import java.util.*;
public class start {
	
	/* main method below */
	public static void main(String[] args) {
		/* Lecture 2 V5 More on Hello World*/
//		System.out.print("Hello\n");
		/* ln for new line */
//		System.out.print("Hello");
		
		
		/*Lecture 2 V6 Variable and Data Type */
		//Add to Numbers ************
		
		//int a = 10;
		//int b = 20;
		//System.out.println(a+b);
		
		
		/*Lecture 2 V7 Variable and Data Type */
		//int a  = 10;
		//short s = 15;
		//byte b = 20;
		//long l = 1;
		//double d = 3;
		//float f = 10.5f;
		//char c = 'a';
		//boolean bool = true;
		
		//System.out.println(sizeOf(s));
		
		/*Lecture 2 V8 Ground rule While creating variable */
		//Keep meaning  full variable name*********
		//Declearation 
		//int a;
		//initialization
		//*Follow Camel case 
		//EX :- isPrime
		//a = 2;
		
		
		/* Lecture 2 V9 Arithmatic operators and there precedence */
		//int a = 2;
		//int b = 3;
		//int c = 3*2/5;//Left to right
		//int d = 3+2/5;//devide first
		//System.out.println(c);//1
		
		
		//int a = 2;
		//int b = 3;
		//int c = 3*(2/5);//for seprate operation in 2/5
		//int d = 3/(2*5);
		//System.out.println(d);
		
		/* Lecture 2 V10 Taking input */
		//Scanner s  = new Scanner(System.in);
		//int a  = s.nextInt();
		//double d  = s.nextDouble();
		
		/* For Taking word input */
		/* String input ***************** */
		//String str = s.next();
		/* Extracting character from string inpiut ***************** */
		//char ch = str.charAt(0);
		
		
		//System.out.println(str);
		//System.out.print(ch);
		
		
		//MCQ Logic for Error *************************
		//Scanner s = new Scanner(System.in);
		//String str = s.next();
		//int a = s.nextInt();
		//System.out.print(str + " " + a);
		/*
		 * abc def
			Exception in thread "main" java.util.InputMismatchException
			at java.base/java.util.Scanner.throwFor(Scanner.java:943)
			at java.base/java.util.Scanner.next(Scanner.java:1598)
			at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
			at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
			at GettingStartedWithJAVA.start.main(start.java:75)
		 */
	}

}
