package printDifferentConnectedComponents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static ArrayList<Integer> helper(int[][] graph,boolean[] visited, int startIndex){
		ArrayList<Integer> list= new ArrayList<>();
		list.add(startIndex);
		visited[startIndex]=true;
		for(int i=0;i<graph[0].length;i++) {
			if(graph[startIndex][i]==1 && visited[i]==false) {
				ArrayList<Integer> list1= helper(graph, visited, i);
				for(int elem : list1) {
				list.add(elem);	
				}
			}
		}
		return list;
	}
	public static ArrayList<ArrayList<Integer>> allConnectedComponents(int[][] graph){
		boolean[] visited= new boolean[graph.length];
		ArrayList<ArrayList<Integer>> list= new ArrayList<>();
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				ArrayList<Integer> miniList= helper(graph, visited, i);
				list.add(miniList);
			}
		}
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
		ArrayList<ArrayList<Integer>> list= allConnectedComponents(graph);
		while(!list.isEmpty()) {
			ArrayList<Integer> miniList= list.remove(0);
			int arr[]= new int[miniList.size()];
			int i=0;
			for(int elem : miniList) {
				arr[i]=elem;
				i++;
			}
			Arrays.sort(arr);
			for(int elem : arr) {
				System.out.print(elem +" ");
			}
			System.out.println();
		}
		scan.close();

	}			
}
