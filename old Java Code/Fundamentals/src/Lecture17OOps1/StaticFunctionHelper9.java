package Lecture17OOps1;

public class StaticFunctionHelper9 {
	public String name;
	final private int rollNumber;
	double cgpa;
	public final static double conversionFactor= 0.95;
	private static int numStudent;
	public int getRollnumber() {
		return rollNumber;
	}
	
	public StaticFunctionHelper9(String s,int num) {
		name = s;
		rollNumber = num;
		numStudent++;
	}
	
	public StaticFunctionHelper9(String s) {
		this.name = s;
		numStudent++;
		this.rollNumber = numStudent++;
	}
	
	public StaticFunctionHelper9() {
		name = "abc";
		numStudent++;
		this.rollNumber = numStudent++;
	}
	
	public static int getNumStudent() {
		return numStudent;
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
