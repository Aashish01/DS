package recursion;
import java.util.*;
public class CheckSortedArray {
	public static boolean checkSort(int[] arr) {
		if(arr.length<=1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}else {
			int arr2[] = new int[arr.length-1];
			for(int i=0;i<arr2.length;i++) {
				arr2[i]=arr[i+1];
			}
			return checkSort(arr2);
		}
	}
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(checkSort(arr));
	scan.close();
}
	
}
