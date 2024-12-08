package Lecture17OOps1;

public class DynamicArrayClassOne13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DunamicArrayHelper13 d = new DunamicArrayHelper13();
		
		for (int i = 0; i < 100; i++) {
			d.add(100+i);
		}
		
		System.out.println(d.size());
		System.out.println(d.get(2));
		d.set(3,170);
		System.out.println(d.get(3));
		
		while (!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("Size " + d.size());
			
		}
	}
	
}
