package corejava;

public class answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
abstract class shape{
	abstract void calcArea();
}
class Circle extends shape{
    public void calcArea(){
        System.out.println("Calculating Area of Circle");
    }
}

class Rectangle extends shape{
    public void calcArea(){
        System.out.println("Calculating Area of Rectangle");
    }
}
}
