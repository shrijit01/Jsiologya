package Lecture23Queue;

public class QueueUseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		QueueUsingArray2 Queue = new QueueUsingArray2(3);
		QueueUsingLL6<Integer> queue = new QueueUsingLL6<>();
		
		int arr[] = {10,20,30,40,50};
		
		for(int elem:arr) {
			queue.enqueue(elem);
		}
		
		while(! queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
//		}
		//10
		//20
		//30
		//40
	}
	}

}
