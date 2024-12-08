package Lecture20LinkedList;

public class InsertNodeInLLHM18 {
	public static Node<Integer> insert(Node<Integer> head,int pos ,int data){
		Node<Integer> NodeTobeInserted = new Node<Integer>(data);
		// LinkedListNode<Integer> temp = head;

		if(pos == 0){
			NodeTobeInserted.next = head;
			return NodeTobeInserted;
		}else{
			int count  = 0;
			Node<Integer> prev = head;
			while(count < pos-1 && prev != null){
				prev = prev.next;
				count++;
			}

			if(prev != null){
				NodeTobeInserted.next = prev.next;
				prev.next = NodeTobeInserted;
			}
			return head;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
