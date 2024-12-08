package Lecture37Graph1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSDFSForDisconnectedGraph15 {

	public static void dfTraversal(int adjMatrix[][] ,int currentVertex, boolean visited[]){
		visited[currentVertex] = true;
		System.out.print(currentVertex +" ");
		for (int i = 0; i < adjMatrix.length; i++) {
			if(adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
				dfTraversal(adjMatrix,i,visited);
			}
		}
	}


	public static void  dfTraversal(int adjMatrix[][]) {
		boolean visited[] = new boolean[adjMatrix.length];
		for (int i = 0; i < adjMatrix.length; i++) {
			if(!visited[i]) {
				dfTraversal(adjMatrix,i,visited);
				System.out.println();
			}
		}
	}
	//BFS traversal
	public static void bfTraversal(int adjMatrix[][]) {
		Queue<Integer> pendingVertices = new LinkedList<>();
		boolean visited[] = new boolean[adjMatrix.length];
		visited[0] = true;
		pendingVertices.add(0);

		while(!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			System.out.print(currentVertex + " ");
			for (int i = 0; i < adjMatrix.length; i++) {
				if(adjMatrix[currentVertex][i] == 1 && !visited[i]) {
					pendingVertices.add(i);
					visited[i] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int adjMatrix[][] = new int[n][n];

		for (int i = 0; i < e; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		dfTraversal(adjMatrix);
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
}
