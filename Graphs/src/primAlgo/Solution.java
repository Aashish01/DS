package primAlgo;
//Accepted perfectly 100/100
//This is For non zero weights, for zero weights ,initialise by -1 in weighted graphs.
import java.util.Scanner;
import java.util.ArrayList;
public class Solution {
	public static ArrayList<Edge> mst(int[][] graph){
		int n= graph.length;
		boolean visited[]= new boolean[n];
		int parent[]= new int[n];
		int weight[]= new int[n];
		parent[0]=-1;
		weight[0]=0;
		for(int i=1;i<n;i++) {
			parent[i]=-1;
			weight[i]=Integer.MAX_VALUE;
		}
		int m=n;
		while(m!=0) {
			int minVertex=-1;
			int min= Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				if(weight[i]<min && visited[i]==false) {
					min=weight[i];
					minVertex=i;
				}
			}
			visited[minVertex]=true;
			for(int i=0;i<graph[0].length;i++) {
				if(graph[minVertex][i]!=0 && visited[i]==false) {
					if(graph[minVertex][i]<weight[i]) {
						weight[i]= graph[minVertex][i];
						parent[i]= minVertex;
					}
				}
			}
			m--;
		}
		ArrayList<Edge> list= new ArrayList<>();
		for(int i=1;i<n;i++) {
			Edge e= new Edge(i, parent[i], weight[i]);
			list.add(e);
		}
		return list;
	}
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int V= scan.nextInt();
	int E= scan.nextInt();
	int graph[][]= new int[V][V];
	for(int i=0;i<V;i++) {
		for(int j=0;j<V;j++) {
			graph[i][j]=0;
		}
	}
	for(int i=0;i<E;i++) {
		int startIndex= scan.nextInt();
		int endIndex= scan.nextInt();
		int weight= scan.nextInt();
		graph[startIndex][endIndex]= weight;
		graph[endIndex][startIndex]= weight;
	}
	ArrayList<Edge> list = mst(graph);
	for(Edge elem: list) {
		Edge edge = elem;
		if(edge.startIndex<edge.endIndex) {
			System.out.println(edge.startIndex+" "+edge.endIndex+" "+edge.weight);
		}else {
			System.out.println(edge.endIndex+" "+edge.startIndex+" "+edge.weight);
		}
		
	}
	scan.close();
}
}
class Edge{
	int startIndex;
	int endIndex;
	int weight;
	public Edge(int s, int e, int w) {
		this.startIndex=s;
		this.endIndex=e;
		this.weight=w;
	}
}
