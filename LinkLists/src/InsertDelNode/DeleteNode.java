package InsertDelNode;

import java.util.Scanner;

public class DeleteNode {
	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i){
				LinkedListNode<Integer> temp = head;
				int length = length(head);
				if(i>=length) {
					return head;
				}else if(i==length-1) {
					for(int j=0;j<i-1;j++) {
						temp=temp.next;
					}
					temp.next=null;
					return head;
				}else if(i==0) {
					head = head.next;
					return head;
				}else {
					for(int j=0;j<i-1;j++) {
						temp=temp.next;
					}
					temp.next= temp.next.next;
					return head;
				}
	}
	
	//Print
		public static void print(LinkedListNode<Integer> head) {
			while(head!=null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
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

		//insert list
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
	int i = scan.nextInt();
	head = deleteIthNode(head, i);
	print(head);
	scan.close();

}
}
