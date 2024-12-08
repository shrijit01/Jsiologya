package Lecture17OOps1;

public class FractionClassOneHelper10 {
	
	int numerator;
	int denominator;
	
	public FractionClassOneHelper10(int numerator,int denominator) {
		this.numerator =numerator;
		this.denominator=denominator;
		simplyfy();
	}

	private void simplyfy() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for (int i = 2; i <= smaller; i++) {
			if(numerator%i == 0 && denominator %i == 0) {
				gcd = i;
			}
		}
		numerator  = numerator/gcd;
		denominator = denominator/gcd;
	}

	public void print() {
		System.out.println(numerator +"/"+denominator);
	}

	public void increment() {
		//it will increse the fraction thats why void
		numerator = numerator + denominator;
		simplyfy();
	}
	
}
