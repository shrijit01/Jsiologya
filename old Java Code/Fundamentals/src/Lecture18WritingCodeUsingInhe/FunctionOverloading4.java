package Lecture18WritingCodeUsingInhe;

public class FunctionOverloading4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
//		v.color = "Blue";
		v.setColor("Black");
		v.getColor();
		v.print();
		
		
		Car c = new Car();
//		c.color = "Black";
		c.setColor("Black");
		c.getColor();
		c.maxSpeed = 480;
		c.numDoor = 4;
		c.print();
//		c.printCar();
		
//		Bycycle b = new Bycycle();
////		b.color = "blue";
//		b.setColor("Black");
//		b.getColor();
//		b.print();
	}
	
}
