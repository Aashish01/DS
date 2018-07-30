package fibonacciMemoization;

import java.util.Scanner;
public class Solution {
	//Memoization
	public static int fibM(int n, int arr[]) {
		if(n==0) {
			arr[0]=0;
			return 0;
		}
		if(n==1) {
			arr[1]=1;
			return 1;
		}
		if(arr[n]!=-1) {
			return arr[n];
		}
		arr[n]= fibM(n-1,arr)+ fibM(n-2, arr);
		return arr[n];
	}
	public static int fib(int n) {
		int arr[]= new int[n+1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
		return fibM(n,arr);
	}
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int n= scan.nextInt();
	System.out.println(fib(n));
	scan.close();
}
}

