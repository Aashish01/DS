package recursion;
import java.io.*;
public class PermutationOfString {
	public static String[] permutationOfString(String input) {
		if(input.length()==1) {
			String str[] = new String[1];
			str[0]="";
			str[0]=str[0]+input.charAt(0);
			return str;
		}
		String ans[]= permutationOfString(input.substring(1));
		int length =helperFn(input.length());
		String arr[] = new String[length];
		int k=0;
		for(int j=0;j<ans.length;j++) {
			String str=ans[j];
			for(int i=0;i<str.length()+1;i++) {
				arr[k]=str.substring(0, i)+ input.charAt(0)+str.substring(i);
				k++;
			}
		}
		ans=arr;
		return ans;
	}
	public static int helperFn(int n) {
		if(n==0) {
			return 1;
		}
		return n*helperFn(n-1);
	}
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String str = scan.readLine();
	long startTime = System.currentTimeMillis();
	String ans[] = permutationOfString(str);
	for(int i=0;i<ans.length;i++) {
		System.out.println(ans[i]);
	}
	long endTime = System.currentTimeMillis();
	System.out.println("Time taken: " + (endTime-startTime));
	scan.close();
}
}
