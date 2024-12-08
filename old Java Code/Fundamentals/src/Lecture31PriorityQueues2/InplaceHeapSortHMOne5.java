package Lecture31PriorityQueues2;

public class InplaceHeapSortHMOne5 {
	
	public static void inplaceHeapsort(int[] arr) {
		int n = arr.length;
		
		for (int i = (n/2)-1; i >= 0; i--) {
			downHeapify(arr,i,n);
		}
		
		for (int i = (n/2)-1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			downHeapify(arr, 0, n);
		}
	}
	
	
	public static void downHeapify(int[] arr, int i, int n) {
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
