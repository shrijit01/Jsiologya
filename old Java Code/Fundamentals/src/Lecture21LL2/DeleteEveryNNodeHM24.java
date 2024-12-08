package Lecture21LL2;

public class DeleteEveryNNodeHM24 {
//	
//	This function is used to skip M nodes and then delete
//	the next N nodes in a singly linked list. It takes in 
//	three arguments, the head of the linked list, an integer 'M' representing the number of nodes to skip and an integer 'N' representing the number of nodes to delete.
//
//	The function starts by checking if the head is null,
//	in which case it returns the head. If the head is not
//	null, it then checks if M or N is equal to zero, in 
//	which case it returns null or the head respectively.
//
//	It then creates a pointer called "curr" and assigns
//	it to the head of the linked list, and a pointer called 
//	"t". It uses a while loop to iterate through the linked
//	list. In the while loop, it uses a for loop to iterate
//	through the next M nodes and assigns the curr pointer to
//	the Mth node. If curr is already at the end of the list, it returns the head.
//
//	It then uses another for loop to iterate through the next N nodes and assigns the t pointer to the Nth node. It then sets the curr.next to t and curr pointer is assigned to t, so that the next iteration starts from t.
//
//	Finally, it returns the head of the modified linked list.
//
//	Please note, this implementation does not take care of edge cases, like if M and N are negative or if the M+N are greater than the length of the linked list, it may cause errors.
	
	
//	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
//		//Your code goes here
//        if(head == null ){
//            return head;
//        }
//
//        if(M == 0){
//            return null;
//        }
//        
//        if(N == 0){
//            return head;
//        }
//        
//
//         LinkedListNode<Integer> curr=head,t;
//        int count;
//        while(curr!=null)
//        {
//            for(count=1;count<M && curr!=null;count++)
//            {
//                curr=curr.next;
//            }
//            if(curr==null)
//                return head;
//            t=curr.next;
//            for(count=1;count<=N && t!=null;count++)
//            {
//                t=t.next;
//            }
//            curr.next=t;
//            curr=t;
//        }
//            return head;
//	}
	
	
	//ChatGpt++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
//	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
//	    // check if head is null, if it is return null
//	    if (head == null) {
//	        return null;
//	    }
//	    // check if M or N is negative, if so return the original head
//	    if (M < 0 || N < 0) {
//	        return head;
//	    }
//	    // create pointers for current and temp
//	    LinkedListNode<Integer> curr = head, temp;
//	    while (curr != null) {
//	        // skip M nodes
//	        for (int i = 1; i < M && curr != null; i++) {
//	            curr = curr.next;
//	        }
//	        // if we reached the end of the list, return the head
//	        if (curr == null) {
//	            return head;
//	        }
//	        // set temp to the next node after curr
//	        temp = curr.next;
//	        // delete N nodes
//	        for (int i = 1; i <= N && temp != null; i++) {
//	            temp = temp.next;
//	        }
//	        // set curr's next pointer to the node after the deleted nodes
//	        curr.next = temp;
//	        // set curr to temp for the next iteration
//	        curr = temp;
//	    }
//	    return head;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
