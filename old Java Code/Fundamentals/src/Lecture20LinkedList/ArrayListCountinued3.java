package Lecture20LinkedList;

import java.util.ArrayList;

public class ArrayListCountinued3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(20);
		arr.add(20);
		arr.add(10);
		arr.add(30);
		arr.add(1,80);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		//Enhance For loop - For Ecah loop
		for(int i : arr) {
			System.out.println(i);
		}
		
		
//		arr.remove(2);
//		arr.set(0, 100);
//		Integer i = 20;
//		arr.remove(i);
//		System.out.println(arr.size());
//		System.out.println(arr.get(2));
	}

}
