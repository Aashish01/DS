import java.util.Scanner;
public class Testcase {
 
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	char ch = str.charAt(0);
	if(Character.isUpperCase(ch)) {
		System.out.println(1);
	}else if(Character.isLowerCase(ch)) {
		System.out.println(0);
	}else
		System.out.println(-1);
}
}
