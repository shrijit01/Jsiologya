package Lecture17OOps1;

public class FinalKeyword7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeywordClasHelper7 s1 = new FinalKeywordClasHelper7("Shrijit",01);
//		s1.name = "Shrijit";
//		System.out.println("s1 " + s1);
//		s1.setRollNumber(20);
		FinalKeywordClasHelper7 s2 = new FinalKeywordClasHelper7("Dikku");
		
		System.out.println(s1.name+" "+s1.getRollnumber());
		s2.print();
	}

}
