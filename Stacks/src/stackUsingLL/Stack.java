package stackUsingLL;
import java.util.Scanner;
public class Stack<T>{
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
      return head.data;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.push(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.pop());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.top());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
	}
}
class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}