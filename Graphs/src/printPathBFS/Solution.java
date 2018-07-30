package printPathBFS;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
	public static ArrayList<Integer> helper(int[][] graph, int v1, int v2, boolean[] visited){
		ArrayList<Integer> list1;
		if(v1>=graph.length || v2>= graph.length) {
			return null;
		}
		if(v1==v2) {
			list1= new ArrayList<>();
			list1.add(v1);
			return list1;
		}
		int startIndex=v1;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(startIndex);
		visited[startIndex]= true;
		HashMap<Integer, Integer> map = new HashMap<>();
		while(!queue.isEmpty()) {
			int i= queue.remove();
			if(graph[i][v2]==1 && i==v1) {
				list1= new ArrayList<>();
				list1.add(v2);
				list1.add(i);
				return list1;
			}
			if(graph[i][v2]==1 && i!=v1) {
				list1= new ArrayList<>();
				list1.add(v2);
				list1.add(i);
				while(i!=v1) {
					int k= map.get(i);
					list1.add(k);
					i=k;
				}
				return list1;
			} 
			for(int j=0;j<graph.length;j++) {
				if(graph[i][j]==1 && visited[j]==false) {
					queue.add(j);
					visited[j]=true;
					map.put(j, i);
				}
			}
			
		}
		list1=null;
		return list1;
		
	}
	public static void printBfsPAth(int[][] graph, int v1, int v2) {
		boolean visited[]= new boolean[graph.length];
		ArrayList<Integer> list = helper(graph, v1, v2, visited);
		if(list!=null) {
			for(int elem : list) {
				System.out.print(elem +" ");
			}
		}
		return;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int V= s.nextInt();
	int E= s.nextInt();
	int graph[][]= new int[V][V];
	for(int i=0;i<E;i++) {
		int startIndex= s.nextInt();
		int endIndex= s.nextInt();
		graph[startIndex][endIndex]=1;
		graph[endIndex][startIndex]=1;
	}
	int v1= s.nextInt();
	int v2= s.nextInt();
	printBfsPAth(graph, v1, v2);
	s.close();
}
}
