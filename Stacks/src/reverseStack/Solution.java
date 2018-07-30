package reverseStack;
import java.util.Scanner;


public class Solution {
	public static Stack<Integer> reverseStack(Stack<Integer> s1, Stack<Integer> s2) throws StackEmptyException {
		while(s1.isEmpty()!=true) {
			s2.push(s1.top());
			s1.pop();	
		}
		
		s1=s2;
		return s1;
	}
	public static void main(String[] args)  throws StackEmptyException{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		Stack<Integer> stack1= new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		for(int i=0;i<n;i++) {
			int a= scan.nextInt();
			stack1.push(a);
		}
		stack1=reverseStack(stack1, stack2);
		
		while(stack1.isEmpty()!=true) {
			System.out.print(stack1.top()+" ");
			stack1.pop();
		}
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
