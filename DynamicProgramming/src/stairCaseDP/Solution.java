package stairCaseDP;

import java.util.Scanner;

public class Solution {
	public static long staircase(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		if(n==3) {
			return 4;
		}
		//n>3
		long arr[]= new long[n+1];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		for(int i=4;i<=n;i++) {
			arr[i]= arr[i-1]+arr[i-2]+arr[i-3];
		}
		return arr[n];
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		//for testing multiple test cases in one go.
		while(n!=-1) {
			long ans= staircase(n);
			System.out.println(ans);
			n=scan.nextInt();

		}
				
		scan.close();
	}

}
