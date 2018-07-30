import java.util.Scanner;

public class DeleteNodeRecursively {
	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i){
		if(i==0) {
			return head.next;
		}
		// if list ends before position can be made 0
		if(head.next ==null) {
			return head;
		}
		LinkedListNode<Integer> temp2= deleteIthNodeRec(head.next, i-1);
		head.next= temp2;
		return head;
		
		
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
	LinkedListNode<Integer> head = inputList(scan);
	int i= scan.nextInt();
	LinkedListNode<Integer> ans = deleteIthNodeRec(head, i);
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
