package stack;

public class DynamicStack {
	private int stackArr[];
	private int top;
	public DynamicStack(int capacity) {
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
	public void push(int element)  {
		if(size()==stackArr.length) {
		//	System.out.println("RESIZED");
			int arr2[]= new int[2*stackArr.length];
			for(int i=0;i<stackArr.length;i++) {
				arr2[i]=stackArr[i];
			}
			stackArr= arr2;
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
		DynamicStack stack1 = new DynamicStack(10);
	for(int i=0;i<25;i++) {	
		stack1.push(i);
	}
	System.out.println(stack1.top());
	}

}
