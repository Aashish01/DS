import java.util.Scanner;

public class ReverseLLiteratively {
public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> temp1, temp2;
		temp1=head;
		temp2=head.next;
		while(temp2!=null) {
			temp1.next=prev;
			prev= temp1;
			temp1=temp2;
			temp2=temp2.next;
		}
		temp1.next=prev;
		return temp1;
	}
public static LinkedListNode<Integer> inputList(Scanner scan){
	 LinkedListNode<Integer> head;
	 head = null;
	
	 Integer a = scan.nextInt();
	 if(a==-1) {
		 //scan.close();
		 return head;
	 }
	 LinkedListNode<Integer> node1= new LinkedListNode<Integer>(a);
	 node1.next=null;
	 head = node1;
	 Integer b = scan.nextInt();
	 while(b!=-1) {
		 LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(b);
		 newNode.next=null;
		 node1.next= newNode;
		 node1= newNode;
		 b= scan.nextInt();
	 }
	 //Scan not closed since once closed can't be opened next time u call fn ,no matter what.
	// scan.close();
	 return head;
}
public static void printList(LinkedListNode<Integer> head) {
	 while(head!=null) {
		 System.out.print(head.data+" ");
		 head = head.next;
	 }
}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	LinkedListNode<Integer> head =inputList(scan);
	LinkedListNode<Integer> ans = reverse_I(head);
	printList(ans);
}
}
class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.data=data;
	}
}