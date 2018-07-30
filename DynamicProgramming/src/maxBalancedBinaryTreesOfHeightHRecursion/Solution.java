package maxBalancedBinaryTreesOfHeightHRecursion;

import java.util.Scanner;

public class Solution {
	public static long balancedTreesOfHeightH(int height) {
		if(height==0) {
			return 1;
		}
		if(height==1) {
			return 1;
		}
		double m= Math.pow(10, 9)+7;
		int m1= (int)m;
		//System.out.println(m1);
		long x= balancedTreesOfHeightH(height-1);
		long y= balancedTreesOfHeightH(height-2);
		
		return (((x*x)%m1)+ ((2*x*y)%m1))%m1;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	System.out.println(balancedTreesOfHeightH(n));
	scan.close();
}
}
