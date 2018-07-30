
import java.util.Scanner;
public class ReverseEachWordInString {

		public static String reverseEachWord(String input) {
		int a=0,b=0;
		String sub="",str2="",str3="";
			for(int i=0;i<input.length();i++) {
				
			if(input.charAt(i)==' ') {
				b=i-1;
				sub=	input.substring(a, b+1);
				//Reversal
				for(int j=sub.length()-1;j>=0;j--) {
			    	str2=str2+ sub.charAt(j); //concatinating char to string this way.
			    }
	      		str3=str3+ str2+' ';

				a= i+1;
				sub="";
				str2="";
			}
		    
		}
			//For last word.
			b= input.length()-1;
			sub= input.substring(a,b+1);
			for(int j=sub.length()-1;j>=0;j--) {
		    	str2=str2+ sub.charAt(j); //concatinating char to string this way.
		    }
		str3=str3+ str2+' ';
		return str3;
	}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			String ans= reverseEachWord(str);
			System.out.println(ans);
			scan.close();
		}
	}
