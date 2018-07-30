package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FindUnique{	

	public static int findUnique(int[] arr){
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				int unique= arr[i];
				return unique;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
System.out.println(findUnique(arr));
	}
}