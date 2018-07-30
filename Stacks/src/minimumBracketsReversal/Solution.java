package minimumBracketsReversal;
import java.util.Stack;

import java.util.Scanner;
public class Solution {
	public static int countBracketReversals(String input){
		if(input.length()%2!=0) {
			return -1;
		}
		Stack<Character> s1= new Stack<>();
		for(int i=0;i<input.length();i++) {
			char ch= input.charAt(i);
			if(ch=='{') {
				if(s1.size()!=0 && s1.peek()=='}') {
					s1.pop();
				}else {
					s1.push('{');
				}
			}else {
				if(s1.size()!=0 && s1.peek()=='{') {
					s1.pop();
				}else {
					s1.push('}');
				}
			}
		}
		if(s1.size()==0) {
			if(input.charAt(0)=='}') {
				return 2;
			}else {
				return 0;
			}
		}else {
			if(input.charAt(0)=='}' && input.charAt(input.length()-1)=='{') {
				return (s1.size()/2) +2;
			}else {
				return s1.size()/2;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int ans=countBracketReversals(str);
		System.out.println(ans);
		scan.close();
	}
}
