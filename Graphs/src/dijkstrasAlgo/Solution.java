package dijkstrasAlgo;
import java.util.Scanner;
public class Solution {
	public static int[] dijkstras(int[][] graph) {
		int n= graph.length;
		int arr[]= new int[n];
		arr[0]=0;
		for(int i=1;i<arr.length;i++) {
			arr[i]=Integer.MAX_VALUE;
		}
		int m=n;
		boolean visited[]= new boolean[n];
		while(m!=0) {
			int min= Integer.MAX_VALUE;
			int minVertex=-1;
			for(int i=0;i<arr.length;i++) {
				if(visited[i]==false && arr[i]<min) {
					min= arr[i];
					minVertex=i;
				}
			}
			visited[minVertex]=true;
			for(int i=0;i<graph[0].length;i++) {
				if(graph[minVertex][i]!=0 && visited[i]==false) {
					if((arr[minVertex]+graph[minVertex][i])<arr[i]) {
						arr[i]= arr[minVertex]+ graph[minVertex][i];
					}
				}
			}
		m--;
		}
		return arr;
	}
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int n= scan.nextInt();
	int e= scan.nextInt();
	int graph[][]= new int[n][n];
	for(int i=0;i<e;i++) {
		int sI=scan.nextInt();
		int eI= scan.nextInt();
		int weight=scan.nextInt();
		graph[sI][eI]=weight;
		graph[eI][sI]=weight;
	}
	int arr[]= dijkstras(graph);
	for(int i=0;i<arr.length;i++) {
		System.out.println(i+" "+arr[i]);
	}
    scan.close();
}
}
