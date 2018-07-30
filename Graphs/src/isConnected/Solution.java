package isConnected;

import java.util.Scanner;

public class Solution {
	public static boolean[] helper(int[][] graph, boolean[] visited, int startIndex) {
		visited[startIndex]= true;
		for(int i=0;i<graph[0].length;i++) {
			if(graph[startIndex][i]==1 && visited[i]==false) {
				visited= helper(graph,visited,i);
			}
		}
		return visited;
	}
	public static boolean checkConnected(int[][] graph) {
		boolean visited[]= new boolean[graph.length];
		visited= helper(graph,visited,0);
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				return false;
			}
		}
		return true;
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
    boolean ans= checkConnected(graph);
    System.out.println(ans);
	scan.close();

}
}
