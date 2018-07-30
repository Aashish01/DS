
public class Operators {

	public static void main(String[] args) {
		//write Storage of positive & negative integers in memory
		
		int i = 5/9;
		int j = (int)(15.0/9);     //double/int is double, int/int is int,float/int is int
		//& double can't be stored in int,so explicit typecast
		System.out.println(i);
		System.out.println(j);
		
		int k = 'c'/3;       //ascii code taken with + ,*,/ arithmetic operators etc
		System.out.println(k);
		
		int m= 'c' + 'd';    //similar ascii
		char n = 'c' + 'd';    //ascii would be taken but since char,
		//char value corresponding to ascii is output eg 99=c
		char o = (char)('c' + 1300323);    //got value so large ,so int can't be stored in char 
		//so typecast explicit
		char p = 'c' + 14;
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
		System.out.println('a' + 3);
		System.out.println('a'/3);
		
		
		int a=5,b=3,c=10;
		System.out.println(a>b);
		System.out.println(!(a>b));
		boolean z = b>a || b>c ;
		System.out.println(z);
		
		
		
	}

}
