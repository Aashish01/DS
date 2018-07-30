//Eureka :this soln works absolutely correct everywhere!
package kruskalAlgo;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
public class Solution {
	public static int vertices;
	public static ArrayList<Edge> inputGraph(int n,int e, Scanner scan){
		ArrayList<Edge> list = new ArrayList<>();
		vertices=n;
		for(int i=0;i<e;i++) {
			int startIndex= scan.nextInt();
			int endIndex= scan.nextInt();
			int weight= scan.nextInt();
			Edge edge= new Edge(startIndex, endIndex, weight);
			list.add(edge);
		}
		return list;
	}
	public static ArrayList<Edge> mst(ArrayList<Edge> list){
		WeightCompare obj = new WeightCompare();
		PriorityQueue<Edge> pq= new PriorityQueue<>(obj);
		for(Edge elem: list) {
			pq.add(elem);
		}
		ArrayList<Edge> mstList= new ArrayList<>();
		int arr[]= new int[vertices];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		int count=vertices-1;
		while(count!=0) {
			Edge e= pq.remove();
			if(arr[e.startIndex]!=arr[e.endIndex]) {
				int x= arr[e.endIndex];
				int y= arr[e.startIndex];
			 for(int i=0;i<arr.length;i++) {
				 
				if(arr[i]==x) {
					arr[i]=y ;
				}
				
			 }
			 mstList.add(e);
			 count--;
			}
		}
		return mstList;
	}
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int V = s.nextInt();
	int E = s.nextInt();

	ArrayList<Edge> list= inputGraph(V,E,s);
	ArrayList<Edge> mst= mst(list);
	for(Edge elem: mst) {
		Edge e= elem;
      if(e.startIndex<=e.endIndex){
        System.out.println(e.startIndex+" "+e.endIndex+" "+e.weight);
      }else{
        System.out.println(e.endIndex+" "+e.startIndex+" "+e.weight);
      }

	}
	s.close();
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
class WeightCompare implements Comparator<Edge>{

	@Override
	public int compare(Edge o1, Edge o2) {
	if(o1.weight<o2.weight) {
		return -1;
	}else if(o1.weight>o2.weight) {
		return 1;
	}else {
		return 0;
	}
	
    }	
}
