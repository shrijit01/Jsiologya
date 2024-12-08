package Lecture17OOps1;

public class FinalKeywordClasHelper7 {

	public String name;
	private int rollNumber;
	double cgpa;
	final double conversionFactor= 0.95;
	public int getRollnumber() {
		return rollNumber;
	}
	
	public FinalKeywordClasHelper7(String s,int num) {
		name = s;
		rollNumber = num;
	}
	
	public FinalKeywordClasHelper7(String s) {
		name = s;
		rollNumber = 01;
	}
	
	public void print() {
		System.out.println(name +" "+rollNumber);
	}
	
	public void setRollNumber(int n) {
		if(n<0) {
			return;
		}
		System.out.println("this "+this);
		this.rollNumber = n;
	}

}
