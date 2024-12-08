package Lecture17OOps1;

public class FractionClassTwo11 {

	public static void main(String[] args) throws DivideByZeroException {
		// TODO Auto-generated method stub
		FractionClassTwoHelper11 f1 = new FractionClassTwoHelper11(4,6);
//		f1.print();
//		f.setNumerator();
//		f.getNumerator();
//		f1.increment();
		f1.print();
		FractionClassTwoHelper11 f2 = new FractionClassTwoHelper11(4,8);
//		f1+ f2;
//		f1.add(f2);
//		f1.print();
		FractionClassTwoHelper11 f3 = FractionClassTwoHelper11.add(f1, f2);
		f3.print();
	}

}
