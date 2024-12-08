package Lecture18WritingCodeUsingInhe;

public class Car extends Vehicle{
	
	int numDoor;
	int maxSpeed;
	
	public int numDoors;
	
	//Inheritance and cunstructor
	public Car(int numDoor,int maxSpeed) {
		super(maxSpeed);
		System.out.println("cars cunstructor ");
		this.numDoor = numDoor;
	}
	
	

	//for super keyword
	public void print() {
		super.print();
		System.out.println("NumDoors " +numDoor);
	}
	
	public void printMaxSpeed() {
		 super.maxSpeed =152;
		System.out.println(maxSpeed+" "+ super.maxSpeed);
	}
	
	//function overloading check
	
//	public void print() {
//		System.out.println("Color "+ getColor()+" maxSpeed "+ maxSpeed+" numDoors " +numDoor);
//	}
	
//	
//	public void printCar() {
//		System.out.println("Color "+ getColor()+" maxSpeed "+ maxSpeed+" numDoors " +numDoor);
//	}
}
