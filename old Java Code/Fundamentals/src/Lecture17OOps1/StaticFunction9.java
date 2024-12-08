package Lecture17OOps1;

public class StaticFunction9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticFunctionHelper9.getNumStudent());
		
		StaticFunctionHelper9 s1 = new StaticFunctionHelper9("Shrijit",01);
		
		StaticFunctionHelper9 s2 = new StaticFunctionHelper9("Dikku",02);
		//ststic variable can acce without obj
//		System.out.println(s1.getNumStudent());
		
		System.out.println(s1.name+" "+s1.getRollnumber());
		s2.print();
	}

}
