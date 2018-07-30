package recursion;

import java.util.Scanner;

public class Solution2 {
	private static int[] allIndexes(int[] input, int startIndex, int x) {
		if(startIndex>input.length-1) {
          int ans[] = new int[store.length-1];
          for(int i=0;i<store.length-1;i++){
            ans[i]=store[i];
          }
			return ans;
		}

		if(input[startIndex]==x) {
		
			store[store.length-1]= startIndex;
			store =	resizeArr(store);
		}
			return allIndexes(input, startIndex+1, x);
		
		
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
	public static int[] allIndexes(int input[],int x) {
	return	allIndexes(input,0,x);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int x= scan.nextInt();
		int ans[] = allIndexes(arr, x);
		for(int i=0;i<ans.length;i++) {  //don't show value at last index of array.
			System.out.print(ans[i]+" ");
		}
		
		scan.close();
	}

}
