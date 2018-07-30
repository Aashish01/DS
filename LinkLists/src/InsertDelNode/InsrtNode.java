package InsertDelNode;

import java.util.Scanner;

public class InsrtNode {
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
	
	//Insert Node
	public static LinkedListNode<Integer> insertNode(LinkedListNode<Integer> head,int x,int i){
		int length = length(head);
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(x);
		newNode.next=null;
		LinkedListNode<Integer> temp = head;
		if(i>length) {
			return head;
		}else if(i==length) {
			for(int j=0;j<i-1;j++) {
				temp=temp.next;
			}
			//since overwriting addresses using temp ,so effective.
			temp.next = newNode;
			return head;
		}else if(i==0) {
			newNode.next=head;
			return newNode;
		}else {
			for(int j=0;j<i-1;j++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
			return head;
		}
	}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	LinkedListNode<Integer> head = inputList();
	int x = scan.nextInt();
	int i = scan.nextInt();
	head =insertNode(head, x, i);
	print(head);
	scan.close();

}
}
