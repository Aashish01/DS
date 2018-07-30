package reverseOfStackByChangingIt;

import java.util.Scanner;
import java.util.Stack;
public class Solution {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.size()==1) {
			return;
		}
		int a= s1.elementAt(s1.size()-1);
		s1.pop();
		reverseStack(s1, s2);
		while(s1.size()!=0) {
			s2.push(s1.pop());
		}
		s1.push(a);
		while(s2.size()!=0) {
			s1.push(s2.pop());
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		Stack<Integer> stack1= new Stack<>();
		for(int i=0;i<n;i++) {
			int a= scan.nextInt();
			stack1.push(a);
		}
		Stack<Integer> stack2 = new Stack<>();
		reverseStack(stack1, stack2);
		//Print function
		for(int i=stack1.size()-1;i>=0;i--) {
			System.out.print(stack1.elementAt(i)+" ");
		}
		scan.close();
	}
}
