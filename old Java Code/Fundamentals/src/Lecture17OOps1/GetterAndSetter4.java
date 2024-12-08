package Lecture17OOps1;

public class GetterAndSetter4 {

	public String name;
	private int rollNumber;
	
	public int getRollnumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int n) {
		if(n<0) {
			return;
		}
		rollNumber = n;
	}

}
