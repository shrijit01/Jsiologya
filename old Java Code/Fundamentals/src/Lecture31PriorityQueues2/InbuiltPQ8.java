package Lecture31PriorityQueues2;

import java.util.PriorityQueue;

public class InbuiltPQ8 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int arr[] = {4,2,7,6,9,10,1,2};
		
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.poll();
		}
	}

}
