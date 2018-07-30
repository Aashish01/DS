package recursion;

import java.util.Scanner;

public class LastPosition {
	private static int position(int[] input, int startIndex,int max, int x) {
		if(startIndex>input.length-1 && max ==Integer.MIN_VALUE) {
			return -1;
		}else if(startIndex>input.length-1 && max !=Integer.MIN_VALUE) {
			return max;
		}

		if(input[startIndex]==x) {
			if(max<startIndex) {
				max=startIndex;
			}
		}
			return position(input, startIndex+1,max, x);
		
		
	}
	
	public static int position(int input[],int x) {
	return	position(input,0,Integer.MIN_VALUE,x);
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
