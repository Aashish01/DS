package queueUsingLL;

public class Queue<T> {
private int size;
private Node<T> front,rear;
public Queue(){
	front =null;
	rear=null;
	size=0;
}
public int size() {
	return size;
}
public boolean isEmpty() {
	return size==0;
}
public T front() throws QueueEmptyException {
	if(front==null) {
		throw new QueueEmptyException();
	}
	return front.data;
}
public T rear() throws QueueEmptyException{
	if(front ==null && rear==null) {
		throw new QueueEmptyException();
	}
	return rear.data;
}
public void enqueue(T element) {
	Node<T> node = new Node<>(element);
	node.next=null;
	if(rear==null) {
		front=node;
		rear=node;
		size++;
	}else {
		rear.next=node;
		rear=node;
		size++;
	}
}
public T dequeue() throws QueueEmptyException {
	if(front==null) {
		throw new QueueEmptyException();
	}
	T temp1= front.data;
	if(size==1) {
		front=null;
		rear=null;
		return temp1;
	}else {
	
	Node<T> temp2= front;
	front = front.next;
	size--;
	temp2.next=null;
	return temp1;
	}
}
public static void main(String[] args) throws QueueEmptyException {
	Queue<Integer> queue= new Queue<>();
	queue.enqueue(5);
	boolean b= queue.isEmpty();
	System.out.println(b);
	System.out.println(queue.front());
	System.out.println(queue.rear());
    int a =	queue.dequeue();
    System.out.println(a);
    b= queue.isEmpty();
    System.out.println(b);
    queue.enqueue(4);
    queue.enqueue(1);
    queue.enqueue(10);
    System.out.println(queue.front());
	System.out.println(queue.rear());
}
}
class QueueEmptyException extends Exception{
	
}
class Node<T>{
	T data;
	Node<T> next;
	Node(T data){
		this.data=data;
	}
}

