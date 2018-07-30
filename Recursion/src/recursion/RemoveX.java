package recursion;

import java.util.Scanner;

public class RemoveX {
	public static String removeX(String input) {
		return replace(input,"");
	}
	public static String replace(String str,String collect) {
		if(str.length()==0) {
			return collect;
		}
	 
		if(str.charAt(0)!='x') {
			collect = collect + str.charAt(0);
		}
		return replace(str.substring(1,str.length()),collect);

		
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str= scan.next();
	str = removeX(str);
	System.out.println(str);
	scan.close();
}
}
