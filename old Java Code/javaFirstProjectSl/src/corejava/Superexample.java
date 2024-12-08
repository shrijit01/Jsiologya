package corejava;

public class Superexample {

	public static void main(String[] args) {
		Bajaj b=new Bajaj();
		b.showData();

	}

}
class Bike{
	int gear=4;
	int speed=100;
	String color="red";
	
}
class Bajaj extends Bike{
	int gear=5;
	int speed=120;
	String color="Black";
	public void showData() {
		System.out.println("Details about Bajaj Bike"+this.gear+" "+this.speed+" "+this.color );
		System.out.println("Details about Bike"+super.gear+" "+super.speed+" "+super.color);
	}
	
}
