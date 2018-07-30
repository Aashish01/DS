package recursion;
import java.io.*;
public class CheckAB {
public static boolean checkAB(String input) {
		if(input.length()==0) {
			return false;
		}
		if(input.length()==1 && input.charAt(0) == 'a'){
			return true;
		}
		if(input.substring(input.length()-2, input.length()).equals("bb")) {
			return checkAB(input.substring(0,input.length()-2));
		}else if( input.charAt(input.length()-1)=='a') {
			return checkAB(input.substring(0,input.length()-1));
		}else {
			return false;
		}
		

	}
public static void main(String[] args) throws IOException{
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	String str = scan.readLine();
	System.out.println(checkAB(str));
	scan.close();
}
}
