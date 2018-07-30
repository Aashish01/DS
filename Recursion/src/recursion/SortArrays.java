package recursion;

import java.util.*;
public class SortArrays {
	
	public static void quickSort(int[] input) {
	Arrays.sort(input);	
	}
  public static void main(String[] args){
   
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		quickSort(arr);
    for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();
  }
	
}