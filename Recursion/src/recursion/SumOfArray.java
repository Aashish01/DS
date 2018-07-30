package recursion;

import java.util.Scanner;

public class SumOfArray {
	public static int sum(int arr[]) {
		if(arr.length==0) {   //base case ,no need to add else ,as if it happen return take out of program .
			return 0;
		}
		int arr2[] = new int[arr.length-1];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr[i+1];
		}
	return arr[0]+ sum(arr2);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(sum(arr));
		scan.close();
	}

}
