package minCountOfSquaresRecursion;

import java.util.Scanner;

public class Solution {
	public static int min= Integer.MAX_VALUE;
	public static void helpminCount(int n, int count) {
		if(n==0) {
			if(count<min) {
				min=count;
			}
			return;
		}
		double d= Math.pow(n, 0.5);
		int max=(int)d;
		for(int i=1;i<=max;i++) {
			helpminCount(n-(i*i), count+1);
		}
	}
	public static int minCount(int n) {
		if(n==0) {
			return 0;
		}
		helpminCount(n, 0);
		return min;
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		System.out.println(minCount(n));
		scan.close();
		}

}
