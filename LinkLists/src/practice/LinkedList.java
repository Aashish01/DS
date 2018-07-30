package practice;

public class LinkedList {
public static void main(String[] args) {
	Node<Integer> node1 = new Node<>(2);
	Node<Integer> node2 = new Node<>(3);
	Node<Integer> node3 = new Node<>(4);
	node1.next= node2;
	node2.next=node3;
	Node<Integer> head;
	head= node1;
	while(head!=null) {
		System.out.print(head.data+" ");
		head = head.next;
	}
}
}
