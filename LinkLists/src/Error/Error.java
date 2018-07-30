package Error;

import java.util.Scanner;

 

public class Error {
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
			
			public static void print(LinkedListNode<Integer> head) {
				while(head!=null) {
					System.out.print(head.data + " ");
					head = head.next;
				}
				System.out.println();
			}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			LinkedListNode<Integer> head = inputList();
			if(head.data==head.next.data) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
			//So always use .equals to compare primitive/objects which holds necessary in case of generics.
			if(head.data.equals(head.next.data)) {
				System.out.println("yes");
			}else {
				System.out.println("No");
			}
			//print(head);
		}

}
