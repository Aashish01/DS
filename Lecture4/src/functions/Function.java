package functions;

public class Function {
	
	public static int sum(int a , int b) {
	int 	c = a+b;
		return c;    //return variable
	}
	
	public static boolean hold(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;   //return value.
		}
	}
	
	public static void print(int n) {   //when doesn't return a value use void.
		for(int i=1; i<=n;i++) {
			System.out.print(i+ " ");
	     }
		System.out.println();     //Scoe of variables...
	}
	
	public static void print2(int n) {
		for(int i=1; i<=n;i++) {
			System.out.print(i+ " ");
			if(i==3) {
				return;  //this out of fn
			}
			if(i==2) {
				print(3);   //function calling other fn
			}
	     }
	}


	public static void main(String[] args) {
		int a , b,c ;
		a= 3;
		b =5;
		c = sum(a,b);
		System.out.println(c);
		
		System.out.println(hold(25));
		boolean hold = hold(22);   //here hold is another var. ,whereas hold() is fn.
		System.out.println(hold);
		
		print(7);
		print2(7);
	}

}
