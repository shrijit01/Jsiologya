package Lecture23Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollection7 {

	public static void main(String[] args) {
		// lTODO Auto-generated method stublll
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.poll());//remove first and print
		System.out.println(queue.size());
	}

}
