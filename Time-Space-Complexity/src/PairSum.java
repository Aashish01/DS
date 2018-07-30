import java.io.*;
import java.util.Arrays;
public class PairSum {
public static void pairSum(int[] arr, int num){
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<=num) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==(num-arr[i])) {
						System.out.println(arr[i]+" "+arr[j]);
					}
				}

			}
		}

	}
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	int n= Integer.parseInt(scan.readLine());
	int arr[]= new int[n];
	String str[]= scan.readLine().split(" ");
	for(int i=0;i<n;i++) {
		arr[i]= Integer.parseInt(str[i]);
	}
	int x= Integer.parseInt(scan.readLine());
	pairSum(arr, x);
	scan.close();
}
}
