import java.util.Scanner;
public class StringnSubstring {
public static void main(String[] args) {
	//Declaring char
	char ch ='c';
	System.out.println(ch);
	//Declaring string(non-primitive data type.)
	String str ="Hello";
	
	//str functions.
	
	System.out.println(str.charAt(3));
	
	System.out.println(str.length());  	
	   //end index is non-inclusive.
	System.out.println(str.substring(2, 5) );
	
	System.out.println(str.substring(2));
	
	System.out.println(str);
	
	System.out.println(str.contains("ell"));
	System.out.println(str.contains("lel"));

	
	//in fn inside (don't use ;)

	System.out.println(str.substring(1,1) );
	//Since end index is non inclusive.
	System.out.println(str.length());
	System.out.println(str.substring(str.length()));
	System.out.println(str.substring(0));
	System.out.println(str.substring(str.length()-1));
	//System.out.println(str.substring(str.length()+1));
	
	String str2 ="Ashish";
	System.out.println(str2.substring(1, 3));
	//taking string as input.
	
	Scanner scan = new Scanner(System.in);
	//when string is line of words i.e enter ends
	String str3 = scan.nextLine();
	
	//when string is single word i.e space ends,wordd after space is stored in next data type.
	String str4 =scan.next();
	System.out.println(str3);
	System.out.println(str4);
	
	//taking chararcter inputs.
	char ch2 =str4.charAt(0);
	System.out.println(ch2);
	scan.close();
}
}
