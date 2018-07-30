package knapsack;
import java.util.Scanner;
public class Solution {
	public static int helpknapsack(int[] weight,int value[],int maxWeight, int n,int startIndex) {
		if(n==0) {
			return 0;
		}
		if(weight[startIndex]>maxWeight) {
			return helpknapsack(weight, value, maxWeight, n-1, startIndex+1);
		}else {
			int x= helpknapsack(weight, value, maxWeight, n-1, startIndex+1);
			int y= value[startIndex]+ helpknapsack(weight, value, maxWeight-weight[startIndex], n-1, startIndex+1);
		return Math.max(x, y);
		}
	}
	public static int knapsack(int[] weight,int value[],int maxWeight,int n) {
		return helpknapsack(weight, value, maxWeight, n, 0);
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
