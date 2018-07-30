package printReverseOfALinkedList;

import java.util.Scanner;


public class Solution {
	//Print reverse 
	public static void printReverseRecursive(LinkedListNode<Integer> root) {
		if(root.next==null) {
			System.out.print(root.data + " ");
			return;
		}
		printReverseRecursive(root.next);
		root.next=null;
		printReverseRecursive(root);
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
		printReverseRecursive(head);
		scan.close();
	}

}
