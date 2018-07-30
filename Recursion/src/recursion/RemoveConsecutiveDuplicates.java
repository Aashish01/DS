package recursion;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String input,String str){
		if(input.length()==0) {
			return str;
		}
		if(str.length()==0) { // to handle the first case
		str = str + input.charAt(0);
		}else if(input.charAt(0)!=str.charAt(str.length()-1)) {
				str = str + input.charAt(0);
		}
		return removeConsecutiveDuplicates(input.substring(1),str);
	}
public static String  removeConsecutiveDuplicates(String input) {
	return removeConsecutiveDuplicates(input,"");
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	String ans =removeConsecutiveDuplicates(input);
	System.out.println(ans);
	scan.close();
}
}
