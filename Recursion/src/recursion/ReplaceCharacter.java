package recursion;
import java.util.Scanner;
public class ReplaceCharacter {
	public static String replaceCharacter(String input, char c1, char c2,String str){
		if(input.length()==0) {
			return str;
		}
		if(input.charAt(0)==c1) {
			str = str+c2;
		}else {
			str = str + input.charAt(0);
		}
		return replaceCharacter(input.substring(1), c1, c2,str);
	}
public static String  replaceCharacter(String input,char c1,char c2 ) {
	return replaceCharacter(input, c1, c2,"");
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	String input1 = scan.next();
	char c1 = input1.charAt(0);
	String input2 = scan.next();
	char c2 = input2.charAt(0);
	String ans =replaceCharacter(input, c1, c2);
	System.out.println(ans);
	scan.close();
}
}
