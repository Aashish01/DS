package recursion;
import java.util.Scanner;
public class CharacterStringInterconversion {
public static void main(String[] args) {
	//Program to covert numeral to corresponding character eg 1= "a'.
	System.out.println("Program to covert numeral to corresponding character,eg enter 1");
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	
	int b = 96+a;
	char ch =(char) b;
	System.out.println(ch);
	
	//Program to covert numeric string to corresponding integer eg "123" to 123.
	//Method 1
	System.out.println();
	System.out.println("Program to covert numeric string to corresponding integer,eg enter 112");
	String str = scan.next();
	int t= Integer.valueOf(str);
	System.out.println(t);
	
	//Method2
	System.out.println("Method 2 ,enter 13");
	String str2= scan.next();
	int v= Integer.parseInt(str2);
	System.out.println(v);
	
	//Program to convert char to corresponding no, eg a =1.
	System.out.println();
	System.out.println(" Program to convert char to corresponding no, eg enter a");
	String str3 = scan.next();
	int w= str3.charAt(0) -96;
	System.out.println(w);
 scan.close();
	}
}
