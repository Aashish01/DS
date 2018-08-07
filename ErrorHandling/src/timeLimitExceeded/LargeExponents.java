package timeLimitExceeded;
import java.io.*;
import java.math.*;
public class LargeExponents {
	public static BigInteger largeExponent(BigInteger A, long n) {
		if(n==0) {
			return BigInteger.valueOf(1);
		}
		if((n&1)==0) {
			return largeExponent(A.multiply(A), n/2);
		}
		return A.multiply(largeExponent(A.multiply(A), n/2));
	}
	public static BigInteger add(BigInteger A, BigInteger B) {
		return A.add(B);
	}
	public static BigInteger gcd(BigInteger Num1, BigInteger Num2) {
		if(Num2.equals(BigInteger.valueOf(0))) {
			return Num1;
		}
		return gcd(Num2, Num1.mod(Num2));
	}
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	int t= Integer.parseInt(scan.readLine());
	for(int l=0;l<t;l++) {
		String[] arr= scan.readLine().split(" ");
		long a= Long.parseLong(arr[0]);
		long b= Long.parseLong(arr[1]);
		long n= Long.parseLong(arr[2]);
		BigInteger A= BigInteger.valueOf(a);
		BigInteger power1= largeExponent(A,n);
		BigInteger B = BigInteger.valueOf(b);
		BigInteger power2= largeExponent(B, n);
		BigInteger sum= add(power1, power2);	
		BigInteger Num1= sum;
		long c= a-b;
//		BigInteger Num2;
//		
//
//		if(a>b) {
//		Num2= BigInteger.valueOf(c);
//		}else {
//			Num2= BigInteger.valueOf(c*(-1));
//		}
//		while(Num1.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))>0) {
//			Num1= Num1.mod(Num2);
//		}
		int m=(int)Math.pow(10, 9)+7;
//		BigInteger ans= gcd(Num1, Num2).mod(BigInteger.valueOf(m));
//		System.out.println(ans);
		if(c<0) {
			c=c*(-1);
		}
		int sq= (int)Math.pow(c, 0.5);
		int ans=1;
		for(int i=1;i<=sq;i++) {
			if(Num1.mod(BigInteger.valueOf(i)).equals(BigInteger.valueOf(0))) {
				ans =i%m;
			}
		}
		System.out.println(ans);
	    
	}
	scan.close();
}
}
