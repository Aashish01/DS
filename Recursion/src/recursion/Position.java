package recursion;

import java.util.Scanner;

public class Position {
	private static int position(int[] input, int startIndex, int x) {
		if(startIndex>input.length-1) {
			return -1;
		}
		if(input[startIndex]==x) {
			return startIndex;
		}else {
			return position(input, startIndex+1, x);
		}
		
	}
	
	public static int position(int input[],int x) {
	return	position(input,0, x);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int x= scan.nextInt();
		System.out.println(position(arr,x));
		scan.close();
	}

}
