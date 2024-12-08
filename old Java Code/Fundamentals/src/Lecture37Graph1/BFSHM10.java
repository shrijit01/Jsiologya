package Lecture37Graph1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSHM10 {
	public static void printHelper(int edges[][] ,int sv,boolean visited[]) {
		Queue<Integer> q = new LinkedList<>();
		//adding stsrt vertice in Queue
		q.add(sv);
		//vidited array with starting vertices as true
		visited[sv] = true;
		while(q.size() != 0) {
			int firstelem = q.remove();
			System.out.println(firstelem + " ");
			for (int i = 0; i < edges.length; i++) {
				if(edges[firstelem][i] == 1 && !visited[i]) {
					q.add(i);
					visited[i]= true;
				}
			}
		}
	}
	
	public static void print(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for (int i = 0; i < edges.length; i++) {
			if(!visited[i]) {
				printHelper(edges,i,visited);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//vertices
		int V = s.nextInt();
		int E = s.nextInt();
		int edges[][] = new int[V][V];
		for (int i = 0; i < E ; i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		print(edges);
	}

}
