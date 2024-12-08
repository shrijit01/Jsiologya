package Array;

public class Print2Largest4 {
	
	public static int print2largest(int []arr) {
		int f ,s;
		f=s=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > f) {
				s = f;
				f = arr[i];
			}else if(arr[i] > s && arr[i] != f) {
				s = arr[i];
			}
		}
		
		if(s == Integer.MIN_VALUE) {
			return-1;
		}else {
			return s;
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {4,5,8,9,3,0};
		int res = print2largest(arr);
		System.out.println(res);
	}
	
	
	
}
