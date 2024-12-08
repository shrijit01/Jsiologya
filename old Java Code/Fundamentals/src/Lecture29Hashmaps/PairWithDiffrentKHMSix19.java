package Lecture29Hashmaps;

import java.util.HashMap;

public class PairWithDiffrentKHMSix19 {
	//Explanation++++++++++++++++++++++++++++++++++++++++++++
//	The code finds the number of pairs in an integer
//	array arr with a difference of k. It does this by
//	first creating a hashmap map to store the frequency
//	of each element in the array. Then, it checks the difference k:
//
//	If k is 0, it counts the number of pairs of each 
//	element by using its frequency and adding it to 
//	countPairs. The formula used is countPairs = countPairs + (val * (val - 1)) / 2.
//	
//	If k is not 0, it checks if the map contains k + i or i - k
//	for each element i in the map. If it does, it adds the product
//	of the frequencies of i and k + i or i - k to countPairs. Finally
//	, it divides countPairs by 2 to get the final count of pairs.
	
//	public static int getPairsWithDifferenceK(int arr[], int k) {
//		//Write your code here
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int key : arr) {
//			if (map.containsKey(key)) {
//				map.put(key, map.get(key) + 1);
//			} else {
//				map.put(key, 1);
//			}
//		}
//		int countPairs = 0;
//		if (k == 0) {
//			for (Integer i : map.keySet()) {
//				int val = map.get(i);
//				countPairs = countPairs + (val * (val - 1)) / 2;
//			}
//			return countPairs;
//		}
//
//		for (Integer i : map.keySet()) {
//			if (map.containsKey(k + i)) {
//				countPairs = countPairs + (map.get(i) * map.get(k + i));
//			}
//			if (map.containsKey(i - k)) {
//				countPairs = countPairs + (map.get(i) * map.get(i - k));
//			}
//		}
//		countPairs = countPairs / 2;
//		return countPairs;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
