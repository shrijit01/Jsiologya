package Lecture18WritingCodeUsingInhe;

public class Vehicle {
	private String color;
//	int maxSpeed;
	
	//bcz it is used in truck
//	public int maxSpeed;
	
//	bcz used intruck as protected
	protected int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		System.out.println("Vehicle cunstructor ");
		this.maxSpeed = maxSpeed;
	}
	
	
	public Vehicle() {
		System.out.println("Vehicle cunstructor ");
//		this.maxSpeed = maxSpeed;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		 this.color = color;
	}
	
	public void print() {
		System.out.println("Color "+color+" "+ maxSpeed);
	}
}
