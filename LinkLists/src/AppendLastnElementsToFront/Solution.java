package AppendLastnElementsToFront;

import java.util.Scanner;
public class Solution {
	//Append
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
	      LinkedListNode<Integer> temp1= root;
	      LinkedListNode<Integer> temp2= root;
	      int length = length(root);
	      for(int j=0;j<length-1;j++) {
	    	  temp1=temp1.next;
	      }
	      temp1.next=root;
	      
	      for(int j=0;j<length-n-1;j++) {
	    	  temp2=temp2.next;
	      }
	      root=temp2.next;
	      temp2.next=null;
	      
	      return root;
	      
    }
	
	//Length
		public static int length(LinkedListNode<Integer> head){
			int length =0;
			while(head!=null) {
				length++;
				head = head.next;
			}
			return length;
	}

	
	//Print
		public static void print(LinkedListNode<Integer> head) {
			while(head!=null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
		}

	
	//Input
	public static LinkedListNode<Integer> inputList(){
		LinkedListNode<Integer> head = null;
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		if(s==-1) {
			//scan.close();
			return head;
		}
		LinkedListNode<Integer> first = new LinkedListNode<Integer>(s);
		first.next=null;
		head = first;
		int i = scan.nextInt();
		while(i!=-1) {
			LinkedListNode<Integer> nextNode = new LinkedListNode<Integer>(i);
			nextNode.next=null;
			first.next = nextNode;
			first = nextNode;
			i=scan.nextInt();
		}
		//scan.close();
		return head;
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	LinkedListNode<Integer> head = inputList();
	int n = scan.nextInt();
	head = append(head, n);
	print(head);
}
}
