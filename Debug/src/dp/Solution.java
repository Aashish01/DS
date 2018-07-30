package dp;

import java.util.Scanner;

public class Solution {
	public static int secondCountStepsTo1(int n) {
		int steps[]= new int[n+1];
		for(int i=2;i<=n;i++) {
			int count1, count2= Integer.MAX_VALUE;
			int count3= Integer.MAX_VALUE;
			count1=steps[i-1];
			if(i%2==0) {
				count2= steps[i/2];
			}
			if(i%3==0) {
				count3= steps[i/3];
			}
			steps[i]=1+ Math.min(count1, Math.min(count2, count3));
		}
		return steps[n];
	}
		public static void main(String[] args) {
			int input[][]= new int[5][6];
			Scanner scan = new Scanner(System.in);
			int n= scan.nextInt();
			System.out.println(secondCountStepsTo1(n));
			scan.close();
		}
}