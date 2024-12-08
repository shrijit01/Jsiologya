package Lecture38Graph2;

import java.util.Scanner;

public class DijkstrasAlgorithmCode17 {
	
	
	private static int findMinVertex(boolean[] visited, int[] distance) {
		int minVertex = -1;
		for (int i = 0; i < visited.length; i++) {
			if(!visited[i] &&(minVertex == -1 || distance[i] < distance[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}
	
	
	
	public static void dijkstra(int adjMatrix[][]) {
		int n = adjMatrix.length;
		boolean visited[] = new boolean[n];
		int distance[] = new int[n];
		distance[0] = 0;
		for (int i = 1; i < n; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i < n-1; i++) {
			int minVertex = findMinVertex(visited,distance);
			visited[minVertex] = true;
			for(int j = 0; j < n; j++) {
				if(adjMatrix[minVertex][j] > 0 && !visited[j] && adjMatrix[minVertex][j] != Integer.MAX_VALUE) {
					// j is unvisited neighbour of min vertex
					//calculate distance to reach j from source via minvertex
					int newDist = distance[minVertex] + adjMatrix[minVertex][j];
					if(newDist < distance[j]) {
						distance[j] = newDist;
					}
				}
			}
		}
		//print distance value for all vertices
		for(int i = 0; i < n; i++) {
			System.out.println(i + " "+distance[i]);
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
			int weight = s.nextInt();
			adjMatrix[v1][v2] = weight;
			adjMatrix[v2][v1] = weight;
		}
		dijkstra(adjMatrix);

	}

}
//input
//5 8
//0 1 4
//0 2 8
//1 2 2
//1 3 6
//1 4 8
//2 3 3
//2 4 5
//3 4 7
//output
//0 0
//1 4
//2 6
//3 9
//4 11
