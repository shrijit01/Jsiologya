package Lecture29Hashmaps;

import java.util.HashMap;

public class MaximumFrequencyNumberHMOne5 {
	
	public static int maxFrequencyNumber(int[] arr) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			int elem = arr[i];
			
			if(map.containsKey(elem)) {
				map.put(elem, map.get(elem)+1);//plus one in an that element thats it
			}else {
				map.put(elem, 1);
			}
		}
		
		int maxCount = Integer.MIN_VALUE,maxElem = arr[0];//1
		
		for (int i = 0; i < arr.length; i++) {
			if(map.get(arr[i]) > maxCount) {
				maxCount = map.get(arr[i]);
				maxElem = arr[i];
			}
		}
		
		
		return maxElem;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,5};
		int res = maxFrequencyNumber(arr);
		System.out.println(res);
	}

}
