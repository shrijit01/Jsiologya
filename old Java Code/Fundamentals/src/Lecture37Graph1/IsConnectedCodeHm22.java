package Lecture37Graph1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsConnectedCodeHm22 {
	
	
	private static boolean isConnected(int[][] edges, int sv) {
		
		boolean[] visited = new boolean[edges.length];
		Queue<Integer> q = new LinkedList<>();
		q.add(sv);
		visited[sv] = true;
		
		while(!q.isEmpty()) {
			int front = q.poll();
			for (int i = 0; i < edges.length; i++) {
				if(!visited[i] && edges[front][i] == 1) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
		for(boolean b : visited) {
			if(!b) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int edges[][] = new int[n][n];

		for (int i = 0; i < e; i++) {
			int se = s.nextInt();
			int ee = s.nextInt();
			edges[se][ee] = 1;
			edges[ee][se] = 1;
		}
		System.out.println(isConnected(edges,0));

	}

	

}
