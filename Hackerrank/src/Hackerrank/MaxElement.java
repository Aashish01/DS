package Hackerrank;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class MaxElement {
public static long newArray(long[] arr,int m,Scanner scan,long max) {
	if(m==0) {
		return max;
	}
	int a = scan.nextInt();
	int b = scan.nextInt();
	int k = scan.nextInt();
    for(int i=a-1;i<=b-1;i++) {
	arr[i] = arr[i]+k;
	if(max<arr[i]) {
		max=arr[i];
	}
     }
   return  newArray(arr, m-1,scan,max);
  }
public static long newArray(long[] arr,int m,Scanner scan) {
	return newArray(arr, m, scan, Long.MIN_VALUE);
}
public static void main(String[] args) {
	try {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	long arr[] = new long[n];
	int m= scan.nextInt();
	long ans =newArray(arr, m,scan);
	System.out.println(ans);
	scan.close();
	}catch(NoSuchElementException e) {
		
	}
    
}
}
