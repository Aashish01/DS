package countGroupOfIslands;
import java.util.Scanner;
public class Solution {
    public static int solve(int n,int m,int U[],int V[]) {
        int graph[][]= new int[n+1][n+1];
        int count=0;
        for(int i=0;i<graph.length;i++) {
        	graph[0][i]=-1;
        	graph[i][0]=-1;
        }
        for(int i=0;i<U.length;i++) {
        	graph[U[i]][V[i]]=1;
        	graph[V[i]][U[i]]=1;
        }
        boolean visited[]= new boolean[n+1];
        visited[0]=true;
        for(int i=1;i<visited.length;i++) {
        	if(visited[i]==false) {
        		helper(i, graph, visited);
        		count++;
        	}
        }
        return count;
    }
    public static void helper(int startIndex, int[][] graph,boolean[] visited) {
    	visited[startIndex]=true;
    	for(int i=1;i<graph[0].length;i++) {
    		if(graph[startIndex][i]==1 && visited[i]==false) {
    			helper(i, graph, visited);
    		}
    	}
    	return;
    }
    public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		int U[]= new int[m];
		int V[]= new int[m];
		for(int i=0;i<m;i++) {
			U[i]=scan.nextInt();
		}
		for(int i=0;i<m;i++) {
			V[i]=scan.nextInt();
		}
		int ans= solve(n, m, U, V);
		System.out.println(ans);
		scan.close();
		

	}
}
