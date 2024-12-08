package Lecture19OOps3;

public class NewCar extends vehicle implements VechicleInterface6, CarInterface{

	@Override
	public boolean isMOtorized() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getCompany() {
		return null;
	}
	
	public int numGears() {
		return 5;
	}
	
	
	
	//variable clash
//	void print() {
//		System.out.println(pI);
//	}
	
}
