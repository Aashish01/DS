package doublyCircularLinkedList;

public class LinkedListNode<T> {
T data;
LinkedListNode<T> next;
LinkedListNode<T> prev;
public LinkedListNode(T data) {
	this.data=data;
	this.prev=null;
	this.next = null;
	}
}
