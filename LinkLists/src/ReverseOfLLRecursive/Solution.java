package ReverseOfLLRecursive;

import java.util.Scanner;


public class Solution<T> {
	public static LinkedListNode<Integer> node;
	
     public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
		ReverseLL(head, null);
		LinkedListNode<Integer> ans = getter();
		return ans;
	 }
	
	public static void ReverseLL(LinkedListNode<Integer> head, LinkedListNode<Integer> temp3) {
		if(head.next==null) {
		LinkedListNode<Integer>	temp1=head;
			temp1.next=temp3;
			temp3=temp1;
			setter(temp3);
          return;
		}
		LinkedListNode<Integer> temp1= head;
		LinkedListNode<Integer> temp2= head.next;
		temp1.next= temp3;
		temp3=temp1;
		ReverseLL(temp2, temp3);
	}
	public static void setter(LinkedListNode<Integer> head) {
		node = head;
	}
	public static LinkedListNode<Integer> getter(){
		return node;
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
	LinkedListNode<Integer> ans = reverse_R(head);
	printList(ans);
	scan.close();
 }
}
