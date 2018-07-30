package redundantBrackets;
import java.util.Stack;
import java.util.Scanner;
public class Solution {
	public static boolean checkRedundantBrackets(String input) {
		Stack<Character> s1= new Stack<>();
		int i=0;
		while(i!=input.length()) {
			char ch1= input.charAt(i);
			if((ch1=='(' || ch1=='{' || ch1=='[')&& s1.size()%2==0) {
				char ch2=input.charAt(i+1);
				if(ch2==ch1) {
					s1.push(ch1);
					s1.push(ch2);
				}else if(ch2==')' || ch2=='}'||ch2==']') {
					
				}else {
					return false;
				}
				i+=2;
			}
			else if(ch1=='}' || ch1==']' || ch1==')') {
				char ch2= input.charAt(i+1);
				if(ch2==ch1) {
					s1.pop();
					s1.pop();
				}else {
					return false;
				}
				i+=2;
			}else {
				i++;
			}
		}
		if(s1.size()==0) {
			return true;
		}else {
			return false;
		}
		

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(checkRedundantBrackets(str));
	}
}
