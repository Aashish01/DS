package recursion;

import java.util.Scanner;

public class FindGeometricSum {
	public static double findGeometricSum(int k){
		if(k==0) {
			return 1;
		}
		double d =1/power(2, k);
		return d + findGeometricSum(k-1);

	}
	public static double power(int x,int n) {
		if(n==0) {
			return 1;
		}
		return x*power(x,n-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m= scan.nextInt();
		System.out.println(findGeometricSum(m));	
		scan.close();
	}

}
