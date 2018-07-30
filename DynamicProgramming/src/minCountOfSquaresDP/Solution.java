package minCountOfSquaresDP;

import java.util.Scanner;
import java.util.PriorityQueue;
public class Solution {
	public static int minCount(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		int arr[]= new int[n+1];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		
		PriorityQueue<Integer> minHeap;
		for(int j=3;j<=n;j++) {
			double sqrt= Math.pow(j, 0.5);
			int max= (int)sqrt;
			minHeap= new PriorityQueue<>();
			for(int i=1;i<=max;i++) {
				minHeap.add(arr[j-(i*i)]);
			}
			arr[j]=1+minHeap.peek();
		}
		return arr[n];
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		System.out.println(minCount(n));
		scan.close();
		}

}
