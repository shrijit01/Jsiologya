package Lecture31PriorityQueues2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElementCode11 {

	public static void kLargest(int input[] ,int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}
		
		for (int i = k; i < input.length; i++) {
//			int minValue = pq.peek();
//			
//			if(minValue < input[i]) {
//				minValue = input[i];
//			}
			
			if(pq.peek() < input[i]) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		while(!pq.isEmpty()) {
//			pq.add(pq.poll());
//		}
//		return arr;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,1,6,3,7,2,9,8};
		kLargest(arr, 4);
		
//		for(Integer i : res) {
//			System.out.println(i);
//		}
	}

}
