package printGraphBFS;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Solution {
	public static void printHelper(int[][] graph,boolean visited[],int startIndex) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(startIndex);
		visited[startIndex]=true;
		while(!queue.isEmpty()) {
			int i=queue.remove();
			System.out.print(i+" ");
			for(int j=0;j<graph.length;j++) {
				if(graph[i][j]==1 && visited[j]==false) {
					queue.add(j);
					visited[j]=true;
				}
			}
		}
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				startIndex=i;
				printHelper(graph, visited, startIndex);
				break;
			}
		}
		return;
	}
	public static void print(int[][] graph) {
		boolean visited[]= new boolean[graph.length];
		int startIndex=0;
		printHelper(graph, visited, startIndex);
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
