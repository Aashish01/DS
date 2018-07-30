package timeLimitExceeded;

import java.io.*;
//this use buffer reader .
import java.util.NoSuchElementException;
public class MaxElement2 {
public static long newArray(long[] arr,int m,BufferedReader scan,long max) throws IOException{
	if(m==0) {
		return max;
	}
	String[] str= scan.readLine().split(" ");
	int a = Integer.parseInt(str[0]);
	int b = Integer.parseInt(str[1]);
	int k = Integer.parseInt(str[2]);
	for(int i=a-1;i<=b-1;i++) {
	arr[i] = arr[i]+k;
	if(max<arr[i]) {
		max=arr[i];
	}
     }
   return  newArray(arr, m-1,scan,max);
  }
public static long newArray(long[] arr,int m,BufferedReader scan) throws IOException{
	return newArray(arr, m, scan, Long.MIN_VALUE);
}
public static void main(String[] args) throws IOException {
	try {
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String[] str = scan.readLine().split(" ");
	int n = Integer.parseInt(str[0]);
	long arr[] = new long[n];
	int m= Integer.parseInt(str[1]);
	long ans =newArray(arr, m,scan);
	System.out.println(ans);
	scan.close();
	}catch(NoSuchElementException e) {
		
	}
    
}
}
