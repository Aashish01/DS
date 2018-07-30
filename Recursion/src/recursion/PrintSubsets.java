package recursion;
import java.io.*;
public class PrintSubsets {
	public static void subsets(int[] arr, int start, int end, int[] collectSoFar) {
		if(start>end) {
			for(int i=0;i<collectSoFar.length;i++) {
				System.out.print(collectSoFar[i]+" ");

			}
			System.out.println();
			return;
			}
		int temp[] = collectSoFar;
		int temp2[] = new int[temp.length+1];
		for(int i=0;i<temp.length;i++) {
			temp2[i]=temp[i];
		}
		temp2[temp2.length-1]= arr[start];
		
		subsets(arr, start+1, end, temp); //if not included
		subsets(arr, start+1, end, temp2); //if included
	}
	
	public static void printSubsets(int[] arr) {
		
		int collect[] = {};
		subsets(arr, 0, arr.length-1, collect);
		
	}

			
public static void main(String[] args) throws IOException {
	

	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	int n= Integer.parseInt(scan.readLine());
	String str[] = scan.readLine().split(" ");
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = Integer.parseInt(str[i]);
	}
	scan.close();
	
	printSubsets(arr);
 	
}
}
