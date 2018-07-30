package hasPath;

import java.util.Scanner;

public class Solution {
	public static boolean checkPathHelper(int[][] graph, boolean[] visited,int startIndex, int v2) {
		if(graph[startIndex][v2]==1) {
			return true;
		}
		visited[startIndex]=true;
		for(int i=0;i<graph.length;i++) {
			if(graph[startIndex][i]==1 && visited[i]==false) {
				boolean hold= checkPathHelper(graph, visited, i, v2);
				if(hold==true) {
					//v2 found at this vertex so return true & exit.
					return hold;
				}else {
					//try for next adjacent vertex
				}
			}
		}
		// in the end if not found
		return false;
		
	}
	public static boolean checkPath(int[][] graph,int v1,int v2) {
		if(v1>=graph.length || v2>=graph.length) {
			return false;
		}
		int startIndex=v1;
		boolean visited[]= new boolean[graph.length];
		return checkPathHelper(graph, visited, startIndex, v2);
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
		int v1= scan.nextInt();
		int v2= scan.nextInt();
	    boolean hasPath= checkPath(graph, v1, v2);
	    System.out.println(hasPath);
		scan.close();
				
	}

}
