package Lecture17OOps1;

public class ThisKeyword5 {

	public String name;
	private int rollNumber;
	
	public int getRollnumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int n) {
		if(n<0) {
			return;
		}
		System.out.println("this "+this);
		this.rollNumber = n;
	}

}
