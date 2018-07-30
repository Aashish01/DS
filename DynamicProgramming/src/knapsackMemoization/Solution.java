package knapsackMemoization;

import java.util.Scanner;
public class Solution {
	public static int helpknapsack(int[] weight, int[] value,int maxWeight,int n,int startIndex,int[][] arr) {
		if(n==0) {
			return 0;
		}
		if(weight[startIndex]>maxWeight) {
			if(arr[n-1][maxWeight]!=-1) {
				arr[n][maxWeight]= arr[n-1][maxWeight];
				return arr[n][maxWeight];
			}else {
				arr[n-1][maxWeight]=helpknapsack(weight, value, maxWeight, n-1, startIndex+1, arr);
				arr[n][maxWeight]= arr[n-1][maxWeight];
				return arr[n][maxWeight];

			}
		}else {
			int x,y;
			if(arr[n-1][maxWeight]!=-1) {
				x=arr[n-1][maxWeight];
			}else {
				arr[n-1][maxWeight]=helpknapsack(weight, value, maxWeight, n-1, startIndex+1, arr);
				x=arr[n-1][maxWeight];
			}
			if(arr[n-1][maxWeight-weight[startIndex]]!=-1) {
				y= value[startIndex]+arr[n-1][maxWeight-weight[startIndex]];
			}else {
				arr[n-1][maxWeight-weight[startIndex]]=helpknapsack(weight, value, maxWeight-weight[startIndex], n-1, startIndex+1, arr);
			 y=value[startIndex]+arr[n-1][maxWeight-weight[startIndex]];
			}
			arr[n][maxWeight]=Math.max(x, y);
			return arr[n][maxWeight];
		}
	}
	public static int knapsack(int[] weight,int[] value,int maxWeight,int n) {
		int arr[][]= new int[n+1][maxWeight+1];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=-1;
			}
		}
		return helpknapsack(weight, value, maxWeight, n, 0, arr);
	}
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	int weight[]= new int[n];
	int value[]= new int[n];
	for(int i=0;i<weight.length;i++) {
		weight[i]= scan.nextInt();
	}
	for(int i=0;i<value.length;i++) {
		value[i]= scan.nextInt();
	}
	int maxWeight= scan.nextInt();
	int i= knapsack(weight, value, maxWeight, n);
	System.out.println(i);
	scan.close();
}
}
