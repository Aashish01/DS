package timeLimitExceeded;
import java.io.*;
import java.math.*;

public class FactorialOfANumber {
	public static BigInteger factorial(int n) {
		BigInteger f = BigInteger.valueOf(1);
		for(int i=n;i>=1;i--) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String str[] = scan.readLine().split(" ");
	int n = Integer.parseInt(str[0]);
	System.out.println(factorial(n));	
}
}
