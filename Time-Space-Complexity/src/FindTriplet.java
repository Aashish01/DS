import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTriplet {
	public static void findTriplet(int[] arr, int x){
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i]<=x) {
				for(int j=i+1;j<arr.length-1;j++) {
					if((arr[i]+arr[j]<=x)) {
						for(int k=j+1;k<arr.length;k++) {
							if((arr[i]+arr[j]+arr[k]==x) && (arr[i]<=arr[j]&&arr[j]<=arr[k])) {
								System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
							}
						}
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
		//long startTime = System.currentTimeMillis();
		findTriplet(arr, x);
		//long endTime = System.currentTimeMillis();
		//System.out.println("Time taken "+(endTime-startTime));
		scan.close();
	}

}
