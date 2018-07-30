package RemoveDuplicacyInSortedLL;

import java.util.Scanner;


public class Solution {
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp1 = head;
		LinkedListNode<Integer> temp2 = temp1.next;
		while(temp2!=null) {
			if(temp1.data.equals(temp2.data)) {
				while(temp1.data.equals(temp2.data) ) {
					temp2=temp2.next;
					
					if(temp2==null) {
						temp1.next=null;
						return head;
					}
				}
				temp1.next=temp2;
				
			}
			temp1=temp1.next;
			temp2= temp1.next;
			
		}
		return head;
		
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
			Integer s = scan.nextInt();
			if(s==-1) {
				//scan.close();
				return head;
			}
			LinkedListNode<Integer> first = new LinkedListNode<Integer>(s);
			first.next=null;
			head = first;
			Integer i = scan.nextInt();
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
		head = removeDuplicates(head);
		print(head);
		scan.close();

	}
}
