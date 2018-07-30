import java.io.*;
import java.util.Arrays;
public class MinTime {
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	int minSum=0;
	for(int j=0;j<3;j++) {
		int arr[] = new int[3];
		String str[] = scan.readLine().split(" ");
		for(int i=0;i<3;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		minSum= minSum+ arr[0];
	}
	System.out.println(minSum);
	scan.close();
}
}
