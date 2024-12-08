package Lecture21LL2;

import java.util.LinkedList;

public class LinkedListINCollection21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(0, 100);
		list.addFirst(120);
		list.set(0,200);
		list.remove();
		list.remove(2);
		list.isEmpty();
		System.out.println(list.get(1));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+"th "+list.get(i));
		}
	}

}
