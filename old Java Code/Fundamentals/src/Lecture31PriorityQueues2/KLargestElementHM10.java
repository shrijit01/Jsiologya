package Lecture31PriorityQueues2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElementHM10 {
	
	public static ArrayList<Integer> kLargest(int input[] ,int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}
		
		for (int i = k; i < input.length; i++) {
			int minValue = pq.peek();
			
			if(minValue < input[i]) {
				minValue = input[i];
			}
			
			if(minValue != pq.peek()) {
				pq.poll();
				pq.add(minValue);
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(!pq.isEmpty()) {
			pq.add(pq.poll());
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2 ,12, 9 ,16 ,10, 5, 3, 20 ,25 ,11 ,1 ,8 ,6 };
		ArrayList<Integer> res = kLargest(arr, 4);
		
		for(Integer i : res) {
			System.out.println(i);
		}
	}

}
