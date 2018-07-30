package timeLimitExceeded;

import java.math.BigInteger;

public class UseBigInteger {
public static void main(String[] args) {
	BigInteger A,B;
	A = BigInteger.valueOf(23);  //when we want to assign values directly
	B = new BigInteger("12");  //when integer is in form of string
	
	//Alternatively
	BigInteger C = BigInteger.valueOf(1);
	BigInteger D = new BigInteger("2");
	
	BigInteger sum = A.add(B);
	BigInteger sum1 = C.add(D);

	BigInteger diff = A.subtract(B);
	BigInteger product = A.multiply(B);
	
	if(sum.compareTo(sum1)<0) {
		System.out.println("sum < sum1");
	}else if(sum.compareTo(sum1)>0){
		System.out.println("sum > sum1");
	}else if(sum.equals(sum1)) {
		System.out.println("sum = sum1");
	}else {
		System.out.println("Fuck off");
	}
	System.out.println(sum);
	System.out.println(sum1);

	System.out.println(diff);
	System.out.println(product);

}
}
