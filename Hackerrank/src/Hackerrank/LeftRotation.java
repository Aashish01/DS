package Hackerrank;
import java.util.Scanner;
public class LeftRotation {
	public static int[] leftRotation(int[] arr, int m) {
		if(m==0) {
			return arr;
		}
		int temp = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]= arr[i];
		}
		arr[arr.length-1]=temp; //last = first.
		
		return leftRotation(arr, m-1);
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int m = scan.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] =scan.nextInt();
	}
	int ans[] =leftRotation(arr, m);
	for(int i=0;i<n;i++) {
		System.out.print(ans[i]+" ");
	}

	scan.close();
}
}
