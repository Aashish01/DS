
import java.util.Scanner;
public class RemoveAllOccurrencesOfChar {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    String str="";
	    for(int i=0;i<input.length();i++) {
	    	if(input.charAt(i)!=c) {
	    		str=str+ input.charAt(i);
	     	}
	    }
return str;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		String str2 =scan.nextLine();
		char ch = str2.charAt(0);
	String ans =	removeAllOccurrencesOfChar(str,ch);
	System.out.println(ans);
		scan.close();
	}

}
