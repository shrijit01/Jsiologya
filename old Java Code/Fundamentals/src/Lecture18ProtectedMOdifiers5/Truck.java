package Lecture18ProtectedMOdifiers5;

import Lecture18WritingCodeUsingInhe.Vehicle;

public class Truck extends Vehicle{
	
	int maxLoadingCapacity;
	
	public void print() {
		System.out.println("Color "+ getColor()+" "+ maxSpeed+"MAxLOading "+maxLoadingCapacity);
	}

	
	
}
