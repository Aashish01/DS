package minimumCostPathRecursion;
import java.util.Scanner;
public class Solution {
	public static int helperMinCostPath(int input[][], int row, int col) {
		if(row==input.length-1 && col== input[0].length-1) {
			return input[row][col];
		}
		int x, y,z;
		if(row== input.length-1 && col<input[0].length-1) {
			x= helperMinCostPath(input, row, col+1);
			y= Integer.MAX_VALUE;
			z=Integer.MAX_VALUE;
		}else if(col==input[0].length-1 && row<input.length-1) {
			z=helperMinCostPath(input, row+1, col);
			x= Integer.MAX_VALUE;
			 y= Integer.MAX_VALUE;
		}else {
			x= helperMinCostPath(input, row, col+1);
			y=helperMinCostPath(input, row+1, col+1);
			z=helperMinCostPath(input, row+1, col);
		}
		return input[row][col]+ Math.min(x, Math.min(y, z));
	}
	public static int minCostPath(int input[][]) {
		return helperMinCostPath(input, 0, 0);
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
