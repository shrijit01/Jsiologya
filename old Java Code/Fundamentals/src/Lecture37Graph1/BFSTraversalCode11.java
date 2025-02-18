package Lecture37Graph1;

import java.nio.channels.AcceptPendingException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTraversalCode11 {

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
		dfTraversal(adjMatrix,0,visited);
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

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(adjMatrix[i][j]+" ");
//			}
//			System.out.println();
//		}
//		-
//		dfTraversal(adjMatrix);//0 1 2 3
		bfTraversal(adjMatrix);
	//input
//		5 4
//		0 2
//		0 3
//		2 1
//		3 4
		//output
//		0 2 3 1 4
	}

}
