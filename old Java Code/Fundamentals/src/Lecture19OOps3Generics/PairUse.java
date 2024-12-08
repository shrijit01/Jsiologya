package Lecture19OOps3Generics;

public class PairUse {
	
	public static void Main(String[] args) {
		//L12 Generic Method
		
		
		
		
		
		//L11 Chained generic  pair ++++++++++++++++++++++
		Pair<String,Integer> pInner =new Pair<>("ab",100);
		Pair<Pair<String,Integer>,String> p = new Pair<>();
		p.setFirst(pInner);
		System.out.println(p.getFirst());//NUll
		System.out.println(p.getFirst().getFirst());//Null
		
//		p.setSecond("abcd");
//		System.out.println(p.getSecond());
		
		//Lecture10 classes with muliplr generic type +++++++++++++++++
		
//		Pair<String,Integer> pSI = new Pair<String,Integer>("ab",10);
		
		
		
//		Pair<Integer> p = new Pair<>(10,20);
//		p.setFirst("aa");
//		int i = 10;
//		Integer i1 =10;
		
//		Pair<String> p = new Pair<>();
//		p.setFirst("abc");
//		System.out.println(p.getFirst()+" "+p.getSecond());
//		
//		Pair<Double> pD ;
//		pD = new Pair<Double>(10.1,20.6);
		
		
		
		
		
		
		
		
		//Lecture9 Creating obj of generic class++++++++++++++
//		Pair<Integer> p = new Pair<>(10,20);
//		p.setFirst("aa");
//		p.setFirst(10);
		
//		String s = (String) p.getFirst();
//		
//		Pair<String> pS = new Pair<String>("aa","bb");
//		System.out.println(pS.getFirst()+" "+pS.getSecond());
//		pS.setFirst("xyz");
//		
//		Pair<Integer> pI = new Pair<Integer>(10,20);
//		System.out.println(pI.getFirst()+" "+pI.getSecond());
//		
//		Pair<Double> pD = new Pair<Double>(10.1,20.6);
//		System.out.println(pD.getFirst()+" "+pD.getSecond());
		
//		Pair<Vehicle> pD = new Pair<Vehicle>(new Vehicle(),new Vehicle());
		
//		System.out.println(pD.getFirst()+" "+pD.getSecond());
//		Pair p = new Pair(10,20);//Dangerous++++++++++++++++++++++++++++++++++
//		System.out.println(p.getFirst()+" "+p.getSecond());
		
		
//		PairString pS new PairString("aa","bb");
//		PairDouble pS new PairDouble(3.1,7.2);
	}
}
