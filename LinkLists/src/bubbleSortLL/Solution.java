package bubbleSortLL;

import java.util.Scanner;


public class Solution {
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		LinkedListNode<Integer> temp1=head,temp2=head.next;
		boolean hold=false;
		while(hold!=true) {
			hold=true;
			for(int i=0;i<length(head)-1;i++) {
				if(temp1.data>temp2.data) {
					head= swap_nodes(head, i, i+1);
					hold=false;
				}
				temp1=head;
				temp2=head.next;
				if(i==length(head)-2) {
					break;
				}
				for(int j=0;j<i+1;j++) {
					temp1=temp1.next;
					temp2=temp2.next;
				}
			}
		}
		return head;	
	}
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
		if(i>j) {
			int f= i;
			i=j;
			j=f;
		}
		LinkedListNode<Integer> temp1 =head, temp2= head;
		for(int k=0;k<i-1;k++) {
			temp1=temp1.next;
		}
		for(int k=0;k<j-1;k++) {
			temp2=temp2.next;
		}
		LinkedListNode<Integer> node1= new LinkedListNode<>(temp1.next.data);
		LinkedListNode<Integer> node2 = new LinkedListNode<>(temp2.next.data);
		if(i==0 && j!=i+1) {
			node1.data=temp1.data;
			node2.next=temp1.next;
			temp1.next=null;
			node1.next=temp2.next.next;
			temp2.next=node1;
			return node2;
		}else if(i==0 && j==i+1) {
			node1.data=temp1.data;
			node2.next=node1;
			node1.next=temp1.next.next;
			return node2;
		}else if(j==i+1 && i!=0 && temp2.next.next!=null) {
			node2.next=node1;
			node1.next=temp2.next.next;
			temp1.next=node2;
			return head;
		}else if(j==i+1 && temp2.next.next==null) {
			node2.next=node1;
			node1.next=null;
			temp1.next=node2;
			return head;
		}
		else {
			node2.next=temp1.next.next;
			temp1.next=node2;
			node1.next=temp2.next.next;
			temp2.next=node1;
			return head;
		}
}
	public static int length(LinkedListNode<Integer> head){
		int length =0;
		while(head!=null) {
			length++;
			head = head.next;
		}
		return length;
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
	LinkedListNode<Integer> ans = bubbleSort(head);
	print(ans);
}
}
class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.data=data;
		this.next= null;
	}
}
