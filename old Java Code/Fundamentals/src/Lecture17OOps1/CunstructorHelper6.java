package Lecture17OOps1;

public class CunstructorHelper6 {
	
	public String name;
	private int rollNumber;
	
	public int getRollnumber() {
		return rollNumber;
	}
	
	public CunstructorHelper6(String s,int num) {
		name = s;
		rollNumber = num;
	}
	
	public CunstructorHelper6(String s) {
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
