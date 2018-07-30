package Hackerrank;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[][] arr = new int[6][6];
	for(int i=0;i<6;i++) {
		for(int j=0;j<6;j++) {
			arr[i][j]= scan.nextInt();
		}
	}
	int max= Integer.MIN_VALUE;
	int row_start=0;
	int col_start=0;
	int sum=0;
	while(row_start<=3 && col_start<=3) {
		for(int i=row_start;i<row_start+3;i++) {
			for(int j=col_start;j<col_start+3;j++) {
				sum+= arr[i][j];
			}
		}
		sum = sum- arr[row_start+1][col_start] -arr[row_start+1][col_start+2];
		if(max<sum) {
			max=sum;
		}
		sum =0;
		row_start++;
		if(row_start==4) {
			col_start++;
			row_start=0;
		}
	}
	System.out.println(max);
	scan.close();
	
}
}
