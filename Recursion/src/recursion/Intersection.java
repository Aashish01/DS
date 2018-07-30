package recursion;

import java.util.Arrays;
import java.util.Scanner;
//Do comparisons in the way we merge 2 sorted arrays into 3rd one
//Time complexity m+n.
public class Intersection {
	public static void intersection(int[] arr1, int[] arr2){
		int m= arr1.length;
		int n= arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);

	      int i = 0, j = 0;
	      while (i < m && j < n)
	      {
	        if (arr1[i] < arr2[j])
	          i++;
	        else if (arr2[j] < arr1[i])
	          j++;
	        else
	        {
	          System.out.println(arr2[j++]);
	          i++;
	        }
	      }
	    
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int n1= scan.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n1;i++) {
			arr1[i]=scan.nextInt();
		}
intersection(arr, arr1);

	}
}
