package deleteNnodesAfterRetaingMnodes;

import java.util.Scanner;


public class Solution {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
       LinkedListNode<Integer> temp= head;
       while(temp.next!=null) {
	     for(int i=0;i<M-1;i++) {
	    	 if(temp.next==null) {
	    		 return head;
	    	 }
	    	 temp = temp.next;
	     }
	   LinkedListNode<Integer> temp2= temp;
	   for(int j=0;j<N+1;j++) {
		   if(temp.next==null) {
			   temp2.next=null;
			   return head;
		   }
		   temp= temp.next;
	   }
	     temp2.next=temp;
          }
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
	int m = scan.nextInt();
	int n= scan.nextInt();
	LinkedListNode<Integer> ans = skipMdeleteN(head, m, n);
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
