package Lecture18WritingCodeUsingInhe;

import java.util.Scanner;

public class polymorphism8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v ;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n<10) {
			v = new Car(4,100);
		}
		else {
			v = new Vehicle();
		}
		
		v.print();
//		v.printMaxSpeed();
		
//		Car  c = new Vehicle();
		
		Vehicle v = new Car(4,480);
//		
//		v.new Bycycle();
//		v.maxSpeed =100;
//		v.print();//Run time polymorphism
//		v.numDoors = 4;
//		Vehicle v2 = new Bycycle();
	}

}
