package staircaseRecursion;
import java.util.Scanner;
public class Solution {
	public static long count=0;
	public static void helpStairCase(int n) {
		if(n==0) {
			count++;
			return;
		}
		if(n==1) {
			helpStairCase(n-1);
		}
	    if(n==2) {
			helpStairCase(n-1);
			helpStairCase(n-2);
		}
	    if(n>=3) {
			helpStairCase(n-1);
			helpStairCase(n-2);
			helpStairCase(n-3);
		}
	}
		public static long staircase(int n) {
			if(n==0) {
				return 0;
			}else {
				helpStairCase(n);
				return count;
			}
		}
	
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int n=scan.nextInt();
	long ans= staircase(n);
	System.out.println(ans);
	
	scan.close();
}
}
