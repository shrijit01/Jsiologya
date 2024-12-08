package Lecture19OOps3Generics;

public class Vehicle implements printInterface{
	int maxSpeed;
	String company;
	
	//L12 Generic Method
	
	public Vehicle(int maxSpeed,String company) {
		super();
		this.maxSpeed = maxSpeed;
		this.company = company;
	}
	
	public void print() {
		System.out.println(maxSpeed + " "+ company);
	}
}
