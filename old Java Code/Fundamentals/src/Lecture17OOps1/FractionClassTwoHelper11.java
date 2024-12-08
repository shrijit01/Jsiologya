package Lecture17OOps1;

public class FractionClassTwoHelper11 {
	int numerator;
	int denominator;
	
	public FractionClassTwoHelper11(int numerator,int denominator) throws DivideByZeroException {
		if(denominator == 0) {
			throw new DivideByZeroException();
//			denominator = 1 ;
		}
//		this.denominator = denominator;
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
	
	
	////set numerator
	public void setNumerator(int num) {
		this.numerator = num;
		simplyfy();
	}
	
	
	
	//get numerator
	public int getNumerator() {
		return numerator;
	}
	
	//set denominator
	public void setDenomiunator(int num) throws DivideByZeroException {
		if(num == 0) {
			throw new DivideByZeroException();
//			return ;
		}
		this.denominator = num;
		simplyfy();
	}
	
	
	////get denominator
	public int getDenominator() {
	return denominator;
}
	
	public void print() {
		System.out.println(numerator +"/"+denominator);
	}
	
	//Add 
	public void add(FractionClassTwoHelper11 f2) {
		//first fraction is the fraction in which fun is called
		//second is passed asargument
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplyfy();
	}

	public void increment() {
		//it will increse the fraction thats why void
		numerator = numerator + denominator;
		simplyfy();
	}
	
	public static FractionClassTwoHelper11 add(FractionClassTwoHelper11 f1, FractionClassTwoHelper11 f2) throws DivideByZeroException{
        int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int newDeno = f1.denominator*f2.denominator;
        FractionClassTwoHelper11 f3= new FractionClassTwoHelper11(newNum, newDeno);
        return f3;
    }
}
