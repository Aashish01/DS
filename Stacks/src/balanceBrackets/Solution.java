package balanceBrackets;
import java.util.Scanner;

public class Solution {

	public static boolean checkBalanced(String exp)  {
		Stack<Character> stack1= new Stack<>();
		for(int i=0;i<exp.length();i++) {
			char ch= exp.charAt(i);
			if(stack1.isEmpty()==true && (ch=='}' || ch==')' || ch==']')) {
				return false;
			}
			if(ch=='[' || ch=='{' || ch=='(') {
				stack1.push(ch);
			}
			if(ch=='}' || ch==')' || ch==']') {
				char open;
				if(ch=='}') {
					open ='{';
				}else if(ch==']') {
					open='[';
				}else {
					open='(';
				}
				try {
					if(stack1.top()==open) {
						stack1.pop();
					}else {
						return false;
					}
				}catch(StackEmptyException e) {
					
				}
				
			}
			
		}
		if(stack1.isEmpty()==true) {
			return true;
			
		}else {
			return false;
		}

	}
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		System.out.println(checkBalanced(str));
		scan.close();
	}
}


 class Stack<T>{
	private Node<T> head ;
	private int size=0;
	public Stack() {
    head =null;
	}
	
	public int size() {
     return size;
	}
	
	public void push(T data) {
     Node<T> node = new Node<>(data);
     node.next=head;
     head =node;
     size++;
	}
	
	public boolean isEmpty() {
      return(head==null);
	}
	
	public T pop() throws StackEmptyException {
      if(head==null) {
    	  StackEmptyException e = new StackEmptyException();
    	  throw e;
      }
      T temp = head.data;
      Node<T> temp2= head.next;
      head.next=null;
      head=temp2;
      size--;
      return temp;
	}
	
	public T top() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
      return head.data;
	}
	}
class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}
class StackEmptyException extends Exception {

}
