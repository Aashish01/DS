package recursion;
import java.io.*;
public class Staircase {
	public static void countWays(int n) {
		//Base case
		if(n==0) {
			helperfn();
			return;
		}
		if(n>=3) {
			countWays(n-3);
			countWays(n-2);
			countWays(n-1);
			return;
		}
		if(n>=2) {
			countWays(n-2);
			countWays(n-1);
			return;
		}
		if(n>=1) {
			countWays(n-1);
			return;
		}
	}
	public static int count =0;
	public static void helperfn() {
		count++;
	}
	public static int staircase(int n){	
		if(n==0) {
			return 0;
		}else {
		countWays(n);
		return count;
		}
		}
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String str[] = scan.readLine().split(" ");
	int n = Integer.parseInt(str[0]);
	System.out.println(staircase(n));
	scan.close();
}
}
