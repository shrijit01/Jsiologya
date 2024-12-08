package Lecture20LinkedList;

import java.util.ArrayList;

public class IntroToArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(20);
		arr.add(20);
		arr.add(10);
		arr.add(30);
		arr.add(1,80);
		System.out.println(arr.size());
		System.out.println(arr.get(1));
	}

}
