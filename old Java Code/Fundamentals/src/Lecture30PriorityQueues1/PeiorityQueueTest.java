package Lecture30PriorityQueues1;

public class PeiorityQueueTest {
	
	
	public static void main(String[] args) throws PriorityQueueException {
		PriorityQueue9<String> pq = new PriorityQueue9<String>();
		
		pq.insert("abc", 15);
		pq.insert("def",13);
		pq.insert("fef", 145);
		pq.insert("jhd", 45);
		pq.insert("jut", 54);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.getMin());
			pq.removeMin();
		}
	}
	
}
