package recursion;
//x raise to power n by recursion
import java.util.*;
public class Solution {

	public static int power(int x, int n) {
		if( n==0){
          return 1;
        }
      return x* power(x,n-1);
	}
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int n = scan.nextInt();
   System.out.println(power(x,n));
    scan.close();
  }
}