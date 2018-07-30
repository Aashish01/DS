package recursion;
import java.io.*;
public class RecursiveBinarySearch {
	public static int binarySearch(int[] arr,int start,int end, int x) {
		int middle = (start+end)/2;
		if(start>end) {
			return -1;
		}
		if(x>arr[middle]) {
			return binarySearch(arr, middle+1,end,x);
		}
		if(x<arr[middle]) {
			return binarySearch(arr, start, middle-1, x);
		}
		else {
			return middle;
		}
	}
	public static int binarySearch(int[] arr, int x) {
		return binarySearch(arr, 0, arr.length-1, x);
	}
public static void main(String[] args) throws IOException {
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(scan.readLine());
	String str[] = scan.readLine().split(" ");
	int arr[]= new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = Integer.parseInt(str[i]);
	}
	int x = Integer.parseInt(scan.readLine());
	System.out.println(binarySearch(arr, x));
	scan.close();
}
}
