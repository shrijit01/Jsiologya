package Lecture20LinkedList;

import java.util.ArrayList;

public class RemoveDuplicateFromArray {
	public static ArrayList<Integer> removeConsicutiveDuplicate(int arr[]){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,10,20,20,30,40,10};
		ArrayList<Integer> result = removeConsicutiveDuplicate(arr);
		
		for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
		}
	}

}
