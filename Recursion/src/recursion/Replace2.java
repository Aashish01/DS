package recursion;
import java.util.Scanner;
public class Replace2 {
	public static String replace(String input) {
		return replace(input,"");
	}
	public static String replace(String str,String collect) {
		if(str.length()==0) {
			return collect;
		}
	  if(str.length()==1) {
			collect = collect + str.charAt(0);
			return collect;
			//so that don't check for charAt(0) & charAt(1) both ,index out of bound error.
		}
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			collect = collect + "3.14";
			return replace(str.substring(2,str.length()),collect);
		}
		else {
			collect = collect + str.charAt(0);
			return replace(str.substring(1,str.length()),collect);
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str= scan.next();
	str = replace(str);
	System.out.println(str);
	scan.close();
}
}
