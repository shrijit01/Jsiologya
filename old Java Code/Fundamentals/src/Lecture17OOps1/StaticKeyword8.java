package Lecture17OOps1;

public class StaticKeyword8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticKeywordHelper8.numStudent);
		
		StaticKeywordHelper8 s1 = new StaticKeywordHelper8("Shrijit",01);
//		s1.name = "Shrijit";
//		System.out.println("s1 " + s1);
//		s1.setRollNumber(20);
		StaticKeywordHelper8 s2 = new StaticKeywordHelper8("Dikku",02);
		//ststic variable can acce without obj
		System.out.println(StaticKeywordHelper8.numStudent);
		
		System.out.println(s1.name+" "+s1.getRollnumber());
		s2.print();
	}

}
