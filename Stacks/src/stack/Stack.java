package stack;

public class Stack {
private int stackArr[];
private int top;
public Stack(int capacity) {
	stackArr= new int[capacity];
	top=-1;
}
public int top() throws StackIsEmptyException{
	if(top==-1) {
		StackIsEmptyException e = new StackIsEmptyException();
		throw e;
	}
	return stackArr[top];
}
public boolean isEmpty() {
	return(top==-1);
}
public int size() {
	return top+1;
}
public void push(int element) throws StackIsFullException {
	if(size()==stackArr.length) {
		StackIsFullException e = new StackIsFullException();
		throw e;
	}
	top=top+1;
	stackArr[top]=element;
}
public int pop() throws StackIsEmptyException{
	if(top==-1) {
		StackIsEmptyException e = new StackIsEmptyException();
		throw e;
	}
	int temp = stackArr[top];
	top=top-1;
	return temp;
}

public static void main(String[] args) throws StackIsFullException , StackIsEmptyException {
	Stack stack1 = new Stack(10);
	for(int i=0;i<5;i++) {
		stack1.push(i+2);
		System.out.println(stack1.top());
	}
	System.out.println(stack1.top());
	System.out.println(stack1.size());
	System.out.println(stack1.isEmpty());
	while(!stack1.isEmpty()) {
		System.out.println(stack1.pop());
	}
	System.out.println(stack1.top);
	System.out.println(stack1.size());
	System.out.println(stack1.isEmpty());
}
}
