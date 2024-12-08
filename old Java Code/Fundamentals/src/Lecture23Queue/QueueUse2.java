package Lecture23Queue;

public class QueueUse2 {

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		QueueUsingArray2 Queue = new QueueUsingArray2(3);
		int arr[] = {10,20,30,40,50};
		
		for(int elem:arr) {
			Queue.enqueue(elem);
		}
		
//		while(! Queue.isEmpty()) {
//			System.out.println(Queue.dequeue(0));
////		}
//		//10
//		//20
//		//30
//		//40
//	}

}
}
