package recursion;

import java.util.Scanner;

public class AllPositions {
	private static int[] position(int[] input, int startIndex, int x) {
		if(startIndex>input.length-1) {
			return store;
		}

		if(input[startIndex]==x) {
		
			store[store.length-1]= startIndex;
			store =	resizeArr(store);
		}
			return position(input, startIndex+1, x);
		
		
	}
	public static int store[] = new int[1] ;
	public static int[] resizeArr(int[] arr) {
		int temp[] = arr;
		arr = new int[temp.length+1];
		for(int i=0;i<temp.length;i++) {
			arr[i] = temp[i];
		}
		return arr;
	}
	public static int[] position(int input[],int x) {
	return	position(input,0,x);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int x= scan.nextInt();
		int ans[] = position(arr, x);
		for(int i=0;i<ans.length-1;i++) {  //don't show value at last index of array.
			System.out.print(ans[i]+" ");
		}
		
		scan.close();
	}

}
