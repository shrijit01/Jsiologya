package Lecture17OOps1;

public class StaticKeywordHelper8 {

	public String name;
	final private int rollNumber;
	double cgpa;
	public final static double conversionFactor= 0.95;
	static int numStudent;
	public int getRollnumber() {
		return rollNumber;
	}
	
	public StaticKeywordHelper8(String s,int num) {
		name = s;
		rollNumber = num;
		numStudent++;
	}
	
	public StaticKeywordHelper8(String s) {
		this.name = s;
		numStudent++;
		this.rollNumber = numStudent++;
	}
	
	public StaticKeywordHelper8() {
		name = "abc";
		numStudent++;
		this.rollNumber = numStudent++;
	}
	
	public void print() {
		System.out.println(name +" "+rollNumber);
	}
	
	public void setRollNumber(int n) {
		if(n<0) {
			return;
		}
		System.out.println("this "+this);
//		this.rollNumber = n;
		
	}

}
