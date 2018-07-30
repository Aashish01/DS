package doublyCircularLinkedList;

public class Solution {
	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp=head;
		while(head.next!=temp) {
			System.out.print(head.data + " ");
			head= head.next;
		}
		System.out.println(head.data);
	}
public static void main(String[] args) {
	LinkedListNode<Integer> node1= new LinkedListNode<Integer>(5);
	LinkedListNode<Integer> node2= new LinkedListNode<Integer>(2);
	LinkedListNode<Integer> node3= new LinkedListNode<Integer>(8);
	node1.next=node2;
	node2.prev=node1;
	node2.next=node3;
	node3.prev=node2;
	node3.next=node1;
	node1.prev=node3;
	LinkedListNode<Integer> head =node1;
	print(head);
	}
}
