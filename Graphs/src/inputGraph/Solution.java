package inputGraph;
import java.util.Scanner;
public class Solution {
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
	scan.close();
	for(int i=0;i<graph.length;i++) {
		for(int elem: graph[i]) {
			System.out.print(elem+" ");
		}
    System.out.println();
	}
		
}
}
