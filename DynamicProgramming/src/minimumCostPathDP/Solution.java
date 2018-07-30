package minimumCostPathDP;

import java.util.Scanner;
public class Solution {
	
	public static int minCostPath(int input[][]) {
		if(input.length==1 && input[0].length==1) {
			return input[0][0];
		}
		int arr[][]= new int[input.length][input[0].length];
		int row= arr.length-1;
		int col= arr[0].length-1;
		arr[row][col]=input[row][col];
		for(int j=col-1;j>=0;j--) {
			arr[row][j]= input[row][j]+ arr[row][j+1];
		}
		for(int i=row-1;i>=0;i--) {
			arr[i][col]= input[i][col]+arr[i+1][col];
		}
		for(int i=row-1;i>=0;i--) {
			for(int j=col-1;j>=0;j--) {
				arr[i][j]= input[i][j]+Math.min(arr[i][j+1], Math.min(arr[i+1][j+1], arr[i+1][j]));
			}
		}
		return arr[0][0];
	}
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int n= scan.nextInt();
	int m= scan.nextInt();
	int arr[][]= new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]= scan.nextInt();
		}
	}
	int ans= minCostPath(arr);
	System.out.println(ans);
	scan.close();
}
}
