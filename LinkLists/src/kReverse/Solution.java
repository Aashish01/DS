package kReverse;

import java.util.Scanner;


public class Solution {
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		if(length(head)<=k) {
			return reverse_R(head);
		}
		LinkedListNode<Integer> temp1= head, temp2=head,prev=null,head1,head2;
		for(int i=0;i<k-1;i++) {
			temp2=temp2.next;
		}
		prev=temp2;
		temp2=temp2.next;
		prev.next=null;
		head1=reverse_R(temp1);
		head2=head1;
		for(int i=0;i<k-1;i++) {
			head2=head2.next;
		}
		head2.next= kReverse(temp2, k);
		return head1;	
		
	}
	
	public static int length(LinkedListNode<Integer> head){
		int length =0;
		while(head!=null) {
			length++;
			head = head.next;
		}
		return length;
}

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
		int k= scan.nextInt();
		LinkedListNode<Integer> ans = kReverse(head, k);
		print(ans);
	}

}
class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}

