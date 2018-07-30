package recursion;

import java.util.Scanner;

public class CheckIfNoIsPresent {
	public static boolean checkNo(int arr[],int x) {
		if(arr.length==0) {   //base case ,no need to add else ,as if it happen return take out of program .
			return false;
		}
		if(arr[0]==x) {
			return true;
		}else {
		int arr2[] = new int[arr.length-1];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr[i+1];
		}
	return  checkNo(arr2,x);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int x= scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(checkNo(arr,x));
		scan.close();
	}

}
