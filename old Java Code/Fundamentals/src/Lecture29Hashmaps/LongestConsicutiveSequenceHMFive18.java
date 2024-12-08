package Lecture29Hashmaps;

import java.util.HashMap;
import java.util.ArrayList;


public class LongestConsicutiveSequenceHMFive18 {
	
//	Explanation+++++++++++++++++++++++++++++++++++++++++++
//	The code is a Java function that finds the longest consecutive 
//	increasing sequence in an input integer array. It does this by
//	using two HashMaps, map and lenMap. The map HashMap is used to 
//	store the elements of the input array as keys with their values
//	set to true. The lenMap HashMap is used to store the length of 
//	the sequence starting from a given element in the array.
//
//	The code then loops through the input array and, for each 
//	element, checks if it exists in the map. If it does, it sets
//	its value to false and finds the length of the sequence of
//	increasing numbers starting from that element. This length 
//	
//	is stored in currLen and the starting number in currStart. 
//	The code also updates map as it iterates through the sequence,
//	setting the value of each element in the sequence to false.
//
//	Finally, the code finds the maximum length of the sequences 
//	and the starting element of the sequence with the maximum length
//	and returns them in an ArrayList. The ArrayList contains two 
//	elements, the starting element and the ending element of the 
//	longest consecutive increasing sequence.
	
	
//	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
//
//		ArrayList<Integer> output = new ArrayList<>();
//		HashMap<Integer, Boolean> map = new HashMap<>();
//		HashMap<Integer, Integer> lenMap = new HashMap<>();
//		for (int i=0;i<arr.length;i++)
//		{
//			map.put(arr[i],true);
//		}
//		int maxStart=-1,maxLen=0;
//		boolean startCheck=true;
//
//		for (int i: arr)
//		{
//			if (map.get(i))
//			{
//				int currStart=i,currLen=1;
//				boolean flag=true;
//				map.put(i,false);
//
//				int ahead=i+1;
//				while(flag)
//				{
//					if(map.containsKey(ahead))
//					{
//						currLen=currLen+1;
//						map.put(ahead,false);
//						ahead=ahead+1;
//					}
//					else
//					{
//						flag=false;   
//					}
//				}
//				flag=true; 
//				int before=i-1;
//				while(flag)
//				{
//					if(map.containsKey(before))
//					{
//						currLen=currLen+1;
//						currStart=before;
//						map.put(before,false);
//						before=before-1;
//					}
//					else
//					{
//						flag=false;   
//					}
//				}
//
//				System.out.println();
//				if (currLen>=maxLen)
//				{
//					maxLen=currLen;
//					maxStart=currStart;   
//					lenMap.put(maxStart,maxLen); 
//				}
//			}
//		}
//		for (int i=0;i<arr.length;i++)
//		{
//			if (lenMap.containsKey(arr[i]) && lenMap.get(arr[i])>=maxLen)
//			{
//				maxStart=arr[i];
//				maxLen=lenMap.get(arr[i]);
//				break;
//			}
//		}
//		output.add(maxStart);
//		output.add(maxStart+maxLen-1);
//		return output;
//
//
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
