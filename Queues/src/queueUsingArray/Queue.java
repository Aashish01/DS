package queueUsingArray;

public class Queue {
private int front, rear;
private int size;
private int arr[];
public Queue(int capacity) {
	arr= new int[capacity];
	size=0;
	front=-1;
	rear=-1;
}
public boolean isEmpty() {
	return(size==0);
}
public int size() {
	return size;
}
public int front() throws QueueEmptyException {
	if(front==-1) {
		throw new QueueEmptyException();
	}
	return arr[front];
}
public int rear() throws QueueEmptyException {
	if(rear==-1) {
		throw new QueueEmptyException();
	}
	return arr[rear];
}
public void enqueue(int element) {
	if(size==arr.length) {
		int arr2[]= new int[2*arr.length];
		if(rear<front) {
			int k=0;
			for(int i=front;i<arr.length;i++) {
				arr2[k]=arr[i];
				k++;
			}
			for(int i=0;i<=rear;i++) {
				arr2[k]=arr[i];
				k++;
			}	
		}else {
			for(int i=0;i<arr.length;i++) {
				arr2[i]=arr[i];
			}
		}
		arr=arr2;
		front=0;
		rear=size-1;
		rear++;
		size++;
		arr[rear]=element;
	}else if(front==-1 && rear ==-1) {
		front++;
		rear++;
		size++;
		arr[rear]=element;
	}else if(size!=arr.length && rear ==arr.length-1) {
		rear=0;
		arr[rear]=element;
		size++;
	}else {
		rear++;
		arr[rear]=element;
		size++;
	}
}
public int dequeue() throws QueueEmptyException{
	if(size==0) {
		throw new QueueEmptyException();
	}else if(size==1) {
		int temp=arr[front];
		front =-1;
		rear=-1;
		size--;
		return temp;
	}else if(front ==arr.length-1) {
		int temp=arr[front];
		front =0;
		size--;
		return temp;
	}else {
		int temp=arr[front];
		front++;
		size--;
		return temp;
	}
}

public static void main(String[] args) throws QueueEmptyException {
	Queue queue= new Queue(3);
//	System.out.println(queue.front);
//	System.out.println(queue.rear);
//	System.out.println(queue.size);
	
	queue.enqueue(15);
	queue.enqueue(5);
	queue.dequeue();
	queue.enqueue(10);
	queue.enqueue(3);
	queue.dequeue();
	queue.enqueue(8);
	queue.dequeue();
	queue.dequeue();
	queue.dequeue();
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	queue.dequeue();
	queue.enqueue(7);
	queue.enqueue(8);
	System.out.println(queue.front);//Data members thus represent front,rear ptr loc.
	System.out.println(queue.rear);
	System.out.println(queue.size);
	System.out.println(queue.front());//Functions so give element at front/rear ptr loc.
	System.out.println(queue.rear());
	System.out.println(queue.size());
	System.out.println(queue.isEmpty());
}

}
class QueueEmptyException extends Exception{
	
}