package Test7;

import java.util.Scanner;

public class BobAndHIsStringHM1 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {
			String s = scn.next();
			int max = Integer.MIN_VALUE;
			int[] freq_map = new int[26];
			for (int i = 0; i < 26; i++) {
				freq_map[i] = -1;
			}

			for (int i = 0; i < s.length(); i++) {
				int index = s.charAt(i) - 'a';
				if (freq_map[index] == -1) {
					freq_map[index] = i;
				} else {
					int distance = i - freq_map[index];
					if (distance > max) {
						max = distance;
					}
				}
			}
			if (max == Integer.MIN_VALUE) {
				System.out.println(-1);
			} else {
				System.out.println(max - 1);
			}
		}

	}
	
	
	

}
