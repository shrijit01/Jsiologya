package Lecture17OOps1;

public class Cunstructor6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CunstructorHelper6 s1 = new CunstructorHelper6("Shrijit",01);
//		s1.name = "Shrijit";
//		System.out.println("s1 " + s1);
//		s1.setRollNumber(20);
		CunstructorHelper6 s2 = new CunstructorHelper6("Dikku");
		
		System.out.println(s1.name+" "+s1.getRollnumber());
		s2.print();
	}

}
