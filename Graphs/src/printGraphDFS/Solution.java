package printGraphDFS;

import java.util.Scanner;
public class Solution {
	public static void printHelper(int[][] graph, boolean[] visited,int startIndex) {
		System.out.println(startIndex);
		visited[startIndex]=true;
		int n= graph.length;
		for(int i=0;i<n;i++) {
			if(graph[startIndex][i]==1 && visited[i]==false) {
				printHelper(graph, visited, i);
			}
		}
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				startIndex=i;
				printHelper(graph, visited, startIndex);
			}
		}
		return;
	}
	public static void print(int graph[][]) {
		int n= graph.length;
		boolean visited[]= new boolean[n];
		printHelper(graph, visited, 0);
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int e= scan.nextInt();
	int graph[][]= new int[n][n];
	for(int i=0;i<e;i++) {
		int startVertex= scan.nextInt();
		int endVertex= scan.nextInt();
		graph[startVertex][endVertex]=1;
		graph[endVertex][startVertex]=1;
		
	}
	print(graph);
	scan.close();
			
}
}
