package recursion;
import java.util.Scanner;
public class IsStringPalindrome {
public static boolean isStringPalindrome(String input) {
		String reverse = reverseString(input,"");
		System.out.println(reverse);
		if(input.equals(reverse)) {
			return true;
		}else {
			return false;
		}

	}
public static String reverseString(String str,String rev) {
		if(str.length()==0) {
		return rev;
	}
	rev =rev + str.charAt(str.length()-1) ;
	return reverseString(str.substring(0, str.length()-1),rev);
	
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str= scan.next();
	System.out.println(isStringPalindrome(str));
	scan.close();
}
}
