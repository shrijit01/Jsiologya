package Lecture37Graph1;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class AssignmentIsLandHM24 {
	public static void numConnected(int[][] edges, Queue<Integer> queue, boolean[] visited) {
		if (queue.isEmpty())
			return;
		for (int i = 0; i < visited.length; i++) {
			if (edges[queue.peek()][i] == 1 && !visited[i]) {
				queue.add(i);
				visited[i] = true;
			}
		}
		queue.poll();
		numConnected(edges, queue, visited);
	}

	public static int numConnected(int[][] edges, int n) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[edges.length];
		int count = 0;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				count++;
				queue.add(i);
				visited[i] = true;
				numConnected(edges, queue, visited);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
	}
}
