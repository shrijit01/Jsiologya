package Lecture20LinkedList;

public class EliminateDuplicateFromLLHM24 {
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		if(head == null || head.next == null)
            return head;
 
		Node<Integer> t1 = head;    
		Node<Integer> t2 = head.next;
 
        while(t2 != null){
            if(t2.data.compareTo(t1.data) == 0)////compare non primitive dataType like this not using == (VERY IMPORTANT THING TO NOTE)
            {//1 1 2 2 3
                t1.next = t2.next;
                t2 = t2.next;
            }
            else{
                t1 =t2;
                t2 = t2.next; 
            }
        }
       return head;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
