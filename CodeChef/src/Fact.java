//To store very large value like 100! even long is not sufficent,big integer is used.

import java.util.Scanner;
import java.math.BigInteger;
class Fact {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		short t =scan.nextShort();
		short i=1;
		while(i<=t) {
			short n = scan.nextShort();
			short j;
			
			 BigInteger f = new BigInteger("1");			
			 for(j=n;j>=1;j--) {
				 f = f.multiply(BigInteger.valueOf(j));
			}
			
			System.out.println(f);
			i++;
		}
	}

}
