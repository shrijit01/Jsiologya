package Lecture19OOps3Generics;

public class Print {
	public static<T extends printInterface> void printArray(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			//L12 For Generic Method
			arr[i].print();
//			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer arr[] = new Integer[5];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//		}
//		
//		printArray(arr);
//		
//		String arrS[] = new String[5];
//		
//		for (int i = 0; i < arrS.length; i++) {
//			arrS[i] = "abc";
//		}
//		
//		printArray(arrS);
		
		Vehicle v[] = new Vehicle[5];
		for (int i = 0; i < v.length; i++) {
			v[i] = new Vehicle(10*i,"ab");
		}
		printArray(v);
		
		
		Student Students[] = new Student[5];
		for (int i = 0; i < Students.length; i++) {
			Students[i] = new Student(10*i+1);
		}
		printArray(Students);
	}

}
