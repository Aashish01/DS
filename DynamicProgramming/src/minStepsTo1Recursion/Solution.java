package minStepsTo1Recursion;
import java.util.Scanner;
public class Solution {
	public static int min= Integer.MAX_VALUE;
	public static void helpCountSteps(int n, int count) {
		if(n==1) {
			if(count<min) {
				min= count;
			}
			return;
		}
		if(n>=2 && n%2==0) {
			helpCountSteps(n-1, count+1);
			helpCountSteps(n/2, count+1);
		}
		if(n>=3 && n%3==0) {
			helpCountSteps(n-1, count+1);
			helpCountSteps(n/3, count+1);
		}
		helpCountSteps(n-1, count+1);
	}
	public static int countStepsTo1(int n) {
		helpCountSteps(n, 0);
		return min;
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	System.out.println(countStepsTo1(n));
	scan.close();
}
}
