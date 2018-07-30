package reverseQueue;
import java.util.Scanner;
public class Solution {
	public static void reverseQueue(Queue<Integer> q) {
		if(q.size()==1) {
			return;
		}
		int a=0;
		try {
			 a= q.dequeue();
		}catch(QueueEmptyException e) {
			
		}
		
		reverseQueue(q);
		q.enqueue(a);

	}
	public static void main(String[] args) throws QueueEmptyException {
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	Queue<Integer> q = new Queue<>();
	for(int i=0;i<n;i++) {
		int a= scan.nextInt();
		q.enqueue(a);
	}
	reverseQueue(q);
	scan.close();
	}
}
class Queue<T> {
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


