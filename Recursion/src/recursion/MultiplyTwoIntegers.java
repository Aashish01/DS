package recursion;

import java.util.Scanner;

public class MultiplyTwoIntegers {
	public static int multiplyTwoIntegers(int m, int n){
		if(m==0) {
			return 0;
		}
		return n + multiplyTwoIntegers(m-1, n);
	
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m= scan.nextInt();
		int n = scan.nextInt();
			System.out.println(multiplyTwoIntegers(m, n));	
		scan.close();
	}

}
