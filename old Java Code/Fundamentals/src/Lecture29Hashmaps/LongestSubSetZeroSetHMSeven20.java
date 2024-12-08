package Lecture29Hashmaps;

import java.util.HashMap;

public class LongestSubSetZeroSetHMSeven20 {

	//Explanation++++++++++++++++++++++++++++++++++++++++++
//	The code is finding the length of the longest 
//	subset in an array with zero sum. It uses a
//	HashMap to store the sum of the elements so 
//	far and the last index of that sum. The variable
//	"sum" keeps track of the current sum while iterating
//	through the array. If the sum is zero, the length of 
//	the subset is set to the current index +1. If the HashMap
//	already contains the current sum, it calculates the current
//	length of the subset (current index - the index stored in 
//	the HashMap for that sum) and updates the
//	max length if it's greater. If the sum is not in the
//	HashMap, it adds the sum and its current index to the 
//	map. Finally, it returns the max length.
	
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        // Write your code here

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = -1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                int currLen = i - prevIndex;
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;

    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
