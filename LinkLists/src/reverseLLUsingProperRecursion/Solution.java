package reverseLLUsingProperRecursion;

import java.util.Scanner;

public class Solution {
	public static Wrapper reverseLL(LinkedListNode<Integer> head) {
		if(head.next==null) {
			Wrapper wrap = new Wrapper();
			wrap.head=head;
			wrap.tail=head;
			return wrap;
		}
		Wrapper wrap2 = reverseLL(head.next);
		wrap2.tail.next=head;
		head.next=null;
		
		Wrapper wrap3= new Wrapper();
	 wrap3.head=wrap2.head;
	 wrap3.tail=head;
	 return wrap3;
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
	public static void print(LinkedListNode<Integer> head) {
		while(head!=null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	LinkedListNode<Integer> head = inputList(scan);
	//we need a wrapper obj to store obj of this type.
	Wrapper wrap = reverseLL(head);
	print(wrap.head);
	
}
}
class Wrapper{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
}
class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.data=data;
		this.next=null;
	}
}
