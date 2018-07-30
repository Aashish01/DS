package exceptionHAndling;

import java.util.Scanner;

public class Operations {
	public static int takeInput() throws ZeroDenomiantorException {
		Scanner scan = new Scanner(System.in);
		
		int deno = scan.nextInt();
		scan.close();

		if(deno==0) {
			ZeroDenomiantorException e = new ZeroDenomiantorException("Don't use 0");
			throw e;
		}
		else {
			return deno;
		} 
	}
public static int printDiv() throws ZeroDenomiantorException{  //static so that use without obj.
	int n =5/takeInput();
	return n;
	}
public static int print2() {
	try {
	int m= printDiv()/2;
	return m;
	}
	catch(ZeroDenomiantorException e) {
		System.out.println("Don't u dare to enter 0");
	return 1;	
	}
	finally {
		System.out.println("Nice try");
	}
	
}
public static void main(String[] args) {
	System.out.println(print2());
}
}
