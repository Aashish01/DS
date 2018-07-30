package printPathDFS;

import java.util.Scanner;
import java.util.ArrayList;
public class Solution2 {
	public static ArrayList<Integer> findPathHelper(int[][] graph, boolean[] visited, int startIndex,int v2){
		ArrayList<Integer> path= new ArrayList<>();
		if(startIndex>=graph.length || v2>=graph.length) {
			return null;
		}
		if(startIndex==v2) {
			path.add(startIndex);
			return path;
		}
		if(graph[startIndex][v2]==1) {
			path.add(v2);
			path.add(startIndex);
			return path;
		}
		visited[startIndex]=true;
		for(int i=0;i<graph.length;i++) {
			if(graph[startIndex][i]==1 && visited[i]==false){
				path= findPathHelper(graph, visited, i, v2);
				if(path!=null) {
					path.add(startIndex);
					return path;
				}else {
					//try for next adjacent nodes of startIndex.
					continue;
				}
			}
		}
		return path;
	}
	public static ArrayList<Integer> printPath(int[][] graph,int v1,int v2) {
		boolean visited[]= new boolean[graph.length];
		ArrayList<Integer> list = findPathHelper(graph, visited, v1, v2);
		return list;
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
	 ArrayList<Integer> list= printPath(graph, v1, v2);
	 if(list!=null) {
		 for(int elem: list) {
			 System.out.print(elem+" ");
		 }
	 }
		scan.close();
				
	}

}
