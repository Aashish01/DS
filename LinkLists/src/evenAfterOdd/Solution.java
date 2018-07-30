package evenAfterOdd;

import java.util.Scanner;

public class Solution {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head){
		if(head.next==null) {
			return head;
		}
		Integer a = head.data%2;
		if(!a.equals(0)) {
			LinkedListNode<Integer> temp1= sortEvenOdd(head.next);
			head.next=temp1;
			return head;
		}
		else {
			LinkedListNode<Integer> temp1, temp2;
			temp1= sortEvenOdd(head.next);
			temp2=temp1;
			Integer b = temp2.data%2;
			if(b.equals(0)) {
				head.next=temp1;
				return head;
			}else {
				LinkedListNode<Integer> prev =temp2;
				while(temp2.data%2!=0 && temp2.next!=null) {
					prev=temp2;
					temp2=temp2.next;
				}
				Integer d= temp2.data%2;
				if(temp2.next==null && !(d.equals(0))) {
					temp2.next=head;
					head.next=null;
					return temp1;
				}else {
					prev.next=head;
					head.next=temp2;
					return temp1;
				}
			}
			
		}
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
	LinkedListNode<Integer> ans = sortEvenOdd(head);
	print(ans);
}
}
class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.data= data;
		this.next=null;
	}
}
