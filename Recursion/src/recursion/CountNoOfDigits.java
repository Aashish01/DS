package recursion;
import java.util.*;
public class CountNoOfDigits {
	public static int count(int n) {
		if(n==0) {
			return 0; //base case
		}
		return 1 + count(n/10);
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	System.out.println(count(n));
	scan.close();
}
}
