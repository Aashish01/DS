package maxBalancedBinaryTreesOfHeightHDP;

import java.util.Scanner;

public class Solution {
	public static long balancedTreesOfHeightH(int height) {
		if(height==0) {
			return 1;
		}
		if(height==1) {
			return 1;
		}
		long arr[]= new long[height+1];
		int m= 1000000007;
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<=height;i++) {
			arr[i]= (arr[i-1]*arr[i-1])%m+(2*(arr[i-2]*arr[i-1]%m))%m;
		}
		return arr[height];
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		System.out.println(balancedTreesOfHeightH(n));
		scan.close();
	}

}
